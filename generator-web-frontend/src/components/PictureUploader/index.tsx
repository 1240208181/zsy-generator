import React, { useState } from 'react';
import { message, Upload, UploadProps } from 'antd';
import { PlusOutlined } from '@ant-design/icons';
import { uploadFileUsingPost } from '@/services/backend/fileController';
import { COS_HOST } from '@/constants';

const { Dragger } = Upload;

interface Props {
  biz: string;
  onChange?: (url: string) => void;
  value?: string;
}

/**
 * 图片上传组件
 * @constructor
 */
const PictureUploader: React.FC<Props> = (props) => {
  const { biz, value, onChange } = props;
  const [loading, setLoading] = useState<boolean>(false);
  const uploadProps: UploadProps = {
    name: 'file',
    multiple: false,
    listType: 'picture-card',
    maxCount: 1,
    showUploadList: false,
    disabled: loading,
    customRequest: async (fileObj: any) => {
      setLoading(true);
      try {
        const res = await uploadFileUsingPost({ biz }, {}, fileObj.file);
        // 拼接完整图片路径
        const full_Path = COS_HOST + res.data;
        onChange?.(full_Path ?? '');
        fileObj.onSuccess(res.data);


      } catch (e: any) {
        message.error('上传失败' + e.message);
        fileObj.onError(e);
      }
      setLoading(false);
    },
  };

  const uploadButton = (
    <button style={{ border: 0, background: 'none' }} type="button">
      <PlusOutlined />
      <div style={{ marginTop: 8 }}>上传</div>
    </button>
  );

  return (
    <Upload {...uploadProps}>
      {value ? <img src={value} alt={'picture'} style={{ width: '100%' }} /> : uploadButton}
    </Upload>
  );
};
export default PictureUploader;

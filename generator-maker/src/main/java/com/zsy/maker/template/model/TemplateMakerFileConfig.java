package com.zsy.maker.template.model;

import com.zsy.maker.meta.Meta;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 模板文件制作对象文件配置参数
 * @author zhusiyuan
 * @date 2023/12/20
 * @apiNote
 */
@Data
public class TemplateMakerFileConfig {
    /**
     * 文件列表
     */
    private List<FileInfoConfig> files;
    /**
     * 分组信息
     */
    private FileGroupConfig fileGroupConfig;
    @Data
    @NoArgsConstructor
    public static class FileInfoConfig{
        /**
         * 路径
         */
        private String path;
        /**
         * 过滤条件
         */
        private List<FileFilterConfig> FilterConfigList;
    }

    @Data
    @NoArgsConstructor
    public static class FileGroupConfig{
        private String condition;
        private String groupKey;
        private String groupName;

    }
}

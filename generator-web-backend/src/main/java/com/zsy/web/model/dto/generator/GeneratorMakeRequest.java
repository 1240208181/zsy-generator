package com.zsy.web.model.dto.generator;

import com.zsy.maker.meta.Meta;
import lombok.Data;

/**
 * @author zhusiyuan
 * @date 2024/1/24
 * @apiNote
 */
@Data
public class GeneratorMakeRequest {
    /**
     * 元信息
     */
    private Meta meta;

    /**
     * 模板文件压缩包路径
     */
    private String zipFilePath;

    private static final long serialVersionUID = 1L;
}

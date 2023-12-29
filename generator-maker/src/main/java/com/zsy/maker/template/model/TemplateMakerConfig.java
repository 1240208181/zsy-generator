package com.zsy.maker.template.model;

import com.zsy.maker.meta.Meta;
import lombok.Data;

/**
 * 模板制作配置
 * @author zhusiyuan
 * @date 2023/12/27
 * @apiNote
 */
@Data
public class TemplateMakerConfig {

    /**
     * 文件夹空间id
     */
    private Long id;
    /**
     * meta.json元信息对象
     */
    private Meta meta= new Meta();
    /**
     * 原模板文件绝对路径
     */
    private String originProjectPath;
    /**
     * 模板文件制作对象文件配置参数
     */
    private TemplateMakerFileConfig fileConfig = new TemplateMakerFileConfig();
    /**
     * 模板文件制作对象模型配置参数
     */
    private TemplateMakerModelConfig modelConfig = new TemplateMakerModelConfig();
    /**
     * 文件输出配置
     */
    private TemplateMakerOutputConfig outputConfig = new TemplateMakerOutputConfig();

}

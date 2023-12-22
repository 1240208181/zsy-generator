package com.zsy.maker.template.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 模板文件制作对象模型配置参数
 * @author zhusiyuan
 * @date 2023/12/20
 * @apiNote
 */
@Data
public class TemplateMakerModelConfig {
    /**
     * 模型
     */
    private List<ModelInfoConfig> models;
    /**
     * 分组信息
     */
    private ModelGroupConfig modelGroupConfig;
    @Data
    @NoArgsConstructor
    public static class ModelInfoConfig{
        private String fieldName;
        private String type;
        private String description;
        private Object defaultValue;
        private String abbr;
        // 替换的文本
        private String replaceText;
    }

    @Data
    @NoArgsConstructor
    public static class ModelGroupConfig{
        private String condition;
        private String groupKey;
        private String groupName;

    }
}

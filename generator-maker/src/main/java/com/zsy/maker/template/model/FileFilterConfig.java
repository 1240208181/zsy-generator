package com.zsy.maker.template.model;

import lombok.Builder;
import lombok.Data;

/**
 * 文件过滤配置
 * @author zhusiyuan
 * @date 2023/12/20
 * @apiNote
 */
@Data
@Builder
public class FileFilterConfig {
    /**
     * 过滤范围
     */
    private String range;
    /**
     * 过滤规则
     */
    private String rule;
    /**
     * 过滤值
     */
    private String value;
}

package com.zsy.maker.template.model;

import lombok.Data;

/**
 * 文件输出配置
 * @author zhusiyuan
 * @date 2023/12/28
 * @apiNote
 */
@Data
public class TemplateMakerOutputConfig {
    /**
     * 从未分组的文件中移除组内的同名文件
     */
    private boolean removeGroupFilesFromRoot = true;
}

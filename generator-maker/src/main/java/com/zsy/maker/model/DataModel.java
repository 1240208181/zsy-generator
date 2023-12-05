package com.zsy.maker.model;

import lombok.Data;

/**
 * @author zhusiyuan
 * @date 2023/11/29
 * @apiNote
 */
@Data
public class DataModel {

    /**
     * 是否生成循环
     */
    private boolean loop;

    /**
     * 作者注释
     */
    private String author = "zsy";

    /**
     * 输出信息
     */
    private String outputText = "sum = ";
}

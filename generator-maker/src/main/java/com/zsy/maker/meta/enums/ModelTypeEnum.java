package com.zsy.maker.meta.enums;

/**
 * 文件生成类型枚举
 * @author zhusiyuan
 * @date 2023/12/10
 * @apiNote
 */
public enum ModelTypeEnum {
    String ("字符串", "String"),
    BOOLEAN("布尔", "boolean");

    private final String text;
    private final String value;

    ModelTypeEnum(String text, String value){
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }
}

package com.zsy.web.model.dto.generator;

import com.zsy.maker.meta.Meta;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 使用代码生成器请求
 */
@Data
public class GeneratorUseRequest implements Serializable {
    /**
     * 生成器id
     */
    private Long id;

    private Map<String, Object> dataModel;


    private static final long serialVersionUID = 1L;
}
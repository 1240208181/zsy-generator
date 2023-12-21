package com.zsy.maker.template.model;

import com.zsy.maker.meta.Meta;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author zhusiyuan
 * @date 2023/12/20
 * @apiNote
 */
@Data
public class TemplateMakerFileConfig {
    private List<FileInfoConfig> files;

    private FileGroupConfig fileGroupConfig;
    @Data
    @NoArgsConstructor
    public static class FileInfoConfig{
        private String path;

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

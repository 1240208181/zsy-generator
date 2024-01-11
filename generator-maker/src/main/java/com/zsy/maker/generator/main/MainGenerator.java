package com.zsy.maker.generator.main;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.StrUtil;
import com.zsy.maker.generator.JarGenerator;
import com.zsy.maker.generator.ScriptGenerator;
import com.zsy.maker.generator.file.DynamicFileGenerator;
import com.zsy.maker.meta.Meta;
import com.zsy.maker.meta.MetaManager;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * @author zhusiyuan
 * @date 2023/12/4
 * @apiNote
 */
public class MainGenerator extends GenerateTemplate{
    @Override
    protected String buildDist(String outputPath, String sourceCopyDestPath, String jarPath, String shellOutputFilePath) {
        System.out.println("不用生成dist文件");
        return "";
    }
}

package com.zsy.maker.generator.main;

/**
 *
 * @author zhusiyuan
 * @date 2023/12/4
 * @apiNote
 */
public class ZipGenerator extends GenerateTemplate{
    @Override
    protected String buildDist(String outputPath, String sourceCopyDestPath, String jarPath, String shellOutputFilePath) {
        String buildDist = super.buildDist(outputPath, sourceCopyDestPath, jarPath, shellOutputFilePath);
        return super.buildZip(buildDist);
    }
}

package com.zsy.maker;

//import com.zsy.maker.cli.CommandExecutor;

import com.zsy.maker.generator.main.MainGenerator;
import freemarker.template.TemplateException;

import java.io.IOException;

/**
 * @author zhusiyuan
 * @date 2023/11/29
 * @apiNote
 */
public class Main {

    public static void main(String[] args) throws TemplateException, IOException, InterruptedException {
        MainGenerator mainGenerator = new MainGenerator();
        mainGenerator.doGenerate();
    }
}

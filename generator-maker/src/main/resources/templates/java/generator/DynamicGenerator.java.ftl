package ${basePackage}.generator;

import cn.hutool.core.io.FileUtil;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 动态文件生成器
 * @author zhusiyuan
 * @date 2023/11/29
 * @apiNote
 */
public class DynamicGenerator {



    /**
     * 生成文件
     *
     * @param inputPath 模板文件输入路径
     * @param outputPath 输出路径
     * @param model 数据模型
     * @throws IOException
     * @throws TemplateException
     */
    public static void doGenerate(String inputPath, String outputPath, Object model) throws IOException, TemplateException {
        // new 出 Configuration 对象，参数为 FreeMarker 版本号
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_32);

        // 指定模板文件所在的路径
        File templateDir = new File(inputPath).getParentFile();
        configuration.setDirectoryForTemplateLoading(templateDir);

        // 设置模板文件使用的字符集
        configuration.setDefaultEncoding("utf-8");
        configuration.setNumberFormat("0.######");


        // 创建模板对象，加载指定模板
        String templateName = new File(inputPath).getName();
        // 生成(解决中文乱码)
        Template template = configuration.getTemplate(templateName, "UTF-8");
        // 如果文件不存在则创建目录
        if(!FileUtil.exist(outputPath)){
            FileUtil.touch(outputPath);
        }
        BufferedWriter out =
                new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputPath), StandardCharsets.UTF_8));
        template.process(model, out);

        // 关闭流
        out.close();
    }

}

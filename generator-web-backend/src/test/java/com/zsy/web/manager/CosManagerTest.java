package com.zsy.web.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author zhusiyuan
 * @date 2024/2/2
 * @apiNote
 */
@SpringBootTest
class CosManagerTest {

    @Resource
    private CosManager cosManager;

    @Test
    void deleteObject() {
        cosManager.deleteObject("/test/屏幕截图(1).png");
    }

    @Test
    void deleteObjects() {
        cosManager.deleteObjects(Arrays.asList("test/test1.png", "test/test2.png"));
    }

    @Test
    void deleteDir() {
        cosManager.deleteDir("/test/");
    }
}
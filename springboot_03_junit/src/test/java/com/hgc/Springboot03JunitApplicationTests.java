package com.hgc;

import com.hgc.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// 如果测试类跟springboot运行引导类不在同一个包下，那么需要给@SpringBootTest注解加classes属性
@SpringBootTest(classes = Springboot03JunitApplication.class)
class Springboot04JunitApplicationTests {
    // 1、注入要测试的对象
    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        // 2、执行要测试的对象对应的方法
        bookDao.save();
    }

}
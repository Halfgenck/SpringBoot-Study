package com.hgc;

import com.hgc.Mapper.BookMapper;
import com.hgc.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04MybatisApplicationTests {
    @Autowired
    private BookMapper bookMapper;
    @Test
    void contextLoads() {
        Book byId = bookMapper.getById(2);
        System.out.println(byId);
    }

}

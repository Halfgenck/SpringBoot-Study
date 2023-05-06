package com.hgc;

import com.hgc.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot05MybatisplusApplicationTests {

    @Autowired
    private BookMapper bookMapper;

    @Test
    void contextLoads() {
        System.out.println(bookMapper.selectById(1));
    }

    @Test
    void testGetAll() {
        System.out.println(bookMapper.selectList(null));
    }

}

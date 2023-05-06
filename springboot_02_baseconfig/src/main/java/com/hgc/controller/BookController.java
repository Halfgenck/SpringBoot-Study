package com.hgc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hgc
 * @version 1.0
 * @date 2023/5/6/0006 13:46
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping
    public String getById() {
        System.out.println("springboot is running...");
        return "springboot is running...";
    }
}
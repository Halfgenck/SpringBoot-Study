package com.hgc.controller;

import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.core.io.Resource;
import java.io.File;

/**
 * @author hgc
 * @version 1.0
 * @date 2023/5/6/0006 13:33
 */
@RestController
@RequestMapping("/book")
public class BookController {
    // 文件下载
    @GetMapping("/file1")
    public ResponseEntity<File> upload() {
        File file = new File("a.txt");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,"attachment;filename=" + file.getName())
                .body(file);

    }
    @GetMapping("/file2")
    public ResponseEntity<Resource> download() {
        File file = new File(".txt");
        Resource resource = null;
        try {
            resource = new UrlResource(file.toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,"attachment;filename=" + resource.getFilename())
                .body(resource);
    }

}

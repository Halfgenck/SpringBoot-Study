package com.hgc.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hgc.controller.utils.R;
import com.hgc.pojo.Book;
import com.hgc.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


/**
 *
 * @author hgc
 * @version 1.0
 * @date 2023/5/6/0006 14:52
 */
@RestController
@RequestMapping("/books")
public class BookController2 {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll() {
        return new R(true, bookService.list());
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, bookService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize, Book book) {
        IPage<Book> page = bookService.getPage(currentPage, pageSize, book);
        // 如果当前页面值大于总页码值，那么重新执行查询操作，使用最大页码值作为当前页码值
        if (currentPage > page.getPages()) {
            page = bookService.getPage((int) page.getPages(), pageSize, book);
        }
        return new R(true, page);
    }

    @PostMapping
    public R save(@RequestBody Book book) {
        /*if (true) {
            throw new RuntimeException("人为故障测试...");
        }*/
        boolean flag = bookService.save(book);
        return new R(flag, flag ? "添加成功^_^" : "添加失败-_-!");
    }

    @PutMapping
    public R update(@RequestBody Book book) {
        boolean flag = bookService.updateById(book);
        return new R(flag, flag ? "修改成功^_^" : "修改失败-_-!");
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        boolean flag = bookService.removeById(id);
        return new R(flag, flag ? "删除成功^_^" : "删除失败-_-!");
    }
}

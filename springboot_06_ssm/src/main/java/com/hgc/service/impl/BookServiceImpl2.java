package com.hgc.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hgc.mapper.BookMapper;
import com.hgc.pojo.Book;
import com.hgc.service.IBookService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author CandyWall
 * @Date 2022/1/20--12:50
 * @Description
 */
@Service
public class BookServiceImpl2 extends ServiceImpl<BookMapper, Book> implements IBookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage<Book> page = new Page<>(currentPage, pageSize);
        bookMapper.selectPage(page, null);
        return page;
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize, Book book) {
        IPage<Book> page = new Page<>(currentPage, pageSize);
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(Strings.isNotEmpty(book.getName()), Book::getName, book.getName());
        lqw.like(Strings.isNotEmpty(book.getType()), Book::getType, book.getType());
        lqw.like(Strings.isNotEmpty(book.getDescription()), Book::getDescription, book.getDescription());
        bookMapper.selectPage(page, lqw);
        return page;
    }
}

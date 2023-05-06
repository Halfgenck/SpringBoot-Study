package com.hgc.dao.impl;


import com.hgc.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author hgc
 * @version 1.0
 * @date 2023/5/6/0006 14:03
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("bookDao is running...");
    }
}
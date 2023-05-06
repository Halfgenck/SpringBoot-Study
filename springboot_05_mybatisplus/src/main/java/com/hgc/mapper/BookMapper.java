package com.hgc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hgc.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author HG
 * @description 针对表【tbl_book】的数据库操作Mapper
 * @createDate 2023-05-06 14:26:20
 * @Entity generator.domain.BookMapper
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

}





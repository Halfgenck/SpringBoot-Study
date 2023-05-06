package com.hgc.Mapper;

import com.hgc.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author hgc
 * @version 1.0
 * @date 2023/5/6/0006 14:09
 */
@Mapper
public interface BookMapper {
    @Select("select * from tbl_book where id = #{id}")
    Book getById(Integer id);
}

package com.hgc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hgc.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author hgc
 * @version 1.0
 * @date 2023/5/6/0006 14:52
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

}

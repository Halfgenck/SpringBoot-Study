package com.hgc.domain;


import lombok.Data;
import org.springframework.stereotype.Component;


/**
 * 
 * @TableName tbl_book
 */
@Component
@Data
public class Book {
    private Integer id;
    private String name;
    private String type;
    private String description;
}

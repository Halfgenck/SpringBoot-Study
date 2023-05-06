package com.hgc.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 *
 * @author hgc
 * @version 1.0
 * @date 2023/5/6/0006 14:52
 */
@Component
@Data
public class Book {
    private Integer id;
    private String name;
    private String type;
    private String description;
}

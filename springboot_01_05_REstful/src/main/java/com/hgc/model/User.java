package com.hgc.model;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author hgc
 * @version 1.0
 * @date 2023/5/6/0006 13:27
 */

@Component
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
}

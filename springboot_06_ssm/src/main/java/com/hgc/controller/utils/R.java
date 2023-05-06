package com.hgc.controller.utils;

import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * @author hgc
 * @version 1.0
 * @date 2023/5/6/0006 14:52
 */
@Data
@NoArgsConstructor
public class R {
    private Boolean flag;
    private Object data;
    private String msg;

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public R(String msg) {
        this(false, msg);
    }
}

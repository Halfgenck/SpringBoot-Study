package com.hgc.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogUtils {
    // 创建记录日志的对象
    protected static Logger log;

    public LogUtils() {
        log = LoggerFactory.getLogger(this.getClass());
    }
}

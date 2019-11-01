package com.renren.log.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
    private final static Logger logger =  LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {

        logger.error("错误");





    }
}

package com.service;
// Created by ZhangJian on 18/2/26.

import com.alibaba.dubbo.common.logger.log4j.Log4jLogger;
import com.service.Test;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("testImpl")
// 默认的注解bean名字就是 "testImpl"
public class TestImpl implements Test {

    private Logger logger = Logger.getLogger(TestImpl.class);


    @Override
    public String zhang(String a) {
        logger.info("provider test()");
        return a;
    }
}

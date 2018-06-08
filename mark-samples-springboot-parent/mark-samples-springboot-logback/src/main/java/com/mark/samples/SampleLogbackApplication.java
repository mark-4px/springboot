/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.samples;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author mark
 * @date 2018年5月19日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */

@SpringBootApplication
public class SampleLogbackApplication {

    private static final Logger logger = LoggerFactory.getLogger(SampleLogbackApplication.class);

    @PostConstruct
    public void logSomething() {
        logger.debug("Sample Debug Message");
        logger.trace("Sample Trace Message");
        logger.info("sample info message");
        logger.error("Sample error message");
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleLogbackApplication.class, args).close();
    }

}

/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.samples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mark
 * @date 2018年5月20日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */
@Controller
public class CommonControl {

    @RequestMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
    
}

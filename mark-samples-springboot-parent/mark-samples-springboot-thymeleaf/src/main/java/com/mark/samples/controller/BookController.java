/*
 * Copyright (c) 2015, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.samples.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mark.samples.domain.Book;
import com.mark.samples.query.BookQuery;
import com.mark.samples.service.IBookService;

/**
 *
 * @author mark
 * @date 2018年5月20日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */

@Controller
@RequestMapping("/book")
public class BookController {

    @Resource
    private IBookService bookService;
    
    
    @RequestMapping("/list")
    public String listBooks (Model model) {
        
        List<Book> lstBooks = bookService.searchBook(new BookQuery());
        
        model.addAttribute("lstBooks", lstBooks);
        
        return "book/list";
    }
    
}

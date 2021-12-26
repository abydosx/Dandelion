package com.dan.dandelion.client.controller;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


/**
 * 图书Controller类
 * 
 * @author tanzibiao
 * @date 2021/06/13
 *
 * @mbg.generated 2021/06/13
 */
@RequestMapping("/book")
@RestController
public class BookController {

    /**
     * 分页查询
     * @param req
     * @return 
     */

    @PostMapping("/test")
    public String hello() {
        return "hello";
    }


}
package com.dan.dandelion.client.controller;
import com.dan.dandelion.client.model.Article;
import com.dan.dandelion.client.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/select/{id}")
    public Article hello(@PathVariable("id") int id){
        System.out.printf("test1");
        return articleService.queryArticleByUniID(0000000001);
    }


    @GetMapping("/hello")
    public String hello1(){
        System.out.printf("test2");
        return articleService.test();
    }

    @GetMapping(value = "/select")
    @ResponseBody
    public Article hello2(@RequestParam int id){
        System.out.printf("test3");
        return articleService.queryArticleByUniID(id);
    }







    @GetMapping("/test")
    public String hell1(){
        return "l";
    }


}
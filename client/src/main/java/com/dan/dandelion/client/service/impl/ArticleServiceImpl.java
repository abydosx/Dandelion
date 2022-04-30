package com.dan.dandelion.client.service.impl;

import com.dan.dandelion.client.dao.ArticleDao;
import com.dan.dandelion.client.model.Article;
import com.dan.dandelion.client.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleDao articleDao;

    @Override
    public String test (){
        return "test";
    }

    @Override
    public Article queryArticleByUniID (int id){
       return articleDao.queryArticleByUniID(id);
    }

}

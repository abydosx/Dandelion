package com.dan.dandelion.client.dao;


import com.dan.dandelion.client.model.Article;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleDao  {

     Article queryArticleByUniID (int uniID);

}

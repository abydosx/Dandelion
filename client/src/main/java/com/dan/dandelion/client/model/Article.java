package com.dan.dandelion.client.model;

import lombok.Data;
import java.util.Date;

@Data
public class Article {

    int uniID;
    String content;
    Integer userID;
    Date createTime;
    Date updateTime;
}

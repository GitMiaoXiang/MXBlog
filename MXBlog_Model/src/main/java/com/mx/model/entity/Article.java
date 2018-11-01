package com.mx.model.entity;


import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "article")
@Data
public class Article {
    @Id
    private String id;

    private String title;

    private String isTop;

    private Integer clickCount;

    private Date createDate;

    private Date updateDate;

    private Integer category;

    private String tags;

    private String isAudit;

    private String describe;

    private String content;
}
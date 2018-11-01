package com.mx.model.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "category")
@Data
public class Category {
    @Id
    private Integer id;

    private String name;

    private Integer titleId;

    private Integer detailId;

    private String rank;

    private String link;

    private String describe;

}
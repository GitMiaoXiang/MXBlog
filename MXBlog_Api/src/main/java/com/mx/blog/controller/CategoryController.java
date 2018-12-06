package com.mx.blog.controller;

import com.mx.blog.cosntenum.ResponseEnum;
import com.mx.blog.entity.cto.ResultData;
import com.mx.blog.entity.vo.CategoryVo;
import com.mx.blog.mapper.CategoryMapper;
import com.mx.blog.service.ICategoryService;
import com.mx.blog.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/categoryList")
    public ResultData<List<CategoryVo>> categoryList(){
        ResultData<List<CategoryVo>> listResultData = categoryService.categoryList();
        return listResultData;
    }
}

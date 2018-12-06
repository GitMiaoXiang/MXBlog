package com.mx.blog.service;

import com.mx.blog.base.service.IBaseService;
import com.mx.blog.entity.model.Category;
import com.mx.blog.entity.cto.ResultData;
import com.mx.blog.entity.vo.CategoryVo;

import java.util.List;

/**
 * @author : ShangGuanMingPeng
 * Description :
 * Date :Create in 2018/12/6 16:21
 * Modified By :
 */
public interface ICategoryService extends IBaseService<Category> {

    /**
     * 查询首页分类
     * @return
     */
    ResultData<List<CategoryVo>> categoryList();
}

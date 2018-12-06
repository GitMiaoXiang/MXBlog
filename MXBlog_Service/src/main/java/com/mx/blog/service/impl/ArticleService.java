package com.mx.blog.service.impl;

import com.github.pagehelper.PageInfo;
import com.mx.blog.base.service.BaseService;
import com.mx.blog.cosntenum.ResponseEnum;
import com.mx.blog.entity.Const;
import com.mx.blog.entity.cto.ResultData;
import com.mx.blog.entity.model.Article;
import com.mx.blog.service.IArticleService;
import com.mx.blog.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : ShangGuanMingPeng
 * Description :
 * Date :Create in 2018/12/6 20:00
 * Modified By :
 */
@Service
public class ArticleService extends BaseService<Article> implements IArticleService {

    @Resource
    private Const aConst;

    @Override
    public ResultData<List<Article>> articleList(int pageIndex) {
        PageInfo<Article> articlePageInfo = queryPageListByWhere(pageIndex,Integer.valueOf(aConst.getPageSize()), null);
        List<Article> articles = articlePageInfo.getList();
        ResultData<List<Article>> listResultData = ResultUtil.successResult(articles, ResponseEnum.SUCCESS);
        return listResultData;
    }

}

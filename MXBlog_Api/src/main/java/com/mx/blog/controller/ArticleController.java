package com.mx.blog.controller;

import com.mx.blog.cosntenum.ResponseEnum;
import com.mx.blog.entity.cto.ResultData;
import com.mx.blog.entity.model.Article;
import com.mx.blog.service.IArticleService;
import com.mx.blog.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : ShangGuanMingPeng
 * Description : 文章Controller
 * Date :Create in 2018/12/6 19:56
 * Modified By :
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @GetMapping("/list")
    public ResultData<List<Article>> articleList(@RequestParam(value = "pageIndex", defaultValue = "1",required = false) Integer pageIndex){
        ResultData<List<Article>> listResultData = articleService.articleList(pageIndex);
        return listResultData;
    }

    @PostMapping("/save")
    public ResultData add(Article article){
        Integer save = articleService.save(article);
        ResultData resultData;
        if(save == 1){
            resultData = ResultUtil.successResult(ResponseEnum.SUCCESS);
        }else{
            resultData = ResultUtil.errorResult(ResponseEnum.SAVE_FAILED);
        }
        return resultData;
    }
}

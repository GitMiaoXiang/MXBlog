package com.mx.dao.mapper;

import com.mx.dao.base.MyMapper;
import com.mx.model.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author : ShangGuanMingPeng
 * Description : 
 * Date :Create in   
 * Modified By :
 */
@Mapper
@Repository
public interface ArticleMapper extends MyMapper<Article> {
}

package com.mx.dao.mapper;

import com.mx.dao.base.MyMapper;
import com.mx.model.entity.Category;
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
public interface CategoryMapper extends MyMapper<Category> {
}

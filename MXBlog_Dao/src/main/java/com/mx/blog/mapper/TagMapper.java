package com.mx.blog.mapper;

import com.mx.blog.base.mapper.MyMapper;
import com.mx.blog.entity.Tag;
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
public interface TagMapper extends MyMapper<Tag> {
}

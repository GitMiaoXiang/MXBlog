package com.mx.dao.mapper;

import com.mx.dao.base.MyMapper;
import com.mx.model.entity.Message;
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
public interface MessageMapper extends MyMapper<Message> {
}

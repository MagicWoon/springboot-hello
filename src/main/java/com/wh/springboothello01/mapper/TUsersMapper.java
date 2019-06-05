package com.wh.springboothello01.mapper;

import com.wh.springboothello01.entity.TUsers;
import org.springframework.stereotype.Component;

@Component
public interface TUsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUsers record);

    int insertSelective(TUsers record);

    TUsers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUsers record);

    int updateByPrimaryKey(TUsers record);
}
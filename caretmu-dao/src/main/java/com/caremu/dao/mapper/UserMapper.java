package com.caremu.dao.mapper;

import com.caremu.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by darchrow on 2016/1/23.
 */
public interface UserMapper {

    @Select("SELECT * FROM user WHERE id = #{userId}")
    User getUser(@Param("userId") long uid);

}

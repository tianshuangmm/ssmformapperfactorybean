package com.ts.ssm.dao.mapping;

import com.ts.ssm.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("SELECT * FROM user WHERE id = #{userId}")
    User getUser(@Param("userId") long id);
}

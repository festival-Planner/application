package com.mohaji.user.repository.mybatis;

import com.mohaji.user.domain.dto.UserDto;
import com.mohaji.user.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Mapper
@Repository
public interface UserMapper {
//    @Select("SELECT * FROM tbl_user WHERE id = #{id}")

    public Optional<UserDto> selectById(long id);
}

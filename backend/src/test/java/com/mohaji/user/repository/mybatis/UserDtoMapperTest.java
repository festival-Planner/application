package com.mohaji.user.repository.mybatis;

import com.mohaji.user.domain.dto.UserDto;
import com.mohaji.user.domain.entity.User;
import com.mohaji.user.repository.jpa.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserDtoMapperTest {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserRepository userRepository;

    //Todo Mybatis - Spring Boot 연동 테스트
    @Test
    public void mybatisTest() {
        User user = User.builder()
                .userId("test")
                .password("1234").build();
        User getUser = userRepository.save(user);
        Long userIndex = getUser.getId();
        UserDto result = userMapper.selectById(userIndex).get();

        System.out.println("result = " + result);

    }
}
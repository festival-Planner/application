package com.mohaji.user.repository.jpa;

import com.mohaji.user.domain.entity.User;
import com.querydsl.core.QueryFactory;
import jakarta.persistence.EntityManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserDtoRepositoryTest {

    @Autowired
    UserRepository userRepository;

    //Todo QueryDSL / Spring Data JPA 가 Spring Boot 와 연동 됐는지 테스트 [완료]
    @Test
    public void testJPAandQueryDSL() {
        User user = User.builder()
                .userId("test")
                .password("1234").build();
        User getUser = userRepository.save(user);

        User resultByDSL = userRepository.searchOneById(getUser.getId()).get();
        User resultByJPA = userRepository.findById(getUser.getId()).get();

        assertThat(user.getUserId()).isEqualTo(resultByDSL.getUserId());
        assertThat(user.getUserId()).isEqualTo(resultByJPA.getUserId());
    }
}
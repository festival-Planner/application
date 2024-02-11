package com.mohaji.user.repository.jpa.impl;

import com.mohaji.user.domain.entity.QUser;
import com.mohaji.user.domain.entity.User;
import com.mohaji.user.repository.jpa.custom.UserRepositoryCustom;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static com.mohaji.user.domain.entity.QUser.user;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom {

    private final JPAQueryFactory factory;

    @Override
    public Optional<User> searchOneById(Long id) {
        return  Optional.ofNullable( factory.selectFrom(user)
                .where(user.id.eq(id))
                .fetchOne());
    }


}

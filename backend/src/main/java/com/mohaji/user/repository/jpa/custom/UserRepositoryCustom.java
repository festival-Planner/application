package com.mohaji.user.repository.jpa.custom;

import com.mohaji.user.domain.entity.User;

import java.util.Optional;

public interface UserRepositoryCustom {
    public Optional<User> searchOneById(Long id);
}

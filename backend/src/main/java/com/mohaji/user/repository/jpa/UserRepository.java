package com.mohaji.user.repository.jpa;

import com.mohaji.user.domain.entity.User;
import com.mohaji.user.repository.jpa.custom.UserRepositoryCustom;
import com.mohaji.user.repository.jpa.impl.UserRepositoryImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User,Long>, UserRepositoryCustom{
}

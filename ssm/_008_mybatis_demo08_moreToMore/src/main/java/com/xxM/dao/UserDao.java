package com.xxM.dao;

import com.xxM.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findUserAccountList();
}

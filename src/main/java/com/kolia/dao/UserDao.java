package com.kolia.dao;

import com.kolia.model.User;

public interface UserDao {

    User findByLogin(final String login);
}

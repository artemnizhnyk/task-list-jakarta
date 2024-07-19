package com.artemnizhnyk.tasklistjakarta.repository;

import com.artemnizhnyk.tasklistjakarta.domain.model.User;

public interface UserRepository {

    User getUserById(Long id);
}

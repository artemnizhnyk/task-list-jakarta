package com.artemnizhnyk.tasklistjakarta.service.impl;

import com.artemnizhnyk.tasklistjakarta.domain.model.Task;
import com.artemnizhnyk.tasklistjakarta.domain.model.User;
import com.artemnizhnyk.tasklistjakarta.repository.UserRepository;
import com.artemnizhnyk.tasklistjakarta.repository.impl.UserRepositoryImpl;
import com.artemnizhnyk.tasklistjakarta.service.UserService;
import com.artemnizhnyk.tasklistjakarta.web.dto.TaskDto;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public User getUserById(final Long id) {
       return userRepository.getUserById(id);
    }

    @Override
    public List<Task> getTasksByUserId(final Long id) {
        return null;
    }

    @Override
    public Task createTask(final TaskDto taskDto) {
        return null;
    }

    @Override
    public User updateUser(final TaskDto taskDto) {
        return null;
    }

    @Override
    public boolean deleteUser() {
        return false;
    }
}

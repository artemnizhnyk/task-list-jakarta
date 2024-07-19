package com.artemnizhnyk.tasklistjakarta.service;

import com.artemnizhnyk.tasklistjakarta.domain.model.Task;
import com.artemnizhnyk.tasklistjakarta.domain.model.User;
import com.artemnizhnyk.tasklistjakarta.web.dto.AnswerDto;
import com.artemnizhnyk.tasklistjakarta.web.dto.TaskDto;
import com.artemnizhnyk.tasklistjakarta.web.dto.UserDto;

import java.util.List;

public interface UserService {

    User getUserById(Long id);

    List<Task> getTasksByUserId(Long id);

    Task createTask(TaskDto taskDto);

    User updateUser(TaskDto taskDto);

    boolean deleteUser();
}

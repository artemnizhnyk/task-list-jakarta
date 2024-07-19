package com.artemnizhnyk.tasklistjakarta.web.rest.controller;

import com.artemnizhnyk.tasklistjakarta.web.dto.AnswerDto;
import com.artemnizhnyk.tasklistjakarta.web.dto.TaskDto;
import com.artemnizhnyk.tasklistjakarta.web.dto.UserDto;

import java.util.ArrayList;
import java.util.List;

public class UserRestControllerV1 {

    UserDto getUserById(final Long id) {
        return null;
    }

    List<TaskDto> getTasksByUserId() {
        return new ArrayList<>();
    }

    TaskDto createTask() {
        return null;
    }

    UserDto updateUser() {
        return null;
    }

    AnswerDto deleteUser() {
        return null;
    }
}

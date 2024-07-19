package com.artemnizhnyk.tasklistjakarta.web.rest.controller;

import com.artemnizhnyk.tasklistjakarta.domain.model.Task;
import com.artemnizhnyk.tasklistjakarta.domain.model.User;
import com.artemnizhnyk.tasklistjakarta.service.UserService;
import com.artemnizhnyk.tasklistjakarta.service.impl.UserServiceImpl;
import com.artemnizhnyk.tasklistjakarta.web.dto.AnswerDto;
import com.artemnizhnyk.tasklistjakarta.web.dto.TaskDto;
import com.artemnizhnyk.tasklistjakarta.web.dto.UserDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

@Path("/v1")
public class UserRestControllerV1 {

    private final UserService userService = new UserServiceImpl();
    private final ObjectMapper objectMapper = new ObjectMapper();

    @GET
    @Path("/users/{id}")
    @Produces("application/json")
    public Response getUserById(@PathParam("id") final Long id) {
        User userById = userService.getUserById(id);
        UserDto userDto = UserDto.builder()
                .id(userById.getId())
                .username(userById.getUsername())
                .password(userById.getPassword())
                .tasks(new ArrayList<>())
                .build();
        return Response.ok(
                userDto
        ).build();
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

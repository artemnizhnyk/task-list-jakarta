package com.artemnizhnyk.tasklistjakarta.web.rest.controller;

import com.artemnizhnyk.tasklistjakarta.domain.model.Task;
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
    @Path("/api/v1/users/{id}")
    @Produces("application/json")
    public Response getUserById(@PathParam("id") final Long id) {
        return Response.ok(UserDto.builder()
                        .id(id)
                        .username("any")
                        .password("123")
                        .tasks(List.of(new Task(228L)))
                .build()
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

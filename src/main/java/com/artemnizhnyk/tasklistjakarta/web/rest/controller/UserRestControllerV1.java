package com.artemnizhnyk.tasklistjakarta.web.rest.controller;

import com.artemnizhnyk.tasklistjakarta.web.dto.AnswerDto;
import com.artemnizhnyk.tasklistjakarta.web.dto.TaskDto;
import com.artemnizhnyk.tasklistjakarta.web.dto.UserDto;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

@Path("/v1")
public class UserRestControllerV1 {

    private final Jsonb jsonb = JsonbBuilder.create();

    @GET
    @Path("/api/v1/users/{id}")
    @Produces("application/json")
    public Response getUserById(@PathParam("id") final Long id) {
        return Response.ok(new UserDto()).build();
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

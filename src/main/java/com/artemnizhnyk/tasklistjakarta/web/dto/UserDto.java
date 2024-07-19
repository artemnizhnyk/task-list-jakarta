package com.artemnizhnyk.tasklistjakarta.web.dto;

import com.artemnizhnyk.tasklistjakarta.domain.model.Task;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Builder
@Data
public class UserDto {

    private Long id;
    private String username;
    private String password;
    private List<Task> tasks;
}
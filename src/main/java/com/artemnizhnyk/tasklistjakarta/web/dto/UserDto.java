package com.artemnizhnyk.tasklistjakarta.web.dto;

import com.artemnizhnyk.tasklistjakarta.domain.model.Task;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@Builder
@Getter
@Setter
@Data
public class UserDto {

    private Long id;
    private String username;
    private String password;
    private List<Task> tasks;
}
package com.artemnizhnyk.tasklistjakarta.domain.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class User {
    private Long id;
    private String username;
    private String password;
    private List<Task> tasks;
}

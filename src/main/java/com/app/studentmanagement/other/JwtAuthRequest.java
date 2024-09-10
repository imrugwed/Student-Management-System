package com.app.studentmanagement.other;

import lombok.Data;

@Data
public class JwtAuthRequest {

    private String username;

    private String password;
}


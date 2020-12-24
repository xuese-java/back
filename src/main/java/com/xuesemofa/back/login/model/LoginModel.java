package com.xuesemofa.back.login.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginModel {

    private String email;

    private String password;
}

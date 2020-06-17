package com.assessment.domain;

import java.io.Serializable;
public class AuthResponse implements Serializable {

    private final String jwttoken;

    public AuthResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getToken() {
        return this.jwttoken;
    }
}
package com.michalszalkowski.demo;

public class UserDto {
    
    private String user;
    private String pass;

    public UserDto(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getUser() {
        return this.user;
    }

    public String getPass() {
        return this.pass;
    }
}

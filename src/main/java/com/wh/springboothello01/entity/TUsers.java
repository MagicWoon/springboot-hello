package com.wh.springboothello01.entity;

import lombok.ToString;

import javax.validation.constraints.NotNull;

@ToString
public class TUsers {
    private Integer id;
    @NotNull
    private String password;
    @NotNull
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}
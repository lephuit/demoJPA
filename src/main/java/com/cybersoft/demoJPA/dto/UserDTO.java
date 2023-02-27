package com.cybersoft.demoJPA.dto;

import javax.persistence.Column;

public class UserDTO {

    private String email;

    private String password;

    private String fullname;

    private String avatar;

    private  int roleID;

    public UserDTO(String email, String password){
        this.email=email;
        this.password=password;
    }
    public UserDTO(){

    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int role_id) {
        this.roleID = role_id;
    }
}

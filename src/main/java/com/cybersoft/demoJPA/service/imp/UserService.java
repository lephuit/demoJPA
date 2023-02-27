package com.cybersoft.demoJPA.service.imp;

import com.cybersoft.demoJPA.dto.UserDTO;
import com.cybersoft.demoJPA.entity.Users;
import com.cybersoft.demoJPA.payload.LoginRequest;

import java.util.List;

public interface UserService {
    boolean login(LoginRequest loginRequest);
    List<UserDTO> findByEmailAndPassword(String email,String password);
    boolean insertUser(UserDTO userDTO);
    List<UserDTO> getAllUsers();
    List<UserDTO> getUserByEmailAndRoleName(String email, String roleName);

}

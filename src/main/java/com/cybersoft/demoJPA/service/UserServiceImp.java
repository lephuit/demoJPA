package com.cybersoft.demoJPA.service;

import com.cybersoft.demoJPA.dto.RoleDTO;
import com.cybersoft.demoJPA.dto.UserDTO;
import com.cybersoft.demoJPA.entity.Roles;
import com.cybersoft.demoJPA.entity.Users;
import com.cybersoft.demoJPA.payload.LoginRequest;
import com.cybersoft.demoJPA.repository.UserRepository;
import com.cybersoft.demoJPA.service.imp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;


    @Override
    public boolean login(LoginRequest loginRequest) {
        return userRepository.getUserByEmailAndRoleName(loginRequest.getEmail(), loginRequest.getPassword()).size()>0;
    }

    @Override
    public List<UserDTO> findByEmailAndPassword(String email, String password){
        List<Users> list = userRepository.findByEmailAndPassword(email,password);
        List<UserDTO> dtoList = new ArrayList<>();
        for (Users data:list) {
            UserDTO userDTO = new UserDTO(email,password);
            userDTO.setEmail(data.getEmail());
            userDTO.setPassword(data.getPassword());
            dtoList.add(userDTO);
        }
        return dtoList;
    }

    @Override
    public boolean insertUser(UserDTO userDTO) {
        Roles roles = new Roles();
        roles.setId(userDTO.getRoleID());

        Users users = new Users();
        users.setEmail(userDTO.getEmail());
        users.setPassword(userDTO.getPassword());
        users.setAvatar(userDTO.getAvatar());
        users.setRoles(roles);

        try {
            userRepository.save(users);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserDTO> list = new ArrayList<>();
        for (Users users: userRepository.getAllUser()) {
            UserDTO userDTO = new UserDTO();
            userDTO.setEmail(users.getEmail());
            userDTO.setPassword(users.getPassword());
            userDTO.setFullname(users.getFullname());
            userDTO.setAvatar(users.getAvatar());

            list.add(userDTO);

        }
        return list;
    }

    public List<UserDTO> getUserByEmailAndRoleName(String email, String roleName) {
        List<UserDTO> list = new ArrayList<>();
        for (Users users: userRepository.getUserByEmailAndRoleName(email,roleName)) {
            UserDTO userDTO = new UserDTO();
            userDTO.setEmail(users.getEmail());
            userDTO.setPassword(users.getPassword());
            userDTO.setFullname(users.getFullname());
            userDTO.setAvatar(users.getAvatar());

            list.add(userDTO);

        }
        return list;
    }
}

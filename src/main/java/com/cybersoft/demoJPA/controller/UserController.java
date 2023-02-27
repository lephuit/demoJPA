package com.cybersoft.demoJPA.controller;

import com.cybersoft.demoJPA.entity.Users;
import com.cybersoft.demoJPA.payload.LoginRequest;
import com.cybersoft.demoJPA.service.imp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/{email}/{password}")
    public ResponseEntity<?> getRoleByName(@PathVariable String email,@PathVariable String password){
        return new ResponseEntity<>(userService.findByEmailAndPassword(email,password), HttpStatus.OK);
    }
    @PostMapping("")
    public  ResponseEntity<?> login(@RequestBody LoginRequest loginRequest){
        return new ResponseEntity<>(userService.login(loginRequest),HttpStatus.OK);
    }
//    @PostMapping("")
//    public ResponseEntity<?> (@RequestBody List<Users> users ){
//        List<Users> list = new ArrayList<>();
//        Users users = new Users();
//        users.setAvatar(avatar);
//        users.setEmail(email);
//        users.setPassword(password);
//        users.setRoles(roles);
//        list.add(users);
//        return new ResponseEntity<>(users,HttpStatus.OK)
//    }
    @GetMapping("")
    public ResponseEntity<?> getAllUser(){
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
    }
    @GetMapping("/getUserByEmailAndRoleName")
    public ResponseEntity<?> getUserByEmailAndRoleName(@PathVariable String email,@PathVariable String roleName){
        return new ResponseEntity<>(userService.getUserByEmailAndRoleName(email,roleName), HttpStatus.OK);
    }
}

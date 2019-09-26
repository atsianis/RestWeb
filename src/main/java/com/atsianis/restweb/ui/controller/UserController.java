/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atsianis.restweb.ui.controller;

import com.atsianis.restweb.service.UserService;
import com.atsianis.restweb.ui.model.request.UserDetailsRequestModel;
import com.atsianis.restweb.ui.model.response.UserRest;
import com.atsianis.restweb.shared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author samsung np350
 */
@RestController
@RequestMapping("users") // https://localhost:8080/users
public class UserController {
    
    @Autowired
    UserService userService;
    
    @GetMapping
    public String getUser(){
        return "get user was called";
    }
    
    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails){
        UserRest returnValue = new UserRest();
        
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetails,userDto);
        
        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser,returnValue);
        
        return returnValue;
    }
    
    @PutMapping
    public String updateUser(){
        return "update user was called";
    }
    
    @DeleteMapping
    public String deleteUser(){
        return "delete user was called";
    }
}

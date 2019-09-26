/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atsianis.restweb.service;

import com.atsianis.restweb.shared.dto.UserDto;

/**
 *
 * @author samsung np350
 */
public interface UserService {
    
    UserDto createUser(UserDto user);
    
}

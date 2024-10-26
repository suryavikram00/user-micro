/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feign.user_micro.service;

import com.feign.user_micro.entity.UserEntity;
import com.api.open.crud.api.service.IOpenCrudService;

/**
 *
 * @author NMSLAP570
 */
public interface IUserService
        extends IOpenCrudService<UserEntity, Long> {    
}

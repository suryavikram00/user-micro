/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feign.user_micro.repository;

import com.api.open.crud.api.repository.OpenCrudApiRepository;
import com.feign.user_micro.entity.UserEntity;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author NMSLAP570
 */
@Repository
@Transactional
public interface IUserRepository
        extends OpenCrudApiRepository<UserEntity, Long> {

}

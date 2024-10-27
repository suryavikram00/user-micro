package com.feign.user_micro.entity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




import javax.persistence.Entity;
import javax.persistence.Table;

import com.open.feign_client.entity.user_micro.UserEntityModel;

/**
 *
 * @author NMSLAP570
 */
@Entity
@Table(name = "user")
public class UserEntity extends UserEntityModel {

}

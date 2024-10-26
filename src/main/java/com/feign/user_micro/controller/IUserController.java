package com.feign.user_micro.controller;

import com.api.open.crud.api.controller.IOpenCrudController;
import com.feign.user_micro.entity.UserEntity;


public interface IUserController
        extends IOpenCrudController<UserEntity, Long> {

}
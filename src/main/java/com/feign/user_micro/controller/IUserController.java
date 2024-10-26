package com.feign.user_micro.controller;

import org.springframework.http.ResponseEntity;

import com.api.open.crud.api.controller.IOpenCrudController;
import com.api.open.crud.api.exception.model.CrudApiResponse;
import com.feign.user_micro.entity.UserEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


public interface IUserController
        extends IOpenCrudController<UserEntity, Long> {

}
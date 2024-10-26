package com.feign.user_micro.controller;

import static com.feign.user_micro.constant.UserMicroEndPoints.ENDPOINT_USER;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.open.crud.api.controller.OpenCrudController;
import com.feign.user_micro.entity.UserEntity;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
@RequestMapping(path = ENDPOINT_USER)
public class UserController
        extends OpenCrudController<UserEntity, Long> implements IUserController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello World";
  }

}

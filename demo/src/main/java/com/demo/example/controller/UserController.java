package com.demo.example.controller;

import com.demo.example.enetity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: UserController
 * @date: 2022/4/19 下午7:51
 * @author: zcy
 * @version: 1.0
 */
@RestController
public class UserController {

    @RequestMapping(value = "/user/{id}/{name}")
    public User getUser(@PathVariable("id")Integer id,@PathVariable("name")String name){
        try {
            Thread.sleep(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new User(id,name);
    }
}

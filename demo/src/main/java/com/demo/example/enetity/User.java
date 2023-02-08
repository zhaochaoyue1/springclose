package com.demo.example.enetity;

import java.io.Serializable;

/**
 * @description: User
 * @date: 2022/4/19 下午7:53
 * @author: zcy
 * @version: 1.0
 */

public class User implements Serializable {
    private int userId;
    private String userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User() {
    }

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}

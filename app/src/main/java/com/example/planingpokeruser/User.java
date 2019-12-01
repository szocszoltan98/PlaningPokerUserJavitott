package com.example.planingpokeruser;

public class User {
    String UserID;
    String UserName;


    public User() {

    }

    public User(String userID, String userName) {
        UserID = userID;
        UserName = userName;
    }

    public String getUserID() {
        return UserID;
    }

    public String getUserName() {
        return UserName;
    }
}
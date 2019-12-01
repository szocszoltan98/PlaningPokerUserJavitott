package com.example.planingpokeruser;

public class Groups {
    String GroupID;
    String Groupname;

    public Groups(){

    }

    public Groups(String groupID, String groupname) {
        GroupID = groupID;
        Groupname = groupname;
    }

    public String getGroupID() {
        return GroupID;
    }

    public String getGroupname() {
        return Groupname;
    }
}
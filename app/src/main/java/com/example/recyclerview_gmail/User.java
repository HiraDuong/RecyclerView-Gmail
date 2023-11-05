package com.example.recyclerview_gmail;

public class User {
    private int resourceId;
    private String name;

    public String getSubText() {
        return subText;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }

    private String subText;
    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int resourceId, String name,String subText){
        this.resourceId = resourceId;
        this.name = name;
        this.subText = subText;
    }

}

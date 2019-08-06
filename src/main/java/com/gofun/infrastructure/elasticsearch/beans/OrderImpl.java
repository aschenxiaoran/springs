package com.gofun.infrastructure.elasticsearch.beans;

public class OrderImpl implements  Order {

    private User user;

    public OrderImpl(User user){
        this.user=user;
    }

    public String getUserName(){
        return user.getOtherName();
    }

}

package com.gofun.infrastructure.elasticsearch.beans;

import lombok.Data;

@Data
public class UserImpl implements User {

    public String name;

    public String code;

    @Override
    public String getOtherName() {
        return "xiaoran";
    }
}

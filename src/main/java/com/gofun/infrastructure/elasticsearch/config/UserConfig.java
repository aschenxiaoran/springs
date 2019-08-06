package com.gofun.infrastructure.elasticsearch.config;

import com.gofun.infrastructure.elasticsearch.beans.Order;
import com.gofun.infrastructure.elasticsearch.beans.OrderImpl;
import com.gofun.infrastructure.elasticsearch.beans.User;
import com.gofun.infrastructure.elasticsearch.beans.UserImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public User user(){
        return new UserImpl();
    }

    @Bean
    public Order order(){
        return new OrderImpl(user());
    }

}

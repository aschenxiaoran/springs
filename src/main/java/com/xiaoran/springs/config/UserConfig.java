package com.xiaoran.springs.config;

import com.xiaoran.springs.beans.Order;
import com.xiaoran.springs.beans.OrderImpl;
import com.xiaoran.springs.beans.User;
import com.xiaoran.springs.beans.UserImpl;
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

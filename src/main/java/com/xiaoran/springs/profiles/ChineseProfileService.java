package com.xiaoran.springs.profiles;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile(value = "dev")
@Component
public class ChineseProfileService implements SpeakProfileService {
    @Override
    public void speak() {
        System.out.println("这个是中国人在说话！");
    }
}

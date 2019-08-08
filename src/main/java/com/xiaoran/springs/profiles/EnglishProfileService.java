package com.xiaoran.springs.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "qa")
public class EnglishProfileService implements SpeakProfileService {
    @Override
    public void speak() {
        System.out.println("这个是英国人在说话！");
    }
}

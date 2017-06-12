package com.example.analysis;

import com.example.analysis.domain.User;
import com.example.analysis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by puroc on 17/5/26.
 */
@Component
public class TestService implements CommandLineRunner {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("bb");
        userMapper.insert(new User(){{
            this.setName("1111");
        }});
        System.out.println("aaa");
    }
}

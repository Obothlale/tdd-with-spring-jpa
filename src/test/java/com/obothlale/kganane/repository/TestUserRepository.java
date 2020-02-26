package com.obothlale.kganane.repository;

import com.obothlale.kganane.Application;
import com.obothlale.kganane.entity.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {Application.class})
@ActiveProfiles("test")
public class TestUserRepository {

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setup() {
//        User user = new User();
//        user.setId(1L);
//        user.setName("Obothlale");
//        user.setSurname("Kganane");
//        userRepository.save(user);
    }

    @Test
    public void testFindAll() {
        List<User> users = userRepository.findAll();
        Assert.assertTrue(users.size() > 0);
        users.forEach(user -> System.out.println(user));
    }
}

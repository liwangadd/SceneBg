package com.windylee.scene.controller;

import com.windylee.scene.entity.User;
import com.windylee.scene.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by windy on 17/4/4.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/register")
    public Map<String, ?> index(User registerUser) {
        User user=userRepository.findByUsername(registerUser.getUsername());
        Map<String, Object> result = new HashMap<String, Object>();
        if(user==null) {
            registerUser = userRepository.save(registerUser);
            result.put("success", true);
            result.put("user_id", registerUser.getId());
        }else{
            result.put("success", false);
            result.put("user_id", -1);
        }
        return result;
    }

    @RequestMapping("/login")
    public Map<String, ?> doLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
        User user = userRepository.findByUsernameAndPassword(username, password);
        Map<String, Object> result = new HashMap<String, Object>();
        if (user != null) {
            result.put("success", true);
            result.put("user_id", user.getId());
        } else {
            result.put("success", false);
            result.put("suer_id", -1);
        }
        return result;
    }

}

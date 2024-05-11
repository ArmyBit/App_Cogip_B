package com.appcogip.off.Controller;

import com.appcogip.off.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController  {
    @Autowired
    UserService userService;
    @GetMapping("/")
    public String index() {
        if(userService.getUser(0).isEmpty()){
            return "User not found";
        }
        else {
            return userService.getUser(0).get().getUsername();
        }
    }
}

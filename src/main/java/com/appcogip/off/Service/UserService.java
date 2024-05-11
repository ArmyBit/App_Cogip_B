package com.appcogip.off.Service;

import com.appcogip.off.Entity.User;
import com.appcogip.off.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo a;
    public Optional<User> getUser(int id) {
        return a.findById(0);
    }
}

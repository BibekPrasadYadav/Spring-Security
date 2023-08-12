package com.example.jwt.services;

import com.example.jwt.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    private List<User> list=new ArrayList<>();

    public UserServiceImpl(){
        list.add(new User(UUID.randomUUID().toString(),"Bibek","bibek@gmail.com"));
        list.add(new User(UUID.randomUUID().toString(),"Rohit","rohit@gmail.com"));
        list.add(new User(UUID.randomUUID().toString(),"Ajay","ajay@gmail.com"));
    }
    @Override
    public List<User> getAllUser() {
        return list;
    }

    ;
}

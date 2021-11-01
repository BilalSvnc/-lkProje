package com.example.lkproje.HelloWorld.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResearch {
    @Autowired
    UserDAOService service;

    @GetMapping(path = "/KİŞİLER")
    public List<User> bob() {
        return service.findAll();

    }
    @PostMapping(path = "/HEHE")
    public User yeni(@RequestBody User user) {
        return service.Save(user);
    }
    @DeleteMapping(path = "/SİL/{ID}")
    public User yoket(@PathVariable int ID) {
        return service.silme(ID);

    }

}

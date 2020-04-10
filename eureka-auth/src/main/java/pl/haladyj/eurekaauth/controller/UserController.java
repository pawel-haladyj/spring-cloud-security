package pl.haladyj.eurekaauth.controller;

import org.springframework.web.bind.annotation.*;
import pl.haladyj.eurekaauth.model.AppUser;
import pl.haladyj.eurekaauth.service.implementation.UserServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class UserController {

    private final UserServiceImpl service;

    public UserController(UserServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/user/{id}")
    public AppUser getUserById(@PathVariable("id") final Long id){
        return service.getUserById(id);
    }

    @GetMapping("/users")
    public List<AppUser> getAllUsers(){
        return service.getAllUsers();
    }

    @PostMapping("/user")
    public AppUser createUser(@RequestBody AppUser user){
        return service.createUser(user);
    }
}

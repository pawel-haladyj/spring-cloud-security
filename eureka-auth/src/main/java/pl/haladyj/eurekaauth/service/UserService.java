package pl.haladyj.eurekaauth.service;

import pl.haladyj.eurekaauth.model.AppUser;

import java.util.List;

public interface UserService {
    AppUser getUserById(Long id);
    List<AppUser> getAllUsers();
    AppUser createUser(AppUser user);
}

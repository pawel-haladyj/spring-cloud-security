package pl.haladyj.eurekaauth.service.implementation;

import org.springframework.stereotype.Service;
import pl.haladyj.eurekaauth.model.AppUser;
import pl.haladyj.eurekaauth.repository.UserRepository;
import pl.haladyj.eurekaauth.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public AppUser getUserById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<AppUser> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public AppUser createUser(AppUser user) {
        return repository.save(user);
    }
}

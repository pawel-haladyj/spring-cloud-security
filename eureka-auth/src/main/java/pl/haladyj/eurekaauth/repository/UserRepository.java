package pl.haladyj.eurekaauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.haladyj.eurekaauth.model.AppUser;

@Repository
public interface UserRepository extends JpaRepository<AppUser,Long> {
}

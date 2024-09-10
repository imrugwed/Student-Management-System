package com.app.studentmanagement.repository;


import com.app.studentmanagement.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);

    User findByUsernameAndPassword(String username, String password);
}

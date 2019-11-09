package ru.karmanno.cloudsintegration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.karmanno.cloudsintegration.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
}

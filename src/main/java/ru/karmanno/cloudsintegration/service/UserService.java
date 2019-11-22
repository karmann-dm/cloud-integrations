package ru.karmanno.cloudsintegration.service;

import ru.karmanno.cloudsintegration.entity.User;

public interface UserService {
    User createNewUser(String username, String encodedPassword);
}

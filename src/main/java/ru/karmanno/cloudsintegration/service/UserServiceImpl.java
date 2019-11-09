package ru.karmanno.cloudsintegration.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.karmanno.cloudsintegration.entity.User;
import ru.karmanno.cloudsintegration.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User createNewUser(String username, String encodedPassword) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(encodedPassword);
        return userRepository.save(user);
    }
}

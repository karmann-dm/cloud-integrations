package ru.karmanno.cloudsintegration.config;

import org.springframework.security.core.Authentication;

public interface JwtProvider {
    String generate(Authentication authentication);
    boolean isTokenValid(String token);
    JwtAuth unwrap(String token);
}

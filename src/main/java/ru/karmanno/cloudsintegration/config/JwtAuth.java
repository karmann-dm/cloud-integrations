package ru.karmanno.cloudsintegration.config;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class JwtAuth {
    private final String userId;
}

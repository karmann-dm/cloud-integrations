package ru.karmanno.cloudsintegration.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "jwt-provider")
@Data
public class JwtProviderProperties {
    private String secret;
    private Long expirationInMs;
}

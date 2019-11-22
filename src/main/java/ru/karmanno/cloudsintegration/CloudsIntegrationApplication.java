package ru.karmanno.cloudsintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.karmanno.cloudsintegration.properties.JwtProviderProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        JwtProviderProperties.class
})
public class CloudsIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudsIntegrationApplication.class, args);
    }

}

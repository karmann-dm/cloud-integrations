package ru.karmanno.cloudsintegration.cloud.google;

import org.springframework.stereotype.Component;

@Component
public class GoogleCloudAuthProvider implements CloudAuthProvider {
    @Override
    public AuthorizedAccount authorize() {
        return null;
    }
}

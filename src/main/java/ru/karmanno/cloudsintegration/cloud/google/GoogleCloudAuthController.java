package ru.karmanno.cloudsintegration.cloud.google;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class GoogleCloudAuthController {

    @GetMapping("/google/auth")
    public RedirectView getAuthPage() {
        return new RedirectView("");
    }
}

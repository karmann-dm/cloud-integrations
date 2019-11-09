package ru.karmanno.cloudsintegration.config;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import ru.karmanno.cloudsintegration.properties.JwtProviderProperties;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class JwtProviderImpl implements JwtProvider {
    private final JwtProviderProperties jwtProviderProperties;

    @Override
    public String generate(Authentication authentication) {
        UserDetails details = (UserDetails) authentication.getPrincipal();
        Date expirationDate = new Date(new Date().getTime() + jwtProviderProperties.getExpirationInMs());

        return Jwts.builder()
                .setSubject(details.getId())
                .setIssuedAt(new Date())
                .setExpiration(expirationDate)
                .signWith(SignatureAlgorithm.HS512, jwtProviderProperties.getSecret())
                .compact();
    }

    @Override
    public boolean isTokenValid(String token) {
        try {
            Jwts.parser()
                    .setSigningKey(jwtProviderProperties.getSecret())
                    .parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public JwtAuth unwrap(String token) {
        return null;
    }
}

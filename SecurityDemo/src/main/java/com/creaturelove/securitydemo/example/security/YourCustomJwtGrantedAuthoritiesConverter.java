package com.creaturelove.securitydemo.example.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;

import java.util.Collection;

public class YourCustomJwtGrantedAuthoritiesConverter extends JwtGrantedAuthoritiesConverter {
    @Override
    public Collection<GrantedAuthority> convert(Jwt jwt) {
        // 从 JWT 中提取权限
        return super.convert(jwt);
    }
} 
package com.dev.web_keycloack.web_keycloack.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration

public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain (HttpSecurity http) throws Exception{
        http .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/products").authenticated()
                        .anyRequest().permitAll()
                )
                .oauth2Login(Customizer.withDefaults());
                return http.build();
    }
}

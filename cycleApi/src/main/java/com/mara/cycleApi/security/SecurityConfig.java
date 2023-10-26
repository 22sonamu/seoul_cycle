package com.mara.cycleApi.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws  Exception{
        http.authorizeRequests().anyRequest().permitAll();
        http.sessionManagement(session -> session.sessionCreationPolicy((SessionCreationPolicy.STATELESS)));
        http.csrf().disable();
        http.headers().frameOptions().sameOrigin();
        return http.build();


}
}

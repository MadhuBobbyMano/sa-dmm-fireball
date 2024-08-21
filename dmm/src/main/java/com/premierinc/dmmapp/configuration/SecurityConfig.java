package com.premierinc.dmmapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http, MvcRequestMatcher.Builder mvc) throws Exception {

        // TODO: Modify to meet your security requirements
        // https://spring.io/guides/gs/securing-web/
        http
                .csrf(csrf -> csrf.disable())
                // Uncomment if performing file uploads via Fireball services layer
                //.headers(headers -> headers.frameOptions(frameOptions -> frameOptions.disable().disable()))
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers(mvc.pattern("/**")).permitAll()
                        .anyRequest().authenticated()
                )
                .httpBasic(httpBasic -> httpBasic.disable());
        return http.build();
    }

    @Bean
    MvcRequestMatcher.Builder mvc(HandlerMappingIntrospector introspector) {
        return new MvcRequestMatcher.Builder(introspector);
    }

}
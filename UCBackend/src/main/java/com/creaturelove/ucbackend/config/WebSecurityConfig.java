package com.creaturelove.ucbackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(authorize -> authorize
                        // set authentication to all request
                        .anyRequest()
                        // .authenticate() permit all authenticated request
                        .permitAll()
                )
                .formLogin(Customizer.withDefaults());
        return http.build();
    }



    @Bean
    UserDetailsManager users(DataSource dataSource) {
        return new JdbcUserDetailsManager(dataSource);
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // No Auth
    //@Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests(authorize -> authorize
//                        // set authentication to all request
//                        .anyRequest()
//                        // .authenticate() permit all authenticated request
//                        .permitAll()
//                )
//                .formLogin(Customizer.withDefaults());
//        return http.build();
//    }

    // Default Config
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(authorize -> authorize
//                        .anyRequest().authenticated()
//                )
//                .formLogin(Customizer.withDefaults())
//                .httpBasic(Customizer.withDefaults());
//        return http.build();
//    }
}
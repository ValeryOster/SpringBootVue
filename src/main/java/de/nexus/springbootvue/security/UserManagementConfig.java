package de.nexus.springbootvue.security;

import de.nexus.springbootvue.services.InMemoryUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Configuration
public class UserManagementConfig {
//
//    @Bean
//    UserDetailsService userDetailsService() {
//        UserDetails user = User.withUsername("arr")
//                .password("777")
//                .roles("read")
//                .build();
//        return new InMemoryUserDetailsService(List.of(user));
//    }
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
}
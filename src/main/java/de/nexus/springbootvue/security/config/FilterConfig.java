package de.nexus.springbootvue.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;

//@Configuration
public class FilterConfig {

    //    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(authorizeRequests -> {
//                    authorizeRequests.requestMatchers("/hello").authenticated()
//                            .requestMatchers("/api/person/save").authenticated()
//                            .requestMatchers("/api/person/get").permitAll()
//                            .anyRequest().permitAll()
//                    ;
//                });
//        http.authorizeHttpRequests(authorizeRequests -> authorizeRequests.anyRequest().permitAll());
//        return http.build();
//    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.cors(httpSecurityCorsConfigurer ->
                httpSecurityCorsConfigurer.configurationSource(request ->
                        new CorsConfiguration().applyPermitDefaultValues()
                )
        );
        http.authorizeHttpRequests(authorizeRequests -> authorizeRequests.anyRequest()
                .permitAll()).csrf(AbstractHttpConfigurer::disable);
        return http.build();
    }
}

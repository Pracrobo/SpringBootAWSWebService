package com.springboot.practice.config.auth;

import com.springboot.practice.domain.user.Role;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final CustomOAuth2UserService customOAuth2UserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().headers().frameOptions().disable().and().authorizeRequests().antMathchers("/", "/css/**", "/images/**", "/js/**", "/h2-console/**")
                .permitAll().antMatchers("/api/v1/*")
                .hasRole(Role.USER.name()).anyRequest().authenticated().and().logout().logoutSuccessUrl("/").and().oauth2Login().userInfoEndpoint().userService(customOAuth2UserService);

    }
}

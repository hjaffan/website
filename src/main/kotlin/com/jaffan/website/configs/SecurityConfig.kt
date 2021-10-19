package com.jaffan.website.configs

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity

@Configuration
class SecurityConfig {

    @Override
    fun configure(http HttpSecurity) {
        http.au
    }
}
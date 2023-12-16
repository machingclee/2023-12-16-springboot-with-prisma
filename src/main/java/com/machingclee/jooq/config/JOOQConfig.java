package com.machingclee.jooq.config;

import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JOOQConfig {
    @Value("${spring.datasource.url}")
    private String jdbcUrl;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Bean
    DSLContext getDSLContext() {
        DSLContext dslContext = DSL.using(jdbcUrl, username, password);
        return dslContext;
    }

}

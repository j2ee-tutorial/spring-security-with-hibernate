package com.javastudio.tutorial.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import java.util.logging.Logger;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
    Logger logger = Logger.getLogger(SecurityWebApplicationInitializer.class.getName());

    public SecurityWebApplicationInitializer() {
        super(SecurityConfig.class);
        logger.info("Initializing Filter for Spring Security");
    }
}

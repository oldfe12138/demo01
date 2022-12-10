package com.fe.config;


import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.fe.config")
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {




}

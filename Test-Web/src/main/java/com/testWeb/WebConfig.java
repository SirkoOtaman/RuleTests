package com.testWeb;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by shychka on 3/27/2015.
 */
@Configuration
@ComponentScan("com.TestWeb")
@Import(SecurityConfig.class)
public class WebConfig {
}

package org.springtest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("org.springtest.beans")
public class AppConfig {
}

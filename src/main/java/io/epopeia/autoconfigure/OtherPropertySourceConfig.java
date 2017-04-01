package io.epopeia.autoconfigure;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:another-source-file.properties")
public class OtherPropertySourceConfig {

}

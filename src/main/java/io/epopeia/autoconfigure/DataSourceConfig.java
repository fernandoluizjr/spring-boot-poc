package io.epopeia.autoconfigure;

import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.H2;
import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.HSQL;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

@Configuration
public class DataSourceConfig {

	// I excluded DataSourceAutoConfig to control here using profile

	@Bean
	@Profile("dev")
	public DataSource h2() {
		return new EmbeddedDatabaseBuilder().setType(H2).build();
	}

	@Bean
	@Profile("stage")
	public DataSource hsql() {
		return new EmbeddedDatabaseBuilder().setType(HSQL).build();
	}
}

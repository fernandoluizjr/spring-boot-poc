package io.epopeia.web;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataSourceController {

	private final DataSource dataSource;

	public DataSourceController(final DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@RequestMapping("/datasource")
	public String embeddedDataSource() throws SQLException {
		return dataSource.getConnection().getMetaData().getDatabaseProductName();
	}
}

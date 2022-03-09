package com.dell.dremioclient.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DataSourceConfig {

	private String dbDriverClass = "oracle.jdbc.driver.OracleDriver";

	@Bean
	public DataSource dataSource() {

		HikariConfig configuration = new HikariConfig();

		configuration.setJdbcUrl("DB_URL"); 
	    configuration.setUsername("USER_NAME");
		configuration.setPassword("PASSWORD"); // Should be moved to properties file or Vault

		configuration.setDriverClassName(dbDriverClass);
		configuration.setMaximumPoolSize(20);
		configuration.setConnectionTimeout(30000);
		configuration.setMaxLifetime(1800000); 
		configuration.setMinimumIdle(1);

		return new HikariDataSource(configuration);
	}

	@Bean
	public DataSourceTransactionManager transactionManager(
			DataSource datasource) {
		return new DataSourceTransactionManager(datasource);
	}
}

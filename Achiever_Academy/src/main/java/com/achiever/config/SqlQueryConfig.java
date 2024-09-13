package com.achiever.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
@Configurable
@PropertySource("classpath:sql-queries.properties")
public class SqlQueryConfig {
	
	@Value("${sql.insert.student}")
	private String INSERT;
	
	@Value("${sql.update.student}")
	private String UPDATE;
	
	@Value("${sql.get.student}")
	private String GET_STUDENT;
	
	@Value("${sql.delete.student}")
	private String DELETE;

	public String getINSERT() {
		return INSERT;
	}
	public String getUPDATE() {
		return UPDATE;
	}
	public String getGET_STUDENT() {
		return GET_STUDENT;
	}
	public String getDELETE() {
		return DELETE;
	}

	

}

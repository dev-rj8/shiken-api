package com.devrj.shiken.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = "com.devrj.shiken.repository")
public class MongoConfig extends AbstractMongoConfiguration {

	@Bean
	public Mongo mongo() throws Exception {
		return new MongoClient("ds131531.mlab.com", 31531);
	}

	@Override
	protected String getDatabaseName() {
		return "shiken";
	}

}

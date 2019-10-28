package com.radhe.modular;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

import cz.jirutka.spring.embedmongo.EmbeddedMongoFactoryBean;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

    private static final String MONGO_DB_URL = "localhost";

    private static final String MONGO_DB_NAME = "embeded_db";

    @Bean
    public MongoTemplate mongoTemplate() throws IOException {

        EmbeddedMongoFactoryBean mongo = new EmbeddedMongoFactoryBean();

        mongo.setBindIp(MONGO_DB_URL);

        MongoClient mongoClient = mongo.getObject();

        MongoTemplate mongoTemplate = new MongoTemplate(mongoClient, MONGO_DB_NAME);

        return mongoTemplate;

    }
}


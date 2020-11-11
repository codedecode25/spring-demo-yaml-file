package com.code.decode.yaml.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication

public class YamlDemo {

	public static void main(String[] args) {
		SpringApplication.run(YamlDemo.class, args);
    }
	

}

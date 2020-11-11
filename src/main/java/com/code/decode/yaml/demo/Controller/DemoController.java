package com.code.decode.yaml.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.decode.yaml.demo.YamlPropertySourceFactory;

@RestController
@ConfigurationProperties(prefix = "yaml")
@PropertySource(value = "classpath:application.yml", factory = YamlPropertySourceFactory.class)

public class DemoController {
	
	@Value("${spring.profiles.active}")
    private String springProfiles;

	@GetMapping("/codeDecode")
	public void codeDecodeControllerDemo() {
		
		System.out.println("springProfiles   " + springProfiles);
		
	}
	
	

}

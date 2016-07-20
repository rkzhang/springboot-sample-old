package com.springboot.example.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="system", locations="classpath:system.properties")
public class SystemConfiguration {

	@Getter
	@Setter
	private String name;
}

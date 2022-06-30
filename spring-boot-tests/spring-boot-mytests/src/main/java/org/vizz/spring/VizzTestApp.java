package org.vizz.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author vizz
 * @since 2022/6/30 15:14
 */
@SpringBootApplication
public class VizzTestApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(VizzTestApp.class);
	}
}

package com.example.springdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDeployApplication.class, args);
		System.out.println("El servidor está funcionando");
	}

}

package com.genesys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenesysApplication {

	public static void main(String[] args) {

		SpringApplication.run(GenesysApplication.class, args);
		System.out.println("Genesys Running .......");
	}

}

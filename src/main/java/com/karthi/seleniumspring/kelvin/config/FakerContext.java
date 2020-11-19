package com.karthi.seleniumspring.kelvin.config;

import org.springframework.context.annotation.Bean;

import com.github.javafaker.Faker;
import com.karthi.seleniumspring.kelvin.annotations.LazyConfiguration;

@LazyConfiguration
public class FakerContext {
	
	@Bean("fakerbean")
	public Faker fakerbean() {
		return new Faker();
	}

}

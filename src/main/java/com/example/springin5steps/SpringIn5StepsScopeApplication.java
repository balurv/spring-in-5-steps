package com.example.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springin5steps.scope.PersonDao;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		
		PersonDao person = applicationContext.getBean(PersonDao.class);
		
		PersonDao person2 = applicationContext.getBean(PersonDao.class);

		LOGGER.info("{}", person);
		LOGGER.info("{}", person.getJdbcConnection());

		LOGGER.info("{}", person2);
		LOGGER.info("{}", person2.getJdbcConnection());

	}
}
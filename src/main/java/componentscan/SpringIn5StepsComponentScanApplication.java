package componentscan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springin5steps.scope.PersonDao;

@SpringBootApplication
public class SpringIn5StepsComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		
		ComponentDao component = applicationContext.getBean(ComponentDao.class);
		LOGGER.info("{}", component);
	}
}
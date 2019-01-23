package horovyi.example.lifecyclebean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LifeCycleBeanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LifeCycleBeanApplication.class, args);
//		context.getBean("")
	}

}


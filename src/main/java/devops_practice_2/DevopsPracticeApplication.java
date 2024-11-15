package devops_practice_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class DevopsPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevopsPracticeApplication.class, args);
    }

}

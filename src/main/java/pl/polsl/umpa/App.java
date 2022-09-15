package pl.polsl.umpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableConfigurationProperties({ComponentUrlConfiguration.class})
@EnableJpaRepositories
public class App {//TODO frontend

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}

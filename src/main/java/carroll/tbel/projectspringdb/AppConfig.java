package carroll.tbel.projectspringdb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Scanner;

@Configuration
@Profile({"mock", "impl", "project"})
public class AppConfig {

    @Bean
    public Scanner scanner() {
        System.out.println("Initialisation of Scanner");
        return new Scanner(System.in);
    }

}

package example.config;

import example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle (){
        Vehicle ve = new Vehicle();
        ve.setName("Audi 8");
        return ve;
    }

    @Bean
    String hello(){
        return "hello world "   ;

    }

    @Bean
    Integer number (){
        return 19   ;
    }
}

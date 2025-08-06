package comment_post._3;

import comment_post._3.util.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication (scanBasePackages = "comment_post._3.util")
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class , args);
    }
    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }

}

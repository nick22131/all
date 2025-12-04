package studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootStudendCrudRestapiSimpleApplication {

	@Bean
     public ModelMapper modelMapper(){
		 return new ModelMapper();
	 }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudendCrudRestapiSimpleApplication.class, args);
	}

}

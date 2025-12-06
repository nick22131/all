package jdbc.jpa.jdbc_6Dec25_02;

import jdbc.jpa.jdbc_6Dec25_02.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class Jdbc6Dec2502Application implements CommandLineRunner  {

    private final UserService userService;

	public static void main(String[] args) {

        SpringApplication.run(Jdbc6Dec2502Application.class, args);
	}

    @Override
    public void run(String ... args){
        userService.createUserTable();
        userService.createUser("alice",45);
        userService.createUser("bob ", 35);
        userService.readUser();
    }
}

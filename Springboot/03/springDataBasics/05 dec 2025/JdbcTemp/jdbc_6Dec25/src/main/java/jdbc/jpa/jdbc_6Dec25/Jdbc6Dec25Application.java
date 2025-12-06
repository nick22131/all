package jdbc.jpa.jdbc_6Dec25;

import jdbc.jpa.jdbc_6Dec25.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class Jdbc6Dec25Application implements CommandLineRunner {

    private final UserService userService;

	public static void main(String[] args) {

        SpringApplication.run(Jdbc6Dec25Application.class, args);
	}

    @Override
    public void run(String ... args){
        userService.createTable();
        userService.insertUser("alice",56);
        userService.insertUser("bod",30);
        userService.getUsers();
    }

}

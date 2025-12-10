package jdbcTemp.jdbc_7Dec25;

import jdbcTemp.jdbc_7Dec25.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class Jdbc7Dec25Application implements CommandLineRunner {

    private final UserService userService;

	public static void main(String[] args) {

        SpringApplication.run(Jdbc7Dec25Application.class, args);
	}

    @Override
    public void run(String ... args){
        userService.createTable();
        userService.createUser("alice", 25);
        userService.createUser("bob",85);
        userService.createUser("name",78);
        userService.readUsers();
    }

}

package JdbcTemplete.JdbcTemplete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcTempleteApplication implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

	public static void main(String[] args) {

        SpringApplication.run(JdbcTempleteApplication.class, args);
	}

    @Override
    public void run(String ... args){
        userRepository.createTable();
    }


}

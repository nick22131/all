package example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

        private String name;

        public void setName(String name) {

            this.name = name;
        }

        public String getName() {

            return name;
        }

   @PostConstruct
    }



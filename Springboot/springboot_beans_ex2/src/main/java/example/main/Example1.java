package example.main;

import example.beans.Vehicle;
import example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle ();
        vehicle.setName("Honda city");
        System.out.println("Vehicle name from non spring context is : " + vehicle.getName() );


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);

    }

}

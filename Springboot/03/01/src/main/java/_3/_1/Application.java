package _3._1;

import _3._1.config.ProjectConfig;
import _3._1.entity.Vehicle;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		var context  = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Vehicle volkswagen = new Vehicle();
		volkswagen.setName("Volkswagen");
		Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

		Supplier<Vehicle> audiSupplier = () -> {
			Vehicle audi = new Vehicle ();
			audi.setName("Audi");
			return audi;
		};

		Random random = new Random();
		int randomNumber = random.nextInt(20);
		System.out.print("\n randomNumber : " + randomNumber	);

		if((randomNumber % 2 ) == 0){
			context.registerBean("volkswagen",Vehicle.class,volkswagenSupplier);
		}else{
			context.registerBean("audi", Vehicle.class, audiSupplier);
		}

		Vehicle volksVehicle = null;
		Vehicle audiVehicle = null ;
		try{
			volksVehicle = context.getBean("volkswagen", Vehicle.class);
		}catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException ){
			System.out.print("\n Error while Creating Volkswagen Vehicle"	);
		}

		try{
			audiVehicle = context.getBean("audi",Vehicle.class);
		}catch(NoSuchBeanDefinitionException noSuchBeanDefinitionException){
			System.out.print("\n Error While Creating Audi Vehicle");
		}


		if (null != volksVehicle){
			System.out.print("\n Programming Vehicle Name from Spring Context is : "
					+ volksVehicle.getName());
		}else {
			System.out.print("\n Programming Vehicle name from Spring Context is : "
					+ audiVehicle.getName());
		}

	}

}

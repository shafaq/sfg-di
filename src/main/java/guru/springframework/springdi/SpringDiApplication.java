package guru.springframework.springdi;

import guru.springframework.springdi.controllers.ConstructorInjectedController;
import guru.springframework.springdi.controllers.MyController;
import guru.springframework.springdi.controllers.PropertyInjectedController;
import guru.springframework.springdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctxt = SpringApplication.run(SpringDiApplication.class, args);
		MyController myController = (MyController) ctxt.getBean("myController");
		String message = myController.sayHello();
		System.out.println(message);

		System.out.println("Property------------------------------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctxt.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("Setter ------------------------------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctxt.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("Constructor --------------------------------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctxt.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}

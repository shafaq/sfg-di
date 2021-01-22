package guru.springframework.springdi;

import guru.springframework.springdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctxt = SpringApplication.run(SpringDiApplication.class, args);

		I18nController i18nController = (I18nController) ctxt.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctxt.getBean("myController");
		System.out.println("Primary Bean -------------------");
		System.out.println(myController.sayHello());

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

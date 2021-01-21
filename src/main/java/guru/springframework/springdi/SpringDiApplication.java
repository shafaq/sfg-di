package guru.springframework.springdi;

import guru.springframework.springdi.controllers.MyController;
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
	}

}

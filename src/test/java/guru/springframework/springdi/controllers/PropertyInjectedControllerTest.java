package guru.springframework.springdi.controllers;

import guru.springframework.springdi.services.GreetingService;
import guru.springframework.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl();
   }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
package guru.springframework.springdi.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello World";
    }
}

package reflection;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

class Service {
    void serve() {
        System.out.println("Service injected");
    }
}

class Client {
    @Inject
    Service service;
}

public class SimpleDI {
    public static void main(String[] args) throws Exception {

        Client client = new Client();

        for (Field f : Client.class.getDeclaredFields()) {
            if (f.isAnnotationPresent(Inject.class)) {
                f.setAccessible(true);
                f.set(client, f.getType().getDeclaredConstructor().newInstance());
            }
        }

        client.service.serve();
    }
}

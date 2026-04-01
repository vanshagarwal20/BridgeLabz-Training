package reflection;

import java.lang.reflect.*;

interface Greeting {
    void sayHello();
}

class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello!");
    }
}

public class LoggingProxy {
    public static void main(String[] args) {

        Greeting obj = new GreetingImpl();

        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                (proxyObj, method, args1) -> {
                    System.out.println("Calling: " + method.getName());
                    return method.invoke(obj, args1);
                });

        proxy.sayHello();
    }
}


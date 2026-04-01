package reflection;

import java.lang.reflect.*;

class Configuration {
    private static String API_KEY = "OLD_KEY";
}

public class StaticFieldAccess {
    public static void main(String[] args) throws Exception {

        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);

        field.set(null, "NEW_KEY");
        System.out.println("Updated API_KEY: " + field.get(null));
    }
}


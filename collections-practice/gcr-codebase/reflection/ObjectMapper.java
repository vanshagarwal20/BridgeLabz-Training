package reflection;

import java.lang.reflect.*;
import java.util.*;

class User {
    String name;
    int age;
}

public class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> props) throws Exception {

        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Map.Entry<String, Object> entry : props.entrySet()) {
            Field field = clazz.getDeclaredField(entry.getKey());
            field.setAccessible(true);
            field.set(obj, entry.getValue());
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Vansh");
        map.put("age", 21);

        User user = toObject(User.class, map);
        System.out.println(user.name + " " + user.age);
    }
}


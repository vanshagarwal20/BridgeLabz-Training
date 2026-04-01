package annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class UserDTO {
    @JsonField(name = "user_name")
    String name = "Vansh";

    @JsonField(name = "age")
    int age = 21;
}

public class JsonFieldDemo {
    public static void main(String[] args) throws Exception {

        UserDTO u = new UserDTO();
        StringBuilder json = new StringBuilder("{");

        for (Field f : u.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            JsonField jf = f.getAnnotation(JsonField.class);
            json.append("\"").append(jf.name()).append("\":\"")
                .append(f.get(u)).append("\",");
        }

        json.deleteCharAt(json.length() - 1).append("}");
        System.out.println(json);
    }
}


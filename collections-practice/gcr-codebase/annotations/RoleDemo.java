package annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class AdminService {

    @RoleAllowed("ADMIN")
    void deleteUser() {
        System.out.println("User deleted");
    }
}

public class RoleDemo {
    public static void main(String[] args) throws Exception {

        String currentRole = "USER";
        AdminService service = new AdminService();

        Method m = AdminService.class.getMethod("deleteUser");
        RoleAllowed role = m.getAnnotation(RoleAllowed.class);

        if (role.value().equals(currentRole))
            m.invoke(service);
        else
            System.out.println("Access Denied!");
    }
}


package reflection;

import java.lang.reflect.*;

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

public class DynamicCall {
    public static void main(String[] args) throws Exception {

        MathOperations obj = new MathOperations();
        Method method = MathOperations.class.getMethod("multiply", int.class, int.class);

        System.out.println(method.invoke(obj, 6, 3));
    }
}


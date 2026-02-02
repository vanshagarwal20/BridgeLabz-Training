package annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class Calculator {

    @CacheResult
    int square(int x) {
        System.out.println("Computing...");
        return x * x;
    }
}

public class CacheDemo {
    static Map<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) throws Exception {

        Calculator c = new Calculator();
        Method m = Calculator.class.getMethod("square", int.class);

        int input = 5;
        if (cache.containsKey(input)) {
            System.out.println("From Cache: " + cache.get(input));
        } else {
            int result = (int) m.invoke(c, input);
            cache.put(input, result);
            System.out.println("Computed: " + result);
        }
    }
}


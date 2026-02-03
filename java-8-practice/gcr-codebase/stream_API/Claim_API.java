package stream_API;

import java.util.*;
import java.util.stream.*;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class Claim_API {
    public static void main(String[] args) {

        List<Claim> claims = List.of(
            new Claim("Health", 5000),
            new Claim("Auto", 7000),
            new Claim("Health", 9000),
            new Claim("Auto", 3000)
        );

        Map<String, Double> avgClaim =
            claims.stream()
                  .collect(Collectors.groupingBy(
                      c -> c.type,
                      Collectors.averagingDouble(c -> c.amount)
                  ));

        avgClaim.forEach((k, v) ->
            System.out.println(k + " Average: " + v)
        );
    }
}


package stream_API;

import java.time.LocalDateTime;
import java.util.*;

public class Logging_Transactions_with_Timestamp {
    public static void main(String[] args) {

        List<String> transactions = List.of("TX1001", "TX1002");

        transactions.forEach(id ->
            System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );
    }
}

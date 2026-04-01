package lambda_expressions;

import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    int transactionId;

    Invoice(int transactionId) {
        this.transactionId = transactionId;
    }
}

public class InvoiceCreation {
    public static void main(String[] args) {

        List<Integer> transactionIds = Arrays.asList(1001, 1002, 1003);

        List<Invoice> invoices =
                transactionIds.stream()
                              .map(Invoice::new)
                              .collect(Collectors.toList());

        System.out.println("Invoices created: " + invoices.size());
    }
}


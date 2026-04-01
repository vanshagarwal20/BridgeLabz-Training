package stream_API;

import java.util.*;

public class Email_Notifications {

    static void sendEmailNotification(String email) {
        System.out.println("Email sent to " + email);
    }

    public static void main(String[] args) {

        List<String> emails = List.of("a@test.com", "b@test.com");

        emails.forEach(email -> sendEmailNotification(email));
    }
}


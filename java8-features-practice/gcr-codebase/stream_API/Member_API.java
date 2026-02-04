package stream_API;

import java.time.*;
import java.util.*;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
}

public class Member_API{
    public static void main(String[] args) {

        List<Member> members = List.of(
            new Member("A", LocalDate.now().plusDays(10)),
            new Member("B", LocalDate.now().plusDays(40))
        );

        members.stream()
               .filter(m -> m.expiryDate.isBefore(LocalDate.now().plusDays(30)))
               .forEach(m -> System.out.println(m.name));
    }
}


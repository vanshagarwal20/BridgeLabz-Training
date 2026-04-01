package JUNIT.junit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

    public String formatDate(String inputDate) {
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date = LocalDate.parse(inputDate, inputFormat);
        return date.format(outputFormat);
    }
}


package extras;

import java.time.*;

public class TimeZonesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current Time in GMT : " + gmtTime);
        System.out.println("Current Time in IST : " + istTime);
        System.out.println("Current Time in PST : " + pstTime);
    }

}

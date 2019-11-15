package tms.c29.lec_12.classwork.part_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDateTime localDateTime = now.atStartOfDay();
        System.out.println(now);
        System.out.println(localDateTime);

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();


        System.out.println("Etc/GMT+9: " + time.atZone(ZoneId.of("Etc/GMT+9")));


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        LocalDate parse = LocalDate.parse("20/Dec/1999", dtf);

        String formatted = parse.format(dtf);
        System.out.println(parse);

        System.out.println(formatted);
    }
}

package Data_e_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        //subtrai semanas, dias etc..
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        //retorna uma coleção
        //ZoneId.getAvailableZoneIds();

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("r1 " + r1);
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("r2 " + r2);
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("r3 " + r3);
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("r4 " + r4);


        System.out.println("D04 " + d04.getDayOfMonth());
        System.out.println("D04 " + d04.getMonth());
        System.out.println("D04 " + d04.getYear());
        System.out.println("D05 " + d05.getHour());
        System.out.println("D05 " + d05.getMinute());
        System.out.println("D05 " + d05.getSecond());

        //CALCULO DATA E HORA

        // adicionando e subtraindo semanas, dias e anos
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        System.out.println(d04);
        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        System.out.println(d05);
        System.out.println(pastWeekLocalDateTime);
        System.out.println(nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        System.out.println(d06);
        System.out.println(pastWeekInstant);
        System.out.println(nextWeekInstant);

        //projeto

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        System.out.println(t1.toDays());

        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println(t2.toDays());

        Duration t3 = Duration.between(pastWeekInstant, d06);
        System.out.println(t3.toDays());
        Duration t4 = Duration.between(d06, pastWeekInstant);
        System.out.println(t4.toDays());

    }
}

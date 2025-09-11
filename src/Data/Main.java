package Data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //instanciando data de agora
        LocalDate d01 = LocalDate.now();
        System.out.println(d01);
        //instanciando hora agora
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);
        // Gerando hora global GMT
        Instant d03 = Instant.now();
        System.out.println(d03);
        //pegar um texto ISO e gerar uma hora local
        LocalDate d04 = LocalDate.parse("2022-07-22");
        System.out.println(d04);
        //pegar um texto ISO e gerar uma hora time
        LocalDateTime d05 = LocalDateTime.parse("2022-07-22T18:20:26");
        System.out.println(d05);
        //pegar um texto iso Global
        Instant d06 = Instant.parse("2022-07-22T18:20:26Z");
        System.out.println(d06);
        // mudando data global
        Instant d07 = Instant.parse("2022-07-22T18:20:26-03:00");
        System.out.println(d07);
        //texto no formato custumizado
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        System.out.println(d08);
        // texto costumizado com time
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
        System.out.println(d09);
        // Pegando dados isolados local
        LocalDate d10 = LocalDate.of(2022, 07, 21);
        System.out.println(d10);
        //pegando dados isolados time
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 21, 13,00);
        System.out.println(d11);


    }
}

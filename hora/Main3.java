package hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main3 {

    public static void main(String[] args) {

        // Cria um LocalDate com apenas a data (sem hora)
        LocalDate d01 = LocalDate.parse("2022-07-20");

        // Cria um LocalDateTime com data e hora
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:20");

        // Cria um Instant (momento exato no tempo em UTC)
        Instant d03 = Instant.parse("2022-07-20T01:02:33Z");

        // Converte o Instant d03 para LocalDate no fuso horário do sistema (ex: America/Sao_Paulo)
        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());

        // Converte o Instant d03 para LocalDate no fuso horário do Japão
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Japan"));

        // Converte o Instant d03 para LocalDateTime no fuso horário do sistema
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());

        // Converte o Instant d03 para LocalDateTime no fuso horário do Japão
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Japan"));

        // Exibe as datas convertidas
        System.out.println("R1 = " + r1); // Data no fuso horário local
        System.out.println("R2 = " + r2); // Data no fuso horário do Japão
        System.out.println("R3 = " + r3); // Data e hora no fuso horário local
        System.out.println("R4 = " + r4); // Data e hora no fuso horário do Japão

        // Exibe informações sobre o LocalDateTime d02

        // Dia do mês (20)
        System.err.println("d04 dia = " + d02.getDayOfMonth());

        // Dia do ano (201º dia do ano)
        System.err.println("d04 dia = " + d02.getDayOfYear());

        // Dia da semana (WEDNESDAY)
        System.err.println("d04 dia = " + d02.getDayOfWeek());

        // Também exibe o dia da semana para d01 (que é a mesma data)
        System.err.println("d01 dia = " + d01.getDayOfWeek());
    }
}

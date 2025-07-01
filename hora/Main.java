package hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        // Formatações personalizadas de datas
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Data atual (sem hora)
        LocalDate d01 = LocalDate.now();

        // Data e hora atual
        LocalDateTime d02 = LocalDateTime.now();

        // Instante atual (ponto no tempo, UTC)
        Instant d03 = Instant.now();

        // Data fixa (sem hora), no formato ISO (yyyy-MM-dd)
        LocalDate d04 = LocalDate.parse("2025-12-25");

        // Data e hora fixa, no formato ISO (yyyy-MM-ddTHH:mm:ss)
        LocalDateTime d05 = LocalDateTime.parse("2025-12-25T00:00:23");

        // Instante fixo no formato UTC (Z = Zulu time = UTC)
        Instant d06 = Instant.parse("2025-12-25T00:00:23Z");

        // Instante com deslocamento de fuso horário (-03:00)
        Instant d07 = Instant.parse("2025-12-25T00:00:23-03:00");

        // Data formatada com padrão brasileiro (dd/MM/yyyy)
        LocalDate d08 = LocalDate.parse("20/09/2025", fmt1);

        // Data e hora formatada com padrão brasileiro (dd/MM/yyyy HH:mm)
        LocalDateTime d09 = LocalDateTime.parse("20/02/2025 09:39", fmt2);

        // Criação manual de uma data específica
        LocalDate d10 = LocalDate.of(2022, 2, 11);

        // Criação manual de data e hora específicas
        LocalDateTime d11 = LocalDateTime.of(2026, 2, 10, 10, 50, 10);

        // Impressão dos resultados no console de erro (System.err)
        System.err.println(d01); // Data atual
        System.err.println(d02); // Data e hora atual
        System.err.println(d03); // Instante atual (UTC)
        System.err.println(d04); // Data fixa
        System.err.println(d05); // Data e hora fixa
        System.err.println(d06); // Instante fixo (UTC)
        System.err.println(d07); // Instante com fuso horário -3
        System.err.println(d08); // Data formatada (pt-BR)
        System.err.println(d09); // Data e hora formatadas (pt-BR)
        System.err.println(d10); // Data criada manualmente
        System.err.println(d11); // Data e hora criadas manualmente
    }
}


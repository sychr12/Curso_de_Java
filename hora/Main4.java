package hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main4 {
    public static void main(String[] args) {

        // Cria uma data sem hora
        LocalDate d01 = LocalDate.parse("2022-07-20");

        // Cria uma data com hora
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:20");

        // Cria um instante (em UTC)
        Instant d03 = Instant.parse("2022-07-20T01:02:33Z");

        // Subtrai 7 dias de d01
        LocalDate pastWeekLocalDate = d01.minusDays(7);

        // Adiciona 7 dias a d01
        LocalDate nextWeekLocalDate = d01.plusDays(7);
        // Alternativamente: adicionar 7 anos
        // LocalDate nextWeekLocalDate = d01.plusYears(7);

        // Exibe os resultados
        System.err.println("pastWeekLocalDate = minusDays " + pastWeekLocalDate);
        System.err.println("nextWeekLocalDate = plusDays " + nextWeekLocalDate);
        System.err.println("nextWeekLocalDate = plusYears " + nextWeekLocalDate); // Esta linha está mal nomeada (veja abaixo a observação)

        // Subtrai e adiciona 7 dias ao LocalDateTime
        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDatetTime = d02.plusDays(7);

        // OBS: estas 3 linhas abaixo estão imprimindo os mesmos valores de LocalDate (devem estar copiadas por engano)
        System.err.println("pastWeekLocalDateTime = minusDays " + pastWeekLocalDate); // Deveria ser: pastWeekLocalDateTime
        System.err.println("pastWeekLocalDateTime = plusDays " + nextWeekLocalDate);  // Deveria ser: nextWeekLocalDatetTime
        System.err.println("pastWeekLocalDateTime = plusYears " + nextWeekLocalDate); // Confusa, pois não adiciona anos

        // Subtrai e adiciona 7 dias ao Instant
        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.err.println("pastWeekInstant = minus " + pastWeekInstant);
        System.err.println("pastWeekInstant = plus " + pastWeekInstant); // Está imprimindo de novo o "minus", deveria imprimir nextWeekInstant

        // Calcula a duração entre datas e horas:

        // Duração entre LocalDateTime 7 dias atrás e a data original
        Duration t1 = Duration.between(pastWeekLocalDateTime, d02);

        // Duração entre LocalDate (sem hora) convertida para 00:00
        Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), d01.atTime(0, 0));

        // Duração entre Instants
        Duration t3 = Duration.between(pastWeekInstant, d03);

        // Invertido: duração negativa
        Duration t4 = Duration.between(d03, pastWeekInstant);

        // Imprime a quantidade de dias de cada Duration (t1 a t4)
        System.err.println(t1.toDays()); // Deve imprimir 7
        System.err.println(t2.toDays()); // Deve imprimir 7
        System.err.println(t3.toDays()); // Deve imprimir 7
        System.err.println(t4.toDays()); // Deve imprimir -7
    }
}


package hora;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Maindois {
    public static void main(String[] args) {

        // Cria uma data (sem hora)
        LocalDate d01 = LocalDate.parse("2022-07-20");

        // Cria uma data com hora
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:20");

        // Cria um instante em UTC
        Instant d03 = Instant.parse("2022-07-20T01:02:33Z");

        // Formatador de data: dia/mês/ano
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formatador de data e hora: dia/mês/ano hora:minuto
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Formatador com fuso horário local do sistema (para uso com Instant)
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        // Formatador ISO para data e hora (ex: 2022-07-20T01:30:20)
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

        // Formatador ISO padrão para `Instant` (ex: 2022-07-20T01:02:33Z)
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        // Formata LocalDate com fmt1
        System.err.println("d01 = " + d01.format(fmt1));

        // Formata LocalDateTime com fmt1 (só usa a parte da data)
        System.err.println("d02 = " + fmt1.format(d02));

        // Formata d01 novamente usando o formatador diretamente (sem variável)
        System.err.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // Formata d02 com data e hora (sem segundos)
        System.err.println("d02 = " + d02.format(fmt2));

        // Formata Instant (d03) com fuso horário do sistema local
        System.err.println("d03 = " + fmt3.format(d03));

        // Formata LocalDateTime no formato ISO
        System.err.println("d02 = " + d02.format(fmt4));

        // Formata Instant no formato ISO_INSTANT (sempre UTC)
        System.err.println("d03 = " + fmt5.format(d03));

        // Mostra o Instant diretamente com .toString() (também no formato ISO UTC)
        System.err.println("d03 = " + d03.toString());
    }
}

package hora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Main5 {
    public static void main(String[] args) throws ParseException {

        // Cria um formatador de datas no formato: dia/mês/ano
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        // Cria um formatador de datas no formato: dia/mês/ano hora:minuto:segundo
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Outro formatador com o mesmo padrão de sdf2, mas com fuso horário definido como GMT (UTC)
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); // Define o fuso horário para GMT

        // Cria um objeto Date com a data e hora atual
        Date x1 = new Date();

        // Cria um objeto Date com o timestamp atual do sistema
        Date x2 = new Date(System.currentTimeMillis());

        // Cria uma data correspondente ao marco zero do Unix: 01/01/1970 00:00:00 GMT
        Date x3 = new Date(0L);

        // Cria uma data correspondente a 5 horas após o marco zero do Unix
        Date x4 = new Date(1000L * 60L * 60L * 5L);

        // Cria uma data a partir de um Instant (UTC)
        Date x5 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        // Converte a string "25/06/2018" para um objeto Date, sem horário (00:00:00)
        Date y1 = sdf1.parse("25/06/2018");

        // Converte a string "25/06/2018 15:45:07" para um objeto Date, com data e hora
        Date y2 = sdf2.parse("25/06/2018 15:45:07");

        System.out.println("-------------------------------------------------------------------------------");

        // Imprime y1 com horário (será 00:00:00)
        System.err.println("Y1 = " + sdf2.format(y1));

        // Imprime y2 com data e hora
        System.err.println("Y2 = " + sdf2.format(y2));

        // Imprime data atual (padrão toString, inclui fuso horário local)
        System.out.println("Data de Hoje = " + x1);

        // Imprime x2 (data atual a partir de System.currentTimeMillis())
        System.err.println(x2);

        // Imprime x3 (data correspondente ao timestamp zero)
        System.err.println(x3);

        // Imprime x4 (5 horas após o timestamp zero)
        System.err.println(x4);

        // Imprime x5 (data convertida a partir do Instant UTC)
        System.out.println("x5 = " + x5);

        System.out.println("-------------------------------------------------------------------------------");

        // Agora imprime todas as datas acima usando o formatador com fuso horário GMT

        System.err.println("Y1 = " + sdf3.format(y1)); // y1 em GMT
        System.err.println("Y2 = " + sdf3.format(y2)); // y2 em GMT

        System.out.println("Data de Hoje = " + sdf3.format(x1)); // data atual em GMT

        System.err.println(sdf3.format(x2)); // x2 em GMT

        System.err.println(sdf3.format(x3)); // x3 (timestamp zero) em GMT

        System.err.println(sdf3.format(x4)); // x4 (5h depois do zero) em GMT

        System.out.println("x5 = " + sdf3.format(x5)); // x5 em GMT
    }
}


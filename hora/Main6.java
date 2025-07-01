package hora;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main6 {
    public static void main(String[] args) {

        // Cria um formatador de data/hora no formato: dia/mês/ano horas:minutos:segundos
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Cria um objeto Date a partir de um Instant (UTC)
        Date d = Date.from(Instant.parse("2018-06-25T15:45:07Z"));

        // Imprime a data formatada com o fuso horário local da JVM
        System.out.println(sdf.format(d));

        // Cria uma instância de Calendar (classe usada para manipular datas)
        Calendar call = Calendar.getInstance();

        // Define que o calendário trabalhará com a data 'd'
        call.setTime(d);

        // (Comentado) Adicionaria 4 horas à data original
        // call.add(Calendar.HOUR_OF_DAY, 4);
        // d = call.getTime(); // Atualiza o objeto Date com a nova hora

        // Obtém os minutos da data
        int minutos = call.get(Calendar.MINUTE);

        // Obtém o mês da data (OBS: os meses no Calendar vão de 0 a 11, por isso é somado +1)
        int mes = 1 + call.get(Calendar.MONTH);

        // Obtém o ano da data
        int ano = call.get(Calendar.YEAR);

        // Imprime a data novamente (não alterada, pois a linha que adiciona horas está comentada)
        System.out.println(sdf.format(d));

        // Imprime os valores extraídos: minutos, mês e ano
        System.out.println(minutos); // Deve imprimir 45
        System.out.println(mes);     // Deve imprimir 6 (junho + 1)
        System.out.println(ano);     // Deve imprimir 2018
    }
}

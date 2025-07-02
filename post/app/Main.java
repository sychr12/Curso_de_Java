package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.comment;
import entities.post;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        comment c1 = new comment("boa viagem");
        comment c2 = new comment("Uau, isso é incrível!");
        post p1 = new post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "Vou visitar este país maravilhoso", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
        comment c3 = new comment("Boa Noite");
        comment c4 = new comment("Que a força esteja com você");


        post p2 = new post(sdf.parse("28/07/2018 23:14:18"), "Boa noite pessoal", "Vejo você amanhã", 5);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);
    }
    
}

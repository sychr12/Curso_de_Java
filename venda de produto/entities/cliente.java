package entities;

import java.text.SimpleDateFormat;
import java.util.Date;


public class cliente {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    

    private String nome;
    private String email;
    private Date aniversario;

    public cliente(){
    }

    
    public cliente(String nome, String email, Date aniversario) {
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }


    public static SimpleDateFormat getSdf() {
        return sdf;
    }

    public static void setSdf(SimpleDateFormat sdf) {
        cliente.sdf = sdf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }
    public String toString(){
        return nome + " (" + sdf.format(aniversario) + ") - " + email; 
    }
}


   
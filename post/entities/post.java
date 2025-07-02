package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date momento;
    private String title;
    private String content;
    private Integer likes;
    

    private List<comment> comments = new ArrayList<>();

    public post() {
    }

    public post(Date momento, String title, String content, Integer likes) {
        this.momento = momento;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<comment> getComments() {
        return comments;
    }

public void addComment(comment comment){
    comments.add(comment);
}

public void removeComment(comment comment){
    comments.remove(comment);
}

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb. append(title + "\n");
        sb.append(likes);
        sb.append(" LIKES - ");
        sb.append(sdf.format(momento) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for (comment c : comments){
            sb.append(c.getTeste() + "\n");
        }

        return sb.toString();

    }

    

}

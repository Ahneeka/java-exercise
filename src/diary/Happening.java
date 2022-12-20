package diary;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Happening {
    private int id;
    private  String title;
    private  String body;
    private LocalDateTime timeOfHappening;
    public Happening(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        timeOfHappening = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }
    public String getBody(){
        return body;
    }
    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        String time = DateTimeFormatter.ofPattern("EEE,dd/MM/yyy, hh:mm:ss a").format(timeOfHappening);
        return String.format("""
                ============================
                Entry %s
                written on %s
                Title: %s
                Body: %s
                =============================
                """, id, time, title, body);
    }
    /*public String toString() {
        return "Happening{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", timeOfHappening=" + timeOfHappening +
                '}';*/

}

package diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private boolean isLocked = true;
    private  String password;
    private List<Happening> happenings = new ArrayList<>();

    public Diary (String ownersName, String password){
        this.password = password;
    }
    public boolean islocked() {
        return isLocked;
    }

    public void UnlockWith(String password) {
        boolean passwordMatches = password.equals(this.password);
        if(passwordMatches) isLocked = false;
    }

    public void lock() {
        isLocked = true;
    }
    public  void write(String title,String body){
        if(isLocked) throw new IllegalArgumentException("The diary is still locked ");
        writeIntoDiary(title,body);
    }

    private void writeIntoDiary(String title, String body) {
        int id = numberOfHappening()+1;
        Happening happening = new Happening(id, title, body);
        happenings.add(happening);
    }

    public int numberOfHappening() {
        return happenings.size();
    }

    public Happening findHappeningWithid(int id) {
        for (Happening happening: happenings){
            if (happening.getId() == id) return happening;
        }
        return null;
    }
}

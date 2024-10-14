package modell;

import java.util.ArrayList;

public class Bemutatkoztato {
    private Ember[] emberek;
    private Ember e1;
    private Ember e2;
    private Ember e3;

    public Bemutatkoztato() {
        Ember e1 =new Ember("Pál",2000);
        Ember e2 = new Ember("John",2000,"angol");
        
        ArrayList<String>nyelvek = new ArrayList<>();
        nyelvek.add("francia");
        nyelvek.add("olasz");
        nyelvek.add("spanyol");
        Ember e3 = new Ember("John",2000,nyelvek);
        emberek = new Ember[3];
        emberek[0] = e1;
        emberek[1] = e2;
        emberek[2] = e3;
    }
        public String bem(){
        String s= "Bemutatkozás:";
        Ember[] emberek={e1,e2,e3};
        for (Ember ember : emberek) {
            s+= ember.bemutakozas();
            s+="--------------";
        }
        return s;
    }
    
}

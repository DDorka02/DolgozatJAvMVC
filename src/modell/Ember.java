package modell;

import java.util.ArrayList;

public class Ember {
    private String nev;
    private int szulev;
    private ArrayList<String> nyelvek;
    
    public Ember(String nev,int szulev){
        this(nev,szulev, "magyar");    
    }
    
    public Ember(String nev,int szulev,String anyanyelv){
        this(nev,szulev, new ArrayList<>());
        this.nyelvek.add(anyanyelv);   
    }
    
    public Ember(String nev,int szulev, ArrayList<String> nyelvek){
        this.nev=nev;
        this.szulev=szulev;
        this.nyelvek=nyelvek;
    }

    public String getNev() {
        return nev;
    }

    public int getSzulev() {
        return szulev;
    }
    
    public String[] getNyelvek(){
        String[] ny= new String[nyelvek.size()];
//        for (int i = 0; i < ny.length; i++) {
//            ny[i]= nyelvek(i);
//        }
//        for (String nyelv : nyelvek) {
//        }
        return nyelvek.toArray(ny); 
    }
    
    public void ujNyelv(String nyelv){
        this.nyelvek.add(nyelv);
    }
    
    public void ujNyelv(ArrayList<String> nyelvek){
        for (String nyelv : nyelvek) {
            ujNyelv(nyelvek);
        }
    }

    public String bemutakozas() {
        return "\nNevem:" + nev + ",\nSzuletesi evem:" + szulev + ",\nNyelvek amiket tudok:" + nyelvek + "\n";
    }
    
    
    
}

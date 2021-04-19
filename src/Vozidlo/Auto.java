package Vozidlo;

import java.text.DateFormat;
import java.util.Date;

public class Auto implements Prepravitelny{
    private String nazov;
    private int km;
    private int platnostStk;
    private int cena;
    private int rokVyroby;
    private boolean napredaj;
    private String vin;


    public Auto (String nazov, int km, int stk, int cena, int rokVyroby, String vin) {
        this.nazov = nazov;
        this.km = km;
        this.platnostStk = stk;
        this.cena = cena;
        this.rokVyroby = rokVyroby;
        this.vin = vin;
        this.napredaj = false;
    }

    public String getNazov() {
        return nazov;
    }

    public int getKm() {
        return km;
    }

    public int getPlatnostStk() {
        return platnostStk;
    }

    public int getCena() {
        return cena;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public void setPlatnostStk(int platnostStk) {
        this.platnostStk = platnostStk;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    public boolean jePlatnaStk(){
       int n = this.platnostStk - this.aktualnyRok();
        return (n > 0);



    }
    public String maPlatnuStk(){
        if(this.jePlatnaStk() == true){
            return " auto má platnú STK";
        }else {
            return " auto nemá platnú STK potreba dorobiť";
        }
    }
    private int aktualnyRok(){

        Date datum = new Date();
        DateFormat format1 = DateFormat.getDateInstance();

        String dnesnyDatum = format1.format(datum);
        int dlzka = dnesnyDatum.length();
        int terajsiRok = Integer.parseInt(dnesnyDatum.substring(dlzka-4, dlzka));
        return terajsiRok;
    }
    public boolean jeNaPredaj(){
        return this.napredaj;
    }
    private String predaj(){
        if(this.jeNaPredaj() == true){
            return " auto je na predaj";
        }else {
            return " auto nie je na predaj";
        }
    }

    public boolean zmenStavPredaju(){
        if(this.napredaj == false){
           return this.napredaj = true;
        }else{
            return this.napredaj = false;
        }
    }

    public String getVin() {
        return vin;
    }
    public String toString(){
        return this.nazov+" rok výroby: "+this.rokVyroby+" vin: "+this.vin+ " ma najazdených: "+this.km+this.predaj()+this.maPlatnuStk();
    }
}

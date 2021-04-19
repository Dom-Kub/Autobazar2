package Vozidlo;

import java.text.DateFormat;
import java.util.Date;

public class Dodavka extends Auto implements Prepravitelny {

        private boolean napredaj;


        public Dodavka (String nazov, int km, int stk, int cena, int rokVyroby, String vin) {
            super(nazov,km,stk,cena,rokVyroby,vin);
            this.napredaj = false;
        }

        public String getNazov() {
            return super.getNazov();
        }

        public int getKm() {

            return super.getKm();
        }

        public int getPlatnostStk() {

            return super.getPlatnostStk() ;
        }

        public int getCena() {
            return super.getCena();
        }

        public void setPlatnostStk(int platnostStk) {
            super.setPlatnostStk(platnostStk);
        }

        public void setCena(int cena) {

            super.setCena(cena);
        }

        public boolean jePlatnaStk(){
         return super.jePlatnaStk();

        }
    public int getRokVyroby() {

            return super.getRokVyroby();
    }
        public String maPlatnuStk(){
           return super.maPlatnuStk();
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

            return super.getVin();
        }
        public String toString(){
            return super.toString();
        }
    }



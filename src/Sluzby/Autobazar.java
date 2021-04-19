package Sluzby;

import Hlavna.Main;
import Vozidlo.Prepravitelny;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Autobazar extends Main {
    private Prepravitelny vozidlo;
    private ArrayList<Prepravitelny> zoznam;
    private String nazov;



    public Autobazar( String nazov) {

        this.nazov = nazov;
        this.zoznam = new ArrayList<Prepravitelny>();
    }
    public String getNazov(){
        return this.nazov;
    }
    public boolean pridajVozidlo( Prepravitelny voz ) {
        if( voz.jeNaPredaj()) {
            return this.zoznam.add( voz );

        } else {
            return false;
        }

    }

    public String hladatKonkretneAuto(String nazov, int rokVyroby, int cena ) {

        String m = new String();
        for (Prepravitelny zoznam1 : this.zoznam) {
            if (nazov.equals(zoznam1.getNazov())) {
                if (rokVyroby == (zoznam1.getRokVyroby())){
                    if (cena == (zoznam1.getCena())) {
                            m +=  zoznam1.toString()+"\n" ;
                    }
                    }

            }
        }
        return m;
    }

    public  void informacieOAute( String vin) {

        for (Prepravitelny zoznam1 : this.zoznam) {
            if (vin.equals(zoznam1.getVin())) {

                System.out.println(zoznam1.toString());
            } else {
                System.out.println( "Vozidlo nie je k dispozícií");
            }
        }

    }
    public boolean vymazatAuto(String vin) {
        for (Prepravitelny zoznam1 : this.zoznam) {
            if (vin.equals(zoznam1.getVin())) {
                int index = this.zoznam.indexOf(zoznam1);
                this.zoznam.remove(index);
                return true;
            }
        }
        return false;
    }
    public String toString() {
        String ucet ="Autobazar: "+ this.nazov+" má má k dispozícií tieto vozidlá: \n";
        for (Prepravitelny zoznam1 : this.zoznam) {
            ucet = ucet + zoznam1.toString() + "\n";
        }
        return ucet;
    }
    public String naPredaj(){
        String m = new String();
        for (Prepravitelny p : this.zoznam){
            if(p.jeNaPredaj() == true){
                m += p.toString();
            }
        }
        return m;
    }
    public String nieNaPredaj(){
        String m = new String();
        for (Prepravitelny p : this.zoznam){
            if(p.jeNaPredaj() == false){
                m += p.toString();
            }
        }
        return m;
    }
    public void zapisDoTextovehoSuboru(String nazovSuboru){
        try{
            FileOutputStream fos = new FileOutputStream(nazovSuboru);
            PrintStream zap = new PrintStream(fos);
            zap.println("V nasom Autobazári sa nachádzajú dané vozidlá: \n")  ;
            for (Prepravitelny pomZam : this.zoznam) {
                zap.println(pomZam + "\n");
            }
            zap.close();
        }
        catch (IOException ex){
            System.out.println("Doslo k chybe pri zapise do suboru " + ex.getMessage());
        }

    }




}

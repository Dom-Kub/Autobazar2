package Sluzby;

import Hlavna.Main;
import Hotel.Predajny;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Hotel extends Main {

    private ArrayList<Predajny> zoznamNaPredaj;
    private ArrayList<Predajny> zoznamNaPrenajom;
    private String nazov;



    public Hotel( String nazov) {

        this.nazov = nazov;
        this.zoznamNaPredaj = new ArrayList<Predajny>();
        this.zoznamNaPrenajom = new ArrayList<Predajny>();
    }
    public String getNazov(){
        return this.nazov;
    }
    public boolean pridajPriestor( Predajny priestor ) {
        if(priestor.getDostupnostPredaju() ) {
            return this.zoznamNaPredaj.add( priestor );

        } if( priestor.getDostupnostPrenajmu() ) {
            return this.zoznamNaPrenajom.add( priestor );

        } else {
            return false;
        }

    }





    public String informacieOPriestore(int id) {
         String n = null;
        for (Predajny zoznam1 : this.zoznamNaPrenajom) {
            if (id == zoznam1.getId()) {

                n = zoznam1.toString();
            }
        }
        for (Predajny zoznam1 : this.zoznamNaPredaj) {
            if (id == zoznam1.getId()) {

                n = zoznam1.toString();
            }

        }
        return n;


    }
    public boolean vymazatPriestor(int id) {
       boolean n = false;
        n = vymazZPredaju(id);
        n = vymazZPrenajmu(id);

        return n;
    }
    private  boolean vymazZPrenajmu(int id){
        for (Predajny zoznam2 : this.zoznamNaPrenajom) {
            if (id == (zoznam2.getId())) {
                int index = this.zoznamNaPrenajom.indexOf(zoznam2);
                this.zoznamNaPrenajom.remove(index);
                return true;
            }
        }return false;
    }

    private boolean vymazZPredaju(int id){
        for (Predajny zoznam1 : this.zoznamNaPredaj) {
            if (id == (zoznam1.getId())) {
                int index = this.zoznamNaPredaj.indexOf(zoznam1);
                this.zoznamNaPredaj.remove(index);
                return true;
            }
        } return false;
    }
    public String toString(){
        return toString1() + toString2();

    }
    private String toString1() {
        String retaz = "Hotel "+this.nazov+ " má k dispozícií tieto priestory na predaj : \n";
        for (Predajny zoznam1 : this.zoznamNaPredaj) {
            retaz = retaz + zoznam1.toString() + "\n";
        }
        return retaz+ "\n";

    }
    private String toString2(){
        String retaz =  "Hotel "+this.nazov+ " má k dispozícií tieto priestory na prenájom : \n";
        for (Predajny zoznam2 : this.zoznamNaPrenajom) {
            retaz = retaz + zoznam2.toString() + "\n";
        }
        return retaz;
    }
    public void zapisDoTextovehoSuboru(String nazovSuboru){
        try{
            FileOutputStream fos = new FileOutputStream(nazovSuboru);
            PrintStream zap = new PrintStream(fos);
            zap.println("V našom hotely sa nachádzajú dané priestory na predaj: \n");
            for (Predajny predaj : this.zoznamNaPredaj) {
                zap.println(predaj + "\n");
            }
            zap.println();
            zap.println("V našom hotely sa nachádzajú dané priestory na prenájom: \n");
            for (Predajny prenajom : this.zoznamNaPrenajom) {
                zap.println(prenajom + "\n");
            }
            zap.close();
        }
        catch (IOException ex){
            System.out.println("Doslo k chybe pri zapise do suboru " + ex.getMessage());
        }

    }






}


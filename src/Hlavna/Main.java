package Hlavna;


import Sluzby.Autobazar;
import Sluzby.Hotel;
import Vozidlo.Auto;
import Vozidlo.Dodavka;
import Vozidlo.Motorka;
import Hotel.Byt;
import Hotel.Sklad;

public class Main  {

    public static void main(String[] args) {


        Autobazar autobazar1 = new Autobazar("AAA auto");
        Auto a1 = new Auto("Audi", 15000, 2022, 20000, 2015, "ABC1");
        Auto a2 = new Auto("Mercedes", 20000, 2021, 18000, 2014, "ABC2");
        Auto a3 = new Auto("Audi", 25000, 2020, 17000, 2013, "ABC3");
        Auto a4 = new Auto("Mercedes", 10000, 2019, 15000, 2012, "ABC4");
        Auto a5 = new Auto("Mercedes", 10000, 2019, 15000, 2012, "ABC5");

        a1.zmenStavPredaju();
        a2.zmenStavPredaju();
        a4.zmenStavPredaju();

        autobazar1.pridajVozidlo(a1);
        autobazar1.pridajVozidlo(a2);
        autobazar1.pridajVozidlo(a3);
        autobazar1.pridajVozidlo(a4);
        autobazar1.pridajVozidlo(a5);

        Motorka m1 = new Motorka("Honda", 1000, 2025, 10000,2018, "M1");
        Motorka m2 = new Motorka("Ducati", 5000,2023, 8000, 2016, "M2");
        Motorka m3 = new Motorka("Yamaha", 3500,2022, 5000, 2015, "M3");
        Motorka m4 = new Motorka("Suzuki", 500, 2020, 9000, 2016, "M4");
        Motorka m5 = new Motorka("Suzuki", 2000,2020, 9000, 2016, "M5");

        m1.zmenStavPredaju();
        m2.zmenStavPredaju();
        m4.zmenStavPredaju();



        autobazar1.pridajVozidlo(m1);
        autobazar1.pridajVozidlo(m2);
        autobazar1.pridajVozidlo(m3);
        autobazar1.pridajVozidlo(m4);
        autobazar1.pridajVozidlo(m5);

        Dodavka d1 = new Dodavka("Volkswagen", 1000, 2025, 25000,2018, "D11");
        Dodavka d2 = new Dodavka("Fiat", 5000,2023, 16000, 2016, "D2");
        Dodavka d3 = new Dodavka("Peugeot", 3500,2022, 18000, 2015, "D3");
        Dodavka d4 = new Dodavka("Mercedes", 500, 2020, 20000, 2016, "D4");
        Dodavka d5 = new Dodavka("Mercedes", 2000,2020, 20000, 2016, "D5");

        d1.zmenStavPredaju();
        d2.zmenStavPredaju();
        d4.zmenStavPredaju();



        autobazar1.pridajVozidlo(d1);
        autobazar1.pridajVozidlo(d2);
        autobazar1.pridajVozidlo(d3);
        autobazar1.pridajVozidlo(d4);
        autobazar1.pridajVozidlo(d5);


        System.out.println("Zoznam autobazáru: "+autobazar1.getNazov());
        System.out.println("***********************************************************************************");
        System.out.println(autobazar1.toString());

        System.out.println("Hladanie konkrétne auto");
        System.out.println("***********************************************************************************");

        System.out.println(autobazar1.hladatKonkretneAuto("Mercedes",2012,15000));

        System.out.println("Vymazanie auta");
        System.out.println("***********************************************************************************");
        autobazar1.vymazatAuto("ABC2");
        autobazar1.vymazatAuto("ABC5");

        System.out.println(autobazar1.toString());


        System.out.println("***********************************************************************************");


        System.out.println("Hladanie konkrétnu dodávku");
        System.out.println("***********************************************************************************");

        System.out.println(autobazar1.hladatKonkretneAuto("Mercedes",2016,20000));

        System.out.println("Vymazanie dodávky");
        System.out.println("***********************************************************************************");
        autobazar1.vymazatAuto("D2");
        autobazar1.vymazatAuto("D5");

        System.out.println(autobazar1.toString());





        System.out.println("***********************************************************************************");


        System.out.println("Hladanie konkretnej motorky");
        System.out.println("***********************************************************************************");

        System.out.println(autobazar1.hladatKonkretneAuto("Suzuki",2016,9000));

        System.out.println("Vymazanie motorky");
        System.out.println("***********************************************************************************");
        autobazar1.vymazatAuto("M5");
        autobazar1.vymazatAuto("M2");

        System.out.println(autobazar1.toString());
        autobazar1.zapisDoTextovehoSuboru("Auta.txt");

















        Hotel hotel1 = new Hotel("Plaza");
        Byt b1 = new Byt(1, 120, 1500, 2);
        Byt b2 = new Byt(2, 150, 1300, 3);
        Byt b3 = new Byt(3, 45, 2500, 1);
        Byt b4 = new Byt(4, 100,2000 , 2);
        Sklad s1 = new Sklad(5,50,500);
        Sklad s2 = new Sklad(6,80,550);
        Sklad s3 = new Sklad(7,100,750);
        Sklad s4 = new Sklad(8,120,480);

        b1.zmenDostupnostPredaju();
        b2.zmenDostupnostPredaju();
        b3.zmenDostupnostPrenajmu();
        b4.zmenDostupnostPrenajmu();
        s1.zmenDostupnostPredaju();
        s2.zmenDostupnostPredaju();
        s3.zmenDostupnostPrenajmu();
        s4.zmenDostupnostPrenajmu();




        hotel1.pridajPriestor(b1);
        hotel1.pridajPriestor(b2);
        hotel1.pridajPriestor(b3);
        hotel1.pridajPriestor(b4);
        hotel1.pridajPriestor(s1);
        hotel1.pridajPriestor(s2);
        hotel1.pridajPriestor(s3);
        hotel1.pridajPriestor(s4);




        System.out.println("Zoznam hotela: "+hotel1.getNazov());
        System.out.println("***********************************************************************************");
        System.out.println(hotel1.toString());

        System.out.println("Informacie o konkretnom byte");
        System.out.println("***********************************************************************************");

        System.out.println(hotel1.informacieOPriestore(2));
        System.out.println(hotel1.informacieOPriestore(3));

        System.out.println();
        System.out.println("Vymazanie bytu");
        System.out.println("***********************************************************************************");
        hotel1.vymazatPriestor(2);
        hotel1.vymazatPriestor(3);

        System.out.println(hotel1.toString());


        System.out.println("Informacie o konkretnom sklade");
        System.out.println("***********************************************************************************");

        System.out.println(hotel1.informacieOPriestore(6));
        System.out.println(hotel1.informacieOPriestore(7));
        System.out.println();

        System.out.println("Vymazanie skladu");
        System.out.println("***********************************************************************************");
        hotel1.vymazatPriestor(6);
        hotel1.vymazatPriestor(7);

        System.out.println(hotel1.toString());
        hotel1.zapisDoTextovehoSuboru("Hotel.txt");









    }

}

package Hotel;



public class Byt implements Predajny {
    private String velkost;
    private int m2;
    private boolean dostupnostPredaju;
    private int cenaZaM2;
    private int cenaZaByt;
    private int pocetIzieb;
    private boolean dostupnostPrenajmu;
    private int id;


    public Byt( int id , int m2, int cenaZaM2, int pocetIzieb) {
        this.id = id;
        this.m2 = m2;
        this.cenaZaM2 = cenaZaM2;
        this.dostupnostPredaju = false;
        this.dostupnostPrenajmu = false;
        this.cenaZaByt = this.m2*this.cenaZaM2;
        this.pocetIzieb = pocetIzieb;
        if(this.m2 > 50){
            this.velkost = "Velký";

        }else{
            this.velkost = "Malý";
        }

    }
    public int getId(){
        return this.id;
    }
    public int getCenaZaByt(){
        return this.cenaZaByt;
    }

    public boolean getDostupnostPredaju(){
        return this.dostupnostPredaju;
    }
    public boolean getDostupnostPrenajmu() {
        return this.dostupnostPrenajmu;
    }

    public boolean zmenDostupnostPredaju(){

           if(this.dostupnostPredaju==true){
               this.dostupnostPredaju = false;
               return false;
           }else{
               this.dostupnostPredaju = true;
               return true;
           }



    }
    public boolean zmenDostupnostPrenajmu(){

            if (this.dostupnostPrenajmu == true) {
                this.dostupnostPrenajmu = false;
                return false;
            } else {
                this.dostupnostPrenajmu = true;
                return true;
            }

    }


    public String getVelkost() {
        return velkost;
    }

    public int getM2() {
        return m2;
    }



    public int getCenaZaM2() {
        return cenaZaM2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public void setCenaZaM2(int cenaZaM2) {
        this.cenaZaM2 = cenaZaM2;
    }
    public String toString(){
        return "Byt číslo: " + this.id+ " je " +this.velkost+" o rozlohe: " +this.m2+ " a cenou: "+this.cenaZaByt;
    }
    public int getCena(){
        return this.cenaZaByt;
    }



}
package Hotel;

public class Sklad implements Predajny {
    private String velkost;
    private int m2;
    private boolean dostupnostPredaju;
    private boolean dostupnostPrenajmu;
    private int cenaZaM2;
    private int cenaZaSklad;
    private int id;


    public Sklad(int id, int m2, int cenaZaM2) {
        this.id = id;
        this.m2 = m2;
        this.cenaZaM2 = cenaZaM2;
        this.dostupnostPredaju = false;
        this.dostupnostPrenajmu = false;
        this.cenaZaSklad = this.m2 * this.cenaZaM2;
        if (this.m2 > 50) {
            this.velkost = "Velký";

        } else {
            this.velkost = "Malý";
        }

    }

    public int getId() {
        return this.id;
    }

    public int getCenaZaSklad() {
        return this.cenaZaSklad;
    }

    public boolean getDostupnostPredaju() {
        return this.dostupnostPredaju;
    }

    public boolean getDostupnostPrenajmu() {
        return this.dostupnostPrenajmu;
    }

    public boolean zmenDostupnostPredaju() {
        if (this.dostupnostPredaju == true) {
            this.dostupnostPredaju = false;
            return false;
        } else {
            this.dostupnostPredaju = true;
            return true;
        }
    }

    public boolean zmenDostupnostPrenajmu() {
        if (this.dostupnostPrenajmu == true) {
            this.dostupnostPrenajmu = false;
            return false;
        } else {
            this.dostupnostPrenajmu = true;
            return true;
        }
    }

    public String getVelkostSkladu() {
        return velkost;
    }

    public int getM2Skladu() {
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

    public String toString() {
        return "SKlad číslo: " + this.id + " je " + this.velkost + " o rozlohe: " + this.m2 + " a cenou: " + this.cenaZaSklad;
    }
}

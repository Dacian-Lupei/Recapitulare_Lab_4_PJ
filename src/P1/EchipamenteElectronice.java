package P1;

enum StareEchipament{
    achizitionat,
    expus,
    vandut
}
public class EchipamenteElectronice {
    public String denumire;
    public int nr_inventar;
    public double pret;
    public String zona_mag;
    public StareEchipament status;

    public EchipamenteElectronice(String denumire, int nr_inventar, double pret, String zona_mag, StareEchipament status) {
        this.denumire = denumire;
        this.nr_inventar = nr_inventar;
        this.pret = pret;
        this.zona_mag = zona_mag;
        this.status = status;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getNr_inventar() {
        return nr_inventar;
    }

    public void setNr_inventar(int nr_inventar) {
        this.nr_inventar = nr_inventar;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getZona_mag() {
        return zona_mag;
    }

    public void setZona_mag(String zona_mag) {
        this.zona_mag = zona_mag;
    }

    public StareEchipament getStatus() {
        return status;
    }

    public void setStatus(StareEchipament status) {
        this.status = status;
    }


}

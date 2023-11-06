package P1;

public class Imprimante extends EchipamenteElectronice{
    public int ppm;
    public int dpi;
    public int p_car;
    public String mod_tiparire;

    public Imprimante(String denumire, int nr_inventar, double pret, String zona_mag, StareEchipament status, int ppm, int dpi, int p_car, String mod_tiparire) {
        super(denumire, nr_inventar, pret, zona_mag, status);
        this.ppm = ppm;
        this.dpi = dpi;
        this.p_car = p_car;
        this.mod_tiparire = mod_tiparire;
    }

    public int getPpm() {
        return ppm;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getP_car() {
        return p_car;
    }

    public void setP_car(int p_car) {
        this.p_car = p_car;
    }

    public String getMod_tiparire() {
        return mod_tiparire;
    }

    public void setMod_tiparire(String mod_tiparire) {
        this.mod_tiparire = mod_tiparire;
    }

    @Override
    public String toString() {
        return "Imprimante{" +
                "ppm=" + ppm +
                ", dpi=" + dpi +
                ", p_car=" + p_car +
                ", mod_tiparire='" + mod_tiparire + '\'' +
                ", denumire='" + denumire + '\'' +
                ", nr_inventar=" + nr_inventar +
                ", pret=" + pret +
                ", zona_mag='" + zona_mag + '\'' +
                ", status=" + status +
                '}';
    }
}

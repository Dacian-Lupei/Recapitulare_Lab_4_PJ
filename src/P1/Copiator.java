package P1;

public class Copiator extends EchipamenteElectronice{
    public int p_ton;
    public String format_copiere;

    public Copiator(String denumire, int nr_inventar, double pret, String zona_mag, StareEchipament status, int p_ton, String format_copiere) {
        super(denumire, nr_inventar, pret, zona_mag, status);
        this.p_ton = p_ton;
        this.format_copiere = format_copiere;
    }

    public int getP_ton() {
        return p_ton;
    }

    public void setP_ton(int p_ton) {
        this.p_ton = p_ton;
    }

    public String getFormat_copiere() {
        return format_copiere;
    }

    public void setFormat_copiere(String format_copiere) {
        this.format_copiere = format_copiere;
    }

    @Override
    public String toString() {
        return "Copiator{" +
                "p_ton=" + p_ton +
                ", format_copiere='" + format_copiere + '\'' +
                ", denumire='" + denumire + '\'' +
                ", nr_inventar=" + nr_inventar +
                ", pret=" + pret +
                ", zona_mag='" + zona_mag + '\'' +
                ", status=" + status +
                '}';
    }
}

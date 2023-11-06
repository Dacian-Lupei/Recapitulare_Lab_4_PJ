package P1;

public class SistemeDeCalcul extends EchipamenteElectronice{
    public String tip_mon;
    public double vit_proc;
    public int c_hdd;
    public String sistemOperare;

    public SistemeDeCalcul(String denumire, int nr_inventar, double pret, String zona_mag, StareEchipament status, String tip_mon, double vit_proc, int c_hdd, String sistemOperare) {
        super(denumire, nr_inventar, pret, zona_mag, status);
        this.tip_mon = tip_mon;
        this.vit_proc = vit_proc;
        this.c_hdd = c_hdd;
        this.sistemOperare = sistemOperare;
    }

    public String getTip_mon() {
        return tip_mon;
    }

    public void setTip_mon(String tip_mon) {
        this.tip_mon = tip_mon;
    }

    public double getVit_proc() {
        return vit_proc;
    }

    public void setVit_proc(double vit_proc) {
        this.vit_proc = vit_proc;
    }

    public int getC_hdd() {
        return c_hdd;
    }

    public void setC_hdd(int c_hdd) {
        this.c_hdd = c_hdd;
    }

    public String getSistemOperare() {
        return sistemOperare;
    }

    public void setSistemOperare(String sistemOperare) {
        this.sistemOperare = sistemOperare;
    }

    @Override
    public String toString() {
        return "SistemeDeCalcul{" +
                "tip_mon='" + tip_mon + '\'' +
                ", vit_proc=" + vit_proc +
                ", c_hdd=" + c_hdd +
                ", sistemOperare='" + sistemOperare + '\'' +
                ", denumire='" + denumire + '\'' +
                ", nr_inventar=" + nr_inventar +
                ", pret=" + pret +
                ", zona_mag='" + zona_mag + '\'' +
                ", status=" + status +
                '}';
    }
}

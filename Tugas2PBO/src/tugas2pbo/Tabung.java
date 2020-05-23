package tugas2pbo;

public class Tabung extends Lingkaran{          
    protected double tg;
    public Tabung(double vr, double t) {
        super(vr);
        tg = t;
    }
//Inheritance
    @Override
    public double Luas(){
        double luas = 2 * Math.PI *r *(r + tg);
        System.out.println("Luas Permukaan Tabung "+luas);
        return luas;
    }
    void volume(){
        double volume = super.Luas() *tg;
        System.out.println("Volume Tabung "+volume);
    }
}

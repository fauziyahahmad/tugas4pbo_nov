package tugas2pbo;

public class Kerucut extends Lingkaran{
    double t;
    private double tinggi;
    Double volume_kerucut;
//    Lingkaran ling = new Lingkaran();
    public Kerucut(double r, double t){
        super(r);
        tinggi = t;
    }
    
    public double Volume() {
        volume_kerucut = super.Luas()*1.0/3.0*tinggi;
        //System.out.println(tinggi);
        //System.out.println("volume kerucut: "+ volume_kerucut);
        return volume_kerucut;
    }
    
    public double Selimut(){
        double s = (double)(Math.sqrt(Math.pow(r, 2)+Math.pow(tinggi, 2)));
        return s;
    }
    
    @Override
    public double Luas(){
        double luas = (double)(Math.PI*r*(r+Selimut()));
        System.out.println("Luas Permukaan Kerucut :"+luas);
        return luas;
    }
}

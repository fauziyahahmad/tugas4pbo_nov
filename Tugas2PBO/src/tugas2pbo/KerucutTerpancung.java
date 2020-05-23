package tugas2pbo;

public class KerucutTerpancung extends Kerucut{
    private double rk;
    private double tinggit;
    private double volume_kerucutt;
//    Lingkaran ling = new Lingkaran();
    public KerucutTerpancung(double r,double t,double rkecil, double tk){
        super(r,t);
        rk = rkecil;
        tinggit = tk;
    }
    
    public double VolumeTerpancung() {
        volume_kerucut = Volume()-(1.0/3.0*tinggit*Math.PI*(Math.pow(rk, 2)));
//        System.out.println(tinggi);
        System.out.println("Volume Kerucut Terpancung: "+ volume_kerucut);
        return volume_kerucut;
    }
    
    
    public double SelimutKecil(){
        double s = (double)(Math.sqrt(Math.pow(rk, 2)+Math.pow(tinggit, 2)));
        return s;
    }
    
    @Override
    public double Luas(){
        double luas = (double)(Math.PI*(Selimut()-SelimutKecil())*(super.r+rk));
        System.out.println("Luas Permukaan Kerucut Terpancung:"+luas);
        return luas;
    }
}

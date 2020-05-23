package tugas2pbo;

public class Juring3D extends Juring2D{
    private double t;
    public Juring3D(double vr, double sdt, double tg) {
        super(vr, sdt);
        t = tg;
    }
    @Override
    //public void luas(double panjangBusur){
    
    public double Luas(){
        //r = Rt = jari2 vertikal 
        //Rr = jari2 horizontal = nilai panjangBusur
        //t = tinggi
        
        double hasilLpJuring = 2 * Math.PI * r + Math.PI * Busur();
        System.out.println("Luas Permukaan Juring 3D = " + hasilLpJuring);
        
        double hasilVolumeJuring = ((2 * Math.PI * Math.pow(r,2) * t)/3);
        System.out.println("Volume Juring 3D = " + hasilVolumeJuring);
        return 0;
        
    }
}

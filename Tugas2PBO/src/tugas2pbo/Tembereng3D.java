package tugas2pbo;

public class Tembereng3D extends Juring3D{
    private double t;
    public Tembereng3D(double vr, double sdt, double tg) {
        super(vr, sdt, tg);
        t = tg;
    }
        @Override
    public double Luas(){
        //r = Rt = jari2 vertikal 
        //t = tinggi
        
        double hasilLpTembereng = 2 * Math.PI * r * t;
        System.out.println("Luas Permukaan Tembereng 3D = " + hasilLpTembereng);
        
        double hasilVolumeTembereng = (Math.PI * Math.pow(t,2) * (3*r - t))/3;
        System.out.println("Volume Tembereng 3D = " + hasilVolumeTembereng);
        return 0;
    }
}

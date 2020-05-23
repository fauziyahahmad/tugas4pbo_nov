package tugas2pbo;

public class Juring2D extends Lingkaran{
    protected double sd;
     double hasilLuasJuring;

    public Juring2D(double vr, double sdt) {
        super(vr);
        sd = sdt;
    }
    
    @Override
    public double Luas(){
        
        System.out.println("Panjang Busur Juring = " +Busur());
        
        double sud = (double)sd/360.0;
        hasilLuasJuring = (double)sud* super.Luas();
        System.out.println("Luas Juring 2D = " +hasilLuasJuring);
    
   
        double busur = Busur();
        double hasilKelilingJuring =busur+2*r;
        System.out.println("Keliling Juring 2D = " +hasilKelilingJuring);
        return 0;
        
    }
    
    public double Busur(){
        double panjangBusur = ((sd/360)*2*Math.PI*r);
        //System.out.println("Panjang Busur = " + panjangBusur);
        return panjangBusur;
    }
    /*double panjangBusur(){
    double sud = (double)sd/360.0;
    double hasilBusur = (double)sud*2*phi*r;
    return hasilBusur;
    }*/
    
}

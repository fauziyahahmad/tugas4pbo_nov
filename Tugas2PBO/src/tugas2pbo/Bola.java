package tugas2pbo;

public class Bola extends Lingkaran{
    protected float luasBola,kelBola,volumeBola, sudut, panjangBusur;
    //protected double hasilKelilingJuring, hasilLuasJuring;
    public Bola(double vr) {
        super(vr);
    }

    @Override
    public double Luas(){
        luasBola = (float) (4*super.Luas());
        return luasBola;
    }
    public double volume(){
        volumeBola = (float) ((4*Math.PI*r*r*r)/3);
        return volumeBola;
    }

    public double Keliling(){
        kelBola = (float) (luasBola/3);
        return kelBola;
    }
    /*public double Busur(){
    panjangBusur = (float) ((sudut/360)*2*Math.PI*r);
    System.out.println("Panjang Busur = " + panjangBusur);
    return panjangBusur;
    }*/
    /*
    public double keliling(double p){
    hasilKelilingJuring = p+ (2*r);
    System.out.println("Keliling Juring 2D = " +hasilKelilingJuring);
    return hasilKelilingJuring;
    }
    
    public double Luas(double p){
    hasilLuasJuring = (double)p * Luas();
    System.out.println("Luas Juring 2D = " +hasilLuasJuring);
    return hasilLuasJuring;
    }*/
}

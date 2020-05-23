package tugas2pbo;

public class Busur extends Lingkaran{
    protected float sudut, panjangBusur;
    public Busur( double vr, float vsudut) {
        super(vr);
        sudut = vsudut;
    }
    public void Busur(){
        panjangBusur = (float) ((sudut/360)*2*Math.PI*r);
        System.out.println("Panjang Busur = " + panjangBusur);
    }
}

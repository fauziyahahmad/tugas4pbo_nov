package tugas2pbo;

public class Lingkaran {
    public double luasling;
    //double phi = 3.14;
    protected double r;
    
    public Lingkaran(double vr){
        r = vr;
    }

    double Luas() {
        luasling = (double) (Math.PI * Math.pow(r, 2));
        //System.out.println("Luas Lingkaran : "+luasling);
        return luasling;
    }
    void keliling(){
        double klingkaran = 2 * Math.PI * r;
        System.out.println("Keliling Lingkaran "+klingkaran);
    }
    /*
    void volume(){
    System.out.println("Lingkaran Tidak Bervolume");
    }*/
}

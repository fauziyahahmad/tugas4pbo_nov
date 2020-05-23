package tugas2pbo;

public class Tembereng2D extends Juring2D{
    //protected double sd;
    public Tembereng2D(double r, double sd) {
        super(r, sd);
    }
     @Override
    public double Luas(){
        
        //System.out.println("Panjang Busur Juring = " +Busur());
        
        double sin = Math.sin(sd);
        double hasilLuasTembereng = hasilLuasJuring-(sin*r*r*0.5);
        System.out.println("Luas Tembereng 2D = " +hasilLuasTembereng);
    
   
        double sin2 = Math.sin(sd/2);
        double a= Busur();
        double hasilKelilingTembereng = a+(2*r*sin2);
        System.out.println("Keliling Tembereng 2D = " +hasilKelilingTembereng);
        return 0;
    }
}

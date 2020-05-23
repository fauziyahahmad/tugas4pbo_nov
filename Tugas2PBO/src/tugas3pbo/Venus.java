/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3pbo;

import java.util.logging.Level;
import java.util.logging.Logger;
import tugas2pbo.Bola;

/**
 *
 * @author HP
 */
public class Venus extends Bola implements Runnable{
    
    private double orbit,kalarot,kalarev;
     
    public Venus(double vr, double o, double rot, double rev) {
        super(vr);
        orbit = o;
        kalarot = rot;
        kalarev = rev;
    }
    
    public double kecrotasi(){
        return Keliling()/kalarot;
    }
    
    public double kecrevolusi(){
        return orbit/kalarev;
    }

    
    @Override
    public void run() {
        try {
            System.out.println("Volume Venus : " + volume());Thread.sleep(250);
            System.out.println("Luas Venus : " + Luas());Thread.sleep(250);
            System.out.println("Panjang Lintasan Rotasi Venus : " + Keliling());Thread.sleep(250);
            System.out.println("Kecepatan Rotasi Venus : " + kecrotasi());Thread.sleep(250);
            System.out.println("Kecepatan Revolusi Venus : " + kecrevolusi());
            
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (InterruptedException ex) {
            Logger.getLogger(Venus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

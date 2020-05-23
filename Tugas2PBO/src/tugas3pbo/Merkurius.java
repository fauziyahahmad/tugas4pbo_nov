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
public class Merkurius extends Bola implements Runnable{
    
    private double orbit,kalarot,kalarev;
     
    public Merkurius(double vr, double o, double rot, double rev) {
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
            System.out.println("\n===Volume====");
            System.out.println("Volume Merkurius : " + volume());Thread.sleep(250);
            System.out.println("\n===Luas Permukaan====");
            System.out.println("Luas Merkurius : " + Luas());Thread.sleep(250);
            System.out.println("\n===Panjang Lintasan Rotasi====");
            System.out.println("Panjang Lintasan Rotasi Merkurius : " + Keliling());Thread.sleep(250);
            System.out.println("\n===Kecepatan Rotasi====");
            System.out.println("Kecepatan Rotasi Merkurius : " + kecrotasi());Thread.sleep(250);
            System.out.println("\n===Kecepatan Revolusi====");
            System.out.println("Kecepatan Revolusi Merkurius : " + kecrevolusi());Thread.sleep(250);
            
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (InterruptedException ex) {
            Logger.getLogger(Merkurius.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}


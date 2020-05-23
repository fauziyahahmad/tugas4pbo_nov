/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2pbo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import tugas3pbo.Bumi;
import tugas3pbo.IlustrasiPergerakan;
import tugas3pbo.IlustrasiVolume;
import tugas3pbo.Jupiter;
import tugas3pbo.Mars;
import tugas3pbo.Merkurius;
import tugas3pbo.Neptunus;
import tugas3pbo.Saturnus;
import tugas3pbo.Uranus;
import tugas3pbo.Venus;

/**
 *
 * @author Asus A409FJ
 */
public class Panggil {
    public Panggil(double rk, double orbitk, double rotasik, double revolusik, double rv, double orbitv, double rotasiv, double revolusiv,
             double rb, double orbitb, double rotasib, double revolusib, double rm, double orbitm, double rotasim, double revolusim,
             double rj, double orbitj, double rotasij, double revolusij, double rs, double orbits, double rotasis, double revolusis, double ru,
             double orbitu, double rotasiu, double revolusiu, double rn, double orbitn, double rotasin, double revolusin){
        Lingkaran ling = new Lingkaran(rk); 
        Bola bola = new Bola(rk);
        Merkurius mk = new Merkurius(rk,orbitk,rotasik,revolusik);
        Thread th = new Thread(mk);
        th.start();
        Lingkaran apa = new Lingkaran(rv); 
        Bola bo = new Bola(rv);
        Venus v = new Venus(rv,orbitv,rotasiv,revolusiv);
        Thread thv = new Thread(v);
        thv.start();
        Lingkaran aha = new Lingkaran(rb); 
        Bola bb = new Bola(rb);
        Bumi bum = new Bumi(rb,orbitb,rotasib,revolusib);
        Thread thb = new Thread(bum);
        thb.start();
        Lingkaran mars = new Lingkaran(rm); 
        Bola bm = new Bola(rm);
        Mars mrs = new Mars(rm,orbitm,rotasim,revolusim);
        Thread thm = new Thread(mrs);
        thm.start();
        Lingkaran jpt = new Lingkaran(rj); 
        Bola bj = new Bola(rj);
        Jupiter jupt = new Jupiter(rj,orbitj,rotasij,revolusij);
        Thread thj = new Thread(jupt);
        thj.start();
        Lingkaran satur = new Lingkaran(rs); 
        Bola bs = new Bola(rs);
        Saturnus str = new Saturnus(rs,orbits,rotasis,revolusis);
        Thread ths = new Thread(str);
        ths.start();
        Lingkaran urs = new Lingkaran(ru); 
        Bola bu = new Bola(ru);
        Uranus urn = new Uranus(ru,orbitu,rotasiu,revolusiu);
        Thread thu = new Thread(urn);
        thu.start();
        Lingkaran nept = new Lingkaran(rn); 
        Bola bn = new Bola(rn);
        Neptunus npt = new Neptunus(rn,orbitn,rotasin,revolusin);
        Thread thn = new Thread(npt);
        thn.start();
        try {
           Thread.sleep(1000);
           IlustrasiVolume iv = new IlustrasiVolume();
           //                             iv.jari2(rk, rv, rb, rm, rj, rs, ru, rn);
           //                             iv.pnjng(orbitk, orbitv, orbitb, orbitm, orbitj, orbits, orbitu, orbitn);
            iv.setVisible(true);
            JFrame myFrame = new JFrame("Hello");
            myFrame.add(iv);
            myFrame.pack();
            myFrame.setVisible(true);
            myFrame.setSize(800, 800);
            iv.init();
        } catch (InterruptedException ex) {
            Logger.getLogger(Tugas2PBO.class.getName()).log(Level.SEVERE, null, ex);
        }
        SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
           JFrame frame = new JFrame("Ilustrasi Pergerakan");
           frame.setContentPane(new IlustrasiPergerakan(rk, rv, rb, rm, rj, rs, ru, rn));  
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.pack();
           frame.setLocationRelativeTo(null); 
           frame.setVisible(true); 
           //IlustrasiPergerakan n = new IlustrasiPergerakan2();
        }
    });
    }
}

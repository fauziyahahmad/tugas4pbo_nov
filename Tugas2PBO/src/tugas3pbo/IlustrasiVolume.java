/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3pbo;
import java.awt.*;
import java.applet.*;
import java.util.Random;

/**
 *
 * @author HP
 */
public class IlustrasiVolume extends Applet {
    Dimension screen;
    Random random;
    int jari[] = new int[8];
    int pjng[] = new int[8];
    
    public void init(){
        // set size frame base on your resolution screen 
        screen = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screen.width, screen.height);
        setBackground(Color.decode("#424242"));
    }
    
    public void paint(Graphics g)
    {
        // draw sun
        
        g.setColor(Color.decode("#FFEB3B"));      
        g.fillOval(-400, 100,550,550);  
        g.setColor(Color.decode("#FFF9C4"));
        g.drawOval(-400, 100, 553, 553);

        String[][] planet = {
            {"#dcdcdc", "#f9932d", "#00bfff", "#cdaa7d", "#fd9730", "#fbf344", "#8bf0f9", "#54c0cc"}, 
            {"#cfcfcf", "#f88614", "#00bfff", "#c69e6b", "#fbcfa3", "#f9f495", "#c5f4f9", "#71cad4"},
            {"15", "25", "20", "30", "140", "100", "90", "80"}, 
            {"Merkurius", "Venus", "Bumi", "Mars", "Jupiter", "Saturnus", "Uranus", "Neptunus"}, 
            {"150", "225", "300", "375", "450", "700", "900", "1200"}, 
            {"250", "450", "400", "500", "350", "500", "350", "250"} 
        };

       
        for (int p = 0; p < planet[0].length; p++) {
            String fillC = planet[0][p];
            String drawC = planet[1][p];
            int size = Integer.parseInt(planet[2][p]);
            int sizeOut = Integer.parseInt(planet[2][p]) + 1;
            String pName = planet[3][p];
            int x = Integer.parseInt(planet[4][p]);
            int y = Integer.parseInt(planet[5][p]);
            int yText = y + sizeOut + 15;

            g.setColor(Color.decode(fillC));
            g.fillOval(x, y, size, size);
            g.setColor(Color.decode(drawC));
            g.drawOval(x, y, sizeOut, sizeOut);
            g.drawString(pName, x, yText);
            if (p == 5) {
                g.setColor(Color.white);
                g.drawArc((x - 5), (y + 35), 150, 50, 150, 170);
                g.setColor(Color.white);
                g.drawArc((x - 10), (y + 40), 150, 50, 150, 170);
                g.setColor(Color.white);
                g.drawArc((x - 15), (y + 45), 150, 50, 150, 170);
            }
            if (p == 7) {
                g.setColor(Color.white);
                g.drawArc((x - 10), (y + 25), 150, 50, 150, 140);
            }
        }
        
        
//        for(int oval=0; oval<=5000;oval++){
//            random = new Random();
//            int y = random.nextInt((screen.height+1000));
//            int x = random.nextInt((screen.width+1000));
//            float xr = random.nextFloat();
//            float xg = random.nextFloat();
//            float xb = random.nextFloat();
//            if(oval%2 == 1){
//                int w = random.nextInt(7);
//                int h = random.nextInt(7);
//                g.setColor(new Color(xr, xg, xb));
//                g.drawOval(y, x, h, h); 
//            } else {
//                random = new Random();
//                int w = random.nextInt(5);
//                int h = random.nextInt(5);
//                g.setColor(new Color(xr, xg, xb));
//                g.fillOval(y, x, h, h); 
//            }
//        }

    }
}
//        String[][] planet = {
//            {"#dcdcdc", "#f9932d", "#00bfff", "#cdaa7d", "#fd9730", "#fbf344", "#8bf0f9", "#54c0cc"}, 
//            {"#cfcfcf", "#f88614", "#00bfff", "#c69e6b", "#fbcfa3", "#f9f495", "#c5f4f9", "#71cad4"},
////            {"35", "45", "40", "50", "160", "120", "110", "100"}, 
//            {"Merkurius", "Venus", "Bumi", "Mars", "Jupiter", "Saturnus", "Uranus", "Neptunus"}, 
////            {"250", "325", "400", "475", "550", "800", "1000", "1300"}, 
//            {"350", "550", "500", "600", "450", "600", "450", "350"} 
//        };
//        
//        // looping for draw planet
//        for(int p=0; p<planet[0].length; p++){
//            String fillC = planet[0][p];
//            String drawC = planet[1][p];
//            int size = jari[p];
//            int sizeOut = jari[p]+1;
//            String pName = planet[2][p];
//            int x = pjng[p];  
//            int y = Integer.parseInt(planet[4][p]);  
//            int yText = y+sizeOut+15;
//            
//            g.setColor(Color.decode(fillC));
//            g.fillOval(x, y, size, size);
//            g.setColor(Color.decode(drawC));
//            g.drawOval(x, y, sizeOut, sizeOut);
//            g.drawString(pName, x, yText);
////            if(p == 7){
////                g.setColor(Color.white);
////                g.drawArc((x-5), (y+35),170,50,170,170);
////                g.setColor(Color.white);
////                g.drawArc((x-10), (y+40),170,50,170,170);
////                g.setColor(Color.white);
////                g.drawArc((x-15), (y+45),170,50,170,170);
////            }
//        }
//
//        // looping for draw litle star with random position and random color
////        for(int oval=0; oval<=5000;oval++){
////            random = new Random();
////            int y = random.nextInt((screen.height+1000));
////            int x = random.nextInt((screen.width+1000));
////            float xr = random.nextFloat();
////            float xg = random.nextFloat();
////            float xb = random.nextFloat();
////            if(oval%2 == 1){
////                int w = random.nextInt(7);
////                int h = random.nextInt(7);
////                g.setColor(new Color(xr, xg, xb));
////                g.drawOval(y, x, h, h); //ganjil is draw
////            } else {
////                random = new Random();
////                int w = random.nextInt(5);
////                int h = random.nextInt(5);
////                g.setColor(new Color(xr, xg, xb));
////                g.fillOval(y, x, h, h); //ganjil is draw
////            }
////        }
//    }
//    
//    public void jari2(double jr1, double jr2, double jr3, double jr4, double jr5, double jr6, double jr7, double jr8){
//        
//        jari[0] = (int)jr1;
//        jari[1] = (int)jr2;
//        jari[2] = (int)jr3;
//        jari[3] = (int)jr4;
//        jari[4] = (int)jr5;
//        jari[5] = (int)jr6;
//        jari[6] = (int)jr7;
//        jari[7] = (int)jr8;
//        
//        
//    }
//    
//    public void pnjng(double pj1, double pj2, double pj3, double pj4, double pj5, double pj6, double pj7, double pj8){
//        
//        pjng[0] = (int)pj1;
//        pjng[1] = (int)pj2;
//        pjng[2] = (int)pj3;
//        pjng[3] = (int)pj4;
//        pjng[4] = (int)pj5;
//        pjng[5] = (int)pj6;
//        pjng[6] = (int)pj7;
//        pjng[7] = (int)pj8;
//        
//        
//    }
//    
//    
//}
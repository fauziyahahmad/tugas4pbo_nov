
package tugas3pbo;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.io.File;
import javax.swing.Timer;
import tugas2pbo.*;
/**
 *
 * @author HP
 */
public class IlustrasiPergerakan extends JPanel
{
    Tugas2PBO tugas2;
    Model model;
    CelestialBody[] celestialBodies = new CelestialBody[9];
    boolean[] descriptionSeen = new boolean[9];
    
    final static int DELAY = 50; 
    double size = 1;
    BufferedImage[] bimgs = new BufferedImage[9];
    String[][] description;
    boolean stop = false;
    int clicked = -1;
        int rkm, rvn, rbm, rms, rjp, rst, rur, rnp;
    
    public IlustrasiPergerakan(double rk, double rv, double rb, double rm, double rj, double rs, double ru, double rn)
    {
          tugas2 = new Tugas2PBO();
          
          model = new Model();
          model.setPreferredSize(new Dimension(1200, 1200));
          add(model);
          
            celestialBodies[0] = new CelestialBody(600, 450, -4.7, 0, 9, (int) rk, Color.GRAY, 1000); //Mercury
            celestialBodies[1] = new CelestialBody(752, 400, 0, -2.5, 900, (int) rv, new Color(207,153,52), 1000); //Venus
            celestialBodies[2] = new CelestialBody(600, 150, 1.8, 0, 900, (int) rb, Color.BLUE, 2000); //Earth
            celestialBodies[3] = new CelestialBody(650, -50, 1.2, 0, 900, (int) rm, Color.RED, 2000); //Mars
            celestialBodies[4] = new CelestialBody(600, -100, 1.2, 0, 900, (int) rj, new Color(255,140,0), 2000); //Jupiter
            celestialBodies[5] = new CelestialBody(600, -150, 1.2, 0, 900,(int) rs, new Color(112,128,144), 2000); //Saturn
            celestialBodies[6] = new CelestialBody(600, -175, 1.2, 0, 900,(int) ru, new Color(196,233,238), 2000); //Uranus
            celestialBodies[7] = new CelestialBody(0, 400, 0, -1.2, 900, (int) rn, new Color(66, 98, 243), 2000);//Neptune
            
            celestialBodies[8] = new CelestialBody(600, 400, .1, 0, 1000, 30, Color.ORANGE, 0);//Sun
            
                      
                    
          setBackground(Color.BLACK);


         
          description = new String[][]{ 
                {"Merkurius","Diameter: " + celestialBodies[0].getDiameter()*1058+ " kilometer",
                    "Massa: 0.330 x 10^(24) kg",
                    "Tipe Atmosphere: Tipis",
                    "Temperatur Rata-Rata: 167 °C",
                    "Planet Dalam - Paling Dekat Dengan Matahari"
                },
                {"Venus","Diameter: " + celestialBodies[1].getDiameter()*1058+ " kilometer",
                    "Massa: 4.87 x 10^(24) kg",
                    "Tipe Atmosphere: Agak Tipis",
                    "Temperatur Rata-Rata: 464 °C",  
                    "Planet Dalam - Dikenal Sebagai Kembaran Bumi"
                },
                {"Bumi","Diameter: " + celestialBodies[2].getDiameter()*1058+ " kilometer",
                    "Massa: 5.97 x 10^(24) kg",
                    "Tipe Atmosphere: Tipis",
                    "Temperatur Rata-Rata: 15 °C",
                    "Planet Dalam - Rumah Kita Semua"	
                 },
                {"Mars","Diameter: " + celestialBodies[3].getDiameter()*1058+ " kilometer",
                    "Massa: 0.642 x 10^(24) kg",
                    "Tipe Atmosphere: Agak Tebal",
                    "Temperatur Rata-rata: -65 °C",
                    "Planet Dalam - Dikenal sebagai Planet Merah"
                },
                {"Jupiter","Diameter: " + celestialBodies[4].getDiameter()*1058+ " kilometer",
                    "Massa: 1898 x 10^(24) kg",
                    "Tipe Atmosphere: Tebal",
                    "Temperatur Rata-Rata: -110 °C",
                    "Planet Luar - Planet Terbesar Di Tata Surya"},
                {"Saturnus","Diameter: " + celestialBodies[5].getDiameter()*3058+ " kilometer",
                    "Massa: 568 x 10^(24) kg",
                    "Temperatur Rata-Rata: -140 °C",
                    "Tipe Atmosphere: Tebal",
                    "Planet Luar - Dikenal karena Cincinnya"}, 
                {"Uranus","Diameter: " + celestialBodies[6].getDiameter()*3058+ " kilometer",
                    "Massa: 86.8 x 10^(24) kg",
                    "Tipe Atmosphere: Tebal",
                    "Temperatur Rata-Rata: -195 °C",
                    "Planet Luar - Terdiri dari Es dan Batuan"},
                {"Neptune","Diameter: " + celestialBodies[7].getDiameter()*1058+ " kilometer",
                    "Massa: 102 x 10^(24) kg",
                    "Tipe Atmosphere: Tebal, Tipis",
                    "Temperatur Rata-Rata: -200 °C",
                    "Planet Luar - Planet yang Ditemukan Oleh Prediksi Matematika"},
                {"Matahari","Diameter: " + celestialBodies[8].getDiameter()*3058+ " kilometer",
                  "Massa: 1.989 × 10^30 kg",
                  "Tipe Atmosphere: Tebal",
                  "Temperatur Rata-Rata: 5505 °C",
                  "Memiliki Ukuran Terbesar di Tata Surya"},
           };

           bimgs[0] = getImage("mercury.jpg"); //stackOverflow
           bimgs[1] = getImage("Venus.jpg");
           bimgs[2] = getImage("bluemarble.jpg");
           bimgs[3] = getImage("mars.jpg");
           bimgs[4] = getImage("jupiterNasa.jpg");
           bimgs[5] = getImage("saturn.jpg");
           bimgs[6] = getImage("uranus.jpg");
           bimgs[7] = getImage("neptune.jpg");
           bimgs[8] = getImage("sun.jpg");
           

          Thread thread =  new Thread() {
     
            @Override
             public void run() {
                gameLoop();
             }
          }; 
          
          thread.start();
    }
   
    
    public static BufferedImage getImage(String ref) {  //loading the image
        BufferedImage bimg = null;  
        try {  
  
            bimg = ImageIO.read(new File(ref));  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return bimg;  
    }  
    private void gameLoop() {
    	
      while (true) {
            if (!stop)
            {
                for(int i = 0; i < celestialBodies.length-1; i++)
                {
                	celestialBodies[i].update(celestialBodies[8].getXPosition(),celestialBodies[8].getYPosition(),celestialBodies[8].getMass());
                }
            }
         repaint();//untuk melakukan penggambaran ulang

         try {
            Thread.sleep(DELAY);
         } catch (InterruptedException ex) { }
      }
   }
    

    class Model extends JPanel implements KeyListener, MouseListener {
      public Model() {

         setFocusable(true); 
         requestFocus();
         addKeyListener(this);
         addMouseListener(this);
      }

      
      public void paintComponent(Graphics g) {


         for(CelestialBody body : celestialBodies)
            body.draw(g,size);
         
         //following code is for creating stars 
         //any more stars, and it got distracting
         for(int count=0;count<=1000;count++) {
        	 g.setColor(Color.WHITE); 
        	 
        	 g.drawOval(50*count,100*count,1,1);
        	g.drawOval(75*count,100*count,1,1);
        	
        	 g.drawOval(100*count,200*count,1,1);
        	 g.drawOval(150*count,200*count,1,1);
        	 g.drawOval(200*count,200*count,1,1);
        	 g.drawOval(250*count,200*count,1,1);
        	 g.drawOval(300*count,200*count,1,1);
        	 g.drawOval(350*count,200*count,1,1);
        	 g.drawOval(400*count,100*count,1,1);
        	 g.drawOval(450*count,100*count,1,1);
        	 g.drawOval(500*count,100*count,1,1);
        	 g.drawOval(550*count,300*count,1,1);
        	 g.drawOval(600*count,300*count,1,1);
        	 g.drawOval(700*count,300*count,1,1);
        	 g.drawOval(800*count,300*count,1,1);
        	 g.drawOval(900*count,300-count,1,1);
        	 g.drawOval(1000*count,300-count,1,1);



        	 }
         //
         
         for (int i = 0; i < celestialBodies.length; i++)
         {
             if (celestialBodies[i].getDescVisible())
            	 celestialBodies[i].dispDesc(g,size);
         }
         if (clicked > -1)
         {
             g.drawImage(bimgs[clicked],0,0,200,200,Color.WHITE,null);
             g.setFont(new Font("Arial", Font.PLAIN, 20));
             g.setColor(Color.WHITE);
             for(int i = 0; i < description[clicked].length; i++)
             {
                 g.drawString(description[clicked][i], 0, 210+i*30);
             }
         }
         
          
          
          String legend = "Solar System Model Legend";
        	String zoomIn = "+ KEY  =  Zoom In";
        	String zoomOut = "- KEY  =  Zoom Out";
        	 String spaceBar = "SPACEBAR = Pause/Play";
        	 String mouseClick =  "MOUSECLICK = More Info on Planet";
        	 String planetNumberInfo = "~The Number beside planet is its";
        	 String planetNumberInfoSecLine = "~distance from the Sun";
        	String escape = "ESC = Quit Model";
      
        g.setFont(new Font("Arial", Font.PLAIN, 10));
        g.setColor(Color.WHITE);
         g.drawString(legend,950,60);
         g.drawString(zoomIn, 950, 100);
         g.drawString(zoomOut, 950, 120);
         g.drawString(spaceBar, 950, 140);
         g.drawString(mouseClick, 950, 160);
         g.drawString(planetNumberInfo, 950, 180);
         g.drawString(planetNumberInfoSecLine,950,200);
         g.drawString(escape, 950, 220);
         
         
         celestialBodies[0].dispDesc(g,size);
         celestialBodies[1].dispDesc(g,size);
         celestialBodies[2].dispDesc(g,size);
         celestialBodies[3].dispDesc(g,size);
         celestialBodies[4].dispDesc(g,size);
         celestialBodies[5].dispDesc(g,size);
         celestialBodies[6].dispDesc(g,size);
         celestialBodies[7].dispDesc(g,size);
         celestialBodies[8].dispDesc(g,size);

      }
      
      public void keyTyped(KeyEvent e) {
    	  
      }
      public void mousePressed(MouseEvent e) {
    	  
      }
      public void mouseReleased(MouseEvent e) {
          for(int i = 0; i < celestialBodies.length; i++)
              if (celestialBodies[i].hitPlanet(e.getX(), e.getY(), size))
              {
                  
            	  celestialBodies[i].setDescVisible(!celestialBodies[i].getDescVisible());
                  if(celestialBodies[i].getDescVisible()) {
                	  clicked = i;
                  }
                  else  {
                	  clicked = -1;
                  }
              }
      }
      public void mouseEntered(MouseEvent e) { 
    	  
      }
      public void mouseExited(MouseEvent e) { 
    	  
      }
      public void mouseClicked(MouseEvent e) { 
    	  
      }
      
      public void keyPressed(KeyEvent e) {
    	  
      }
      
      @Override
      public void keyReleased(KeyEvent e) { 

          if(e.getKeyCode() == KeyEvent.VK_PLUS || e.getKeyCode() == KeyEvent.VK_EQUALS)
        	  size += .1;
          
    	  if(e.getKeyCode() == KeyEvent.VK_MINUS && size > 0)
        	  size -= .1;
    	  
          if(e.getKeyCode() == KeyEvent.VK_SPACE)
          {
              stop = !stop;
          }
          if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
          {
              System.exit(0);
          }
         
      }
   

   }
    
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            JFrame frame = new JFrame("Solar System Model");
//            frame.setContentPane(new IlustrasiPergerakan());  
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null); 
            frame.setVisible(true);            
         }
      });
    }
}

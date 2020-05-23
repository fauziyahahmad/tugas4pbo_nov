/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3pbo;

/**
 *
 * @author HP
 */
public class Synchronize {
    static void print (String p1 , String p2) {
        System.out.print(p1);
      try {
         Thread.sleep(2000);
      } 
      catch (InterruptedException ie) {
      }
        System.out.println(p2);
   }
}

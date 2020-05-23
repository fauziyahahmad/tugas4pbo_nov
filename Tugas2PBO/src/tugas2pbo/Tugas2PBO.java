package tugas2pbo;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import tugas3pbo.*;

public class Tugas2PBO {

    
    public static void main(String[] args) {
        Scanner planet = new Scanner(System.in);
        double rk,  r, tg, r2, tg2, orbitk, rotasik, revolusik;
        double rv, orbitv, rotasiv, revolusiv;
        double rb, orbitb, rotasib, revolusib;
        double rm, orbitm, rotasim, revolusim;
        double rj, orbitj, rotasij, revolusij;
        double rs, orbits, rotasis, revolusis;
        double ru, orbitu, rotasiu, revolusiu;
        double rn, orbitn, rotasin, revolusin;
        float sd;
        System.out.println("MENU:");
        System.out.println("1. BANGUN RUANG");
        System.out.println("2. PLANET");
        System.out.print("PILIH : ");
        int menu = planet.nextInt();
        switch(menu){
            case 1 : System.out.println("*PROGRAM MENGHITUNG KELILING, LUAS PERMUKAAN, DAN VOLUME*");
                   // System.out.println("Masukkan Tinggi = ");
                    Scanner pilihan = new Scanner(System.in);
                    Scanner jari2 = new Scanner(System.in);
                    Scanner tinggi = new Scanner(System.in);
                    Scanner sudut = new Scanner(System.in);
                    Scanner tinggi2 = new Scanner(System.in);
                    Scanner jarikcl = new Scanner(System.in);
                    
                    try{
                        System.out.println("Masukkan Jari-jari = ");
                        r = jari2.nextDouble();
                        if(r<=0){
                            throw new RuntimeException("Data Salah");
                        }
                        System.out.println("Masukkan Jari-jari Kecil = ");
                        r2 = jarikcl.nextDouble();
                        if(r2<=0){
                            throw new RuntimeException("Data Salah");
                        }
                        System.out.println("Masukkan Tinggi = ");
                        tg = tinggi.nextDouble();
                        if(tg<=0){
                            throw new RuntimeException("Data Salah");
                        }
                        System.out.println("Masukkan Tinggi Kecil = ");
                        tg2 = tinggi2.nextDouble();
                        if(tg2<=0){
                            throw new RuntimeException("Data Salah");
                        }
                        System.out.println("Masukkan Sudut = ");
                        sd = sudut.nextFloat();
                        if(sd<=0){
                            throw new RuntimeException("Data Salah");
                        }
                    } catch(RuntimeException a) {
                        System.out.println("Data Tidak Boleh Kurang Dari Samadengan 0, Mohon Ulangi");

                        System.out.println("Masukkan Jari-jari = ");
                        r = jari2.nextDouble();
                        if(r<=0){
                            throw new RuntimeException("Data Salah");
                        }
                        System.out.println("Masukkan Jari-jari Kecil = ");
                        r2 = jarikcl.nextDouble();
                        if(r2<=0){
                            throw new RuntimeException("Data Salah");
                        }
                        System.out.println("Masukkan Tinggi = ");
                        tg = tinggi.nextDouble();
                        if(tg<=0){
                            throw new RuntimeException("Data Salah");
                        }
                        System.out.println("Masukkan Tinggi Kecil = ");
                        tg2 = tinggi2.nextDouble();
                        if(tg2<=0){
                            throw new RuntimeException("Data Salah");
                        }
                        System.out.println("Masukkan Sudut = ");
                        sd = sudut.nextFloat();
                        if(sd<=0){
                            throw new RuntimeException("Data Salah");
                        }
                    }
                    Lingkaran l = new Lingkaran(r); 
                    Tabung t = new Tabung(r, tg);
                    Busur b = new Busur(r, sd);
                    Bola bl = new Bola(r);
                    Kerucut k = new Kerucut(r, tg);
                    KerucutTerpancung kt = new KerucutTerpancung(r, tg, r2, tg2);
                    Juring2D j = new Juring2D(r, sd);
                    Tembereng2D tb = new Tembereng2D(r, sd);
                    Juring3D jr = new Juring3D(r, sd, tg);
                    Tembereng3D tbr = new Tembereng3D(r, sd,tg);


                    System.out.println("========MENU=========");
                    System.out.println("1. Lingkaran");
                    System.out.println("2. Tabung");
                    System.out.println("3. Kerucut");
                    System.out.println("4. Bola");
                    System.out.println("Pilih = ");
                    int pilih = pilihan.nextInt();

                    switch(pilih){
                        case 1 : System.out.println("LINGKARAN");
                                l.Luas();
                                System.out.println("Luas Lingkaran : "+l.luasling);
                                l.keliling();
                                j.Luas();
                                tb.Luas();
                                break;
                        case 2 : System.out.println("TABUNG");
                                t.Luas();
                                t.volume();
                                break;
                        case 3 : System.out.println("KERUCUT");
                                k.Luas();
                                k.Volume();
                                System.out.println("Volume Kerucut : "+ k.volume_kerucut);
                                kt.Luas();
                                kt.VolumeTerpancung();
                                break;
                        case 4 : System.out.println("BOLA");
                                bl.Luas();
                                System.out.println("Luas Bola = "+ bl.luasBola);
                                bl.volume();
                                System.out.println("Volume Bola "+ bl.volumeBola);
                                bl.Keliling();            
                                System.out.println("Keliling Bola "+ bl.kelBola);
                                jr.Luas();
                                tbr.Luas();
                                break;
                    }
                    break;
            case 2 : 
                     try {
                        RandomAccessFile raFile = null;
                        raFile = new RandomAccessFile("src//file//data.txt", "rw");
                        System.out.println("========MENGGUNAKAN RANDOM ACCESS FILE=========");
                        System.out.println("1. INPUT");
                        System.out.println("2. READ");
                        System.out.print("Pilih = ");
                        int menu2 = planet.nextInt();
                        switch(menu2){
                            case 1: 
                                System.out.println(raFile.length());
                                raFile.setLength(0);
                                System.out.println("1.PLANET MERKURIUS");
                                System.out.print("Masukkan Jari-jari : ");
                                rk = planet.nextDouble();
                                raFile.writeDouble(rk);
                                System.out.print("Masukkan Panjang Lintasan revolusi / orbit : ");
                                orbitk = planet.nextDouble();
                                raFile.writeDouble(orbitk);
                                System.out.print("Masukkan Kala Rotasi :");
                                rotasik = planet.nextDouble();
                                raFile.writeDouble(rotasik);
                                System.out.print("Masukkan Kala Revolusi :");
                                revolusik = planet.nextDouble();
                                raFile.writeDouble(revolusik);
                                System.out.println("2.PLANET VENUS");
                                System.out.print("Masukkan Jari-jari : ");
                                rv = planet.nextDouble();
                                raFile.writeDouble(rv);
                                System.out.print("Masukkan Panjang Lintasan revolusi / orbit : ");
                                orbitv = planet.nextDouble();
                                raFile.writeDouble(orbitv);
                                System.out.print("Masukkan Kala Rotasi :");
                                rotasiv = planet.nextDouble();
                                raFile.writeDouble(rotasiv);
                                System.out.print("Masukkan Kala Revolusi :");
                                revolusiv = planet.nextDouble();
                                raFile.writeDouble(revolusiv);
                                System.out.println("3.PLANET BUMI");
                                System.out.print("Masukkan Jari-jari : ");
                                rb = planet.nextDouble();
                                raFile.writeDouble(rb);
                                System.out.print("Masukkan Panjang Lintasan revolusi / orbit : ");
                                orbitb = planet.nextDouble();
                                raFile.writeDouble(orbitb);
                                System.out.print("Masukkan Kala Rotasi :");
                                rotasib = planet.nextDouble();
                                raFile.writeDouble(rotasib);
                                System.out.print("Masukkan Kala Revolusi :");
                                revolusib = planet.nextDouble();
                                raFile.writeDouble(revolusib);
                                System.out.println("4.PLANET MARS");
                                System.out.print("Masukkan Jari-jari : ");
                                rm = planet.nextDouble();
                                raFile.writeDouble(rm);
                                System.out.print("Masukkan Panjang Lintasan revolusi / orbit : ");
                                orbitm = planet.nextDouble();
                                raFile.writeDouble(orbitm);
                                System.out.print("Masukkan Kala Rotasi :");
                                rotasim = planet.nextDouble();
                                raFile.writeDouble(rotasim);
                                System.out.print("Masukkan Kala Revolusi :");
                                revolusim = planet.nextDouble();
                                raFile.writeDouble(revolusim);
                                System.out.println("5.PLANET JUPITER");
                                System.out.print("Masukkan Jari-jari : ");
                                rj = planet.nextDouble();
                                raFile.writeDouble(rj);
                                System.out.print("Masukkan Panjang Lintasan revolusi / orbit : ");
                                orbitj = planet.nextDouble();
                                raFile.writeDouble(orbitj);
                                System.out.print("Masukkan Kala Rotasi :");
                                rotasij = planet.nextDouble();
                                raFile.writeDouble(rotasij);
                                System.out.print("Masukkan Kala Revolusi :");
                                revolusij = planet.nextDouble();
                                raFile.writeDouble(revolusij);
                                System.out.println("6.PLANET SATURNUS");
                                System.out.print("Masukkan Jari-jari : ");
                                rs = planet.nextDouble();
                                raFile.writeDouble(rs);
                                System.out.print("Masukkan Panjang Lintasan revolusi / orbit : ");
                                orbits = planet.nextDouble();
                                raFile.writeDouble(orbits);
                                System.out.print("Masukkan Kala Rotasi :");
                                rotasis = planet.nextDouble();
                                raFile.writeDouble(rotasis);
                                System.out.print("Masukkan Kala Revolusi :");
                                revolusis = planet.nextDouble();
                                raFile.writeDouble(revolusis);
                                System.out.println("7.PLANET URANUS");
                                System.out.print("Masukkan Jari-jari : ");
                                ru = planet.nextDouble();
                                raFile.writeDouble(ru);
                                System.out.print("Masukkan Panjang Lintasan revolusi / orbit : ");
                                orbitu = planet.nextDouble();
                                raFile.writeDouble(orbitu);
                                System.out.print("Masukkan Kala Rotasi :");
                                rotasiu = planet.nextDouble();
                                raFile.writeDouble(rotasiu);
                                System.out.print("Masukkan Kala Revolusi :");
                                revolusiu = planet.nextDouble();
                                raFile.writeDouble(revolusiu);
                                System.out.println("8.PLANET NEPTUNUS");
                                System.out.print("Masukkan Jari-jari : ");
                                rn = planet.nextDouble();
                                raFile.writeDouble(rn);
                                System.out.print("Masukkan Panjang Lintasan revolusi / orbit : ");
                                orbitn = planet.nextDouble();
                                raFile.writeDouble(orbitn);
                                System.out.print("Masukkan Kala Rotasi :");
                                rotasin = planet.nextDouble();
                                raFile.writeDouble(rotasin);
                                System.out.print("Masukkan Kala Revolusi :");
                                revolusin = planet.nextDouble();
                                raFile.writeDouble(revolusin);
                                Panggil panggil = new Panggil(rk,orbitk, rotasik, revolusik, rv, orbitv, rotasiv, revolusiv,
                                rb, orbitb, rotasib, revolusib, rm, orbitm, rotasim, revolusim, rj, orbitj, rotasij, revolusij,
                                rs, orbits, rotasis, revolusis, ru, orbitu, rotasiu, revolusiu, rn, orbitn, rotasin, revolusin);
                                   raFile.close();
                                break;
                            case 2: 
                                raFile.seek(0);
                                rk = raFile.readDouble();
                                raFile.seek(1*8);
                                orbitk = raFile.readDouble();
                                raFile.seek(2*8);
                                rotasik = raFile.readDouble();
                                raFile.seek(3*8);
                                revolusik = raFile.readDouble();
                                raFile.seek(4*8);
                                rv = raFile.readDouble();
                                raFile.seek(5*8);
                                orbitv = raFile.readDouble();
                                raFile.seek(6*8);
                                rotasiv = raFile.readDouble();
                                raFile.seek(7*8);
                                revolusiv = raFile.readDouble();
                                raFile.seek(8*8);
                                rb = raFile.readDouble();
                                raFile.seek(9*8);
                                orbitb = raFile.readDouble();
                                raFile.seek(10*8);
                                rotasib = raFile.readDouble();
                                raFile.seek(11*8);
                                revolusib = raFile.readDouble();
                                raFile.seek(12*8);
                                rm = raFile.readDouble();
                                raFile.seek(13*8);
                                orbitm = raFile.readDouble();
                                raFile.seek(14*8);
                                rotasim = raFile.readDouble();
                                raFile.seek(15*8);
                                revolusim = raFile.readDouble();
                                raFile.seek(16*8);
                                rj = raFile.readDouble();
                                raFile.seek(17*8);
                                orbitj = raFile.readDouble();
                                raFile.seek(18*8);
                                rotasij = raFile.readDouble();
                                raFile.seek(19*8);
                                revolusij = raFile.readDouble();
                                raFile.seek(20*8);
                                rs = raFile.readDouble();
                                raFile.seek(21*8);
                                orbits = raFile.readDouble();
                                raFile.seek(22*8);
                                rotasis = raFile.readDouble();
                                raFile.seek(23*8);
                                revolusis = raFile.readDouble();
                                raFile.seek(24*8);
                                ru = raFile.readDouble();
                                raFile.seek(25*8);
                                orbitu = raFile.readDouble();
                                raFile.seek(26*8);
                                rotasiu = raFile.readDouble();
                                raFile.seek(27*8);
                                revolusiu = raFile.readDouble();
                                raFile.seek(28*8);
                                rn = raFile.readDouble();
                                raFile.seek(29*8);
                                orbitn = raFile.readDouble();
                                raFile.seek(30*8);
                                rotasin = raFile.readDouble();
                                raFile.seek(31*8);
                                revolusin = raFile.readDouble();
                                Panggil panggillagi = new Panggil(rk,orbitk, rotasik, revolusik, rv, orbitv, rotasiv, revolusiv,
                                rb, orbitb, rotasib, revolusib, rm, orbitm, rotasim, revolusim, rj, orbitj, rotasij, revolusij,
                                rs, orbits, rotasis, revolusis, ru, orbitu, rotasiu, revolusiu, rn, orbitn, rotasin, revolusin);
                                   raFile.close();
                                   raFile.close();
                                break;
                        }
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Tugas2PBO.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                         System.out.println("Ada Error");
                    }
                     
                        
                    break;
            
        }
        
       
    }
}

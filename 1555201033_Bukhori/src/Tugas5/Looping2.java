/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;

/**
 *
 * @author Bukhori
 */
public class Looping2 {

    public static void main(String[] args) {

        //100-0
        System.out.println("Bilangan 100-0 adalah");
        int i = 100;
        do {
            System.out.println(i);
            i--;
        } while (i >= 0);

        //0-100
        System.out.println("Bilangan 0-100 adalah");
        int b = 0;
        do {
            System.out.println(b);
            b++;
        } while (b <= 100);

        //Genap O-100
        System.out.println("Bilangan genap antara 0-100 adalah");
        int d = 0;
        do {
            if ((d != 1) && (d % 2 == 0)) {
                System.out.println(d);
            }
            d++;
        } while (d <= 100);

        //Ganjil 0-100
        System.out.println("Bilangan ganjil antara 0-100 adalah");
        int e = 0;
        do {
            if (e % 2 == 1) {
                System.out.println(e);
            }
            e++;
        } while (e <= 100);
        
        //Kelipatan 5, 0-100
        System.out.println("Bilangan kelipatan 5 antara 0-100 adalah");
        int f = 0;
        do {
            if ((f != 2) && (f % 5 == 0)){
                System.out.println(f);
            }
            f++;
        }  while (f <= 100);
        
        //Kelipatan pangkat 2, 0-100
        System.out.println("Bilangan kelipatan pangkat 2 antara 0-100 adalah");
        int z = 0;
        do {
            int h;
            h= (int) Math.pow(z, 2);
                System.out.println(h);
                z++;
        } while (z <= 10);
    }
}

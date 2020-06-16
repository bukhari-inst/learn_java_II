/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;

/**
 *
 * @author toshiba
 */
public class Looping3 {

    public static void main(String[] args) {

        //100-0
        System.out.println("Bilangan 100-0 adalah");
        for (int a = 100; a >= 0; a--) {
            System.out.println(a);
        }

        //0-100
        System.out.println("Bilangan 0-100 adalah");
        for (int b = 0; b <= 100; b++) {
            System.out.println(b);
        }

        //Bilangan genap, 0-100
        System.out.println("Bilangan Genap antara 1-100 adalah");
        int c;
        for (c = 0; c <= 100; c++) {
            if ((c != 1) && (c % 2 == 0)) {
                System.out.println(c);
            }
        }

        //Bilangan ganjil, 0-100
        System.out.println("Bilangan Ganjil antara 1-100 adalah");
        int d;
        for (d = 0; d <= 100; d++) {
            if (d % 2 == 1) {
                System.out.println(d);
            }
        }

        //Bilangan Kelipatan 5, 0-100
        System.out.println("Bilangan Kelipatan 5 antara 1-100 adalah");
        int e;
        for (e = 0; e <= 100; e++) {
            if ((e != 2) && (e % 5 == 0)) {
                System.out.println(e);
            }
        }

        //Bilangan Pangkat 2, 0-100
        System.out.println("Bilangan Kelipatan pangkat 2 antara 1-100 adalah");
        int z;
        for (z = 0; z <= 10; z++) {
            int h;
            h = (int) Math.pow(z, 2);
                System.out.println(h);
                z++;
            
        }
    }
}

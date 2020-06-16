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
public class Looping1 {

    public static void main(String[] args) {

        // 100-0
        System.out.println("Bilangan 100-0 adalah");
        int i = 100;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
        System.out.println("Bilangan 0-100 adalah");

        // 0-100
        int c = 0;
        while (c <= 100) {
            System.out.println(c);
            c++;
        }

        //Bilangan Genap, 0-100
        System.out.println("Bilangan genap antara 0-100 adalah");
        int d = 0;
        while (d <= 100) {
            d++;
            if ((d != 1) && (d % 2 == 0)) {
                System.out.println(d);
            }
        }

        //Bilangan Ganjil, 0-100
        System.out.println("Bilangan ganjil antara 0-100 adalah");
        int e = 0;
        while (e < 100) {
            e++;
            if (e % 2 == 1) {
                System.out.println(e);
            }
        }

        //Bilangan Kelipatan 5, 0-100
        System.out.println("Bilangan kelipatan 5 antara 0-100 adalah");
        int f = 0;
        while (f <= 100) {
            f++;
            if ((f != 2) && (f % 5 == 0)) {
                System.out.println(f);
            }
        }

        //Bilangan Pangkat 2, 0-100
        System.out.println("Bilangan kelipatan pangkat 2 antara 0-100 adalah");
        int z = 0;
        while ((z >= 0) && (z <= 10)) {
            int h;
            h = (int) Math.pow(z, 2);
            System.out.println(h);
            z++;
        }
    }
}

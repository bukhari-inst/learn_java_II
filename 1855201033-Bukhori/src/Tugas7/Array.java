/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas7;

import java.util.Arrays;

/**
 *
 * @author Bukhori
 */
public class Array {

    public static void main(String[] args) {

        int bilangan[] = {2, 3, 4, 5, 6};
        int[] Bilangan = {2, 3, 4, 5, 6};
        int angka[] = new int[5];

        //cara pengisian data dengan index
        angka[0] = 1;
        angka[1] = 2;
        angka[2] = 3;
        angka[3] = 4;
        angka[4] = 5;

        System.out.println(angka[1]);

        String[] nama = {"andi", "badak"};
        System.out.println(nama[1]); //berada pada index ke 0
        System.out.println(angka[4]);
        System.out.println("panjang array adalah = " + nama.length);
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas6;

/**
 *
 * @author Bukhori
 */
public class Bintang {

    public static void main(String[] args) {

        //pola rata kiri
        System.out.println("pola segitiga rata kiri");
        int bintang = 8;
        //outer
        for (int a = 1; a <= bintang; a++) {
            //inter
            for (int b = 1; b <= a; b++) {
                System.out.print("(^_^)");
            }
            System.out.println("");
        }

        System.out.println("pola segitiga rata kiri terbalik");
        for (int a = bintang; a >= 1; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print("(^_^)");
            }
            System.out.println("");
        }

        System.out.println("pola segitiga rata kanan");
        for (int b = 1; b <= bintang; b++) {
            for (int c = bintang; c >= b; c--) {
                System.out.print("     "); //spasi
            }
            for (int d = 1; d <= b; d++) {
                System.out.print("(^_^)"); //wajah
            }
            System.out.println("");
        }

        System.out.println("pola segitiga");
        for (int i = 1; i <= bintang; i++) {
            for (int j = bintang; j >= i; j--) { //spasi
                System.out.print("     "); //spasi
            }
            for (int k = 1; k <= i; k++) { //bintang
                System.out.print("(^_^)");
            }
            for (int l = 1; l <= i - 1; l++) {
                System.out.print("(^_^)");
            }
            System.out.println();
        }
        
        System.out.println("pola segitiga rata kanan terbalik");
        for (int b = 1; b <= bintang; b++) {
            for (int c = 2; c <= b; c++) {
                System.out.print("     "); //spasi
            }
            for (int d = bintang; d >= b; d--) {
                System.out.print("(^_^)"); //wajah
            }
            System.out.println("");
    }
    }
}


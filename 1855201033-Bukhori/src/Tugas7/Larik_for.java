/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas7;

import javax.swing.JOptionPane;

/**
 *
 * @author toshiba
 */
public class Larik_for {

    public static void main(String[] args) {

        int angka[] = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int a = 0; a < angka.length; a++) {
            System.out.println("index A ke " + a + " adalah " + angka[a]);
        }
        for (int b = 0; b < number.length; b++) {
            System.out.println("index B ke " + b + " adalah " + number[b]);
        }
    }
}


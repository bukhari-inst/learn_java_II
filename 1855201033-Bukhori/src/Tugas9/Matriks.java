/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas9;

import javax.swing.JOptionPane;

/**
 *
 * @author Bukhori
 */
public class Matriks {

    public static void main(String[] args) {

        int matriks[][] = new int[2][2];
        matriks[0][0] = 10;
        matriks[0][1] = 15;
        matriks[1][0] = 20;
        matriks[1][1] = 25;
        //String data = "";
        for (int baris = 0; baris < matriks.length; baris++) {
            for (int kolom = 0; kolom < matriks[0].length; kolom++) {

                JOptionPane.showMessageDialog(null, matriks[0][0] + " " + matriks[0][1] + "\n"
                        + matriks[1][0] + " " + matriks[1][1]);
                break;
            }
            break;
            //System.out.println();
        }
    }
}


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
public class LinierSearch {

    public static void main(String[] args) {

        /*xampp
        tampilkan data
        Ganti data
        cari data
        keluar*/
        int cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nama Yang Dicari!"));
        int angka[] = {34, 35, 36, 56, 67, 67};
        String nama[] = {"Boriel", "Lukman", "Ukie", "Rio"};

        for (int s = 0; s < nama.length; s++) {

            if (nama[s].equals(cari)) {
                System.out.println(nama[s]);
            }
        }
    }
}


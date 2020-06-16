/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

import java.util.Scanner;

/**
 *
 * @author Bukhori
 */
public class InputUser_Scanner {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
                //JOptionPane.showInputDialog("PILIHAN HITUNG LUAS BANGUN DATAR:\n1.Hitung Luas Persegi Panjang\n2.Hitung Luas Trapesium\n3.Hitung luas Lingkaran");
                
                //JOptionPane.showInputDialog("Inputkan Nilai angka");
	    

	    int Nilai = input.nextInt();
            
		if (Nilai<0 || Nilai>100) {
			System.out.println("NILAI INPUT SALAH");
		}else {
			if(Nilai>=91) {
                                System.out.println("A");
			}if(Nilai>=86 && Nilai <91)  {
				System.out.println("A-");
			}if(Nilai>=81 && Nilai <86) {
				System.out.println("B+");
			}else if(Nilai>=75 && Nilai <81) {
				System.out.println("B");
			}else if (Nilai>=71 && Nilai <75) {
				System.out.println("B-");
			}else if (Nilai>=66 && Nilai <71) {
				System.out.println("C+");
			}else if (Nilai>=61 && Nilai <66) {
				System.out.println("C");
			}else if (Nilai>=56 && Nilai <61) {
				System.out.println("C-");
			}else if (Nilai>=51 && Nilai <56) {
				System.out.println("D");
			}else if (Nilai>=0 && Nilai <51) {
				System.out.println("E");
			}
		}
    }
}
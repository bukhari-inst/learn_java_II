/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Bukhori
 */
public class Condition {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Nilai = 70;
		if (Nilai<0 || Nilai>100) {
			System.out.println("NILAI INPUT SALAH");
		}else {
			if(Nilai>90) {
				System.out.println("A");
			}else if(Nilai>=86 && Nilai <91) {
				System.out.println("A-");
			}else if(Nilai>=81 && Nilai <86) {
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
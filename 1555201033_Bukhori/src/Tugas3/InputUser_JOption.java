/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

import javax.swing.JOptionPane;

/**
 *
 * @author Bukhori
 */
public class InputUser_JOption {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
                
                String Nilaibaru = JOptionPane.showInputDialog("Inputkan Nilai");
		// Convert String ke Integer
        int Nilai = Integer.parseInt(Nilaibaru);
        
		if (Nilai<0 || Nilai>100) {
			JOptionPane.showMessageDialog(null, "Nilai Input Salah");
			System.out.println("NILAI INPUT SALAH");
		}else {
			if(Nilai>90) {
				JOptionPane.showMessageDialog(null,"Nilai Kamu adalah= " +"A");
                                System.out.println("A");
			}else if(Nilai>=86 && Nilai <91) {
                            JOptionPane.showMessageDialog(null,"Nilai Kamu adalah= " +"A-");
				System.out.println("A-");
			}else if(Nilai>=81 && Nilai <86) {
                            JOptionPane.showMessageDialog(null,"Nilai Kamu adalah= " +"B+");
				System.out.println("B+");
			}else if(Nilai>=75 && Nilai <81) {
                            JOptionPane.showMessageDialog(null,"Nilai Kamu adalah= " + "B");
				System.out.println("B");
			}else if (Nilai>=71 && Nilai <75) {
                            JOptionPane.showMessageDialog(null,"Nilai Kamu adalah= " +"B-");
				System.out.println("B-");
			}else if (Nilai>=66 && Nilai <71) {
                            JOptionPane.showMessageDialog(null,"Nilai Kamu adalah= " +"C+");
				System.out.println("C+");
			}else if (Nilai>=61 && Nilai <66) {
                            JOptionPane.showMessageDialog(null,"Nilai Kamu adalah= " + "C");
				System.out.println("C");
			}else if (Nilai>=56 && Nilai <61) {
                            JOptionPane.showMessageDialog(null,"Nilai Kamu adalah= " + "C-");
				System.out.println("C-");
			}else if (Nilai>=51 && Nilai <56) {
                            JOptionPane.showMessageDialog(null, "Nilai Kamu adalah= " + "D");
				System.out.println("D");
			}else if (Nilai>=0 && Nilai <51) {
                            JOptionPane.showMessageDialog(null,"Nilai Kamu adalah= " + "E");
				System.out.println("E");
			}
		}
}
}







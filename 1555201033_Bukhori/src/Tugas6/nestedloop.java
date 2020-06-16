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
public class nestedloop {
    public static void main(String[] args) {
        
        
        int j_baris = 9;//Menentukan Jumlah Baris
        
        //Menghitung Jumlah Baris (Outer for)
        for(int baris=1; baris<=j_baris; baris++){
            
            //Mencetak Simbol * (Inner for)
            for(int s=1; s<=baris; s++){
                System.out.print("* ");
            }
      
            //Membuat Baris Baru
            System.out.println();
        }
    }
}

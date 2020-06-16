/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SN;

import javax.swing.JOptionPane;

/**
 *
 * @author Bukhori
 */
public class Test_NewClass1 {

    public static void main(String[] args) {

       int A [][] = new int[2][2];
        int B[][]=new int [2][2];
        int hasilx[][] = new int [2][2];
        int i,j,k,l,m,n;
        i=0;       
        k=0;
        m=0;
        n=0;
        
        int hasil[][] = new int[2][2];
        int jumlahmatriks [][] = new int[2][2];
        int kurangmatriks [][] = new int[2][2];
        int kalimatriks [][] = new int[2][2];
        
        String masA[][] = new String[2][2];
        String masB[][] = new String[2][2];
        String hasilax[][] = new String[2][2];
        
        
        JOptionPane.showMessageDialog(null,"selamat datang di kalkulator matriks","Informasi",JOptionPane.INFORMATION_MESSAGE);
      
        //memasukan input untuk matriks A
        do{
            j=0;
            do{
                masA[i][j]= JOptionPane.showInputDialog(" Masukan nilai matriks A [" + i + "]["+ j + "]" );
                A[i][j] = Integer.parseInt(masA[i][j]);
                j++;
        }while (j<2);
            i++;
            }while (i<2);
    
        //Memasukan input untuk matriks B
        do{
            l=0;
            do{
                masB[k][l] = JOptionPane.showInputDialog(null,"Masukan nilai matriks B["+k+"]["+l+"]");
                B[k][l] = Integer.parseInt(masB[k][l]);
                l++;
            }while(l<2);
            k++;
        }while(k<2);
        
                
       String pilih = JOptionPane.showInputDialog(null,"Pilih operasi yang anda inginkan : \n1. INPUT 1.\n2. INPUT 2.\n3. PENJUMLAHAN.\n4. PENGURANGAN.\n5. PERKALIAN","...:Memasukan Jenis Operasi:...");
        int p = Integer.parseInt(pilih);
        //Menampilkan nilai matriks A dan B
        //Matriks A
        System.out.print("\n..:Matriks A:..\n");
        for(j=0;j<2;j++){
            for(i=0;i<2;i++){
            System.out.print("  "+A[j][i]);}
            System.out.print("\n");}
            System.out.println("");
                              
            if(p==1){System.out.print("      +\n");}
            else if(p==1){System.out.print("      -\n");}
            else if(p==2){System.out.print("      X\n");}
            
            
        //Matriks B
            System.out.print("\n..:Matriks B:..\n");
        for(j=0;j<2;j++){
            for(i=0;i<2;i++){
            System.out.print("  "+B[j][i]);}
            System.out.println();}
            System.out.println("");
                      
        //Proses yang menentukan hasil setiap operasi    
        //penjumlahan matriks
        for(i = 0;i<2;i++){
            for(j=0;j<2;j++){
                jumlahmatriks[i][j] = A[j][i]+B[j][i];}
                }
        
        //pengurangan matriks
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                kurangmatriks[i][j] = A[j][i]-B[j][i];}
        }
        
        //Perkalian matriks
       for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                hasil[i][j] = 0;
            for(k=0;k<2;k++){
                hasil[i][j] +=A[i][k] * B[k][j];}
                }
          }

        switch(p){
            case 3:jumlah (j,i,jumlahmatriks);
                        JOptionPane.showMessageDialog(null,"Anda memilih operasi penjumlahan matriks","..:Information:..",JOptionPane.INFORMATION_MESSAGE);
                                ;break;
            case 4:kurang (j,i,kurangmatriks);   
                                JOptionPane.showMessageDialog(null,"Anda memilih operasi pengurangan matriks","..:Information:..",JOptionPane.INFORMATION_MESSAGE);
                                break;
            /*case 5:kali (j,i,hasil);   
                                JOptionPane.showMessageDialog(null,"Anda memilih operasi perkalian matriks","..:Information:..",JOptionPane.INFORMATION_MESSAGE);
                                break;*/
            default : System.out.println("..:Input harus diantara 1-2:..");
                                JOptionPane.showMessageDialog(null,"Input yang anda masukan salah, harus diantara 1-3","..:Information:..",JOptionPane.INFORMATION_MESSAGE);}
                  }
      
   
   //menampilan hasil
   public static void jumlah(int x, int z, int [][]y){
       System.out.print("Hasil penjumlahan matriks\n");
       //penjumlahan 
         for(x=0;x<2;x++){
            for(z=0;z<2;z++){
                System.out.print("  "+y[z][x]);}
            System.out.println();
            }
         System.out.println("\n");
   }
   
   public static void kurang(int x, int z, int [][]o){
       System.out.print("Hasil pengurangan matriks\n");
       //pengurangan
          for(x=0;x<2;x++){
            for(z=0;z<2;z++){
                System.out.print("  "+o[z][x]);}
            System.out.println();
            }System.out.println("\n");
   }
  
   /*public static void kali(int x, int z, int [][]v){
       System.out.print("Hasil perkalian matriks\n");
         //perkalian
          for(x=0;x<2;x++){
            for(z=0;z<2;z++){
                System.out.print("  "+v[x][z]);}
            System.out.println();*/
          }
    //
//






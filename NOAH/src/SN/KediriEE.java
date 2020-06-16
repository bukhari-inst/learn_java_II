/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SN;

/**
 *
 * @author toshiba
 */
public class KediriEE {
    // instance Variable 2:
	
	String Pesan = "selamat belajar";
	
	// Class/Static Variable 3:
	
	static String pesaN = "Selamat belajar";
	
	// konstanta Di Java
	
	static int radius;
	static final double PI = 3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hello Word
		
		System.out.println("hello word dari java");
		
		// Variabel di Java 1:
		
		int a,b,c;
	    a = 10; b = 10;
		byte B = 22;
		double pi = 3.14159;
		char d = 'a';
		
		String pesan = "Selamat Belajar";
		System.out.println(pesan);
		
		//instance Variable 2:
		
		KediriEE E = new KediriEE();
		System.out.println(E.Pesan);
		
		// Class/Static Variable 3:
		
		System.out.println(KediriEE.pesaN);
		
		// konstanta Di Java
			
			//KediriEE.PI = 3.14159;
		KediriEE.radius = 7;
		double luas = (KediriEE.radius * KediriEE.radius * KediriEE.PI);
		System.out.println("jari-jari="+ KediriEE.radius);
		System.out.println("luas="+ luas);
		
		// Tipe Data
		
		/*char   : (')
		 * double: bilangan koma dengan rentang 64-bit IEEE 754 floating point
		 * float : bilangan koma dengan rentang 32-bit IEEE 754 floating point
		 * byte  : angka bulat -128 hingga 127
		 * short : angka bulat -32.767 hingga 32.767
		 * int   : angka bulat -2.147.483.648 hingga 2.147.483.647
		 * long  : angka bulat -9.223.372.036.854.775.808 hingga 9.223.372.036.854.775.807
		 * boolean: True/false saja
		 */
		
		byte A = 100;
		short bb = 10000;
		int AB = 1000000000;
		long C = 1000000000;
		double PI = 3.14;
		String Pesan = "Tak Ada Yang Abadi";
		char nilai = 'A';
		System.out.println(A);
		System.out.println(bb);
		System.out.println(AB);
		System.out.println(C);
		System.out.println(PI);
		System.out.println(Pesan);
		System.out.println(nilai);
		
		// Operator Aritmatika
		
		int s = 25;
		int S = 20;
		int t = s + S;
		int T = t / s;
		s++;
		S--;
		double n = (double) t / s;
		System.out.println(s);
		System.out.println(S);
		System.out.println(t);
		System.out.println(T);
		System.out.println(n);
		
		// Operator Ralasional= True/False
		
		/* ==: sama dengan
		 * =: untuk menghasilkan nilai
		 * !=: tidak sama dengan
		 * >: lebih dari
		 * <: kurang dari
		 * >=: lebih dari sama dengan
		 * <=: kurang dari sama dengan
		 */
		int g,h;
		g= 10; h= 15;
		System.out.println(g!=h);
		
		// Operator Logika
		
		/* &&= dan; keduanya harus bernilai benar
		 * ||= atau: salah satu saja bernilai benar maka benar
		 * != negasi: nilai variabel akan dibalik !True maka false, !false maka true
		 */
		System.out.println((g==h) && (g!=h));// false
		System.out.println((g > h) || (g < h));// True
		System.out.println(!(g >= h));// True
		
		// Operator Bitwise
		
		/* &= melakukan operasi AND terhadap dua bilangan biner
		 * |= melakukan operasi OR terhadap dua bilangan biner
		 * ^= melakukan operasi XOR terhadap dua bilangan biner
		 * ~= melakukan operasi negasi terhadap bilangan biner
		 * >> n= melakukan operasi pergeseran bit ke kanan trhdap blangan biner sbnyak n bit
		 * << n= melakukan operasi pergeseran bit ke kiri trhdap bilngan biner sbnyak n bit
		 /Misalkan bilangan i = 60 yang dalam biner adalah 
		   0011 1100, dan j = 13 yang dalam biner adalah 0000 1101, maka:
		 i & j 		i | j		i ^ j		 ~ i		i >> 2		i << 2
		0011 1100	0011 1100	0011 1100	0011 1100	0011 1100	0011 1100
		0000 1101	0000 1101	0000 1101	---------	---------	---------
		---------	---------	--------	1100 0011	0000 1111	1111 0000
		0000 1100	0011 1101	0011 0001	
		 */
		int i,j; i= 60; j= 13;
		System.out.println(i & j);
		System.out.println(i | j);
		System.out.println(i ^ j);
		System.out.println( ~ i);
		System.out.println(i >> 2);
		System.out.println(i << 2);
		
		// Operator Instanceof
		
		String pesaN = "Hallo Coders";
		
		KediriEE tes = new KediriEE();
		System.out.println(tes instanceof KediriEE);
		System.out.println(tes.Pesan instanceof String);
		
		// Operator Konkatenansi (+)
		
		String judul = "Rukun Islam ada";
		String isi = "5";
		System.out.println(judul +":"+ isi);
		
		// Operator Ternary
		//if-else dengan lebih sederhana
		int Nilai,skbm; Nilai = 90; skbm = 75;
		System.out.println((Nilai < skbm) ? "nilai di atas rata-rata" : "nilai di bawah rata-rata");
		
		// Statemen While
		
		int k = 1;
		while(k <= 5)
		{
		    System.out.println(k);
		    k++;
		}
		
		// Statemen Do while
		
		int l = 7;
		do {System.out.println(l);
		l++;
		}while(l <= 10);
		
		// Statemen For
		
		for (int m = 0; m <=20; m++){
		System.out.println(m);
		}
		
		// State For Bersarang
		
		for (int nn = 0; nn  < 10; nn++) {
			
			System.out.print(nn + " => ");
			
			for (int oo= 0; oo < 10; oo++ ) {
				System.out.print(oo + " ");
			}
			
			System.out.println();
		}
		
		for (int p = 5; p >= 1; p++ ) {
			for (int q = 1; q >= p; q++)
				System.out.println(q + " ");
		}
	}


}




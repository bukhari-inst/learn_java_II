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
public class Kediri {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		var x = 7;
		var q = 60;
		var y = 7;
		var p = 5;

		// proses di kanan hasil di kiri
		var z = x * y;
		var Z = x * p;
		var P = x / y;

		// Java memiliki sifat Case Sensitive
		int s = 25;
		int S = 20;
		int t = s + S;
		int T = t / s;
		double n = (double) t / s;
		System.out.println(s);
		System.out.println(S);
		System.out.println(t);
		System.out.println(T);
		System.out.println(n);

		// Luxury Car,Super Car, High Performance Car
		String nama = "Nissan GTR-R35 Nismo";
		String Nama = "Koenigseg CXX";
		String NAMA = "Rolls Royce";
		System.out.println(P);
		System.out.println(Z);
		System.out.println(z);
		System.out.println(Nama);
		System.out.println(nama);
		System.out.println(NAMA);

		// sahabat NOAH Kediri
		System.out.println("@NOAH_ID");
		System.out.println("Sebuah Nama Sebuah Cerita");
		System.out.println("NOAH2ndAlbum");
		//boolean = true atau false

		boolean nyala = true;
		boolean mati = false;

		System.out.println(nyala);

		// If & Else
		int K = 9;
		if (K > 10) {
			System.out.println("K lebih besar dari 10");
		}else {
			System.out.println("K tidak lebih besar dari 10");
		}
		int l = 41;
		boolean hidup = true;
		if (true) {
			System.out.println("l lebih besar dari 40");
		}else {
			System.out.println("l tidak lebih besar dari 40");
			if(hidup) {
				System.out.println("l lebih besar dari 40");
			}else {
				System.out.println("l tidak lebih besar dari 40");
			}
		}
		int o = 41;
		boolean Hidup = false;
		if (false) {
			System.out.println("o lebih besar dari 40");
		}else {
			System.out.println("o tidak lebih besar dari 40");
			if (Hidup) {
				System.out.println("o lebih besar dari 40");
			}else {
				System.out.println("o tidak lebih besar dari 40");
			}
		}

		boolean X = true;
		if (X) {
			System.out.println("tampilkan semua");
		}else {
			System.out.println("jangan tampilkan semua");
		}
		boolean Q = false;
		if (Q) {
			System.out.println("tampilkan semua");
		}else {
			System.out.println("jangan tampilakn semua");
		}

		// if else
		{int A,B,C,D,E,F,G,H,I,J;
		 A = 100;		 F = 70;
		 B = 90;		 G = 65;
		 C = 85;		 H = 60;
		 D = 80;		 I = 55;
		 E = 75;		 J = 50;
		 
		  if (A>90) {
		  	System.out.println("A");
		  }else {
			  if (B>85)
		  	System.out.println("A"+"-");
		  }
		  if (C>80) {
			  System.out.println("B"+"+");
		  }else {
			  if(D>75) {
				  System.out.println("B"+"+");
			  }else {
				  if(E>70) {
					  System.out.println("B"+"-");
				  }else {
					  if(F>65) {
						  System.out.println("C"+"+");
					  }else {
						  if(G>60) {
							  System.out.println("C");
						  }else {
							  if(H>55) {
								  System.out.println("C-");
							  }else {
								  if(I>50) {
									  System.out.println("D");
								  }else {
									  if(J>0) {
										  System.out.println(E);
									  }
								  }
							  }
						  }
					  }
				  }
			  }
		  }
		  }

}
}


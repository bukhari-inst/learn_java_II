
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bukhori
 */
public class test2 {

    public static void main(String[] args) {
        int i;
        int[] array = new int[5];
        for (i = 0; i < array.length; i++) {// kode untuk input array array[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukan angka 1 - 9 !")); System.out.println("Data ke = "+ i +" --->"+array[i]);
        }

        do {
            int input = Integer.parseInt(JOptionPane.showInputDialog("Pilih menu : \n1.Mengubah data \n2.Mencari data index ke ? \n3.Keluar"));
            switch (input) {
                case 1:
                    int input3 = Integer.parseInt(JOptionPane.showInputDialog("Data index keberapa yang ingin diubah  ?"));
                    array[input3] = Integer.parseInt(JOptionPane.showInputDialog("Masukan data baru untuk index ini !"));
                    String data = "";
                    for (int a = 0; a < array.length; a++) {
                        data += (a + 1 + ". ") + array[a];
                        {
                            data += "\n";
                        }
                    }JOptionPane.showMessageDialog(null, data
                    );
                    break;
                case 2:
                    i = Integer.parseInt(JOptionPane.showInputDialog("data index ke berapa yang mau ditampilkan ?"));
                    JOptionPane.showMessageDialog(null, array[i]);
                    break;
                case 3:
                    //Runtime.getRuntime().exit(input);
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}



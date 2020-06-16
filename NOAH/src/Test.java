
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toshiba
 */
public class Test {
     public static void main(String[] args) throws IOException {
           //Buat variabel utama (nama, nim)   
        
        int Absen[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        String name[] = {"Farizki Dafa", "Ahmada Ilyas", "Izulma Sultan Aqil", "Roqi Wildana", "Iwan Prasetyo", "Suwanto", "Ulil Absor", "Silvia hermala", "silfiana Alwi", "muhammad Ghothofan", "Melinda Putri", "Aditia pratama", "Reza Pratama", "Fajar Utomo", "Ilham Izzulhaq"};
        String alamat[] = {"Blitar", "Blitar", "Blitar", "Jakarta", "Blitar", "Blitar", "Blitar", "jombang", "Blitar", "Blitar", "Blitar", "Blitar", "Blitar", "Blitar" };
        String ttl[] = {"19-10-2001", "22-02-2001", "21-12-1999", "13-12-1998", "17-03-2002", "14-05-2005", "16-02-2000", "17-02-2005", "17-03-1999", "29-08-2004", "21-05-2001", "20-03-2004", "27-06-2000", "09-05-2003", "02-04-2004"};
        
        String SemuaData = " ";
        boolean program = true;
        while (program) {

            try {
                //menampilkan menu pilihan

                String InputUser = JOptionPane.showInputDialog(" BIODATA PASIEN RS. JANTUNG BLITAR : "
                        + "\n 1. MENAMPILKAN SEMUA DATA PASIEN  "
                        + "\n 2. CARI DATA PASIEN "
                        + "\n 3. GANTI DATA PASIEN "
                        + "\n 4. KELUAR \n\n");

                int Biodata = Integer.valueOf(InputUser);

                //1.MENAMPILKAN SEMUA DATA PASIEN
                if (Biodata == 1) {
                    for (int i = 0; i < name.length; i++) {
                        SemuaData = SemuaData + (i + 1) 
                                + "     Nama                    : " + name[i] + "\n"
                                + "     Absen    : " + Absen[i] + "\n"
                                + "     Alamat                  : " + alamat[i] + "\n"
                                + "     TTL   : " + ttl[i] + "\n";
                    }
                    JOptionPane.showMessageDialog(null, SemuaData);
                    SemuaData = "";
                }
                //2.MENCARI  DATA PASIEN
                if (Biodata == 2) {
                    String pilihMenu = JOptionPane.showInputDialog(null, "Pilih Biodata Pasien Yang Dicari\n"
                            + "\n1. NOMER ABSEN "
                            + "\n2. NAMA SISWA "
                            + "\n");
                    Integer Menu = Integer.valueOf(pilihMenu);
                    //mencari berdasarkan nomer kamar
                    if (Menu == 1) {
                        String Carink = JOptionPane.showInputDialog(null, "masukan nomer kamar yang dicari \n");
                        int MencariData = Integer.valueOf(Carink);
                        for (int j = 0; j < Absen.length; j++) {
                            if (MencariData == Absen[j]) {
                                JOptionPane.showMessageDialog(null, " BIODATA \n PASIEN RS. JANTUNG BLITAR\n"
                                        + "     Nama                    : " + name[j] + "\n"
                                + "     Absen    : " + Absen[j] + "\n"
                                + "     Alamat                  : " + alamat[j] + "\n"
                                + "     TTL   : " + ttl[j] + "\n");
                            }
                        }
                    }

                    //MENCARI BERDASARKAN NAMA PASIEN
                    if (Menu == 2) {
                        String CariNama = JOptionPane.showInputDialog(null, "masukan nama yang dicari \n");

                        for (int j = 0; j < name.length; j++) {
                            if (CariNama.equalsIgnoreCase(name[j])) {
                                JOptionPane.showMessageDialog(null, "BIODATA \n BIODATA PASIEN RS. JANTUNG BLITAR \n"
                                              + "     Nama                    : " + name[j] + "\n"
                                + "     Absen    : " + Absen[j] + "\n"
                                + "     Alamat                  : " + alamat[j] + "\n"
                                + "     TTL   : " + ttl[j] + "\n");

                            }
                        }
                    }

                }
                //MENGGANTI DATA PASIEN
                if (Biodata == 3) {
                    String gantiData = JOptionPane.showInputDialog("pilih data yang ingin diganti : \n"
                            + "\n1. Ganti Nama Berdasarkan Index "
                            + "\n2. Ganti Nama Berdasarkan Nama \n");

                    int Data = Integer.valueOf(gantiData);
                    if (Data == 1) {
                        JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                        int input13 = Integer.parseInt(JOptionPane.showInputDialog("Data Nama index keberapa yang ingin diubah  ?"));
                        name[input13] = JOptionPane.showInputDialog("Masukan Data Nama baru untuk index ini !");
                        String data = "";
                        for (int a = 0; a < name.length; a++) {
                            data += (a + 1 + ". ") + name[a];
                            {
                                data += "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Nama Telah Diganti Menjadi: \n"
                                + data);
                    }
                    if (Data == 2) {
                        JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                        String data = "";
                        String f = JOptionPane.showInputDialog("Masukkan Nama Yang Ingin Anda Ganti!");
                        for (int a = 0; a < name.length; a++) {
                            if (name[a].equals(f)) {
                                String g = JOptionPane.showInputDialog(null, "Inputkan Nama Pengganti");
                                name[a] = g;
                                {
                                    data += ("Nama Telah Diganti Menjadi: "
                                            + name[a] + "\n");
                                }
                                JOptionPane.showMessageDialog(null, data);
                            }
                        }
                    }
                    
                if (Biodata == 4) {
                    int keluar;
                    keluar = JOptionPane.showConfirmDialog(null, "KAMU YAKIN UDAH SELSAI ?", "KONFIRMASI KELUAR PROGRAM", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (keluar == JOptionPane.YES_OPTION) {
                        program = false;
                    }
                }
            }
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Input Yang Anda Masukkan Salah! \n"
                        + "Silahkan Ulangi Kembali!");
            }
        }
    }
    }












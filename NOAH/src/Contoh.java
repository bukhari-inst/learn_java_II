
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
class Contoh {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "=*=SELAMAT DATANG DI RS. JANTUNG KAB.BLITAR=*= ");
        // Data nama pasien
        String[] Nama = {"AGUNG", "WIJI ASTUT", "MBAH SENGUT", "MBAH TUKIYEM",
            "MBAH PAINEM", "AGUS ROZI", "KATIJAN"};

        // nomer kamar pasien
        int nk[] = new int[7];
        nk[0] = 001;
        nk[1] = 002;
        nk[2] = 003;
        nk[3] = 004;
        nk[4] = 005;
        nk[5] = 006;
        nk[6] = 007;

        // TANGGAL MASUK PASIEN
        String tgl[] = new String[7];
        tgl[0] = "10 juni 2019";
        tgl[1] = "12 mei 2019";
        tgl[2] = "02 juni 2019";
        tgl[3] = "11 november 2019";
        tgl[4] = "16 maret 2019";
        tgl[5] = "13 januai 2019";
        tgl[6] = "16 april 2019";

        // ALAMAT PASIEN
        String almt[] = new String[7];
        almt[0] = "SRENGAT - BLITAR";
        almt[1] = "UDANAWU - BLITAR";
        almt[2] = "SELOPURO - BLITAR";
        almt[3] = "PONGGOK - BLITAR";
        almt[4] = "GANDUSARI - BLITAR";
        almt[5] = "BINANGUN - BLITAR";
        almt[6] = "SANAN KULON - BLITAR";

        String[] jk = {"L (Laki-Laki)", "P(Perempuan)", "L(Laki-Laki)", "P(Perempuan)", "P(Perempuan)", "L(Laki-Laki)", "L(Laki-Laki)",};

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
                    for (int i = 0; i < Nama.length; i++) {
                        SemuaData = SemuaData + (i + 1) + ". " + "Nomor Kamar: " + nk[i] + "\n"
                                + "     Nama                    : " + Nama[i] + "\n"
                                + "     Jenis Kelamin    : " + jk[i] + "\n"
                                + "     Alamat                  : " + almt[i] + "\n"
                                + "     Tanggal Masuk   : " + tgl[i] + "\n";
                    }
                    JOptionPane.showMessageDialog(null, SemuaData);
                    SemuaData = "";
                }
                //2.MENCARI  DATA PASIEN
                if (Biodata == 2) {
                    String pilihMenu = JOptionPane.showInputDialog(null, "Pilih Biodata Pasien Yang Dicari\n"
                            + "\n1. NOMER KAMAR "
                            + "\n2. NAMA PASIEN "
                            + "\n");
                    Integer Menu = Integer.valueOf(pilihMenu);
                    //mencari berdasarkan nomer kamar
                    if (Menu == 1) {
                        String Carink = JOptionPane.showInputDialog(null, "masukan nomer kamar yang dicari \n");
                        int MencariData = Integer.valueOf(Carink);
                        for (int j = 0; j < nk.length; j++) {
                            if (MencariData == nk[j]) {
                                JOptionPane.showMessageDialog(null, " BIODATA \n PASIEN RS. JANTUNG BLITAR\n"
                                        + "NOMER KAMAR  : " + nk[j] + "\n"
                                        + "NAMA PASIEN    : " + Nama[j] + "\n"
                                        + "JENIS KELAMIN : " + jk[j] + "\n"
                                        + "ALAMAT             : " + almt[j] + "\n"
                                        + "TANGGAL MASUK     :" + tgl[j] + "\n"
                                        + "\n");
                            }
                        }
                    }

                    //MENCARI BERDASARKAN NAMA PASIEN
                    if (Menu == 2) {
                        String CariNama = JOptionPane.showInputDialog(null, "masukan nama yang dicari \n");

                        for (int j = 0; j < nk.length; j++) {
                            if (CariNama.equalsIgnoreCase(Nama[j])) {
                                JOptionPane.showMessageDialog(null, "BIODATA \n BIODATA PASIEN RS. JANTUNG BLITAR \n"
                                        + "NOMER KAMAR  : " + nk[j] + "\n"
                                        + "NAMA PASIEN   : " + Nama[j] + "\n"
                                        + "JENIS KELAMIN : " + jk[j] + "\n"
                                        + "ALAMAT             : " + almt[j] + "\n"
                                        + "TANGGAL MASUK  : " + tgl[j] + "\n"
                                        + "\n");

                            }
                        }
                    }

                }
                //MENGGANTI DATA PASIEN
                if (Biodata == 3) {
                    String gantiData = JOptionPane.showInputDialog("pilih data yang ingin diganti : \n"
                            + "\n1. Ganti Nama Berdasarkan Index "
                            + "\n2. Ganti Nama Berdasarkan Nama \n"
                            + "3. Ganti Jenis Kelamin \n"
                            + "4. Ganti Alamat \n"
                            + "5. Ganti Tanggal Masuk \n");

                    int Data = Integer.valueOf(gantiData);
                    if (Data == 1) {
                        JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                        int input13 = Integer.parseInt(JOptionPane.showInputDialog("Data Nama index keberapa yang ingin diubah  ?"));
                        Nama[input13] = JOptionPane.showInputDialog("Masukan Data Nama baru untuk index ini !");
                        String data = "";
                        for (int a = 0; a < Nama.length; a++) {
                            data += (a + 1 + ". ") + Nama[a];
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
                        for (int a = 0; a < nk.length; a++) {
                            if (Nama[a].equals(f)) {
                                String g = JOptionPane.showInputDialog(null, "Inputkan Nama Pengganti");
                                Nama[a] = g;
                                {
                                    data += ("Nama Telah Diganti Menjadi: "
                                            + Nama[a] + "\n");
                                }
                                JOptionPane.showMessageDialog(null, data);
                            }
                        }
                    }
                    if (Data == 3) {
                        JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                        int input13 = Integer.parseInt(JOptionPane.showInputDialog("Data Jenis Kelamin index keberapa yang ingin diubah  ?"));
                        jk[input13] = JOptionPane.showInputDialog("Masukan Data Jenis Kelamin baru untuk index ini !");
                        String data = "";
                        for (int a = 0; a < jk.length; a++) {
                            data += (a + 1 + ". ") + jk[a];
                            {
                                data += "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Data Jenis Kelamin Telah Diganti Menjadi: \n"
                                + data);
                    }
                    if (Data == 4) {
                        JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                        int input13 = Integer.parseInt(JOptionPane.showInputDialog("Data Nama Alamat index keberapa yang ingin diubah  ?"));
                       almt[input13] = JOptionPane.showInputDialog("Masukan Data Nama Alamat baru untuk index ini !");
                        String data = "";
                        for (int a = 0; a < almt.length; a++) {
                            data += (a + 1 + ". ") + almt[a];
                            {
                                data += "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Nama Alamat Telah Diganti Menjadi: \n"
                                + data);
                    }
                    if (Data == 5) {
                        JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                        int input13 = Integer.parseInt(JOptionPane.showInputDialog("Data Tanggal Masuk index keberapa yang ingin diubah  ?"));
                        tgl[input13] = JOptionPane.showInputDialog("Masukan Data Tanggal Masuk baru untuk index ini !");
                        String data = "";
                        for (int a = 0; a < tgl.length; a++) {
                            data += (a + 1 + ". ") + tgl[a];
                            {
                                data += "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Data Tanggal Masuk Telah Diganti Menjadi: \n"
                                + data);
                    }
                }
                if (Biodata == 4) {
                    int keluar;
                    keluar = JOptionPane.showConfirmDialog(null, "KAMU YAKIN UDAH SELSAI ?", "KONFIRMASI KELUAR PROGRAM", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (keluar == JOptionPane.YES_OPTION) {
                        program = false;
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Input Yang Anda Masukkan Salah! \n"
                        + "Silahkan Ulangi Kembali!");
            }
        }
    }
}


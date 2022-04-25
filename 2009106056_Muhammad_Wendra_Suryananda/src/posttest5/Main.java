/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author SHaneEZolDyC
 */
public class Main {

    static ArrayList<Jasa> jasa = new ArrayList<Jasa>();
    static ArrayList<Desain> dataDesain = new ArrayList<Desain>();
    static ArrayList<Video> dataVideo = new ArrayList<Video>();

    public static void main(String[] args) throws Exception {

        while (true) {
            menu();
        }

    }
    //Tampilan Menu

    private static void menu() throws IOException {
        InputStreamReader menu = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(menu);
        System.out.println("|=========================================|");
        System.out.println("|= Progam Sistem Pemesanan Desain Grafis =|");
        System.out.println("|= 1. Tambah Jasa                        =|");
        System.out.println("|= 2. Lihat Jasa Yang tersedia           =|");
        System.out.println("|= 3. Update Jasa                        =|");
        System.out.println("|= 4. Delete Jasa                        =|");
        System.out.println("|= 5. Diskon Jasa                        =|");
        System.out.println("|= 0. Exit                               =|");
        System.out.println("|=========================================|");

        System.out.print("Pilih Menu Yang Anda Inginkan : ");
        int PilihMenu = Integer.valueOf(input.readLine());
        switch (PilihMenu) {
            case 1:
                tambahjasa();
                break;
            case 2:
                lihatjasa();
                break;
            case 3:
                updatejasa();
                break;
            case 4:
                deletejasa();
                break;
            case 5:
                diskonjasa();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan Anda Salah!");
                menu();

        }

    }

    public static void tambahjasa() throws IOException {
        InputStreamReader tambah = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(tambah);

        System.out.println("|=====================================|");
        System.out.println("|=      Data Jasa yang Tersedia      =|");
        System.out.println("|= 1. Data Desain                    =|");
        System.out.println("|= 2. Data Video                     =|");
        System.out.println("|=====================================|");
        System.out.print(" Pilih Data yang ingin ditambahkan : ");
        int Pilih = Integer.valueOf(input.readLine());
        if (Pilih == 1) {
            System.out.print("Masukkan Jenis Jasa :");
            String namajasa = input.readLine();
            System.out.print("Masukkan Lamanya Proses Kerja :");
            String proseskerja = input.readLine();
            System.out.print("Masukkan Rating Jasa Desain :");
            String ratingjasa = input.readLine();
            System.out.print("Masukkan harga Jasa Desain :");
            int hargajasa = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nama Desain :");
            String namadesain = input.readLine();
            if ("".equals(namajasa) || "".equals(proseskerja) || "".equals(ratingjasa) || "".equals(hargajasa) || "".equals(namadesain)) {
                System.out.println("data gagal ditambahkan");
                return;
            }
            Desain dataDesainbaru = new Desain(namajasa, proseskerja, ratingjasa, hargajasa, namadesain);
            dataDesain.add(dataDesainbaru);
            dataDesainbaru.MenambahkandataJasa();
        } else {
            System.out.print("Masukkan Jenis Jasa :");
            String namajasa = input.readLine();
            System.out.print("Masukkan Lamanya Proses Kerja :");
            String proseskerja = input.readLine();
            System.out.print("Masukkan Rating Jasa Video :");
            String ratingjasa = input.readLine();
            System.out.print("Masukkan harga Jasa Video :");
            int hargajasa = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nama Jasa Video :");
            String namavideo = input.readLine();
            if ("".equals(namajasa) || "".equals(proseskerja) || "".equals(ratingjasa) || "".equals(hargajasa) || "".equals(namavideo)) {
                System.out.println("data gagal ditambahkan");
                return;
            }
            Video dataVideobaru = new Video(namajasa, proseskerja, ratingjasa, hargajasa, namavideo);
            dataVideo.add(dataVideobaru);
            dataVideobaru.MenambahkandataJasa();

        }

    }

    public static void lihatjasa() throws IOException {
        InputStreamReader lihat = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(lihat);

        System.out.println("|=====================================|");
        System.out.println("|=      Data Jasa yang Tersedia      =|");
        System.out.println("|= 1. Data Desain                    =|");
        System.out.println("|= 2. Data Video                     =|");
        System.out.println("|=====================================|");
        System.out.print(" Pilih Data yang ingin dilihat : ");
        int Pilih = Integer.valueOf(input.readLine());
        if (Pilih == 1) {
            for (int i = 0; i < dataDesain.size(); i++) {
                System.out.println("Data Desain Ke -" + (i + 1));
                dataDesain.get(i).display();
            }

        } else {
            for (int i = 0; i < dataVideo.size(); i++) {
                System.out.println("Data Video Ke -" + (i + 1));
                dataVideo.get(i).display();
            }
        }
    }

    public static void updatejasa() throws IOException {
        InputStreamReader update = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(update);
        System.out.println("|=====================================|");
        System.out.println("|=      Data Jasa yang Tersedia      =|");
        System.out.println("|= 1. Data Desain                    =|");
        System.out.println("|= 2. Data Video                     =|");
        System.out.println("|=====================================|");

        System.out.print("Pilih jasa yang ingin diupdate : ");
        int Pilih = Integer.valueOf(input.readLine());
        if (Pilih == 1) {
            for (int i = 0; i < dataDesain.size(); i++) {
                System.out.println("Data Desain Ke -" + (i + 1));
                System.out.println("Jenis Jasa           :" + dataDesain.get(i).getNamajasa());
                System.out.println("Lamanya Proses Kerja :" + dataDesain.get(i).getProseskerja());
                System.out.println("Rating Jasa Desain   :" + dataDesain.get(i).getRatingjasa());
                System.out.println("Harga Jasa Desain    :" + dataDesain.get(i).getHargajasa());
                System.out.println("Nama Jasa Desain     :" + dataDesain.get(i).getNamadesain());
            }
            int index;
            System.out.print(" Pilih Data yang ingin diupdate : ");
            index = Integer.parseInt(input.readLine());
            index--;
            System.out.print("Masukkan Jenis Jasa :");
            String namajasa = input.readLine();
            System.out.print("Masukkan Lamanya Proses Kerja :");
            String proseskerja = input.readLine();
            System.out.print("Masukkan Rating Jasa Desain :");
            String ratingjasa = input.readLine();
            System.out.print("Masukkan harga Jasa Desain :");
            int hargajasa = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nama Desain :");
            String namadesain = input.readLine();
            if ("".equals(namajasa) || "".equals(proseskerja) || "".equals(ratingjasa) || "".equals(hargajasa) || "".equals(namadesain)) {
                System.out.println("data gagal ditambahkan");
                return;
            }
            dataDesain.get(index).setNamajasa(namajasa);
            dataDesain.get(index).setProseskerja(proseskerja);
            dataDesain.get(index).setRatingjasa(ratingjasa);
            dataDesain.get(index).setHargajasa(hargajasa);
            dataDesain.get(index).setNamadesain(namadesain);
            dataDesain.get(index).updateJasa();
        } else {
            for (int i = 0; i < dataVideo.size(); i++) {
                System.out.println("Data Video Ke -" + (i + 1));
                System.out.println("Jenis Jasa           :" + dataVideo.get(i).getNamajasa());
                System.out.println("Lamanya Proses Kerja :" + dataVideo.get(i).getProseskerja());
                System.out.println("Rating Jasa Video    :" + dataVideo.get(i).getRatingjasa());
                System.out.println("Harga Jasa Video     :" + dataVideo.get(i).getHargajasa());
                System.out.println("Nama Jasa Video      :" + dataVideo.get(i).getNamavideo());
            }
            int index;
            System.out.print(" Pilih Data yang ingin diupdate : ");
            index = Integer.parseInt(input.readLine());
            index--;
            System.out.print("Masukkan Jenis Jasa :");
            String namajasa = input.readLine();
            System.out.print("Masukkan Lamanya Proses Kerja :");
            String proseskerja = input.readLine();
            System.out.print("Masukkan Rating Jasa Video :");
            String ratingjasa = input.readLine();
            System.out.print("Masukkan harga Jasa Video :");
            int hargajasa = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nama Jasa Video :");
            String namavideo = input.readLine();
            if ("".equals(namajasa) || "".equals(proseskerja) || "".equals(ratingjasa) || "".equals(hargajasa) || "".equals(namavideo)) {
                System.out.println("data gagal ditambahkan");
                return;
            }
            dataVideo.get(index).setNamajasa(namajasa);
            dataVideo.get(index).setProseskerja(proseskerja);
            dataVideo.get(index).setRatingjasa(ratingjasa);
            dataVideo.get(index).setHargajasa(hargajasa);
            dataVideo.get(index).setNamavideo(namavideo);
            dataVideo.get(index).updateJasa();
        }
    }

    public static void deletejasa() throws IOException {
        InputStreamReader delete = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(delete);
        System.out.println("|=====================================|");
        System.out.println("|=      Data Jasa yang Tersedia      =|");
        System.out.println("|= 1. Data Desain                    =|");
        System.out.println("|= 2. Data Video                     =|");
        System.out.println("|=====================================|");

        System.out.print("Pilih jasa yang ingin diupdate : ");
        int Pilih = Integer.valueOf(input.readLine());
        if (Pilih == 1) {
            for (int i = 0; i < dataDesain.size(); i++) {
                System.out.println("Data Desain Ke -" + (i + 1));
                System.out.println("Jenis Jasa           :" + dataDesain.get(i).getNamajasa());
                System.out.println("Lamanya Proses Kerja :" + dataDesain.get(i).getProseskerja());
                System.out.println("Rating Jasa Desain   :" + dataDesain.get(i).getRatingjasa());
                System.out.println("Harga Jasa Desain    :" + dataDesain.get(i).getHargajasa());
                System.out.println("Nama Jasa Desain     :" + dataDesain.get(i).getNamadesain());
            }
            int index;
            System.out.print(" Pilih Data yang ingin dihapus : ");
            index = Integer.parseInt(input.readLine());
            index--;
            dataDesain.get(index).deleteJasa();
            dataDesain.remove(index);
        } else {
            for (int i = 0; i < dataVideo.size(); i++) {
                System.out.println("Data Video Ke -" + (i + 1));
                System.out.println("Jenis Jasa           :" + dataVideo.get(i).getNamajasa());
                System.out.println("Lamanya Proses Kerja :" + dataVideo.get(i).getProseskerja());
                System.out.println("Rating Jasa Video    :" + dataVideo.get(i).getRatingjasa());
                System.out.println("Harga Jasa Video     :" + dataVideo.get(i).getHargajasa());
                System.out.println("Nama Jasa Video      :" + dataVideo.get(i).getNamavideo());
            }
            int index;
            System.out.print(" Pilih Data yang ingin dihapus : ");
            index = Integer.parseInt(input.readLine());
            index--;
            dataVideo.get(index).deleteJasa();
            dataVideo.remove(index);
        }
    }

    public static void diskonjasa() throws IOException {
        InputStreamReader delete = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(delete);
        System.out.println("|=====================================|");
        System.out.println("|=      Data Jasa yang Tersedia      =|");
        System.out.println("|= 1. Data Desain                    =|");
        System.out.println("|= 2. Data Video                     =|");
        System.out.println("|=====================================|");

        System.out.print("Pilih jasa yang ingin diupdate : ");
        int Pilih = Integer.valueOf(input.readLine());

        if (Pilih == 1) {
            for (int i = 0; i < dataDesain.size(); i++) {
                System.out.println("Data Video Ke -" + (i + 1));
                System.out.println("Jenis Jasa           :" + dataDesain.get(i).getNamajasa());
                System.out.println("Lamanya Proses Kerja :" + dataDesain.get(i).getProseskerja());
                System.out.println("Rating Jasa Video    :" + dataDesain.get(i).getRatingjasa());
                System.out.println("Harga Jasa Video     :" + dataDesain.get(i).getHargajasa());
                System.out.println("Nama Jasa Video      :" + dataDesain.get(i).getNamadesain());
            }
            System.out.println("Masukkan Jasa yang ingin dihitung diskon ");
            System.out.print("Pilih barang Ke -");
            int index1 = Integer.parseInt(input.readLine());
            index1--;
            dataDesain.get(index1).diskon(10);
            
        }else{
            for (int i = 0; i < dataVideo.size(); i++) {
                System.out.println("Data Video Ke -" + (i + 1));
                System.out.println("Jenis Jasa           :" + dataVideo.get(i).getNamajasa());
                System.out.println("Lamanya Proses Kerja :" + dataVideo.get(i).getProseskerja());
                System.out.println("Rating Jasa Video    :" + dataVideo.get(i).getRatingjasa());
                System.out.println("Harga Jasa Video     :" + dataVideo.get(i).getHargajasa());
                System.out.println("Nama Jasa Video      :" + dataVideo.get(i).getNamavideo());
            }
            System.out.println("Masukkan Jasa yang ingin dihitung diskon ");
            System.out.print("Pilih barang Ke -");
            int index1 = Integer.parseInt(input.readLine());
            index1--;
            dataVideo.get(index1).diskon(10);
            
        }
     
    }
}

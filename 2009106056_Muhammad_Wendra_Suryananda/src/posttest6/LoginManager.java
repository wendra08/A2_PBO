/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

import java.io.BufferedReader;
import posttest6.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import static posttest6.Admin.dataDesain;
import static posttest6.Admin.dataVideo;

/**
 *
 * @author SHaneEZolDyC
 */
public class LoginManager extends Akunn implements Login {

    private ArrayList<Jasa> Jasa;
    private ArrayList<Desain> Desain;
    private ArrayList<Video> Video;
    private String nama;

    public LoginManager(String nama, String Username, String Password) {
        super(Username, Password);
        this.nama = nama;
        Jasa = new ArrayList<>();
        Desain = new ArrayList<>();
        Video = new ArrayList<>();
    }

    @Override
    public void login() throws IOException {
        ArrayList<LoginManager> dataManager = new ArrayList<LoginManager>();
        dataManager.add(new LoginManager("Wendra", "managerakun", "manager123"));
        System.out.print("Masukan Nama Anda : ");
        String nama = input.readLine();
        System.out.print("Masukan username : ");
        String Username = input.readLine();
        System.out.print("Masukan password : ");
        String Password = input.readLine();
        if (nama.equals(this.getNama()) && Username.equals(this.getUsername()) && Password.equals(this.getPassword())) {
            System.out.println("Login Berhasil");
            lihatjasa();
        } else {
            System.out.println("Username Atau PAssword Anda salah");
        }
    }

    public static void lihatjasa() throws IOException {
        LoginManager dataManager = new LoginManager("Wendra", "managerakun", "manager123");
        Karyawanmng wendra = new Karyawanmng(dataManager);
        InputStreamReader lihat = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(lihat);
        while (true) {
            System.out.println("|=====================================|");
            System.out.println("|=   Lihat Data Jasa yang Tersedia   =|");
            System.out.println("|= 1. Data Desain                    =|");
            System.out.println("|= 2. Data Video                     =|");
            System.out.println("|= 3. LogoutManager                  =|");
            System.out.println("|=====================================|");
            System.out.print(" Pilih Data yang ingin dilihat : ");

            int Pilih = Integer.valueOf(input.readLine());
            switch (Pilih) {
                case 1:
                    for (int i = 0; i < dataDesain.size(); i++) {
                        System.out.println("Data Desain Ke -" + (i + 1));
                        dataDesain.get(i).display();
                    }
                    break;
                case 2:
                    for (int i = 0; i < dataVideo.size(); i++) {
                        System.out.println("Data Video Ke -" + (i + 1));
                        dataVideo.get(i).display();
                    }
                    break;
                case 3:
                    wendra.LogoutAkun();
                    return;
            }
        }
    }

    @Override
    public void logout() {
        System.out.println("Anda Berhasil Logout");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}

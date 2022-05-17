/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author SHaneEZolDyC
 */
public class Main {

    static InputStreamReader menulogin = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(menulogin);
    static int pilih;

    public static void main(String[] args) throws Exception {
        while (true) {
            menulogin();
        }

    }
    private static void menulogin() throws IOException{
        LoginManager dataManager = new LoginManager("Wendra", "managerakun", "manager123");
        LoginAdmin dataAdmin = new LoginAdmin("Raymong", "adminakun", "admin123");
        Karyawanmng wendra = new Karyawanmng(dataManager);
        Karyawanadm raymong = new Karyawanadm(dataAdmin);
        while (true) {
            System.out.println("|===============================|");
            System.out.println("|     Program Pemesanan Jasa    |");
            System.out.println("| 1. Manager                    |");
            System.out.println("| 2. Admin                      |");
            System.out.println("| 0. Exit                       |");
            System.out.println("|===============================|");
            System.out.println("Pilih Login Sebagai? :");
            int pilih = Integer.valueOf(input.readLine());
            switch (pilih) {
                case 1:
                    wendra.LoginAkun();
                    break;
                case 2:
                    raymong.LoginAkun();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Anda Salah!");
                    menulogin();
          
            }

        }

    }
}

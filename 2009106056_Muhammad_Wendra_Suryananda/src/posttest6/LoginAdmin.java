/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

import posttest6.*;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author SHaneEZolDyC
 */
public class LoginAdmin extends Akunn implements Login {
    private String nama;

    public LoginAdmin(String nama, String Username, String Password) {
        super(Username, Password);
        this.nama = nama;
    }

    @Override
    public void login()throws IOException {
        ArrayList<LoginAdmin> dataAdmin = new ArrayList<LoginAdmin>();
        dataAdmin.add(new LoginAdmin("Raymong", "adminakun", "admin123"));
        System.out.print("Masukan Nama Anda : ");
        String nama = input.readLine();
        System.out.print("Masukan username : ");
        String Username = input.readLine();
        System.out.print("Masukan password : ");
        String Password = input.readLine();
        if (nama.equals(this.getNama()) && Username.equals(this.getUsername()) && Password.equals(this.getPassword())) {
            System.out.println("Login Berhasil");
            Admin.menu();
        }else {
            System.out.println("Username Atau PAssword Anda salah");
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

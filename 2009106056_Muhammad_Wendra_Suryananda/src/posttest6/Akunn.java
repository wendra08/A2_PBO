/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

/**
 *
 * @author SHaneEZolDyC
 */
import posttest6.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class Akunn {
    protected String Username, Password;
     protected InputStreamReader akun = new InputStreamReader(System.in);
     protected BufferedReader input = new BufferedReader(akun);
     protected int jumlahakun = 0;

    public Akunn(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
     
}

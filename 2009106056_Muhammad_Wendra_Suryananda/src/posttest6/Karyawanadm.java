/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

import posttest6.*;
import java.io.IOException;

/**
 *
 * @author SHaneEZolDyC
 */
public class Karyawanadm {
    private Login LoginManager;
    
    public Karyawanadm(Login LoginManager){
        this.LoginManager = LoginManager;
    }
    
     void LoginAkun()throws IOException {
        this.LoginManager.login();
    }

    public void LogoutAkun()throws IOException {
        this.LoginManager.logout();
    }
}

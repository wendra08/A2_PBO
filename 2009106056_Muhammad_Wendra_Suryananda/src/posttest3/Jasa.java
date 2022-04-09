/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

import posttest2.*;

/**
 *
 * @author SHaneEZolDyC
 */
class Jasa {

    private String namadesain,jenisdesain,ukurandesain;
    private int hargajasa;
    
    public Jasa(String namadesain, String jenisdesain, String ukurandesain, int hargajasa) {
        this.namadesain = namadesain;
        this.jenisdesain = jenisdesain;
        this.ukurandesain = ukurandesain;
        this.hargajasa = hargajasa;
    }

    public String getNamadesain() {
        return namadesain;
    }

    public void setNamadesain(String namadesain) {
        this.namadesain = namadesain;
    }

    public String getJenisdesain() {
        return jenisdesain;
    }

    public void setJenisdesain(String jenisdesain) {
        this.jenisdesain = jenisdesain;
    }

    public String getUkurandesain() {
        return ukurandesain;
    }

    public void setUkurandesain(String ukurandesain) {
        this.ukurandesain = ukurandesain;
    }

    public int getHargajasa() {
        return hargajasa;
    }

    public void setHargajasa(int hargajasa) {
        this.hargajasa = hargajasa;
    }

     
    void Menambahkandata() {
        System.out.println("Data berhasil ditambahkan");
    }
    void Menghapusdata() {
        System.out.println("Data berhasil dihapus");
    }

    
}


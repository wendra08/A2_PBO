/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;


/**
 *
 * @author SHaneEZolDyC
 */
public class Jasa {
// nama jasa, harga jasa, proseskerja, ratingjasa,
    protected String namajasa, proseskerja, ratingjasa;
    protected int hargajasa;
    
    //construtor

    public Jasa(String namajasa, String proseskerja, String ratingjasa, int hargajasa) {
        this.namajasa = namajasa;
        this.proseskerja = proseskerja;
        this.ratingjasa = ratingjasa;
        this.hargajasa = hargajasa;
    }

    public String getNamajasa() {
        return namajasa;
    }

    public void setNamajasa(String namajasa) {
        this.namajasa = namajasa;
    }

    public String getProseskerja() {
        return proseskerja;
    }

    public void setProseskerja(String proseskerja) {
        this.proseskerja = proseskerja;
    }

    public String getRatingjasa() {
        return ratingjasa;
    }

    public void setRatingjasa(String ratingjasa) {
        this.ratingjasa = ratingjasa;
    }

    public int getHargajasa() {
        return hargajasa;
    }

    public void setHargajasa(int hargajasa) {
        this.hargajasa = hargajasa;
    }
    public void MenambahkandataJasa() {
        System.out.println("Data Jasa berhasil ditambahkan");
    }
     public void updateJasa(){
         System.out.println("Data Jasa berhasil diupdate");
     }
     public void deleteJasa(){
         System.out.println("Data Jasa berhasil dihapus");
     }
     public void diskon(int hargadis, String diskons){
        hargadis = this.hargajasa * 10/100;
        diskons = "jasa ini : " + this.namajasa + "mendapatkan diskon";
         System.out.println("diskons");
         System.out.println(hargadis);
     }
}
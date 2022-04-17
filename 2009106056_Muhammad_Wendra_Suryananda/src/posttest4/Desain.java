/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

/**
 *
 * @author SHaneEZolDyC
 */
//import library
public class Desain extends Jasa {

    private String namadesain;

    public Desain(String namajasa, String proseskerja, String ratingjasa, int hargajasa, String namadesain) {
        super(namajasa, proseskerja, ratingjasa, hargajasa);
        this.namadesain = namadesain;
    }

    public String getNamadesain() {
        return namadesain;
    }

    public void setNamadesain(String namadesain) {
        this.namadesain = namadesain;
    }

    @Override
    public void MenambahkandataJasa() {
        System.out.println("Data Desain berhasil ditambahkan");
    }

    @Override
    public void updateJasa() {
        System.out.println("Data Desain berhasil diupdate");
    }

    @Override
    public void deleteJasa() {
        System.out.println("Data Desain berhasil dihapus");
    }

    public void diskon(int diskon) {
        System.out.println(this.namadesain);
        if (this.hargajasa >= 50000) {
            int diskons = diskon+10;
            int hargadisdesain = this.hargajasa * diskons/100;
            System.out.println("DISKON SEBESAR 20%," + hargadisdesain + " IDR");
        } else if (this.hargajasa >= 100000) {
            int diskons1 = diskon+30;
            int hargadisdesain2 = this.hargajasa * diskons1/100;
            System.out.println("DISKON SEBESAR 40%," + hargadisdesain2 + " IDR");
        } else {
            System.out.println("TIDAK MENDAPATKAN DISKON !");
        }
    }
}

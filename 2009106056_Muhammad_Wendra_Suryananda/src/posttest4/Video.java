/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

/**
 *
 * @author SHaneEZolDyC
 */
public class Video extends Jasa{
    private String namavideo;

    public Video(String namajasa, String proseskerja, String ratingjasa, int hargajasa, String namavideo) {
        super(namajasa, proseskerja, ratingjasa, hargajasa);
        this.namavideo = namavideo;
    }

    public String getNamavideo() {
        return namavideo;
    }

    public void setNamavideo(String namavideo) {
        this.namavideo = namavideo;
    }
    @Override
    public void MenambahkandataJasa() {
        System.out.println("Data Video berhasil ditambahkan");
    }

    @Override
    public void updateJasa() {
        System.out.println("Data Video berhasil diupdate");
    }
    
    @Override
    public void deleteJasa() {
        System.out.println("Data Video berhasil dihapus");
    }
    
    public void diskon(int diskon) {
        System.out.println(this.namavideo);
        if (this.hargajasa >= 70000) {
            int diskons = diskon+20;
            int hargadisvideo = this.hargajasa * diskons/100;
            System.out.println("DISKON SEBESAR 30%," + hargadisvideo + " IDR");
        } else if (this.hargajasa >= 120000) {
            int diskons1 = diskon+40;
            int hargadisvideo2 = this.hargajasa * diskons1/100;
            System.out.println("DISKON SEBESAR 50%," + hargadisvideo2 + " IDR");
        } else {
            System.out.println("TIDAK MENDAPATKAN DISKON !");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_rental;

/**
 *
 * @author A S U S
 */
public class Kendaraan {
    int id, idPemilikKendaraan;
    private String noMesin, noRangka, noPol, merk, warna, kondisi;
    private int harga;
    
    //Kendaraan (int idPemilikKendaraan, int id, String noMesin, String noRangka, String noPol, String merk, String, warna, String kondisi){
        
    //}
    
    public void setId(int id){
        this.id = id;
    }

    public void setNoMesin(String noMesin) {
        this.noMesin = noMesin;
    }

    public void setNoRangka(String noRangka) {
        this.noRangka = noRangka;
    }

    public void setNoPol(String noPol) {
        this.noPol = noPol;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getNoMesin() {
        return noMesin;
    }

    public String getNoRangka() {
        return noRangka;
    }

    public String getNoPol() {
        return noPol;
    }

    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public String getKondisi() {
        return kondisi;
    }

    public int getHarga() {
        return harga;
    }
}

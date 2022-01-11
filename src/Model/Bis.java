/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author A S U S
 */
public class Bis extends Kendaraan {
    int jumlahKursi;
    private String jenisBis;

    public Bis(int jumlahKursi, String jenisBis, int id, int idPemilikKendaraan, String noMesin, String noRangka, String noPol, String merk, String warna, String kondisi, int harga) {
        super(id, idPemilikKendaraan, noMesin, noRangka, noPol, merk, warna, kondisi, harga);
        this.jumlahKursi = jumlahKursi;
        this.jenisBis = jenisBis;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public void setJenisBis(String jenisBis) {
        this.jenisBis = jenisBis;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public String getJenisBis() {
        return jenisBis;
    }
}

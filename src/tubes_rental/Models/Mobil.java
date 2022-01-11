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
public class Mobil extends Kendaraan {
    int jumlahKursi;
    private String jenisMobil;

    public Mobil(int jumlahKursi, String jenisMobil, int id, int idPemilikKendaraan, String noMesin, String noRangka, String noPol, String merk, String warna, String kondisi, int harga) {
        super(id, idPemilikKendaraan, noMesin, noRangka, noPol, merk, warna, kondisi, harga);
        this.jumlahKursi = jumlahKursi;
        this.jenisMobil = jenisMobil;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public void setJenisMobil(String jenisMobil) {
        this.jenisMobil = jenisMobil;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public String getJenisMobil() {
        return jenisMobil;
    }
}

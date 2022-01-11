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
public class Motor extends Kendaraan {
    int jumlahKursi;
    private String jenisMotor;

    public Motor(int jumlahKursi, String jenisMotor, int id, int idPemilikKendaraan, String noMesin, String noRangka, String noPol, String merk, String warna, String kondisi, int harga) {
        super(id, idPemilikKendaraan, noMesin, noRangka, noPol, merk, warna, kondisi, harga);
        this.jumlahKursi = jumlahKursi;
        this.jenisMotor = jenisMotor;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public String getJenisMotor() {
        return jenisMotor;
    }
}

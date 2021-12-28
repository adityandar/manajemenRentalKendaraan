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
public class Motor {
    int jumlahKursi;
    private String jenisMotor;
    
    //Motor (int idKendaraan, String noMesin, String noRangka, String noPol, String merk, String, warna, String kondisi){
        
    //}

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

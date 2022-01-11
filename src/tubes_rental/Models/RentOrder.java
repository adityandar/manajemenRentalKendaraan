/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_rental;

import java.util.Date;

/**
 *
 * @author 529
 */
public class RentOrder {
    private int id;
    private int idPelanggan;
    private int idKendaraan;
    private Date tanggalSewa;
    private Date tanggalSelesai;
    private int durasiSewa;
    private int biayaSewa;
    
    public RentOrder(int id, int idPelanggan, int idKendaraan, Date tanggalSewa, Date tanggalSelesai, int durasiSewa, int biayaSewa) {
        this.id = id;
        this.idPelanggan = idPelanggan;
        this.idKendaraan = idKendaraan;
        this.tanggalSewa = tanggalSewa;
        this.tanggalSelesai = tanggalSelesai;
        this.durasiSewa = durasiSewa;
        this.biayaSewa = biayaSewa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public int getIdKendaraan() {
        return idKendaraan;
    }

    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public Date getTanggalSewa() {
        return tanggalSewa;
    }

    public void setTanggalSewa(Date tanggalSewa) {
        this.tanggalSewa = tanggalSewa;
    }

    public Date getTanggalSelesai() {
        return tanggalSelesai;
    }

    public void setTanggalSelesai(Date tanggalSelesai) {
        this.tanggalSelesai = tanggalSelesai;
    }

    public int getDurasiSewa() {
        return durasiSewa;
    }

    public void setDurasiSewa(int durasiSewa) {
        this.durasiSewa = durasiSewa;
    }

    public int getBiayaSewa() {
        return biayaSewa;
    }

    public void setBiayaSewa(int biayaSewa) {
        this.biayaSewa = biayaSewa;
    }

}

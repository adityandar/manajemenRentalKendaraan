/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 529
 */
public class Pelanggan extends Pengguna {
    
    private int id;
    private String NIK;
    private String jenisKelamin;
    private int umur;
    private String noHP;
    private String pekerjaan;
    
    public Pelanggan(int id, String NIK, String jenisKelamin, int umur, String noHP, String pekerjaan, String nama, String alamat, String username, String password) {
        super(nama, alamat, username, password);
        this.id = id;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
        this.noHP = noHP;
        this.pekerjaan = pekerjaan;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
}

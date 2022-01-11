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
public class PemilikKendaraan extends Pengguna{
    
    private int id;
    private String NIK;
    private String noHP;

    public PemilikKendaraan(int id, String NIK, String noHP, String nama, String alamat, String username, String password) {
        super(nama, alamat, username, password);
        this.id = id;
        this.NIK = NIK;
        this.noHP = noHP;
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

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_rental;

/**
 *
 * @author asus
 */
public class Pengguna {
    
    private String nama;
    private String alamat;
    private String username;
    private String password;
    
    public Pengguna(String nama, String alamat, String username, String password) {
        this.nama = nama;
        this.alamat = alamat;
        this.username = username;
        this.password = password;
    }

    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

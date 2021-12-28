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
public class Admin extends Pengguna implements InterfacePelanggan, InterfaceLaporan{
    private int id;

    public Admin(int id, String nama, String alamat, String username, String password) {
        super(nama, alamat, username, password);
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void tambahPelanggan() {
        
    }

    @Override
    public void hapusPelanggan() {
        
    }

    @Override
    public void lihatLaporan() {
        
    }
    
}

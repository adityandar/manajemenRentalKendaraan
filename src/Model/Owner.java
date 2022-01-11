/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import tubes_rental.InterfaceLaporan;
import tubes_rental.InterfacePelanggan;

/**
 *
 * @author asus
 */
public class Owner extends Pengguna implements InterfacePelanggan, InterfaceLaporan{
    private int id;

    public Owner(int id, String nama, String alamat, String username, String password) {
        super(nama, alamat, username, password);
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setIdOwner(int id) {
        this.id = id;
    }
    
    @Override
    public void lihatLaporan() {
        
    }
    
    @Override
    public void tambahPelanggan() {
        
    }

    @Override
    public void hapusPelanggan() {
        
    }
    
    public void tambahAdmin(){
    
    }
    
    public void hapusAdmin(){
    
    }

}

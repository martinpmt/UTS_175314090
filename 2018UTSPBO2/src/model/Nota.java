/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author basisa19
 */
public class Nota {
    private ArrayList<Transaksi> daftarTransaksi = new ArrayList<Transaksi>();

    @Override
    public String toString() {
        return "Nota{" + "daftarTransaksi=" + daftarTransaksi + '}';
    }
    
    public Nota(){
        
    }
    
    public void tambahTransaksi(Transaksi transaksi){
        daftarTransaksi.add(transaksi);
    }

    public ArrayList<Transaksi> getDaftarTransaksi() {
        return daftarTransaksi;
    }

    public void setDaftarTransaksi(ArrayList<Transaksi> daftarTransaksi) {
        this.daftarTransaksi = daftarTransaksi;
    }


    
}

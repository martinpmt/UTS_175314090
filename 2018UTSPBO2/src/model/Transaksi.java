/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author basisa19
 */
public class Transaksi {

    private String namaPembeli;
    private String namaBarang;
    private String daftarBarang[] = {"-pilih-", "Buku", "Pensil", "Penggaris"};

    @Override
    public String toString() {
        return namaPembeli + "," + namaBarang + "," + jumlah + "," + hargaBarang;
    }
    private int jumlah;
    private int hargaBarang;

    public Transaksi() {

    }

    public Transaksi(String namaPembeli, String namaBarang, int jumlah, int hargaBarang) {
        this.namaPembeli = namaPembeli;
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.hargaBarang = hargaBarang;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) throws Exception {
        if (namaBarang.length() < 15) {
            this.namaBarang = namaBarang;
        } else {
            throw new Exception("Nama Barang lebih dari 25 karakter");
        }

    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public String[] getDaftarBarang() {
        return daftarBarang;
    }

    public void setDaftarBarang(String[] daftarBarang) {
        this.daftarBarang = daftarBarang;
    }

}

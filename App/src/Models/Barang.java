/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SGT
 */
public class Barang implements ITampil{
    private int id_barang,stock;
    private double harga;
    private String nama_barang;
    private String nama_kategori;
    private String nama_supplier;
    private int id_kategori,id_supplier;
    
    
    public Barang(){}
    public Barang(int _id_barang,String _nama_supplier,int _stock,double _harga,String _nama_kategori,String _nama_barang,int id_kat,int id_supp)
    {
        setId_barang(_id_barang);
        setNama_kategori(_nama_kategori);
        setNama_supplier(_nama_supplier);
        setStock(_stock);
        setHarga(_harga);
        setNama_barang(_nama_barang);
        setId_kategori(id_kat);
        setId_supplier(id_supp);
    }
    
     public Barang(int _stock,double _harga,String _nama_barang,int id_kat,int id_supp)
    {

        setStock(_stock);
        setHarga(_harga);
        setNama_barang(_nama_barang);
        setId_kategori(id_kat);
        setId_supplier(id_supp);
    }
    
   
    /**
     * @return the id_barang
     */
    public int getId_barang() {
        return id_barang;
    }

    /**
     * @param id_barang the id_barang to set
     */
    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    /**
     * @return the id_supplier
     */

    /**
     * @param id_supplier the id_supplier to set
     */


    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the harga
     */
    public double getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(double harga) {
        this.harga = harga;
    }

    /**
     * @return the nama_baranga
     */
    public String getNama_barang() {
        return nama_barang;
    }

    /**
     * @param nama_baranga the nama_baranga to set
     */
    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }
    
    public String tampil(){
        return "ID Barang : "+getId_barang()+"\n"
                + "Nama Supplier : "+getNama_supplier()+"\n"
                + "Nama Kategori : "+getNama_kategori()+"\n"
                + "Nama Barang : "+getNama_barang()+"\n"
                + "Stok  : "+getStock()+"\n"
                + "Harga : "+getHarga()+"\n\n";
    }

    /**
     * @return the nama_kategori
     */
    public String getNama_kategori() {
        return nama_kategori;
    }

    /**
     * @param nama_kategori the nama_kategori to set
     */
    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }

    /**
     * @return the nama_supplier
     */
    public String getNama_supplier() {
        return nama_supplier;
    }

    /**
     * @param nama_supplier the nama_supplier to set
     */
    public void setNama_supplier(String nama_supplier) {
        this.nama_supplier = nama_supplier;
    }

    /**
     * @return the id_kategori
     */
    public int getId_kategori() {
        return id_kategori;
    }

    /**
     * @param id_kategori the id_kategori to set
     */
    public void setId_kategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }

    /**
     * @return the id_supplier
     */
    public int getId_supplier() {
        return id_supplier;
    }

    /**
     * @param id_supplier the id_supplier to set
     */
    public void setId_supplier(int id_supplier) {
        this.id_supplier = id_supplier;
    }
}

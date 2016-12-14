/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author SGT
 */
public class Transaksi {
    private int id_transaksi,id_barang,id_pegawai,id_member,kuantias;
    private double total_harga;
    private String tanggal;
    
    public Transaksi(){}
    public Transaksi(int _id_transaksi,int _id_barang,int _id_pegawai,int _id_member,int _kuantias,double _total_harga,String _tanggal)
    {
        setId_transaksi(_id_transaksi);
        setId_barang(_id_barang);
        setKuantias(_kuantias);
        setTotal_harga(_total_harga);
        setId_member(_id_member);
        setId_pegawai(_id_pegawai);
        setTanggal(_tanggal);
    }

    /**
     * @return the id_transaksi
     */
    public int getId_transaksi() {
        return id_transaksi;
    }

    /**
     * @param id_transaksi the id_transaksi to set
     */
    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
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
     * @return the id_pegawai
     */
    public int getId_pegawai() {
        return id_pegawai;
    }

    /**
     * @param id_pegawai the id_pegawai to set
     */
    public void setId_pegawai(int id_pegawai) {
        this.id_pegawai = id_pegawai;
    }

    /**
     * @return the id_member
     */
    public int getId_member() {
        return id_member;
    }

    /**
     * @param id_member the id_member to set
     */
    public void setId_member(int id_member) {
        this.id_member = id_member;
    }

    /**
     * @return the kuantias
     */
    public int getKuantias() {
        return kuantias;
    }

    /**
     * @param kuantias the kuantias to set
     */
    public void setKuantias(int kuantias) {
        this.kuantias = kuantias;
    }

    /**
     * @return the total_harga
     */
    public double getTotal_harga() {
        return total_harga;
    }

    /**
     * @param total_harga the total_harga to set
     */
    public void setTotal_harga(double total_harga) {
        this.total_harga = total_harga;
    }

    /**
     * @return the tanggal
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}

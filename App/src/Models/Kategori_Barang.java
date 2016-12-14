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
public class Kategori_Barang implements ITampil{
    private int id_kategori;
    private String nama_kategori,deskripsi;
    
    public Kategori_Barang(){}
    public Kategori_Barang(int _id_kategori,String _nama_kategori,String _deskripsi)
    {
        setId_kategori(_id_kategori);
        setNama_kategori(_nama_kategori);
        setDeskripsi(_deskripsi);
    }
    
    public Kategori_Barang(String _nama_kategori,String _deskripsi)
    {
        setNama_kategori(_nama_kategori);
        setDeskripsi(_deskripsi);
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
     * @return the deskripsi
     */
    public String getDeskripsi() {
        return deskripsi;
    }

    /**
     * @param deskripsi the deskripsi to set
     */
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    public String tampil(){
        return "ID Kategori : "+getId_kategori()+"\n"
                + "Nama Kategori : "+getNama_kategori()+"\n"
                + "Deskripsi : "+getDeskripsi()+"\n\n";
    }
}

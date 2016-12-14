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
public class Supplier implements ITampil{
    private int id_supplier;
    private String nama_supplier,alamat,no_tlpn;
    
    public Supplier(){}
    public Supplier(int _id_supplier,String _nama_supplier, String _alamat, String _no_tlpn)
    {
        setId_supplier(_id_supplier);
        setNama_supplier(_nama_supplier);
        setAlamat(_alamat);
        setNo_tlpn(_no_tlpn);
    }
    
     public Supplier(String _nama_supplier, String _alamat, String _no_tlpn)
    {
        setNama_supplier(_nama_supplier);
        setAlamat(_alamat);
        setNo_tlpn(_no_tlpn);
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
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the no_tlpn
     */
    public String getNo_tlpn() {
        return no_tlpn;
    }

    /**
     * @param no_tlpn the no_tlpn to set
     */
    public void setNo_tlpn(String no_tlpn) {
        this.no_tlpn = no_tlpn;
    }
    
    public String tampil(){
        return "ID Supplier : "+getId_supplier()+"\n"
                + "Nama supplier : "+getNama_supplier()+"\n"
                + "Alamat : "+getAlamat()+"\n"
                + "No Tlpn : "+getNo_tlpn()+"\n\n";
                
    }
}

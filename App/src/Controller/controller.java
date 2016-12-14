/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.dao;
import Models.*;
import ModelTabel.*;
import java.util.List;
import javax.swing.table.TableModel;

/**
 *
 * @author Aldi
 */
public class controller {
    private dao daomart = new dao(){};
    private List<Staff> dummyStaff;
    private List<Manager> dummyManager;
    private List<Barang> dummyBarang;
    private List<Kategori_Barang> dummyKetegoriBarang;
    private List<Member> dummyMember;
    private List<Role> dummyRole;
    private List<Supplier> dummySupplier;
    private List<User> dummyUser;
    private List<Transaksi> dummyTransaksi;
    private Barang tempBarang;
    private Kategori_Barang tempKategori;
    private Member tempMember;
    
    public controller(){};
    
    // <editor-fold defaultstate="collapsed" desc="INSERT">   

    public void insertMember(String nama,String alamat,String notelp){
        daomart.makeConnection();
        tempMember=new Member(nama, alamat, notelp);
        daomart.insertMember(tempMember);
        daomart.closeConnection();
    }
    
    public void insertBarang(String nama, String kategori,int stok, double harga, String supplier){
        daomart.makeConnection();
        int tempID_Kat=daomart.getIdKategori(kategori);
        int tempID_Supp=daomart.getIdSupplier(supplier);
        tempBarang=new Barang(stok, harga, nama, tempID_Kat, tempID_Supp);
        daomart.insertBarang(tempBarang);
        daomart.closeConnection();
    }
    
     public void insertKategori(String nama, String deskripsi){
        daomart.makeConnection();
        tempKategori=new Kategori_Barang(nama, deskripsi);
        daomart.insertKategoriBarang(tempKategori);
        daomart.closeConnection();
    }
     
    public void addSupplier(Supplier _sup)
    {
        dummySupplier.add(_sup);
        daomart.makeConnection();
        daomart.insertSupplier(_sup);
        daomart.closeConnection();
    } 
// </editor-fold>
     
    // <editor-fold defaultstate="collapsed" desc="SHOW TABEL">
    
     public TableModel searchShowTabelSupplier(String key){
        daomart.makeConnection();
        TableModel modelSplr= new ModelSupplier(daomart.showSearchSupplier(key));
        daomart.closeConnection();
        
        return modelSplr;
        
    }
     
    public TableModel showTabelSupplier()
    {
       daomart.makeConnection();
       TableModel modelSplr = new ModelSupplier(daomart.getSupplier());
       daomart.closeConnection();
       return modelSplr;
    }
     
    public TableModel showTableBarang(){
        daomart.makeConnection();
        TableModel tb;
        tb= new ModelBarang(daomart.getBarang());
        daomart.closeConnection();
        return tb;
    }
    
    public TableModel showTableMember(){
        daomart.makeConnection();
        TableModel tb = new ModelMember(daomart.getMember());
        daomart.closeConnection();
        return tb;
    }
    
    public TableModel searchTableMember(String key){
        daomart.makeConnection();
        TableModel tb = new ModelMember(daomart.searchMember(key));
        daomart.closeConnection();
        return tb;
    }
    
    public TableModel searchTableBarang(String key){
        daomart.makeConnection();
        TableModel tb;
        tb= new ModelBarang(daomart.searchBarang(key));
        daomart.closeConnection();
        return tb;
    }
    
    public TableModel showTableKategori(){
        daomart.makeConnection();
        TableModel tb;
        tb= new ModelKategori(daomart.getKategoriBarang());
        daomart.closeConnection();
        return tb;
    }
    
    public TableModel searchTableKategori(String key){
        daomart.makeConnection();
        TableModel tb;
        tb= new ModelKategori(daomart.searchKategoriBarang(key));
        daomart.closeConnection();
        return tb;
    }
//</editor-fold>    
    
    // <editor-fold defaultstate="collapsed" desc="Lain-Lain">
    
  public void getAll(){
            daomart.makeConnection();
            dummyManager=daomart.getManager();
            dummyStaff=daomart.getStaff();
            dummyBarang=daomart.getBarang();
            dummyKetegoriBarang=daomart.getKategoriBarang();
            dummyMember=daomart.getMember();
            dummyRole=daomart.getRole();
            dummySupplier=daomart.getSupplier();
            dummyUser=daomart.getUsers();
            daomart.closeConnection();
        }

        public void setKategori(){
            daomart.makeConnection();
            dummyKetegoriBarang=daomart.getKategoriBarang();
            daomart.closeConnection();
        }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Login">
        public String getUserActive(String user,String pass){
            String result="";
            daomart.makeConnection();
            result=daomart.getUserActive( user,  pass);
            daomart.closeConnection();
            return result;
        }

        public int cekUser(String user,String pass){
            int result=0;
            daomart.makeConnection();
            result=daomart.cekUser(user, pass);
            daomart.closeConnection();
            return result;
        }

        public int cekRole(String user,String pass){
            int result=0;
            daomart.makeConnection();
            result=daomart.cekRole(user, pass);
            return result;
        }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="GET_BY_">
        public String getBarangByID(int key){
            String result="";
            daomart.makeConnection();
            result=daomart.getBarangById(key);
            daomart.closeConnection();
            return result;
        }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="EDIT">
    public void editSupplier(Supplier sup,String id_sup)
    {
        daomart.makeConnection();
        daomart.editSupplier(sup,id_sup);
        daomart.closeConnection();
    }
        
        
    public void editBarang(String nama, String kategori,int stok, double harga, String supplier,int id){
        daomart.makeConnection();
        int tempID_Kat=daomart.getIdKategori(kategori);
        int tempID_Supp=daomart.getIdSupplier(supplier);
        tempBarang=new Barang(stok, harga, nama, tempID_Kat, tempID_Supp);
        daomart.updateBarang(tempBarang,id);
        daomart.closeConnection();
    }
    
    public void editKategori(int id,String nama, String deskripsi){
        daomart.makeConnection();
        tempKategori=new Kategori_Barang(nama, deskripsi);
        daomart.updateKategoriBarang(tempKategori,id);
        daomart.closeConnection();
    }
    
    public void editMember(int id,String nama,String alamat,String notelp){
        daomart.makeConnection();
        tempMember=new Member(nama, alamat, notelp);
        daomart.updateMember(tempMember, id);
        daomart.closeConnection();
    }
    //</editor-fold>
      
    // <editor-fold defaultstate="collapsed" desc="DELETE">
    public void deleteBarang(int id){
        daomart.makeConnection();
        daomart.deleteBarang(id);
        daomart.closeConnection();
    }
    
    public void deleteKategori(int id){
        daomart.makeConnection();
        daomart.deleteKategori(id);
        daomart.closeConnection();
    }
    
    public void deleteSupplier(String id_sup){
        daomart.makeConnection();
        daomart.deleteSupplier(id_sup);
        daomart.closeConnection();
    }
    
    public void deleteMember(int id){
        daomart.makeConnection();
        daomart.deleteMember(id);
        daomart.closeConnection();
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="GETTER_SETTER">
    public List<Staff> getDummyStaff() {
        return dummyStaff;
    }

    public List<Manager> getDummyManager() {
        return dummyManager;
    }
    
    public List<Barang> getDummyBarang() {
        return dummyBarang;
    }
 
    public List<Kategori_Barang> getdummyKetegoriBarang() {
        daomart.makeConnection();
        dummyKetegoriBarang=daomart.getKategoriBarang();
        daomart.closeConnection();
        return dummyKetegoriBarang;
    }

    public List<Member> getdummyMember() {
        return dummyMember;
    }
    
    public List<Role> getdummyRole() {
        return dummyRole;
    }
    
    public List<Supplier> getdummySupplier() {
        daomart.makeConnection();
        dummySupplier=daomart.getSupplier();
        daomart.closeConnection();
        return dummySupplier;
    }
    
    public List<User> getdummyUsers() {
        return dummyUser;
    }
    
    public List<Transaksi> getdummyTransaksi() {
        return dummyTransaksi;
    }
     
    //</editor-fold>
    
}

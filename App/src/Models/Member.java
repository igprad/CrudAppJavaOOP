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
public class Member implements ITampil{
    private int id_member,poin_member;
    private String nama_member,alamat,no_tlpn;
    
    public Member(){}
    public Member(int _id_member,int _poin_member,String _nama_member,String _alamat,String _no_tlpn)
    {
        setId_member(_id_member);
        setNama_member(_nama_member);
        setPoin_member(_poin_member);
        setAlamat(_alamat);
        setNo_tlpn(_no_tlpn);
    }
    
    public Member(String _nama_member,String _alamat,String _no_tlpn)
    {
        setNama_member(_nama_member);
        setAlamat(_alamat);
        setNo_tlpn(_no_tlpn);
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
     * @return the poin_member
     */
    public int getPoin_member() {
        return poin_member;
    }

    /**
     * @param poin_member the poin_member to set
     */
    public void setPoin_member(int poin_member) {
        this.poin_member = poin_member;
    }

    /**
     * @return the nama_member
     */
    public String getNama_member() {
        return nama_member;
    }

    /**
     * @param nama_member the nama_member to set
     */
    public void setNama_member(String nama_member) {
        this.nama_member = nama_member;
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
        return "ID Member : "+getId_member()+"\n"
                + "Nama Member : "+getNama_member()+"\n"
                + "Poin : "+getPoin_member()+"\n"
                + "Alamat : "+getAlamat()+"\n"
                + "No.Tlpn : "+getNo_tlpn()+"\n\n";
                
    }
}

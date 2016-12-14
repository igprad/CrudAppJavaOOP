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
public class Pegawai implements ITampil{
    private int id_pegawai,id_role,id_user;
    private double salary;
    private String nama,jenis_kelamin,alamat,no_tlpn,tgl_diangkat;
    
    public Pegawai(){}
    public Pegawai(int _id_pegawai,int _id_role,int _id_user,double _salary,String _nama,String _jenis_kelamin,String _alamat,String _no_tlpn,String _tglangkat)
    {
        setId_pegawai(_id_pegawai);
        setId_role(_id_role);
        setId_user(_id_user);
        setSalary(_salary);
        setNama(_nama);
        setJenis_kelamin(_jenis_kelamin);
        setAlamat(_alamat);
        setNo_tlpn(_no_tlpn);
        setTgl_diangkat(_tglangkat);
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
     * @return the id_role
     */
    public int getId_role() {
        return id_role;
    }

    /**
     * @param id_role the id_role to set
     */
    public void setId_role(int id_role) {
        this.id_role = id_role;
    }

    /**
     * @return the id_user
     */
    public int getId_user() {
        return id_user;
    }

    /**
     * @param id_user the id_user to set
     */
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the jenis_kelamin
     */
    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    /**
     * @param jenis_kelamin the jenis_kelamin to set
     */
    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
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
        return "ID Pegawai : "+getId_pegawai()+"\n"
                + "ID Role : "+getId_role()+"\n"
                + "ID User : "+getId_user()+"\n"
                + "Nama : "+getNama()+"\n"
                + "Jenis Kelamin : "+getJenis_kelamin()+"\n"
                + "Tanggal Angkat : "+getTgl_diangkat()+"\n"
                + "Gaji : "+getSalary()+"\n"
                + "Alamat : "+getAlamat()+"\n"
                + "NoTelp : "+getNo_tlpn()+"\n";
    }

    /**
     * @return the tgl_diangkat
     */
    public String getTgl_diangkat() {
        return tgl_diangkat;
    }

    /**
     * @param tgl_diangkat the tgl_diangkat to set
     */
    public void setTgl_diangkat(String tgl_diangkat) {
        this.tgl_diangkat = tgl_diangkat;
    }
}

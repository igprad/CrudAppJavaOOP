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
public class Staff extends Pegawai{
    private String shift;
    
    public Staff(){}
    public Staff(int _id_pegawai,int _id_role,int _id_user,double _salary,String _nama,String _jenis_kelamin,String _alamat,String _no_tlpn,String _tgl,String _shift)
    {
        super(_id_pegawai,_id_role,_id_user,_salary,_nama,_jenis_kelamin,_alamat,_tgl,_no_tlpn);
        setShift(_shift);
    }

    /**
     * @return the shift
     */
    public String getShift() {
        return shift;
    }

    /**
     * @param shift the shift to set
     */
    public void setShift(String shift) {
        this.shift = shift;
    }
    
     public String tampil(){
        return super.tampil()+"Shift : "+getShift()+"\n\n";
    }
}

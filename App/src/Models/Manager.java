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
public class Manager extends Pegawai{
    private double bonus;
    
    public Manager(){}
    public Manager(int _id_pegawai,int _id_role,int _id_user,double _salary,String _nama,String _jenis_kelamin,String _alamat,String _no_tlpn,String _tgl, double _bonus)
    {
        super(_id_pegawai,_id_role,_id_user,_salary,_nama,_jenis_kelamin,_alamat,_no_tlpn,_tgl);
        setBonus(_bonus);
    }

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public String tampil(){
        return super.tampil()+"Bonus : "+getBonus()+"\n\n";
    }
}

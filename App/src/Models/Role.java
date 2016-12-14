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
public class Role implements ITampil{
    private int role;
    private String nama_role;
    
    public Role(){}
    public Role(int _role,String _nama_role)
    {
        setRole(_role);
        setNama_role(_nama_role);
    }

    /**
     * @return the role
     */
    public int getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(int role) {
        this.role = role;
    }

    /**
     * @return the nama_role
     */
    public String getNama_role() {
        return nama_role;
    }

    /**
     * @param nama_role the nama_role to set
     */
    public void setNama_role(String nama_role) {
        this.nama_role = nama_role;
    }
    
    public String tampil(){
        return "ID Role : "+getRole()+"\n"
                + "Nama Role : "+getNama_role()+"\n\n";
                
                
    }
}

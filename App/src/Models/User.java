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
public class User implements ITampil{
    private int id_user,id_pegawai;
    private String username,password;
    
    public User(){}
    public User(int _id_user,int _id_pegawai,String _username,String _password)
    {
        setId_user(_id_user);
        setId_pegawai(_id_pegawai);
        setUsername(_username);
        setPassword(_password);
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
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String tampil(){
        return "ID User : "+getId_user()+"\n"
                + "ID Pegawai : "+getId_pegawai()+"\n"
                + "Username : "+getUsername()+"\n"
                + "PAssword : "+getPassword()+"\n\n";              
    }
}

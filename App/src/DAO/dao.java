/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Models.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aldi
 */
public class dao {
    
    public dao(){}
    
    public static Connection c;
   
    public static final String url = "jdbc:ucanaccess://";
    
    public static final String path="G:/database.mdb";
    //change w8 ur db directory path
    
    public void makeConnection(){
        System.out.println("Opening Database...");
        try
        {
            c=DriverManager.getConnection(url+path);
            System.out.println("Success !\n");   
        }catch(Exception EX){
            System.out.println("Error opening the database...");
            System.out.println(EX);
        }
    }
    
    public void closeConnection(){
        System.out.println("Closing database...");
        try{
              c.close();
            System.out.println("Success!\n");
        }catch(Exception EX){
            System.out.println("Error Closing the database...");
            System.out.println(EX);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="DAO_BARANG">    
    public void insertBarang(Barang  barang){
        String sql="Insert into barang(id_supplier,id_kategori,nama_barang,stok,harga) values("+barang.getId_supplier()+","+barang.getId_kategori()+",'"+barang.getNama_barang()+"',"+barang.getStock()+","+barang.getHarga()+")";
        try{
            Statement statement=c.createStatement();
            int result=statement.executeUpdate(sql);
            statement.close();
        }
        catch(Exception Ex){
            System.out.println("Gagal menambah Barang \n");
            System.out.println(Ex);
        }
    }
    
    public String getBarangById(int ID){
        String result="";
            String sql = "select nama_barang from barang where id_barang='"+ID+"'";
             try{
            Statement state = c.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs!=null){
                while (rs.next()){
                    result =rs.getString("nama_barang");
                }
            }
            rs.close();
            state.close();
        }catch(Exception EX){
            System.out.println("Error Reading From database. . .");
            System.out.println(EX);
        }
        return result;
    }
    
    public void updateBarang(Barang  barang,int id){
        String sql="UPDATE barang SET nama_barang='"+barang.getNama_barang()+"',"
                + "stok='"+barang.getStock()+"',harga='"+barang.getHarga()+"',"
                + "id_kategori='"+barang.getId_kategori()+"',id_supplier='"+barang.getId_supplier()+"' where id_barang='"+id+"'";
        try{
            Statement statement=c.createStatement();
            int result=statement.executeUpdate(sql);
            statement.close();
        }
        catch(Exception Ex){
            System.out.println("Gagal menambah Barang \n");
            System.out.println(Ex);
        }
    }
    
    public void deleteBarang(int id){
        String sql="DELETE FROM Barang WHERE id_barang = '" +id+"'";
        System.out.println("Delete Barang ");
        try{
            Statement statement=c.createStatement();
            int result=statement.executeUpdate(sql);
            System.out.println("Delete"+result+"Barang\n");
            statement.close();
        }
        catch(Exception Ex){
            System.out.println("Error deleting a barang...\n");
            System.out.println(Ex);
        }
    }
    
    public List<Barang> searchBarang(String key){
        String sql = "select id_barang,id_kategori,id_supplier,nama_supplier,nama_kategori,nama_barang,stok,harga from barang "
                + "join supplier on supplier.id_supplier=barang.id_supplier "
                + "join Kategori_barang on Kategori_barang.id_kategori=Barang.id_kategori"
                + " where (id_barang Like '%"+key+"%') OR (id_kategori Like '%"+key+"%') OR (id_supplier Like '%"+key+"%') OR (nama_supplier Like '%"+key+"%')"
                + " OR (nama_kategori Like '%"+key+"%') OR (nama_barang Like '%"+key+"%') OR (stok Like '%"+key+"%') OR (harga Like '%"+key+"%')";
        List<Barang> list = new ArrayList<Barang>();
        try{
            Statement state = c.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs!=null){
                while (rs.next()){
                    Barang b = new Barang(rs.getInt("id_barang"), 
                            rs.getString("nama_supplier"), rs.getInt("stok"),rs.getInt("harga"),rs.getString("nama_kategori"),
                            rs.getString("nama_barang"),rs.getInt("id_kategori"),rs.getInt("id_supplier"));
                    list.add(b);
                }
            }
            rs.close();
            state.close();
        }catch(Exception EX){
            System.out.println("Error Reading From database. . .");
            System.out.println(EX);
        }
        
        return list;
    }
    
    public List<Barang> getBarang(){
        String sql = "select id_barang,id_kategori,id_supplier,nama_supplier,nama_kategori,nama_barang,stok,harga from barang "
                + "join supplier on supplier.id_supplier=barang.id_supplier "
                + "join Kategori_barang on Kategori_barang.id_kategori=Barang.id_kategori";
        List<Barang> list = new ArrayList<Barang>();
        try{
            Statement state = c.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs!=null){
                while (rs.next()){
                    Barang b = new Barang(rs.getInt("id_barang"), 
                            rs.getString("nama_supplier"), rs.getInt("stok"),rs.getInt("harga"),rs.getString("nama_kategori"),
                            rs.getString("nama_barang"),rs.getInt("id_kategori"),rs.getInt("id_supplier"));
                    list.add(b);
                }
            }
            rs.close();
            state.close();
        }catch(Exception EX){
            System.out.println("Error Reading From database. . .");
            System.out.println(EX);
        }
        
        return list;
    }
// </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="DAO_USER">      
     public String getUserActive(String user,String pass){
        String result="";
            String sql = "select username from user where username='"+user+"' and password='"+pass+"'";
             try{
            Statement state = c.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs!=null){
                while (rs.next()){
                    result =rs.getString("username");
                }
            }
            System.out.println("User Aktif = "+result);
            rs.close();
            state.close();
        }catch(Exception EX){
            System.out.println("Error Reading From database. . .");
            System.out.println(EX);
        }
        return result;
    }
    
    public int cekUser(String user,String pass){
        int result=0;
            String sql = "select username,password from user where username='"+user+"' and "
                    + "ASCII(password) = ASCII('"+pass+"')";
             try{
            Statement state = c.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs!=null){
                while (rs.next()){
                    result =1;
                }
            }
            rs.close();
            state.close();
        }catch(Exception EX){
            System.out.println("Error Reading From database. . .");
            System.out.println(EX);
        }
        return result;
    }
    
    public List<User> getUsers(){
        String sql = "select id_user,id_pegawai,username,password from user";
        List<User> list = new ArrayList<User>();
        try{
            Statement state = c.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs!=null){
                while (rs.next()){
                    User b = new User(rs.getInt("id_user"), 
                            rs.getInt("id_pegawai"),
                            rs.getString("username"),
                            rs.getString("password"));
                    list.add(b);
                }
            }
            rs.close();
            state.close();
        }catch(Exception EX){
            System.out.println("Error Reading From database. . .");
            System.out.println(EX);
        }
        
        return list;
    }    
    
// </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="DAO_ROLE">         
    public int cekRole(String user,String pass){
        int result=0;
            String sql = "select id_role from role join user on role.id_role=user.id_role where username='"+user+"' and password='"+pass+"'";
            try{
            Statement state = c.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs!=null){
                while (rs.next()){
                    result =rs.getInt("id_role");
                }
            }
            rs.close();
            state.close();
        }catch(Exception EX){
            System.out.println("Error Reading From database. . .");
            System.out.println(EX);
        }
        return result;
    }
    
    public List<Role> getRole(){
        String sql = "select id_role,nama_role from role";
        List<Role> list = new ArrayList<Role>();
        try{
            Statement state = c.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs!=null){
                while (rs.next()){
                    Role b = new Role(rs.getInt("id_role"), 
                            rs.getString("nama_role"));
                    list.add(b);
                }
            }
            rs.close();
            state.close();
        }catch(Exception EX){
            System.out.println("Error Reading From database. . .");
            System.out.println(EX);
        }
        
        return list;
    }
// </editor-fold>      
    
    // <editor-fold defaultstate="collapsed" desc="DAO_MANAGER">      
    public List<Manager> getManager(){
        String sql = "select id_pegawai, id_role,id_user,nama,jenis_kelamin,tgl_diangkat,salary,alamat,notelp, bonus from PEGAWAI join Manager on PEGAWAI.id_pegawai=Manager.id_pegawai ";
        List<Manager> list = new ArrayList<Manager>();
        try{
            Statement state = c.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs!=null){
                while (rs.next()){
                    Manager pegawai = new Manager(rs.getInt("id_pegawai"), 
                            rs.getInt("id_role"), rs.getInt("id_user"),
                            rs.getDouble("salary"), rs.getString("nama"),rs.getString("jenis_Kelamin"),
                            rs.getString("alamat"), rs.getString("tgl_diangkat"), rs.getString("notelp"),rs.getDouble("bonus"));
                    list.add(pegawai);
                }
            }
            rs.close();
            state.close();
        }catch(Exception EX){
            System.out.println("Error Reading From database. . .");
            System.out.println(EX);
        }
        
        return list;
    }
// </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="DAO_STAFF">      
    public List<Staff> getStaff(){
        String sql = "select id_pegawai, id_role,id_user,nama,"
                + "jenis_kelamin,tgl_diangkat,salary,alamat,notelp,shift from PEGAWAI join STAFF on PEGAWAI.id_pegawai=STAFF.id_pegawai ";
        List<Staff> list = new ArrayList<Staff>();
        try{
            Statement state = c.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs!=null){
                while (rs.next()){
                    Staff pegawai = new Staff(rs.getInt("id_pegawai"), 
                            rs.getInt("id_role"), rs.getInt("id_user"),
                            rs.getDouble("salary"), rs.getString("nama"),rs.getString("jenis_Kelamin"),
                            rs.getString("alamat"),  rs.getString("tgl_diangkat"),rs.getString("notelp"),rs.getString("shift"));
                    list.add(pegawai);
                }
            }
            rs.close();
            state.close();
        }catch(Exception EX){
            System.out.println("Error Reading From database. . .");
            System.out.println(EX);
        }
        
        return list;
    }
// </editor-fold>     
    
    // <editor-fold defaultstate="collapsed" desc="DAO_MEMBER">
    public List<Member> getMember(){
        String sql = "select id_member,nama_member,poin_member,alamat,notelp from member";
        List<Member> list = new ArrayList<Member>();
        try{
            Statement state = c.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs!=null){
                while (rs.next()){
                    Member b = new Member(rs.getInt("id_member"),rs.getInt("poin_member"), 
                            rs.getString("nama_member"), rs.getString("alamat"),rs.getString("notelp"));
                    list.add(b);
                }
            }
            rs.close();
            state.close();
        }catch(Exception EX){
            System.out.println("Error Reading From database. . .");
            System.out.println(EX);
        }
        
        return list;
    }
    
    public List<Member> searchMember(String key){
        String sql = "select id_member,nama_member,poin_member,alamat,notelp from member "
                + "where id_member like '%"+key+"%' OR "
                + "nama_member like '%"+key+"%' OR "
                + "alamat like '%"+key+"%' OR "
                + "notelp like '%"+key+"%'";
        List<Member> list = new ArrayList<Member>();
        try{
            Statement state = c.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs!=null){
                while (rs.next()){
                    Member b = new Member(rs.getInt("id_member"),rs.getInt("poin_member"), 
                            rs.getString("nama_member"), rs.getString("alamat"),rs.getString("notelp"));
                    list.add(b);
                }
            }
            rs.close();
            state.close();
        }catch(Exception EX){
            System.out.println("Error Reading From database. . .");
            System.out.println(EX);
        }
        
        return list;
    }
    
    public void insertMember(Member member){
           String sql="Insert into MEMBER(nama_member,poin_member,alamat,notelp) "
                   + "values('"+member.getNama_member()+"',0,'"+member.getAlamat()+"','"+member.getNo_tlpn()+"')";
        try{
            Statement statement=c.createStatement();
            int result=statement.executeUpdate(sql);
            statement.close();
        }
        catch(Exception Ex){
            System.out.println("Gagal menambah Member \n");
            System.out.println(Ex);
        }
    }

    public void deleteMember(int id){
        String sql="DELETE FROM MEMBER WHERE id_member = '" +id+"'";
        System.out.println("Delete Kategori ");
        try{
            Statement statement=c.createStatement();
            int result=statement.executeUpdate(sql);
            System.out.println("Delete"+result+"Member\n");
            statement.close();
        }
        catch(Exception Ex){
            System.out.println("Error deleting a member...\n");
            System.out.println(Ex);
        }
    }
    
    public void updateMember(Member member,int id){
        String sql = "Update Member Set "
                + "nama_member='"+member.getNama_member()+"',"
                + " alamat='"+member.getAlamat()+"',"
                + " notelp='"+member.getNo_tlpn()+"' "
                + "where id_member='"+id+"'";
         try{
            Statement statement=c.createStatement();
            int result=statement.executeUpdate(sql);
            statement.close();
        }
        catch(Exception Ex){
            System.out.println("Gagal update Member \n");
            System.out.println(Ex);
        }
    }
    
// </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="DAO_KATEGORI">
    
    public void deleteKategori(int id){
        String sql="DELETE FROM Kategori_barang WHERE id_kategori = '" +id+"'";
        System.out.println("Delete Kategori ");
        try{
            Statement statement=c.createStatement();
            int result=statement.executeUpdate(sql);
            System.out.println("Delete"+result+"Kategori\n");
            statement.close();
        }
        catch(Exception Ex){
            System.out.println("Error deleting a barang...\n");
            System.out.println(Ex);
        }
    }
    
    public void insertKategoriBarang(Kategori_Barang Kategori){
        String sql = "insert into KATEGORI_BARANG(nama_kategori,deskripsi) values('"+Kategori.getNama_kategori()+"','"+Kategori.getDeskripsi()+"')";
         try{
            Statement statement=c.createStatement();
            int result=statement.executeUpdate(sql);
            statement.close();
        }
        catch(Exception Ex){
            System.out.println("Gagal menambah Kategori \n");
            System.out.println(Ex);
        }
    }
    
    public void updateKategoriBarang(Kategori_Barang Kategori,int id){
        String sql = "Update KATEGORI_BARANG Set "
                + "nama_kategori='"+Kategori.getNama_kategori()+"',"
                + " deskripsi='"+Kategori.getDeskripsi()+"' "
                + "where id_kategori='"+id+"'";
         try{
            Statement statement=c.createStatement();
            int result=statement.executeUpdate(sql);
            statement.close();
        }
        catch(Exception Ex){
            System.out.println("Gagal update Kategori \n");
            System.out.println(Ex);
        }
    }
    
    public List<Kategori_Barang> getKategoriBarang(){
        String sql = "select id_kategori,nama_kategori,deskripsi from kategori_barang";
        List<Kategori_Barang> list = new ArrayList<Kategori_Barang>();
        try{
            Statement state = c.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs!=null){
                while (rs.next()){
                    Kategori_Barang b = new Kategori_Barang(rs.getInt("id_kategori"), 
                            rs.getString("nama_kategori"), rs.getString("deskripsi"));
                    list.add(b);
                }
            }
            rs.close();
            state.close();
        }catch(Exception EX){
            System.out.println("Error Reading From database. . .");
            System.out.println(EX);
        }
        
        return list;
    }
    
    public List<Kategori_Barang> searchKategoriBarang(String key){
        String sql = "select id_kategori,nama_kategori,deskripsi from kategori_barang where "
                + "id_kategori like '%"+key+"%' or "
                + "nama_kategori like '%"+key+"%' or "
                + "deskripsi  like '%"+key+"%' ";
        List<Kategori_Barang> list = new ArrayList<Kategori_Barang>();
        try{
            Statement state = c.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs!=null){
                while (rs.next()){
                    Kategori_Barang b = new Kategori_Barang(rs.getInt("id_kategori"), 
                            rs.getString("nama_kategori"), rs.getString("deskripsi"));
                    list.add(b);
                }
            }
            rs.close();
            state.close();
        }catch(Exception EX){
            System.out.println("Error Reading From database. . .");
            System.out.println(EX);
        }
        
        return list;
    }
    
    public int getIdKategori(String nama){
        int temp=-1;
        String sql = "select id_kategori from kategori_barang where nama_kategori='"+nama+"'";
        try{
            Statement state = c.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs!=null){
                while (rs.next()){
                    temp= rs.getInt("id_kategori");
                }
            }
            rs.close();
            state.close();
        }catch(Exception EX){
            System.out.println("Error Reading From database. . .");
            System.out.println(EX);
        }
        
        return temp;
        
    }
// </editor-fold>     
    
    // <editor-fold defaultstate="collapsed" desc="DAO_SUPPLIER">    
    
    public void insertSupplier(Supplier  sup){
        String sql="INSERT INTO Supplier(NAMA_SUPPLIER,ALAMAT,NOTELP) VALUES('"+sup.getNama_supplier()+"','"+sup.getAlamat()+"','"+sup.getNo_tlpn()+"')";
        System.out.println("Tambah Supplier");
        try{
            Statement statement=c.createStatement();
            int result=statement.executeUpdate(sql);
            System.out.println("Tambah"+result+"Supplier\n");
            statement.close();
        }
        catch(Exception Ex){
            System.out.println("Gagal menambah Supplier \n");
            System.out.println(Ex);
        }
    }
    
     public void editSupplier(Supplier sup,String id_sup){
        String sql="UPDATE SUPPLIER SET NAMA_SUPPLIER='"+sup.getNama_supplier()+"',ALAMAT='"+sup.getAlamat()+"',NOTELP='"+sup.getNo_tlpn()+"' where ID_SUPPLIER='" +id_sup+"'";
        System.out.println("Edit Supplier");
        try{
            Statement statement=c.createStatement();
            int result=statement.executeUpdate(sql);
            System.out.println("Edit"+result+"Supplier\n"+id_sup);
            statement.close();
        }
        catch(Exception Ex){
            System.out.println("Error edit a Supplier...\n");
            System.out.println(Ex);
        }
    }
     
     public void deleteSupplier(String id_sup){
        String sql="DELETE FROM SUPPLIER WHERE ID_SUPPLIER = '" +id_sup+"'";
        System.out.println("Delete SUpplier ");
        try{
            Statement statement=c.createStatement();
            int result=statement.executeUpdate(sql);
            System.out.println("Delete"+result+"Supplier\n");
            statement.close();
        }
        catch(Exception Ex){
            System.out.println("Error deleting a Supplier...\n");
            System.out.println(Ex);
        }
     }
        
        public List <Supplier> showSearchSupplier(String Search){
        String sql="SELECT ID_SUPPLIER,NAMA_SUPPLIER,ALAMAT,NOTELP FROM SUPPLIER  WHERE (NAMA_SUPPLIER Like '%"+Search+"%') OR (ALAMAT Like '%"+ Search +"%') OR (NOTELP Like '%"+ Search +"%')";
        System.out.println("Daftar Supplier...");
        List <Supplier> list=new ArrayList<Supplier>();
        try{
            Statement statement=c.createStatement();
            ResultSet rs2=statement.executeQuery(sql);
            if(rs2!=null){
                while(rs2.next()){
                    Supplier sup= new Supplier(rs2.getInt("ID_SUPPLIER"),rs2.getString("NAMA_SUPPLIER"),rs2.getString("ALAMAT"),rs2.getString("NOTELP"));
                    list.add(sup);
                }
            }
            rs2.close();
            statement.close();

        }
        catch(Exception Ex){
            System.out.println("Error reading database information...\n");
            System.out.println(Ex);
        }
         return list;
    }
    
    public List<Supplier> getSupplier(){
        String sql = "select id_supplier,nama_supplier,alamat,notelp from supplier";
        List<Supplier> list = new ArrayList<Supplier>();
        try{
            Statement state = c.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs!=null){
                while (rs.next()){
                    Supplier b = new Supplier(rs.getInt("id_supplier"), 
                            rs.getString("nama_supplier"),
                            rs.getString("alamat"),
                            rs.getString("notelp"));
                    list.add(b);
                }
            }
            rs.close();
            state.close();
        }catch(Exception EX){
            System.out.println("Error Reading From database. . .");
            System.out.println(EX);
        }
        
        return list;
    }
    
        public int getIdSupplier(String nama){
        int temp=-1;
        String sql = "select id_supplier from supplier where nama_supplier='"+nama+"'";
        try{
            Statement state = c.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs!=null){
                while (rs.next()){
                    temp= rs.getInt("id_supplier");
                }
            }
            rs.close();
            state.close();
        }catch(Exception EX){
            System.out.println("Error Reading From database. . .");
            System.out.println(EX);
        }
        
        return temp;
        
    }
// </editor-fold>     
    
    // <editor-fold defaultstate="collapsed" desc="DAO_TRANSAKSI">
   /* public List<Manager> getTransaksi(){
        String sql = "select id_transaksi, id_barang,id_member,id_pegawai,kuantitas,tanggal_transaksi,total_harga from transaksi join barang on transkasi.id_barang=barang.id_baran ";
        List<Manager> list = new ArrayList<Manager>();
        try{
            Statement state = c.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs!=null){
                while (rs.next()){
                    Manager pegawai = new Manager(rs.getInt("id_pegawai"), 
                            rs.getInt("id_role"), rs.getInt("id_user"),
                            rs.getDouble("salary"), rs.getString("nama"),rs.getString("jenis_Kelamin"),
                            rs.getString("alamat"), rs.getString("tgl_diangkat"), rs.getString("notelp"),rs.getDouble("bonus"));
                    list.add(pegawai);
                }
            }
            rs.close();
            state.close();
        }catch(Exception EX){
            System.out.println("Error Reading From database. . .");
            System.out.println(EX);
        }
        
        return list;
    }*/
        
// </editor-fold>  
        
}

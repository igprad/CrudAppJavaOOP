/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelTabel;

import Models.Member;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Aldi
 */
public class ModelMember extends AbstractTableModel{

   private List<Member> list;
    
    public ModelMember(List<Member> list){
        this.list=list;
    }       

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId_member();
            case 1:
                return list.get(rowIndex).getNama_member();
            case 2:
                return list.get(rowIndex).getAlamat();
            case 3:
                return list.get(rowIndex).getNo_tlpn();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
       switch(column){
            case 0:
                return "ID Member";
            case 1:
                return "Nama";
            case 2:
                return "Alamat";
            case 3:
                return "No Telp";
            default:
                return null;
        }
    }
    
}

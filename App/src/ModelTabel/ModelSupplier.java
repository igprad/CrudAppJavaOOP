/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelTabel;
import Models.Supplier;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author SGT
 */
public class ModelSupplier extends AbstractTableModel{
    
    private List<Supplier> list;
    
    public ModelSupplier(List<Supplier> list)
    {
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
                return list.get(rowIndex).getId_supplier();
            case 1:
                return list.get(rowIndex).getNama_supplier();
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
                return "ID Supplier";
            case 1:
                return "Nama Supplier";
            case 2:
                return "Alamat";
            case 3:
                return "NoTelp";
            default:
                return null;
        }
    }
}

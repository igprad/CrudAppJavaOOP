/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelTabel;

import Models.Barang;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Aldi
 */
public class ModelBarang extends AbstractTableModel
{
    private List<Barang> list;
    
    public ModelBarang(List<Barang> list){
        this.list=list;
    }       

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId_barang();
            case 1:
                return list.get(rowIndex).getNama_barang();
            case 2:
                return list.get(rowIndex).getStock();
            case 3:
                return list.get(rowIndex).getHarga();
            case 4:
                return list.get(rowIndex).getNama_kategori();
            case 5:
                return list.get(rowIndex).getNama_supplier();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
       switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "Stok";
            case 3:
                return "Harga";
            case 4:
                return "Kategori";
            case 5:
                return "Supplier";
            default:
                return null;
        }
    }
    
    
}

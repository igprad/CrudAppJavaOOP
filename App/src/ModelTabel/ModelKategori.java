/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelTabel;

import Models.Kategori_Barang;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Aldi
 */
public class ModelKategori extends AbstractTableModel{

    private List<Kategori_Barang> list;
    
    public ModelKategori(List<Kategori_Barang> list){
        this.list=list;
    }       

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId_kategori();
            case 1:
                return list.get(rowIndex).getNama_kategori();
            case 2:
                return list.get(rowIndex).getDeskripsi();

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
                return "Nama Kategori";
            case 2:
                return "Deskripsi";
            default:
                return null;
        }
    }
    
}

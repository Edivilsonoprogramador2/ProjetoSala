/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.Pedidos;
import bean.PedidosProdutos;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author edivi
 */
public class Pedidos_Controler extends AbstractTableModel {

    private SimpleDateFormat dtnFormat = new SimpleDateFormat("dd/MM/yyyy");
    private List listaPedidos;

    @Override
    public int getRowCount() {
        return listaPedidos.size();
    }

    public void setLista(List lista) {
        this.listaPedidos = lista;
    }

    public Pedidos getBean(int rowIndex) {
        Pedidos pedidos = (Pedidos) listaPedidos.get(rowIndex);
        return pedidos;
    }
    
    public void addBean(PedidosProdutos obj){
        this.listaPedidos.add(obj);
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pedidos pedidos = (Pedidos) getBean(rowIndex);
        if (columnIndex == 0) {
            return pedidos.getIdpedidos();
        } else if (columnIndex == 1) {
            return pedidos.getClientes().getNome();
        } else if (columnIndex == 2) {
            return pedidos.getVendedor();
        } else if (columnIndex == 3) {
            return pedidos.getTotal();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Cliente";
        } else if (columnIndex == 2) {
            return "Vendedor";
        } else if (columnIndex == 3) {
            return "Total";
        }
        return "";
    }
}

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
public class Pedidos_Produto_Controler extends AbstractTableModel {

    private SimpleDateFormat dtnFormat = new SimpleDateFormat("dd/MM/yyyy");
    private List listaPedidos;

    @Override
    public int getRowCount() {
        return listaPedidos.size();
    }

    public void setLista(List lista) {
        this.listaPedidos = lista;
    }

    public PedidosProdutos getBean(int rowIndex) {
        PedidosProdutos pedidosProdutos = (PedidosProdutos) listaPedidos.get(rowIndex);
        return pedidosProdutos;
    }
    
    public void addBean(PedidosProdutos obj){
        this.listaPedidos.add(obj);
        this.fireTableDataChanged();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PedidosProdutos pedidosProdutos = (PedidosProdutos) getBean(rowIndex);
        if (columnIndex == 0) {
            return pedidosProdutos.getIdpedidosProdutos();
        } else if (columnIndex == 1) {
            return pedidosProdutos.getProdutos().getNome();
        } else if (columnIndex == 2) {
            return pedidosProdutos.getQuantidade();
        } else if (columnIndex == 3) {
            return pedidosProdutos.getValorUnitario();
        } else if (columnIndex == 4) {
            return pedidosProdutos.getValorUnitario() * pedidosProdutos.getQuantidade();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Produto";
        } else if (columnIndex == 2) {
            return "Quantidade";
        } else if (columnIndex == 3) {
            return "Valor Unitário";
        } else if (columnIndex == 4) {
            return "Total";
        }
        return "";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.Usuarios;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author edivi
 */
public class Usuarios_Controler extends AbstractTableModel {

    private SimpleDateFormat dtnFormat = new SimpleDateFormat("dd/MM/yyyy");
    private List listaUsuarios;

    @Override
    public int getRowCount() {
        return listaUsuarios.size();
    }

    public void setLista(List lista) {
        this.listaUsuarios = lista;
    }

    public Usuarios getBean(int rowIndex) {
        Usuarios usuario = (Usuarios) listaUsuarios.get(rowIndex);
        System.out.println(usuario.getNome());
        return usuario;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuarios usuarios = (Usuarios) getBean(rowIndex);
        if (columnIndex == 0) {
            return usuarios.getIdusuarios();
        } else if (columnIndex == 1) {
            return usuarios.getNome();
        } else if (columnIndex == 2) {
            return usuarios.getCpf();
        } else if (columnIndex == 3) {
            return dtnFormat.format(usuarios.getDataNascimento());
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Nome";
        } else if (columnIndex == 2) {
            return "CPF";
        } else if (columnIndex == 3) {
            return "Data de nascimento";
        }
        return "";
    }
}

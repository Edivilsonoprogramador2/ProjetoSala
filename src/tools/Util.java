/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author u08852060103
 */
public class Util {

    public static void habilitar(boolean ativo, JComponent... comp) {

        for (int i = 0; i < comp.length; i++) {
            comp[i].setEnabled(ativo);
        }

    }

    public static void limpar(JComponent... comp) {
        for (int i = 0; i < comp.length; i++) {
            if (comp[i] instanceof JTextField) {
                ((JTextField) comp[i]).setText("");
            } else if (comp[i] instanceof JComboBox) {
                ((JComboBox) comp[i]).setSelectedIndex(-1);
            } else if (comp[i] instanceof JTextField) {
                ((JPasswordField) comp[i]).setText("");
            }
        }
    }
    
     public static boolean perguntar(String mensagem, String titulo) {
        int option = JOptionPane.showConfirmDialog(null, mensagem, titulo, JOptionPane.YES_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            return true;
        }
        return false;
    }

    public static int strToInt(String value) {
        return Integer.valueOf(value);
    }

    public static double strToDouble(String value) {
        return Double.valueOf(value);
    }

    public static Date strToDate(String cad) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return format.parse(cad);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Formato de data inválido. Use dd/MM/yyyy.", e);
        }
    }

    public static String intToStr(int num) {
        return String.valueOf(num);
    }

    public static String doubleToStr(double num) {
        return Double.toString(num);
    }

    public static String dateToStr(Date data) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(data);
    }

}

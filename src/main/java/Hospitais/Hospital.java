package Hospitais;


import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Hospital {

    public static void carregarHospitais(JTable tabela) {

        DefaultTableModel model =
                (DefaultTableModel)
                tabela.getModel();

        // Limpa tabela
        model.setRowCount(0);

        // Adiciona hospitais
        model.addRow(new Object[]{
                "Hospital São Lucas",
                "0.8 km"
        });

        model.addRow(new Object[]{
                "Hospital Santa Maria",
                "1.5 km"
        });

        model.addRow(new Object[]{
                "Hospital Central",
                "3.2 km"
        });
    }
}
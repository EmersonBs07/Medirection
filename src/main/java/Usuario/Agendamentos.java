package Usuario;

import ApiVoz.Acessibilidade;
import DAO.DAOusuario;
import java.awt.Image;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Agendamentos extends javax.swing.JFrame {
    
    public Agendamentos() {
        initComponents();
        
        Acessibilidade.adicionarLeitura(txtBuscarCpf,"Digite seu CPF");
        Acessibilidade.adicionarLeitura(bntBuscar,"Buscar");
        Acessibilidade.adicionarLeitura(bntExcluir,"Excluir agendamento");
        Acessibilidade.adicionarLeitura(bntVoltar,"Botão voltar");
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/Agenda.jpg"));

     Image img = icon.getImage().getScaledInstance(labelFundo.getWidth(), labelFundo.getHeight(),Image.SCALE_SMOOTH);

    labelFundo.setIcon(new ImageIcon(img));
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAgendamentos = new javax.swing.JTable();
        txtBuscarCpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bntBuscar = new javax.swing.JButton();
        bntVoltar = new javax.swing.JButton();
        bntExcluir = new javax.swing.JButton();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital", "Data", "Horario", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaAgendamentos.setToolTipText("");
        jScrollPane1.setViewportView(tabelaAgendamentos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 530, 230));

        txtBuscarCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscarCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 190, 30));

        jLabel1.setText("Digite seu CPF");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        bntBuscar.setText("Buscar");
        bntBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(bntBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 90, -1));

        bntVoltar.setText("Voltar");
        bntVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(bntVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 170, 40));

        bntExcluir.setText("Excluir");
        bntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(bntExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 130, 40));

        labelFundo.setBackground(new java.awt.Color(153, 204, 255));
        labelFundo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(labelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCpfActionPerformed

    private void bntBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarActionPerformed

    String cpf = txtBuscarCpf.getText();
    
    try {
        DAOusuario dao = new DAOusuario();

        ResultSet rs = dao.buscar(cpf);

        DefaultTableModel modelo = (DefaultTableModel) tabelaAgendamentos.getModel();

        modelo.setRowCount(0);

        while (rs.next()) {

        modelo.addRow(new Object[]{

    rs.getString("hospital"),
    rs.getString("data_agendada"),
    rs.getString("horario"),
    rs.getString("cpf")});
    }

    } catch (Exception e) {

      e.printStackTrace();
    }

    }//GEN-LAST:event_bntBuscarActionPerformed

    private void bntVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVoltarActionPerformed
        Interface telaSec = new Interface();
        telaSec.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_bntVoltarActionPerformed

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed
   
        String cpf = txtBuscarCpf.getText();

    try {

        DAOusuario dao = new DAOusuario();
        dao.excluir(cpf);

        JOptionPane.showMessageDialog(null, "Agendamento excluído!");

    } catch (Exception e) {

        JOptionPane.showMessageDialog(null, "Não foi possível excluir!");

        e.printStackTrace();
    }
    }//GEN-LAST:event_bntExcluirActionPerformed

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agendamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBuscar;
    private javax.swing.JButton bntExcluir;
    private javax.swing.JButton bntVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JTable tabelaAgendamentos;
    private javax.swing.JTextField txtBuscarCpf;
    // End of variables declaration//GEN-END:variables
}

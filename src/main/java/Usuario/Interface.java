package Usuario;
import ApiVoz.Acessibilidade;
import Hospitais.Hospital;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
        
        Acessibilidade.adicionarLeitura(BotaoBuscar,"Buscar Hospitais");
        Acessibilidade.adicionarLeitura(BntAgendar,"Agendar Consulta");
        Acessibilidade.adicionarLeitura(BntVer,"Ver agendamentos");
        Acessibilidade.adicionarLeitura(BntExcluir,"Chamada de video");
        
        
         ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/Layout.jpg"));
         Image img = icon.getImage().getScaledInstance(
                    Layout.getWidth(),
                    Layout.getHeight(),
                    Image.SCALE_SMOOTH);

    Layout.setIcon(new ImageIcon(img));
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaHospitais = new javax.swing.JTable();
        BotaoBuscar = new javax.swing.JButton();
        BntVer = new javax.swing.JButton();
        BntAgendar = new javax.swing.JButton();
        BntExcluir = new javax.swing.JButton();
        Layout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaHospitais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Hospital", "Distancia "
            }
        ));
        jScrollPane1.setViewportView(tabelaHospitais);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 380, 250));

        BotaoBuscar.setText("Buscar Hospitais");
        BotaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 200, -1));

        BntVer.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        BntVer.setForeground(new java.awt.Color(0, 0, 0));
        BntVer.setText("Ver agendamentos                 >");
        BntVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntVerActionPerformed(evt);
            }
        });
        getContentPane().add(BntVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 290, 60));

        BntAgendar.setBackground(new java.awt.Color(0, 102, 51));
        BntAgendar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BntAgendar.setForeground(new java.awt.Color(255, 255, 255));
        BntAgendar.setText("Agendar consulta                     >");
        BntAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(BntAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 290, 50));

        BntExcluir.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        BntExcluir.setForeground(new java.awt.Color(0, 0, 0));
        BntExcluir.setText("Chamada de video              >");
        BntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(BntExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 320, 50));

        Layout.setBackground(new java.awt.Color(255, 255, 255));
        Layout.setOpaque(true);
        getContentPane().add(Layout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscarActionPerformed
        Hospital.carregarHospitais(tabelaHospitais);
  
    }//GEN-LAST:event_BotaoBuscarActionPerformed

    private void BntAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntAgendarActionPerformed
   Agendar telaSec = new Agendar();
   telaSec.setVisible(true);
   this.dispose();    }//GEN-LAST:event_BntAgendarActionPerformed

    private void BntVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntVerActionPerformed
   Agendamentos telaSec = new Agendamentos();
   telaSec.setVisible(true);
   this.dispose();    }//GEN-LAST:event_BntVerActionPerformed

    private void BntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntExcluirActionPerformed
   
     }//GEN-LAST:event_BntExcluirActionPerformed

  
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BntAgendar;
    private javax.swing.JButton BntExcluir;
    private javax.swing.JButton BntVer;
    private javax.swing.JButton BotaoBuscar;
    private javax.swing.JLabel Layout;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaHospitais;
    // End of variables declaration//GEN-END:variables
}

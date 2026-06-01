package Usuario;

import ApiVoz.Acessibilidade;
import DAO.DAOusuario;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CadastrarUsuario extends javax.swing.JFrame {

    public CadastrarUsuario() {
        
        initComponents();
        Acessibilidade.adicionarLeitura(bntVoltar,"Botão Voltar");
        Acessibilidade.adicionarLeitura(bntConfirmar,"Botão Confirmar");
        Acessibilidade.adicionarLeitura(comboDeficiencia,"Diga sua deficiência");
        Acessibilidade.adicionarLeitura(campoSenha,"Digite sua senha");
        Acessibilidade.adicionarLeitura(campoEmail,"Digite seu email");
        Acessibilidade.adicionarLeitura(campoNome,"Digite seu nome completo");
        
        
      ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/FundoMe.jpg"));
      Image img =icon.getImage().getScaledInstance(
                    labelFundo.getWidth(),
                    labelFundo.getHeight(),
                    Image.SCALE_SMOOTH);

    labelFundo.setIcon(new ImageIcon(img));
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        comboDeficiencia = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        campoSenha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bntConfirmar = new javax.swing.JButton();
        bntVoltar = new javax.swing.JButton();
        labelFundo = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboDeficiencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deficiencia Fisica", "Deficiencia Visual", "Deficiencia Auditiva", "Transtorno do Espectro Autista", " " }));
        comboDeficiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Especifque o tipo de deficiência"));
        comboDeficiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDeficienciaActionPerformed(evt);
            }
        });
        jPanel1.add(comboDeficiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 260, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel1.setText("Crie sua Conta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1142, 411, 161, 0));
        jPanel1.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 260, 40));

        jLabel3.setText("Nome Completo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 60));
        jPanel1.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 260, 40));

        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 260, 40));

        jLabel4.setText("Endereço de E-mail");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 50));

        jLabel5.setText("Senha");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 20));

        bntConfirmar.setBackground(new java.awt.Color(0, 153, 0));
        bntConfirmar.setText("Confirmar");
        bntConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(bntConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 300, 50));

        bntVoltar.setBackground(new java.awt.Color(0, 153, 0));
        bntVoltar.setText("Voltar");
        bntVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(bntVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 300, 50));

        labelFundo.setBackground(new java.awt.Color(255, 255, 255));
        labelFundo.setForeground(new java.awt.Color(255, 255, 255));
        labelFundo.setAutoscrolls(true);
        labelFundo.setOpaque(true);
        labelFundo.setPreferredSize(new java.awt.Dimension(350, 600));
        jPanel1.add(labelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 380, 670));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 1187, 56, 27));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboDeficienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDeficienciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDeficienciaActionPerformed

    private void bntConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntConfirmarActionPerformed
                                                                               
    try {
        String nome = campoNome.getText();
        String email = campoEmail.getText();
        String senha = campoSenha.getText();
        String deficiencia = comboDeficiencia.getSelectedItem().toString();

        Usuario usuario = new Usuario(nome, email, senha, deficiencia);
        
        DAOusuario dao = new DAOusuario();

        dao.cadastrarUsuario(usuario);

        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
    }
    }//GEN-LAST:event_bntConfirmarActionPerformed

    private void bntVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVoltarActionPerformed
   Login telaSec = new Login();
   telaSec.setVisible(true);
   this.dispose();
    }//GEN-LAST:event_bntVoltarActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntConfirmar;
    private javax.swing.JButton bntVoltar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JComboBox<String> comboDeficiencia;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel labelFundo;
    // End of variables declaration//GEN-END:variables

}

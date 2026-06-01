package Usuario;

import ApiVoz.Acessibilidade;
import ApiVoz.assistenteVoz;
import DAO.DAOusuario;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

 
  public Login() {
    initComponents();

    Acessibilidade.adicionarLeitura(bntEntrar,"Entrar");
    Acessibilidade.adicionarLeitura(BntCadastrar,"Cadastrar-se");
    Acessibilidade.adicionarLeitura(campoEmail,"Digite seu Email");
    Acessibilidade.adicionarLeitura(campoSenha,"Digite sua senha");
    
         ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/FundoLogin.jpg"));
         Image img = icon.getImage().getScaledInstance(
                    labelFundo1.getWidth(),
                    labelFundo1.getHeight(),
                    Image.SCALE_SMOOTH);

    labelFundo1.setIcon(new ImageIcon(img));
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoEmail = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        BntCadastrar = new javax.swing.JButton();
        bntEntrar = new javax.swing.JButton();
        labelFundo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 240, 40));

        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 210, 40));

        BntCadastrar.setForeground(new java.awt.Color(0, 153, 0));
        BntCadastrar.setText("Cadastrar-se");
        BntCadastrar.setBorder(null);
        BntCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(BntCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 90, 20));

        bntEntrar.setBackground(new java.awt.Color(0, 51, 255));
        bntEntrar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        bntEntrar.setForeground(new java.awt.Color(255, 255, 255));
        bntEntrar.setText("Entrar");
        bntEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(bntEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 270, 50));

        labelFundo1.setBackground(new java.awt.Color(255, 255, 255));
        labelFundo1.setOpaque(true);
        labelFundo1.setPreferredSize(new java.awt.Dimension(350, 600));
        getContentPane().add(labelFundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 321, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEntrarActionPerformed
     String email = campoEmail.getText().trim();
     String senha = new String(campoSenha.getPassword()).trim();

        
      
try {
    Usuario usuario = new Usuario(email, senha);
    DAOusuario dao = new DAOusuario();

    if (dao.existe(usuario)) {

        JOptionPane.showMessageDialog(null, "Bem-vindo!");

       
        new Interface().setVisible(true);

        this.dispose();

    } else {
        JOptionPane.showMessageDialog(null, "Usuário inválido");
    }

} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
}
      assistenteVoz.falar("Bem Vindo");
     
      
    }//GEN-LAST:event_bntEntrarActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void BntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntCadastrarActionPerformed
   CadastrarUsuario telaSec = new CadastrarUsuario();
   telaSec.setVisible(true);
   this.dispose();
    }//GEN-LAST:event_BntCadastrarActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BntCadastrar;
    private javax.swing.JButton bntEntrar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel labelFundo1;
    // End of variables declaration//GEN-END:variables
}

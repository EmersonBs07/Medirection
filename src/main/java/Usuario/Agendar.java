package Usuario;

import ApiVoz.Acessibilidade;
import DAO.DAOusuario;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Agendar extends javax.swing.JFrame {

   
    public Agendar() {
        initComponents();
        
        Acessibilidade.adicionarLeitura(calendario,"Escolha sua data");
        Acessibilidade.adicionarLeitura(comboHospital,"Escolha seu hospital de preferencia");
        Acessibilidade.adicionarLeitura(comboHorario,"Escolha seu horario");
        Acessibilidade.adicionarLeitura(bntAgendar,"Agendar consulta");
        Acessibilidade.adicionarLeitura(bntVoltar,"Botão voltar");
        Acessibilidade.adicionarLeitura(txtCpf,"Digite seu CPF");

        
        
            
         ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/Agenda.jpg"));

     Image img = icon.getImage().getScaledInstance(
                    FundoAgenda.getWidth(),
                    FundoAgenda.getHeight(),
                    Image.SCALE_SMOOTH);

    FundoAgenda.setIcon(new ImageIcon(img));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calendario = new com.toedter.calendar.JCalendar();
        comboHospital = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        comboHorario = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        bntAgendar = new javax.swing.JButton();
        bntVoltar = new javax.swing.JButton();
        txtCpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FundoAgenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calendario.setDecorationBackgroundColor(new java.awt.Color(51, 153, 0));
        calendario.setDecorationBackgroundVisible(false);
        calendario.setDoubleBuffered(false);
        calendario.setFocusable(false);
        calendario.setOpaque(false);
        calendario.setSundayForeground(new java.awt.Color(51, 153, 0));
        calendario.setWeekOfYearVisible(false);
        calendario.setWeekdayForeground(new java.awt.Color(51, 153, 0));
        getContentPane().add(calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        comboHospital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hospital São Lucas", "Hospital Santa Maria", "Hospital Central" }));
        comboHospital.setToolTipText("");
        comboHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHospitalActionPerformed(evt);
            }
        });
        getContentPane().add(comboHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        jLabel1.setText("Escolha o hospital");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        comboHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "00:00" }));
        getContentPane().add(comboHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 110, -1));

        jLabel2.setText("Escolha o horario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        bntAgendar.setText("Agendar");
        bntAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(bntAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 600, -1, -1));

        bntVoltar.setText("Voltar");
        bntVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(bntVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, -1, -1));
        getContentPane().add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 150, -1));

        jLabel3.setText("Digite seu CPF");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));

        FundoAgenda.setBackground(new java.awt.Color(255, 255, 255));
        FundoAgenda.setForeground(new java.awt.Color(255, 255, 255));
        FundoAgenda.setOpaque(true);
        getContentPane().add(FundoAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHospitalActionPerformed
      String valor = comboHospital.getSelectedItem().toString();      }//GEN-LAST:event_comboHospitalActionPerformed

    private void bntAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAgendarActionPerformed

  String hospital = comboHospital.getSelectedItem().toString();
  String horario = comboHorario.getSelectedItem().toString();
  Date data = calendario.getDate();
  String cpf = txtCpf.getText();
  
  SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
  String dataTexto = formato.format(data);

try {
    DAOusuario dao = new DAOusuario();
    dao.salvar(hospital, horario, dataTexto,cpf);

    JOptionPane.showMessageDialog(null,"Agendado com sucesso!");
    
} catch (Exception e) {

    JOptionPane.showMessageDialog(null,"Erro ao agendar!");
    e.printStackTrace();
}
    }//GEN-LAST:event_bntAgendarActionPerformed

    private void bntVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVoltarActionPerformed
   Interface telaSec = new Interface();
   telaSec.setVisible(true);
   this.dispose();
    }//GEN-LAST:event_bntVoltarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FundoAgenda;
    private javax.swing.JButton bntAgendar;
    private javax.swing.JButton bntVoltar;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JComboBox<String> comboHorario;
    private javax.swing.JComboBox<String> comboHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCpf;
    // End of variables declaration//GEN-END:variables
}
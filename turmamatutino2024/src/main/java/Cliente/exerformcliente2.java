/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cliente;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class exerformcliente2 extends javax.swing.JFrame {

    /**
     * Creates new form exerformcliente2
     */
    public exerformcliente2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtfNome = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        lbCpf = new javax.swing.JLabel();
        txtfCpf = new javax.swing.JTextField();
        lbEndereco = new javax.swing.JLabel();
        txtfEndereco = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        txtfTelefone = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txtfEmail = new javax.swing.JTextField();
        lbDatadenascimento = new javax.swing.JLabel();
        txtfDatadenascimento = new javax.swing.JTextField();
        lbSexo = new javax.swing.JLabel();
        txtfSexo = new javax.swing.JTextField();
        lbEstadoCivil = new javax.swing.JLabel();
        txtfEstadoCivil = new javax.swing.JTextField();
        lbProfissao = new javax.swing.JLabel();
        txtfProfissao = new javax.swing.JTextField();
        btndelete = new javax.swing.JButton();
        btnlimpar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtcodcliente = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNome.setText("nome");

        lbCpf.setText("cpf");

        lbEndereco.setText("Endereço");

        txtfEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfEnderecoActionPerformed(evt);
            }
        });

        lbTelefone.setText("telefone");

        lbEmail.setText("Email");

        lbDatadenascimento.setText("Data de Nascimento");

        lbSexo.setText("Sexo");

        txtfSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfSexoActionPerformed(evt);
            }
        });

        lbEstadoCivil.setText("Estado Civil");

        lbProfissao.setText("Profissão");

        btndelete.setText("delete");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCpf)
                            .addComponent(lbNome)
                            .addComponent(lbEndereco)
                            .addComponent(lbTelefone)
                            .addComponent(lbEmail)
                            .addComponent(lbDatadenascimento)
                            .addComponent(lbSexo)
                            .addComponent(lbEstadoCivil)
                            .addComponent(lbProfissao))))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfNome)
                    .addComponent(txtfCpf)
                    .addComponent(txtfEndereco)
                    .addComponent(txtfTelefone)
                    .addComponent(txtfEmail)
                    .addComponent(txtfDatadenascimento)
                    .addComponent(txtfSexo, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(txtfEstadoCivil)
                    .addComponent(txtfProfissao, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btndelete)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCpf)
                    .addComponent(txtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEndereco)
                    .addComponent(txtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone)
                    .addComponent(txtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(txtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDatadenascimento)
                    .addComponent(txtfDatadenascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSexo)
                    .addComponent(txtfSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstadoCivil)
                    .addComponent(txtfEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProfissao)
                    .addComponent(txtfProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnlimpar.setText("limpar");
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });

        btnmostrar.setText("mostrar");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        jLabel2.setText("codigo");

        btnAtualizar.setText("Atualizar");

        jMenu1.setText("relatorio");

        jMenuItem1.setText("dados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGravar)
                .addGap(37, 37, 37)
                .addComponent(btnmostrar)
                .addGap(18, 18, 18)
                .addComponent(btnlimpar)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtcodcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcodcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlimpar)
                    .addComponent(btnmostrar)
                    .addComponent(btnGravar)
                    .addComponent(btnAtualizar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfEnderecoActionPerformed

    private void txtfSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfSexoActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
       cliente c = this.montarcliente();
       JOptionPane.showMessageDialog(null,"nome: "+c.getNome()+"\nCpf: "+c.getCpf()+
               "\nEndereco: "+c.getEndereco()+"\nTelefone: "+c.getTelefone()+"\nEmail: "+c.getEmail()+
               "\nDataNASC: "+c.getDataNASC()+"+\nSexo: "+c.getSexo()+"\nEstado civil: "+c.getEstadoC()+
               "+\nprofissao: "+c.getProfissao());
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnlimparActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
       clientecontrole c = new clientecontrole();
       cliente cl = this.montarcliente();
       c.insert(cl);
    }//GEN-LAST:event_btnGravarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          clientecontrole c = new clientecontrole();
       c.selectAll();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(exerformcliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exerformcliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exerformcliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exerformcliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exerformcliente2().setVisible(true);
            }
        });
    }
    
    public cliente montarcliente(){
        cliente c = new cliente();
        c.setNome(txtfNome.getText());
        c.setCpf(txtfCpf.getText());
        c.setEndereco(txtfEndereco.getText());
        c.setTelefone(txtfTelefone.getText());
        c.setEmail(txtfEmail.getText());
        c.setDataNASC(txtfDatadenascimento.getText());
        c.setSexo(txtfSexo.getText());
        c.setEstadoC(txtfEstadoCivil.getText());
        c.setProfissao(txtfProfissao.getText());
        return c; 
    }
    
    public void limpar(){
    txtfCpf.setText("");
    txtfDatadenascimento.setText("");
    txtfEmail.setText("");
    txtfEndereco.setText("");
    txtfEstadoCivil.setText("");
    txtfNome.setText("");
    txtfProfissao.setText("");
    txtfSexo.setText("");
    txtfTelefone.setText("");        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbDatadenascimento;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbEstadoCivil;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbProfissao;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JTextField txtcodcliente;
    private javax.swing.JTextField txtfCpf;
    private javax.swing.JTextField txtfDatadenascimento;
    private javax.swing.JTextField txtfEmail;
    private javax.swing.JTextField txtfEndereco;
    private javax.swing.JTextField txtfEstadoCivil;
    private javax.swing.JTextField txtfNome;
    private javax.swing.JTextField txtfProfissao;
    private javax.swing.JTextField txtfSexo;
    private javax.swing.JTextField txtfTelefone;
    // End of variables declaration//GEN-END:variables
}

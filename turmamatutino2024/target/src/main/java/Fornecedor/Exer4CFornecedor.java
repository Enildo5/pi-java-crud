/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Fornecedor;

import javax.swing.JOptionPane;

/**
 *
 * @author Senac
 */
public class Exer4CFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form Exer4CFornecedor
     */
    public Exer4CFornecedor() {
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
        lbNome = new javax.swing.JLabel();
        txttNome = new javax.swing.JTextField();
        lbCnpj = new javax.swing.JLabel();
        txtfCnpj = new javax.swing.JTextField();
        lbEndereco = new javax.swing.JLabel();
        txtfEndereco = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        txtfTelefone = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txtfEmail = new javax.swing.JTextField();
        lbNomeContato = new javax.swing.JLabel();
        txtfNomeContato = new javax.swing.JTextField();
        lbTiposervico = new javax.swing.JLabel();
        txtfTiposervico = new javax.swing.JTextField();
        lbCondicoesdepagamento = new javax.swing.JLabel();
        txtfCondicoesdepagamento = new javax.swing.JTextField();
        lbPrazoentrega = new javax.swing.JLabel();
        txtfPrazoentrga = new javax.swing.JTextField();
        bntmostrar = new javax.swing.JButton();
        btnlimpar = new javax.swing.JButton();
        btngravar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNome.setText("Nome da Empresa ");

        lbCnpj.setText("Cnpj");

        lbEndereco.setText("Endereço");

        lbTelefone.setText("Telefone");

        lbEmail.setText("Email");

        lbNomeContato.setText("Nome do contato");

        lbTiposervico.setText("Tipo de Produto/Serviço");

        lbCondicoesdepagamento.setText("Condições de pagamento");

        lbPrazoentrega.setText("Prazo de entrega");

        bntmostrar.setText("mostrar");
        bntmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntmostrarActionPerformed(evt);
            }
        });

        btnlimpar.setText("limpar");

        btngravar.setText("gravar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNome)
                    .addComponent(lbCnpj)
                    .addComponent(lbEndereco)
                    .addComponent(lbTelefone)
                    .addComponent(lbEmail)
                    .addComponent(lbNomeContato)
                    .addComponent(lbTiposervico)
                    .addComponent(lbCondicoesdepagamento)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bntmostrar)
                        .addComponent(lbPrazoentrega)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txttNome)
                        .addComponent(txtfCnpj)
                        .addComponent(txtfEndereco)
                        .addComponent(txtfTelefone)
                        .addComponent(txtfEmail)
                        .addComponent(txtfNomeContato)
                        .addComponent(txtfTiposervico)
                        .addComponent(txtfCondicoesdepagamento)
                        .addComponent(txtfPrazoentrga, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnlimpar)
                        .addGap(92, 92, 92)
                        .addComponent(btngravar)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(txttNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbCnpj))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbEndereco)
                    .addComponent(txtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone)
                    .addComponent(txtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmail)
                    .addComponent(txtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNomeContato)
                    .addComponent(txtfNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTiposervico)
                    .addComponent(txtfTiposervico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCondicoesdepagamento)
                    .addComponent(txtfCondicoesdepagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrazoentrega)
                    .addComponent(txtfPrazoentrga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntmostrar)
                    .addComponent(btnlimpar)
                    .addComponent(btngravar))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntmostrarActionPerformed
       fornecedor f = this.montarfornecedor();
       JOptionPane.showMessageDialog(null, "Nome:"+f.getNomecompleto()+"\nCnpj: "+f.getCnpj()+"\nEnderco "+f.getEnderco()
       +"\nEmail: "+f.getEmail()+"\nNomedoContato:"+f.getNomedocontato()+"\nTipoddeproduto: "+f.getTipodeproduto_servico()
       +"\nCondicoesdepagamento: "+f.getCondicoesdepagamento()+"\nPrazodeentrega: "+f.getPrazodeentrega());
    }//GEN-LAST:event_bntmostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Exer4CFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exer4CFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exer4CFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exer4CFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exer4CFornecedor().setVisible(true);
                
            }
        });
    }
    
    public fornecedor montarfornecedor(){
        fornecedor f= new fornecedor();
        f.setNomecompleto(txttNome.getText());
        f.setCnpj(txtfCnpj.getText());
        f.setEnderco(txtfEndereco.getText());
        f.setEmail(txtfEmail.getText());
        f.setNomedocontato(txtfNomeContato.getText());
        f.setTipodeproduto_servico(txtfTiposervico.getText());
        f.setCondicoesdepagamento(txtfCondicoesdepagamento.getText());
        f.setPrazodeentrega(txtfPrazoentrga.getText());
        return f;
    }
      public void limpar(){ 
          txttNome.setText("");
          txtfCnpj.setText("");
          txtfEndereco.setText("");
          txtfEmail.setText("");
          txtfNomeContato.setText("");
          txtfTiposervico.setText("");
          txtfCondicoesdepagamento.setText("");
          txtfPrazoentrga.setText("");
          
     }     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntmostrar;
    private javax.swing.JButton btngravar;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCnpj;
    private javax.swing.JLabel lbCondicoesdepagamento;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNomeContato;
    private javax.swing.JLabel lbPrazoentrega;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTiposervico;
    private javax.swing.JTextField txtfCnpj;
    private javax.swing.JTextField txtfCondicoesdepagamento;
    private javax.swing.JTextField txtfEmail;
    private javax.swing.JTextField txtfEndereco;
    private javax.swing.JTextField txtfNomeContato;
    private javax.swing.JTextField txtfPrazoentrga;
    private javax.swing.JTextField txtfTelefone;
    private javax.swing.JTextField txtfTiposervico;
    private javax.swing.JTextField txttNome;
    // End of variables declaration//GEN-END:variables
}

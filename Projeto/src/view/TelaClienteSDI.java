/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Toolkit;
import Banco.FuncoesBanco;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mode.bean.Veiculo;

/**
 *
 * @author Lucas
 */
public class TelaClienteSDI extends javax.swing.JFrame {

    FuncoesBanco f = new FuncoesBanco();
    String cpf;
    public TelaClienteSDI() {
        this.cpf=cpf;
        initComponents();
        this.setTitle("SMES - StoffMalocoking Enterprise System");
        setIcon();
    }
    public TelaClienteSDI(String cpf) {
        initComponents();
        this.setTitle("SMES - StoffMalocoking Enterprise System");
        setIcon();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextoValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Botao_Buscar = new javax.swing.JButton();
        EscolhaAtributo = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Retornar = new javax.swing.JMenuItem();
        Botao_EditarCliente = new javax.swing.JMenu();
        EditarCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        AlugarVeiculo = new javax.swing.JMenuItem();
        DevolverVeiculo = new javax.swing.JMenuItem();
        Botao_Infor = new javax.swing.JMenu();
        Infor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel4.setText("Cliente");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sem Título-1.png"))); // NOI18N

        TextoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoValorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Busque o veículo mais adequado para você!");

        Botao_Buscar.setText("Buscar");
        Botao_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_BuscarActionPerformed(evt);
            }
        });

        EscolhaAtributo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Placa", "Marca", "Modelo", "Cor" }));
        EscolhaAtributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscolhaAtributoActionPerformed(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/page.png"))); // NOI18N
        jMenu1.setText("Arquivo");

        Retornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/door_out.png"))); // NOI18N
        Retornar.setText("Retornar");
        Retornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetornarActionPerformed(evt);
            }
        });
        jMenu1.add(Retornar);

        jMenuBar1.add(jMenu1);

        Botao_EditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group.png"))); // NOI18N
        Botao_EditarCliente.setText("Cliente");

        EditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group_edit.png"))); // NOI18N
        EditarCliente.setText("Editar");
        EditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarClienteActionPerformed(evt);
            }
        });
        Botao_EditarCliente.add(EditarCliente);

        jMenuBar1.add(Botao_EditarCliente);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car.png"))); // NOI18N
        jMenu2.setText("Veículos");

        AlugarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car_add.png"))); // NOI18N
        AlugarVeiculo.setText("Alugar veículo");
        AlugarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlugarVeiculoActionPerformed(evt);
            }
        });
        jMenu2.add(AlugarVeiculo);

        DevolverVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car_delete.png"))); // NOI18N
        DevolverVeiculo.setText("Devolver veículo");
        DevolverVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DevolverVeiculoActionPerformed(evt);
            }
        });
        jMenu2.add(DevolverVeiculo);

        jMenuBar1.add(jMenu2);

        Botao_Infor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.png"))); // NOI18N
        Botao_Infor.setText("Sobre");

        Infor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/information.png"))); // NOI18N
        Infor.setText("Informações");
        Infor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InforActionPerformed(evt);
            }
        });
        Botao_Infor.add(Infor);

        jMenuBar1.add(Botao_Infor);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(396, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(TextoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(EscolhaAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(277, 277, 277)
                            .addComponent(Botao_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(293, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EscolhaAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(35, 35, 35)
                    .addComponent(Botao_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(59, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetornarActionPerformed
        new TelaPrincipalSDI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RetornarActionPerformed

    private void EditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarClienteActionPerformed
          new TelaEditarClienteSDI().setVisible(true);
    }//GEN-LAST:event_EditarClienteActionPerformed

    private void InforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InforActionPerformed
        new TelaSobreSDI().setVisible(true);
    }//GEN-LAST:event_InforActionPerformed

    private void TextoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoValorActionPerformed

    private void Botao_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_BuscarActionPerformed
        String atributo = String.valueOf(EscolhaAtributo.getSelectedItem());
        String valor = TextoValor.getText();
        ArrayList lista_de_Veiculos = f.buscarVeiculosObject(atributo, valor);
        if(lista_de_Veiculos.isEmpty()==true){
            JOptionPane.showMessageDialog(null, "Não há veículos com essa caracterítica!");
        }else{
        new TelaPesquisaSDI(lista_de_Veiculos).setVisible(true);
        }
    }//GEN-LAST:event_Botao_BuscarActionPerformed

    private void EscolhaAtributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscolhaAtributoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EscolhaAtributoActionPerformed

    private void DevolverVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DevolverVeiculoActionPerformed
        new TelaDevolverVeiculoSDI(this.cpf).setVisible(true);
    }//GEN-LAST:event_DevolverVeiculoActionPerformed

    private void AlugarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlugarVeiculoActionPerformed
        new TelaAlugarVeiculoSDI().setVisible(true);
    }//GEN-LAST:event_AlugarVeiculoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaClienteSDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClienteSDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClienteSDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClienteSDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaClienteSDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AlugarVeiculo;
    private javax.swing.JButton Botao_Buscar;
    private javax.swing.JMenu Botao_EditarCliente;
    private javax.swing.JMenu Botao_Infor;
    private javax.swing.JMenuItem DevolverVeiculo;
    private javax.swing.JMenuItem EditarCliente;
    private javax.swing.JComboBox<String> EscolhaAtributo;
    private javax.swing.JMenuItem Infor;
    private javax.swing.JMenuItem Retornar;
    private javax.swing.JTextField TextoValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
          setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/car.png")));
    }
}

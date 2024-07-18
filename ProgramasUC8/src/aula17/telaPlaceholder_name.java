/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aula17;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class telaPlaceholder_name extends javax.swing.JFrame {

    /**
     * Creates new form telaPlaceholder_name
     */
    //Variável global
    FormatadorCampos formatter = new FormatadorCampos();
    
    public telaPlaceholder_name() throws ParseException {
        initComponents();
        //Inicializar os campos com a formatação
        formatter.formatFieldCPF(ftxtCPF);
        formatter.formatFieldTelefone(ftxtTelefone);
        formatter.formatFieldTelefoneInter(ftxtFoneInter);
        formatter.formatFieldCEP(ftxtCEP);
        formatter.formatFieldCNPJ(ftxtCNPJ);
        formatter.formatFieldTltEleitor(ftxtTltEleitor);
        formatter.formatFieldDataNasc(ftxtDataNasc);
        formatter.formatFieldPlacaAuto(ftxtPlacaAuto);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        pnlBottom = new javax.swing.JPanel();
        pnlButtons = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pnlSliders = new javax.swing.JPanel();
        sldController01 = new javax.swing.JSlider();
        lblSliderValue = new javax.swing.JLabel();
        pnlLeft = new javax.swing.JPanel();
        pnlRight = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlMiddle = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        ftxtCPF = new javax.swing.JFormattedTextField();
        lblTelefone = new javax.swing.JLabel();
        ftxtTelefone = new javax.swing.JFormattedTextField();
        lblFoneInter = new javax.swing.JLabel();
        ftxtFoneInter = new javax.swing.JFormattedTextField();
        lblCEP = new javax.swing.JLabel();
        ftxtCEP = new javax.swing.JFormattedTextField();
        lblCNPJ = new javax.swing.JLabel();
        ftxtCNPJ = new javax.swing.JFormattedTextField();
        lblTltEleitor = new javax.swing.JLabel();
        ftxtTltEleitor = new javax.swing.JFormattedTextField();
        lblDataNasc = new javax.swing.JLabel();
        ftxtDataNasc = new javax.swing.JFormattedTextField();
        lblPlacaAuto = new javax.swing.JLabel();
        ftxtPlacaAuto = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlButtons.setLayout(new java.awt.GridLayout(1, 1, 5, 10));

        jButton1.setText("Cancelar");
        pnlButtons.add(jButton1);

        jButton2.setText("Salvar");
        pnlButtons.add(jButton2);

        sldController01.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldController01StateChanged(evt);
            }
        });

        lblSliderValue.setText("50");

        javax.swing.GroupLayout pnlSlidersLayout = new javax.swing.GroupLayout(pnlSliders);
        pnlSliders.setLayout(pnlSlidersLayout);
        pnlSlidersLayout.setHorizontalGroup(
            pnlSlidersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSlidersLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(sldController01, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSliderValue, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnlSlidersLayout.setVerticalGroup(
            pnlSlidersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSlidersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSlidersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sldController01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSliderValue))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addComponent(pnlSliders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSliders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Formulário de Campos Formatados - Java - TDS23_2M");

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(33, 33, 33))
        );

        jPanel1.setLayout(new java.awt.GridLayout(18, 0));

        lblNome.setText("Nome:");
        jPanel1.add(lblNome);
        jPanel1.add(txtNome);

        lblCPF.setText("CPF:");
        jPanel1.add(lblCPF);
        jPanel1.add(ftxtCPF);

        lblTelefone.setText("Telefone:");
        jPanel1.add(lblTelefone);
        jPanel1.add(ftxtTelefone);

        lblFoneInter.setText("TelefoneInternacional:");
        jPanel1.add(lblFoneInter);
        jPanel1.add(ftxtFoneInter);

        lblCEP.setText("CEP:");
        jPanel1.add(lblCEP);
        jPanel1.add(ftxtCEP);

        lblCNPJ.setText("CNPJ:");
        jPanel1.add(lblCNPJ);
        jPanel1.add(ftxtCNPJ);

        lblTltEleitor.setText("Titulo Eleitor:");
        jPanel1.add(lblTltEleitor);
        jPanel1.add(ftxtTltEleitor);

        lblDataNasc.setText("Data Nascimento:");
        jPanel1.add(lblDataNasc);
        jPanel1.add(ftxtDataNasc);

        lblPlacaAuto.setText("Placa Automóvel:");
        jPanel1.add(lblPlacaAuto);
        jPanel1.add(ftxtPlacaAuto);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout pnlMiddleLayout = new javax.swing.GroupLayout(pnlMiddle);
        pnlMiddle.setLayout(pnlMiddleLayout);
        pnlMiddleLayout.setHorizontalGroup(
            pnlMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMiddleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlMiddleLayout.setVerticalGroup(
            pnlMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMiddleLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addComponent(pnlRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMiddle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addComponent(pnlMiddle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldController01StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldController01StateChanged
        // TODO add your handling code here:
        int sliderValue = sldController01.getValue();
        lblSliderValue.setText(String.valueOf(sliderValue));
    }//GEN-LAST:event_sldController01StateChanged

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaPlaceholder_name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPlaceholder_name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPlaceholder_name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPlaceholder_name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new telaPlaceholder_name().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(telaPlaceholder_name.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ftxtCEP;
    private javax.swing.JFormattedTextField ftxtCNPJ;
    private javax.swing.JFormattedTextField ftxtCPF;
    private javax.swing.JFormattedTextField ftxtDataNasc;
    private javax.swing.JFormattedTextField ftxtFoneInter;
    private javax.swing.JFormattedTextField ftxtPlacaAuto;
    private javax.swing.JFormattedTextField ftxtTelefone;
    private javax.swing.JFormattedTextField ftxtTltEleitor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblFoneInter;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPlacaAuto;
    private javax.swing.JLabel lblSliderValue;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTltEleitor;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlMiddle;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlSliders;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JSlider sldController01;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}

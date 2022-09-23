
package code;

import java.text.NumberFormat;


public class GUI extends javax.swing.JFrame {

   
    public GUI() {
        initComponents();
        myInit();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edta = new javax.swing.JTextField();
        edtkq = new javax.swing.JTextField();
        edtb = new javax.swing.JTextField();
        btncong = new javax.swing.JButton();
        btntru = new javax.swing.JButton();
        btnchia = new javax.swing.JButton();
        btnnhan = new javax.swing.JButton();
        edtthongbao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THỰC HIỆN PHÉP TÍNH");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(255, 51, 51)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("NHẬP SỐ A:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("NHẬP SỐ B:");

        jLabel6.setBackground(new java.awt.Color(51, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("KẾT QUẢ:");

        edta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtaActionPerformed(evt);
            }
        });

        edtkq.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        edtkq.setForeground(new java.awt.Color(255, 0, 0));
        edtkq.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edtkq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtkqActionPerformed(evt);
            }
        });

        edtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtbActionPerformed(evt);
            }
        });

        btncong.setBackground(new java.awt.Color(255, 255, 51));
        btncong.setText("+");
        btncong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncongActionPerformed(evt);
            }
        });

        btntru.setBackground(new java.awt.Color(255, 255, 51));
        btntru.setText("-");
        btntru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntruActionPerformed(evt);
            }
        });

        btnchia.setBackground(new java.awt.Color(255, 255, 0));
        btnchia.setText("/");
        btnchia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchiaActionPerformed(evt);
            }
        });

        btnnhan.setBackground(new java.awt.Color(255, 255, 0));
        btnnhan.setText("*");
        btnnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhanActionPerformed(evt);
            }
        });

        edtthongbao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edtthongbao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtthongbaoActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(51, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Thông báo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel2)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(edtthongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtkq)
                            .addComponent(edtb)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btncong, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btntru, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnchia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(edta))
                        .addGap(189, 189, 189))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(edta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(edtb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(edtkq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnchia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntru, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtthongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtaActionPerformed

    private void edtkqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtkqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtkqActionPerformed

    private void edtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtbActionPerformed

    private void btncongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncongActionPerformed
        //Double a = Double.parseDouble(edta.getText());
        //Double b = Double.parseDouble(edtb.getText());
        String regex = "^[-]?(\\d+(\\.\\d*)?)";
        String tmpa = edtb.getText();
        String tmpb = edta.getText();
        if(tmpa.matches(regex) && tmpb.matches(regex)) { 
            double a= Double.parseDouble(tmpa);
            double b= Double.parseDouble(tmpb);
            double c = a + b;
            String s = String.valueOf(c);
            edtkq.setText(s);
            edtthongbao.setText("");
        } else {
            edtthongbao.setText("Đầu vào phải là số");
        }     
    }//GEN-LAST:event_btncongActionPerformed

    private void btntruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntruActionPerformed
        //Double a = Double.parseDouble(edta.getText());
        //Double b = Double.parseDouble(edtb.getText());       
        String regex = "^[-]?(\\d+(\\.\\d*)?)";
        String tmpa = edtb.getText();
        String tmpb = edta.getText();
        if(tmpa.matches(regex) && tmpb.matches(regex)) { 
            double a= Double.parseDouble(tmpa);
            double b= Double.parseDouble(tmpb);
            double c = a - b;
            String s = String.valueOf(c);
            edtkq.setText(s);
            edtthongbao.setText("");
        } else {
            edtthongbao.setText("Đầu vào phải là số");
        }     
    }//GEN-LAST:event_btntruActionPerformed

    private void btnnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhanActionPerformed
        //Double a = Double.parseDouble(edta.getText());
        //Double b = Double.parseDouble(edtb.getText());
        String regex = "^[-]?(\\d+(\\.\\d*)?)";
        String tmpa = edtb.getText();
        String tmpb = edta.getText();
        if(tmpa.matches(regex) && tmpb.matches(regex)) { 
            double a= Double.parseDouble(tmpa);
            double b= Double.parseDouble(tmpb);
            double c = a * b;
            String s = String.valueOf(c);
            edtkq.setText(s);
            edtthongbao.setText("");
        } else {
            edtthongbao.setText("Đầu vào phải là số!!");
        }     
    }//GEN-LAST:event_btnnhanActionPerformed

    private void btnchiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchiaActionPerformed
        Double q = Double.parseDouble(edtb.getText());
        if (q == 0) {
            edtthongbao.setText("Số bị chia phải khác 0");
            edtb.requestFocus();
        }
        
        String regex = "^[-]?(\\d+(\\.\\d*)?)";
        String tmpa = edtb.getText();
        String tmpb = edta.getText();
        if(tmpa.matches(regex) && tmpb.matches(regex)) { 
            double a= Double.parseDouble(tmpa);
            double b= Double.parseDouble(tmpb);
            double c = a / b;
            String s = String.valueOf(c);
            edtkq.setText(s);
            edtthongbao.setText("");
        } else {
            edtthongbao.setText("Đầu vào phải là số!!");
        }     
    }//GEN-LAST:event_btnchiaActionPerformed

    private void edtthongbaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtthongbaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtthongbaoActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchia;
    private javax.swing.JButton btncong;
    private javax.swing.JButton btnnhan;
    private javax.swing.JButton btntru;
    private javax.swing.JTextField edta;
    private javax.swing.JTextField edtb;
    private javax.swing.JTextField edtkq;
    private javax.swing.JTextField edtthongbao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        setLocationRelativeTo(null);
        edtkq.setEnabled(true);
        edtkq.setEnabled(false);
    }
}

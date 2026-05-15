
package View;


public class LoginView extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginView.class.getName());

   
    public LoginView() {
        initComponents();
        setSize(930,420 );
        setResizable(false);
        setTitle("ingresar al sistema");
        setLocationRelativeTo(null);
        this.repaint(); 
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        TxtPassword = new javax.swing.JPasswordField();
        btnEnter = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        wallPaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(40, 147, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIAR SESION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        txtUserName.setBackground(new java.awt.Color(255, 255, 255));
        txtUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 210, 35));

        TxtPassword.setBackground(new java.awt.Color(255, 255, 255));
        TxtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TxtPassword.setForeground(new java.awt.Color(0, 0, 0));
        TxtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(TxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 210, 35));

        btnEnter.setBackground(new java.awt.Color(255, 255, 255));
        btnEnter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(0, 0, 0));
        btnEnter.setText("INGRESAR");
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 210, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 490, 420));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Captura.PNG"))); // NOI18N
        wallPaper.setText("jLabel4");
        jPanel2.add(wallPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 420));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPasswordActionPerformed

   
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new LoginView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField TxtPassword;
    public javax.swing.JButton btnEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txtUserName;
    private javax.swing.JLabel wallPaper;
    // End of variables declaration//GEN-END:variables
}

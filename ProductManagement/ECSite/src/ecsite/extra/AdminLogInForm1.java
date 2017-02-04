
package ecsite.extra;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.awt.Dimension;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class AdminLogInForm1 extends javax.swing.JFrame {

  
    public AdminLogInForm1() throws SQLException, ClassNotFoundException, Exception {
        initComponents();
        
        //LogInResult.setBorder(BorderFactory.createEmptyBorder());
        
        //AdminLogInFirstPanel.setPreferredSize(new Dimension(AdminLogInForm.));
        //System.out.println(AdminLogInFirstPanel.size());
        
        
        
    }
    
    public boolean mCheckLogIn(String Username, String Password) throws Exception
    {
        boolean result;
        Connection c=getOracleConnection();
        CallableStatement callStmt = null;

        try 
        {
            callStmt = c.prepareCall("{? = call CHECKLOGIN(?,?)}");

            callStmt.setString(2, Username);
            callStmt.setString(3, Password);   

            callStmt.registerOutParameter(1, java.sql.Types.NUMERIC);
            callStmt.execute();
            System.out.println(callStmt.getInt(1));
            
            if(callStmt.getInt(1)==0)result=false;
            else result=true;
            
        } finally {
            callStmt.close();
            c.close();
        }
        
        return result;
    }
    
    public static Connection getOracleConnection() throws Exception 
    {
        String driver = "oracle.jdbc.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "XAMPP";
        String password = "123456";

        Class.forName(driver); // load Oracle driver
  
        Connection conn = DriverManager.getConnection(url, username, password);

        return conn;
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mDesktop = new javax.swing.JDesktopPane();
        AdminLogInFirstPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        usenameField = new javax.swing.JTextField();
        logInButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        LogInResult = new javax.swing.JTextField();
        secondPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("BaseFrame"); // NOI18N
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        mDesktop.setLayout(new javax.swing.OverlayLayout(mDesktop));

        AdminLogInFirstPanel.setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        usenameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usenameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        logInButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logInButton.setText("Log In");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setToolTipText("");
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logInButton, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(passwordField)
                    .addComponent(usenameField))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(usenameField, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(logInButton, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );

        LogInResult.setEditable(false);
        LogInResult.setBackground(new java.awt.Color(0, 153, 153));
        LogInResult.setFont(new java.awt.Font("Tahoma", 2, 15)); // NOI18N
        LogInResult.setForeground(new java.awt.Color(255, 255, 255));
        LogInResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LogInResult.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        LogInResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminLogInFirstPanelLayout = new javax.swing.GroupLayout(AdminLogInFirstPanel);
        AdminLogInFirstPanel.setLayout(AdminLogInFirstPanelLayout);
        AdminLogInFirstPanelLayout.setHorizontalGroup(
            AdminLogInFirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLogInFirstPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(LogInResult)
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminLogInFirstPanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(214, 214, 214))
        );
        AdminLogInFirstPanelLayout.setVerticalGroup(
            AdminLogInFirstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLogInFirstPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addComponent(LogInResult, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        mDesktop.add(AdminLogInFirstPanel);

        getContentPane().add(mDesktop);

        javax.swing.GroupLayout secondPanelLayout = new javax.swing.GroupLayout(secondPanel);
        secondPanel.setLayout(secondPanelLayout);
        secondPanelLayout.setHorizontalGroup(
            secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 832, Short.MAX_VALUE)
        );
        secondPanelLayout.setVerticalGroup(
            secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        getContentPane().add(secondPanel);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogInResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogInResultActionPerformed

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        // TODO add your handling code here:
        
        String userName=usenameField.getText();
        String password=passwordField.getText();
        
        LogInResult.setText("");
        //LogInResult.setBorder(BorderFactory.createTitledBorder(""));
        
        try {
            if(mCheckLogIn(userName, password))LogInResult.setText("LogIn Successful");
            else LogInResult.setText("LogIn Failed.  !! Wrong username or password !!");
            
        } catch (Exception ex) {
            Logger.getLogger(AdminLogInForm1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*try {
            AdminLogInForm f=new AdminLogInForm();
            mDesktop.add(f);
            f.setVisible(true);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminLogInForm1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(AdminLogInForm1.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        AdminLogInFirstPanel.setVisible(false);
        secondPanel.setVisible(true);
        
        
        
    }//GEN-LAST:event_logInButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
        LogInResult.setText("");
        //LogInResult.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_passwordFieldActionPerformed

    
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
            java.util.logging.Logger.getLogger(AdminLogInForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogInForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogInForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogInForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new AdminLogInForm1().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AdminLogInForm1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(AdminLogInForm1.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminLogInFirstPanel;
    private javax.swing.JTextField LogInResult;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logInButton;
    private javax.swing.JDesktopPane mDesktop;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPanel secondPanel;
    private javax.swing.JTextField usenameField;
    // End of variables declaration//GEN-END:variables
}
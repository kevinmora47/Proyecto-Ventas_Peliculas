package Frame_Views;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class Login_Frame extends javax.swing.JFrame {
    
    public Login_Frame() {
        
        initComponents();
        setSize(820, 650);//Se predefine la dimension de la ventana.
        this.setLocationRelativeTo(null);//Centramos el frame.
        setIconImage(new ImageIcon(getClass().getResource("../Image_Resources/Movie.png")).getImage());//Esta propiedad nos permite cambiar el icono de nuestra app creada.
        setTitle("Movie Flex");//Con esto setiamos el titulo.
        SetColors();
        setTexts();
        
    }

    //Método para cambiarle el color al un label.
    public void SetColors() {
        Login_Label.setBackground(new Color(247, 222, 139));
        Login_Label.setForeground(Color.WHITE);
        Login_Label.setOpaque(true);
    }

    //Este metodo sirve para colocar una guia de lo que tenemos que usar en nuestro frame.
    void setTexts() {
        
        Text_User.setText("UserName/Email");
        Text_Pass.setText("Password");
        Text_User.setForeground(Color.gray);
        Text_Pass.setForeground(Color.gray);
        
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
        Label_Bienvenida = new javax.swing.JLabel();
        Text_Pass = new javax.swing.JTextField();
        Text_User = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Login_Label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Movie Flex"); // NOI18N

        jPanel1.setBackground(java.awt.SystemColor.controlLtHighlight);
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Bienvenida.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        Label_Bienvenida.setText("¡Genial verte de nuevo!");
        jPanel1.add(Label_Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 260, 90));

        Text_Pass.setFont(new java.awt.Font("Calibri Light", 1, 17)); // NOI18N
        Text_Pass.setBorder(null);
        Text_Pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text_PassMouseClicked(evt);
            }
        });
        jPanel1.add(Text_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 410, 60));

        Text_User.setFont(new java.awt.Font("Calibri Light", 1, 17)); // NOI18N
        Text_User.setBorder(null);
        Text_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Text_UserMouseClicked(evt);
            }
        });
        jPanel1.add(Text_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 410, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 410, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 410, 30));

        Login_Label.setBackground(new java.awt.Color(255, 255, 255));
        Login_Label.setFont(new java.awt.Font("Lato Black", 0, 21)); // NOI18N
        Login_Label.setText("                                    Login");
        Login_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Login_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(Login_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 410, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Film_Reel_150px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 150, 150));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(181, 193, 255));
        jLabel2.setText("¿No estas registrado?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 150, 20));

        jSeparator3.setForeground(new java.awt.Color(181, 193, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 150, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Twitter_50px.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, 60, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Facebook_50px.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 60, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Instagram_Old_48px.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 60, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Password_1_52px.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 60, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_User_50px.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 50, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Text_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text_UserMouseClicked
        Text_User.setText("");
    }//GEN-LAST:event_Text_UserMouseClicked

    private void Text_PassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Text_PassMouseClicked
        Text_Pass.setText("");
    }//GEN-LAST:event_Text_PassMouseClicked

    private void Login_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_LabelMouseClicked
        
        final String User = "Kevinmora47";
        final String Pass = "mora04";
        int cont = 0;
        
        if (Text_User.getText().equals(User) && Text_Pass.getText().equals(Pass)) {
            
            Home_Frame fr = new Home_Frame();
            fr.setVisible(true);
            this.dispose();
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Lo siento, usuario o contraseña incorrectos");
            cont++;
            
        }
        
        if (cont == 3) {            
            
            JOptionPane.showMessageDialog(null, "Limite de intentos rebasados, por favor intenta más tarde.");
            System.exit(0);
            
        }
        

    }//GEN-LAST:event_Login_LabelMouseClicked

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
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Bienvenida;
    private javax.swing.JLabel Login_Label;
    private javax.swing.JTextField Text_Pass;
    private javax.swing.JTextField Text_User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}

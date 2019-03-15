package Frame_Views;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.net.URL;
import java.util.Stack;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public final class Home_Frame extends javax.swing.JFrame {

    int cont = 1;
    int contador_pelis = 1;
    Stack Peliculas_Adquiridas = new Stack();
    int valor_Estreno = 6000;

    public Home_Frame() {
        initComponents();
        Calculo();
        disable_Labels();
        JPanel_Usuario.setVisible(false);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../Image_Resources/Movie.png")).getImage());
        //comando para agregar la imagen para hacer un carrousel de fotos el cual nos devuelve una imagen de nuestra carpeta.
        setTitle("Movie Flex");
        Set_Texts();
        Change_Images();
    }

    void Calculo() {

        int total = Peliculas_Adquiridas.size() * 6000;
        Total.setText("" + total);

    }

    void disable_Labels() {

        Check_Label.setVisible(false);
        Check_Label1.setVisible(false);
        Check_Label2.setVisible(false);
        Check_Label3.setVisible(false);
        Check_Label4.setVisible(false);
        Check_Label5.setVisible(false);
        Check_Label6.setVisible(false);

    }

    void Set_Texts() {
        Label_Search.setText(" Buscar ");
    }

    void Change_Images() {

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                JLabel_Carrousel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HD_Movies_Images/" + cont + ".jpg")));
                cont++;

                if (cont == 12) {

                    cont = 1;

                }

            }
        });

        timer.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal_Panel = new javax.swing.JPanel();
        Menu_JPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Label_Search = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Btn_Buy = new javax.swing.JLabel();
        Quantity_Label = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        JLabel_Carrousel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Jpanel_Carrousel = new javax.swing.JPanel();
        JLabel_8 = new javax.swing.JLabel();
        JLabel_5 = new javax.swing.JLabel();
        Btn_add = new javax.swing.JLabel();
        JLabel_1 = new javax.swing.JLabel();
        JLabel_7 = new javax.swing.JLabel();
        JLabel_3 = new javax.swing.JLabel();
        JLabel_4 = new javax.swing.JLabel();
        JLabel_6 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Check_Label = new javax.swing.JLabel();
        Btn_add1 = new javax.swing.JLabel();
        Check_Label1 = new javax.swing.JLabel();
        Btn_add2 = new javax.swing.JLabel();
        Check_Label2 = new javax.swing.JLabel();
        Btn_add3 = new javax.swing.JLabel();
        Check_Label3 = new javax.swing.JLabel();
        Btn_add4 = new javax.swing.JLabel();
        Check_Label4 = new javax.swing.JLabel();
        Btn_add5 = new javax.swing.JLabel();
        Check_Label5 = new javax.swing.JLabel();
        Btn_add6 = new javax.swing.JLabel();
        Check_Label6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        JPanel_Usuario = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        JPanel_Usuario1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        Total_Pelis = new javax.swing.JLabel();
        TotalDe_peliculas = new javax.swing.JLabel();
        Colones = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        Principal_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Principal_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Principal_PanelMouseClicked(evt);
            }
        });
        Principal_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu_JPanel.setBackground(new java.awt.Color(247, 245, 212));
        Menu_JPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Search_30px.png"))); // NOI18N
        Menu_JPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 40, 60));
        Menu_JPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 220, 10));

        Label_Search.setBackground(new java.awt.Color(153, 153, 153));
        Label_Search.setFont(new java.awt.Font("Candara Light", 0, 15)); // NOI18N
        Label_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_SearchMouseClicked(evt);
            }
        });
        Menu_JPanel.add(Label_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 220, 40));
        Menu_JPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 320, 0));
        Menu_JPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 270, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 19)); // NOI18N
        jLabel5.setText("Películas de terror:");
        Menu_JPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 160, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Categorize_50px.png"))); // NOI18N
        Menu_JPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 50, 60));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 19)); // NOI18N
        jLabel7.setText("Categorías:");
        Menu_JPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, 60));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 19)); // NOI18N
        jLabel8.setText("Acción y aventura");
        Menu_JPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 60));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 19)); // NOI18N
        jLabel9.setText("Infantiles:");
        Menu_JPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 80, 60));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 19)); // NOI18N
        jLabel10.setText("Ciencia ficción y fantasía:");
        Menu_JPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 200, 60));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 19)); // NOI18N
        jLabel11.setText("Comedias:");
        Menu_JPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 90, 60));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 19)); // NOI18N
        jLabel12.setText("Dramas:");
        Menu_JPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 70, 60));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 19)); // NOI18N
        jLabel13.setText("Música y Documentales:");
        Menu_JPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 200, 60));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Music_48px.png"))); // NOI18N
        Menu_JPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 60, 60));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Action_50px.png"))); // NOI18N
        Menu_JPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 50, 60));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Children_48px.png"))); // NOI18N
        Menu_JPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 50, 60));
        Menu_JPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 70, 60));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Theatre_Mask_50px.png"))); // NOI18N
        Menu_JPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 60, 60));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Fantasy_48px.png"))); // NOI18N
        Menu_JPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 50, 60));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Horror_48px.png"))); // NOI18N
        Menu_JPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 620, 70, 60));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Drama_48px.png"))); // NOI18N
        Menu_JPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 50, 60));

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 19)); // NOI18N
        jLabel22.setText("Películas románticas:");
        Menu_JPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, 170, 60));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Romance_48px.png"))); // NOI18N
        Menu_JPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 690, 50, 60));

        jLabel25.setFont(new java.awt.Font("Segoe UI Light", 0, 19)); // NOI18N
        jLabel25.setText("Películas familiares:");
        Menu_JPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 760, 170, 60));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Family_48px.png"))); // NOI18N
        Menu_JPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 760, 50, 60));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Trophy_50px.png"))); // NOI18N
        Menu_JPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 830, 50, 60));

        jLabel28.setFont(new java.awt.Font("Segoe UI Light", 0, 19)); // NOI18N
        jLabel28.setText("Películas premiadas:");
        Menu_JPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 830, 170, 60));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Naruto_50px.png"))); // NOI18N
        Menu_JPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 900, 50, 60));

        jLabel31.setFont(new java.awt.Font("Segoe UI Light", 0, 19)); // NOI18N
        jLabel31.setText("Anime:");
        Menu_JPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 900, 60, 60));

        Principal_Panel.add(Menu_JPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, 90, 260, 1010));

        jPanel2.setBackground(new java.awt.Color(247, 222, 139));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Menu_30px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setText("¡Hola, bienvenido!");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 310, 80));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_User_Account_50px.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 20, 50, 50));

        Btn_Buy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Buying_48px.png"))); // NOI18N
        Btn_Buy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_BuyMouseClicked(evt);
            }
        });
        jPanel2.add(Btn_Buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 20, 50, 50));

        Quantity_Label.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Quantity_Label.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.add(Quantity_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 0, 20, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI Light", 0, 40)); // NOI18N
        jLabel33.setText("Kevinmora47");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 20, -1, 50));

        Principal_Panel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1960, 90));
        Principal_Panel.add(JLabel_Carrousel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 800, 490));
        Principal_Panel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 120, 790, 10));
        Principal_Panel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 610, 10));

        Jpanel_Carrousel.setBackground(new java.awt.Color(247, 247, 235));
        Jpanel_Carrousel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabel_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera_Package/5.jpg"))); // NOI18N
        Jpanel_Carrousel.add(JLabel_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 90, 190, 300));

        JLabel_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera_Package/3.jpg"))); // NOI18N
        Jpanel_Carrousel.add(JLabel_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 190, 300));

        Btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Add_50px_1.png"))); // NOI18N
        Btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_addMouseClicked(evt);
            }
        });
        Jpanel_Carrousel.add(Btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 50, 50));

        JLabel_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera_Package/9.jpg"))); // NOI18N
        Jpanel_Carrousel.add(JLabel_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 200, 300));

        JLabel_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera_Package/6.jpg"))); // NOI18N
        Jpanel_Carrousel.add(JLabel_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 90, 190, 300));

        JLabel_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera_Package/1.jpg"))); // NOI18N
        Jpanel_Carrousel.add(JLabel_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 200, 300));

        JLabel_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera_Package/4.jpg"))); // NOI18N
        Jpanel_Carrousel.add(JLabel_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 190, 300));

        JLabel_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartelera_Package/7.jpg"))); // NOI18N
        Jpanel_Carrousel.add(JLabel_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 100, 190, 290));

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 40)); // NOI18N
        jLabel23.setText("Estrenos:");
        Jpanel_Carrousel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 90));

        Check_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Checked_48px.png"))); // NOI18N
        Check_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Check_LabelMouseClicked(evt);
            }
        });
        Jpanel_Carrousel.add(Check_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 50, 50));

        Btn_add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Add_50px_1.png"))); // NOI18N
        Btn_add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_add1MouseClicked(evt);
            }
        });
        Jpanel_Carrousel.add(Btn_add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 50, 50));

        Check_Label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Checked_48px.png"))); // NOI18N
        Check_Label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Check_Label1MouseClicked(evt);
            }
        });
        Jpanel_Carrousel.add(Check_Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 50, 50));

        Btn_add2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Add_50px_1.png"))); // NOI18N
        Btn_add2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_add2MouseClicked(evt);
            }
        });
        Jpanel_Carrousel.add(Btn_add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 50, 50));

        Check_Label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Checked_48px.png"))); // NOI18N
        Check_Label2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Check_Label2MouseClicked(evt);
            }
        });
        Jpanel_Carrousel.add(Check_Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 50, 50));

        Btn_add3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Add_50px_1.png"))); // NOI18N
        Btn_add3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_add3MouseClicked(evt);
            }
        });
        Jpanel_Carrousel.add(Btn_add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, 50, 50));

        Check_Label3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Checked_48px.png"))); // NOI18N
        Check_Label3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Check_Label3MouseClicked(evt);
            }
        });
        Jpanel_Carrousel.add(Check_Label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, 50, 50));

        Btn_add4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Add_50px_1.png"))); // NOI18N
        Btn_add4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_add4MouseClicked(evt);
            }
        });
        Jpanel_Carrousel.add(Btn_add4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 380, 50, 50));

        Check_Label4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Checked_48px.png"))); // NOI18N
        Check_Label4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Check_Label4MouseClicked(evt);
            }
        });
        Jpanel_Carrousel.add(Check_Label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 380, 50, 50));

        Btn_add5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Add_50px_1.png"))); // NOI18N
        Btn_add5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_add5MouseClicked(evt);
            }
        });
        Jpanel_Carrousel.add(Btn_add5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 380, 50, 50));

        Check_Label5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Checked_48px.png"))); // NOI18N
        Check_Label5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Check_Label5MouseClicked(evt);
            }
        });
        Jpanel_Carrousel.add(Check_Label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 380, 50, 50));

        Btn_add6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Add_50px_1.png"))); // NOI18N
        Btn_add6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_add6MouseClicked(evt);
            }
        });
        Jpanel_Carrousel.add(Btn_add6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 380, 50, 50));

        Check_Label6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Checked_48px.png"))); // NOI18N
        Check_Label6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Check_Label6MouseClicked(evt);
            }
        });
        Jpanel_Carrousel.add(Check_Label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 380, 50, 50));

        Principal_Panel.add(Jpanel_Carrousel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 1800, 430));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Categorize_48px.png"))); // NOI18N
        Principal_Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, 50, 50));
        Principal_Panel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 120, 318, 9));

        JPanel_Usuario.setBackground(new java.awt.Color(255, 255, 255));
        JPanel_Usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(247, 222, 139));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JPanel_Usuario.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 510, 10));

        jPanel3.setBackground(new java.awt.Color(247, 222, 139));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JPanel_Usuario.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 10, 290));

        jPanel4.setBackground(new java.awt.Color(247, 222, 139));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JPanel_Usuario.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 10));

        jPanel5.setBackground(new java.awt.Color(247, 222, 139));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JPanel_Usuario.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 10, 290));

        jLabel32.setFont(new java.awt.Font("Calibri Light", 0, 17)); // NOI18N
        jLabel32.setText("Detalles de la pre-compra:");
        JPanel_Usuario.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 40));

        jLabel34.setFont(new java.awt.Font("Calibri Light", 0, 17)); // NOI18N
        jLabel34.setText("Usuario: Kevinmora47");
        JPanel_Usuario.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Buy_30px.png"))); // NOI18N
        JPanel_Usuario.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 30, 40));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Male_User_42px.png"))); // NOI18N
        JPanel_Usuario.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 40, 40));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Romantic_Movies_42px.png"))); // NOI18N
        JPanel_Usuario.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 40, 40));

        jLabel39.setFont(new java.awt.Font("Calibri Light", 0, 17)); // NOI18N
        jLabel39.setText("Total de peliculas:");
        JPanel_Usuario.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        JPanel_Usuario1.setBackground(new java.awt.Color(255, 255, 255));
        JPanel_Usuario1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(247, 222, 139));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        JPanel_Usuario1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 510, 10));

        jPanel7.setBackground(new java.awt.Color(247, 222, 139));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        JPanel_Usuario1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 10, 290));

        jPanel8.setBackground(new java.awt.Color(247, 222, 139));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        JPanel_Usuario1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 10));

        jPanel9.setBackground(new java.awt.Color(247, 222, 139));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        JPanel_Usuario1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 10, 290));

        jLabel40.setFont(new java.awt.Font("Calibri Light", 0, 17)); // NOI18N
        jLabel40.setText("Detalles de la pre-compra:");
        JPanel_Usuario1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 40));

        jLabel41.setFont(new java.awt.Font("Calibri Light", 0, 17)); // NOI18N
        jLabel41.setText("Usuario: Kevinmora47");
        JPanel_Usuario1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Buy_30px.png"))); // NOI18N
        JPanel_Usuario1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 30, 40));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Male_User_42px.png"))); // NOI18N
        JPanel_Usuario1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 40, 40));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Romantic_Movies_42px.png"))); // NOI18N
        JPanel_Usuario1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 40, 40));

        jLabel45.setFont(new java.awt.Font("Calibri Light", 0, 17)); // NOI18N
        jLabel45.setText("Total de peliculas:");
        JPanel_Usuario1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        JPanel_Usuario.add(JPanel_Usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 120, 510, 300));

        jLabel46.setFont(new java.awt.Font("Calibri Light", 0, 17)); // NOI18N
        jLabel46.setText("Total a pagar:");
        JPanel_Usuario.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Google_Pay_42px.png"))); // NOI18N
        JPanel_Usuario.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 50, 40));

        jLabel48.setFont(new java.awt.Font("Calibri Light", 0, 17)); // NOI18N
        jLabel48.setText("Proceder pago");
        JPanel_Usuario.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Purchase_Order_48px.png"))); // NOI18N
        JPanel_Usuario.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 50, 50));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image_Resources/icons8_Right_50px.png"))); // NOI18N
        JPanel_Usuario.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 50, 50));

        Total_Pelis.setFont(new java.awt.Font("Calibri Light", 0, 17)); // NOI18N
        JPanel_Usuario.add(Total_Pelis, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 100, 40));

        TotalDe_peliculas.setFont(new java.awt.Font("Calibri Light", 0, 17)); // NOI18N
        JPanel_Usuario.add(TotalDe_peliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 40));

        Colones.setText("₡");
        JPanel_Usuario.add(Colones, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 20, 40));

        Total.setFont(new java.awt.Font("Candara Light", 0, 17)); // NOI18N
        JPanel_Usuario.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 110, 40));

        Principal_Panel.add(JPanel_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 140, 510, 300));

        jLabel51.setFont(new java.awt.Font("Segoe UI Light", 0, 40)); // NOI18N
        jLabel51.setText("Recomendaciones:");
        Principal_Panel.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Principal_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1962, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1089, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        int position = this.Menu_JPanel.getX();
        if (position > -1) {

            this.Menu_JPanel.setVisible(true);
            Animacion.Animacion.mover_izquierda(0, -360, 5, 2, Menu_JPanel);

        } else {

            this.Menu_JPanel.setVisible(true);
            Animacion.Animacion.mover_derecha(-360, 0, 5, 2, Menu_JPanel);

        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void Label_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_SearchMouseClicked

        Check_Label.setVisible(false);
        Btn_add.setVisible(true);
        Quantity_Label.setText("" + 0);

    }//GEN-LAST:event_Label_SearchMouseClicked

    private void Btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_addMouseClicked

        Check_Label.setVisible(true);
        Btn_add.setVisible(false);
        Peliculas_Adquiridas.push(valor_Estreno);
        Total_Pelis.setText("" + Peliculas_Adquiridas.size());
        Calculo();
        JOptionPane.showMessageDialog(null, "Felicidades, ¡Haz adquirido una película!"
                + "\n- The Case For Christ"
                + "\n-Código: #1", "¡Genial!", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_Btn_addMouseClicked

    private void Check_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Check_LabelMouseClicked

        Check_Label.setVisible(false);
        Btn_add.setVisible(true);
        Peliculas_Adquiridas.pop();
        Total_Pelis.setText("" + Peliculas_Adquiridas.size());
        JOptionPane.showMessageDialog(null, "Haz quitado la pelicula seleccionda."
                + "\n-The Case For Christ"
                + "\n-Código: #1");


    }//GEN-LAST:event_Check_LabelMouseClicked

    private void Btn_add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_add1MouseClicked
        Check_Label1.setVisible(true);
        Btn_add1.setVisible(false);
        Peliculas_Adquiridas.push(valor_Estreno);
        Total_Pelis.setText("" + Peliculas_Adquiridas.size());
        Calculo();
        JOptionPane.showMessageDialog(null, "Felicidades, ¡Haz adquirido una película!"
                + "\n- Glass"
                + "\n-Código: #2", "¡Genial!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Btn_add1MouseClicked

    private void Check_Label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Check_Label1MouseClicked
        Check_Label1.setVisible(false);
        Btn_add1.setVisible(true);
        Peliculas_Adquiridas.pop();
        Total_Pelis.setText("" + Peliculas_Adquiridas.size());
        JOptionPane.showMessageDialog(null, "Haz quitado la pelicula seleccionda."
                + "\n-Glass"
                + "\n-Código: #2");


     }//GEN-LAST:event_Check_Label1MouseClicked

    private void Btn_add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_add2MouseClicked
        Check_Label2.setVisible(true);
        Btn_add2.setVisible(false);
        Peliculas_Adquiridas.push(valor_Estreno);
        Total_Pelis.setText("" + Peliculas_Adquiridas.size());
        Calculo();
        JOptionPane.showMessageDialog(null, "Felicidades, ¡Haz adquirido una película!"
                + "\n-Made in Bangok"
                + "\n-Código: #3", "¡Genial!", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_Btn_add2MouseClicked

    private void Check_Label2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Check_Label2MouseClicked
        Check_Label2.setVisible(false);
        Btn_add2.setVisible(true);
        Peliculas_Adquiridas.pop();
        Total_Pelis.setText("" + Peliculas_Adquiridas.size());
        JOptionPane.showMessageDialog(null, "Haz quitado la pelicula seleccionda."
                + "\n-Made in Bangok"
                + "\n-Código: #3", "¡Genial!", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_Check_Label2MouseClicked

    private void Btn_add3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_add3MouseClicked
        Check_Label3.setVisible(true);
        Btn_add3.setVisible(false);
        Peliculas_Adquiridas.push(valor_Estreno);
        Total_Pelis.setText("" + Peliculas_Adquiridas.size());
        Calculo();
        JOptionPane.showMessageDialog(null, "Felicidades, ¡Haz adquirido una película!"
                + "\n-Prick Up Your Ears"
                + "\n-Código: #4", "¡Genial!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Btn_add3MouseClicked

    private void Check_Label3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Check_Label3MouseClicked
        Check_Label3.setVisible(false);
        Btn_add3.setVisible(true);
        Peliculas_Adquiridas.pop();
        Total_Pelis.setText("" + Peliculas_Adquiridas.size());
        JOptionPane.showMessageDialog(null, "Haz quitado la pelicula seleccionda."
                + "\n-Prick Up Your Ears"
                + "\n-Código: #4", "¡Genial!", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_Check_Label3MouseClicked

    private void Btn_add4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_add4MouseClicked
        Check_Label4.setVisible(true);
        Btn_add4.setVisible(false);
        Peliculas_Adquiridas.push(valor_Estreno);
        Total_Pelis.setText("" + Peliculas_Adquiridas.size());
        Calculo();
        JOptionPane.showMessageDialog(null, "Felicidades, ¡Haz adquirido una película!"
                + "\n-Motel Hell"
                + "\n-Código: #5", "¡Genial!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Btn_add4MouseClicked

    private void Check_Label4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Check_Label4MouseClicked
        Check_Label4.setVisible(false);
        Btn_add4.setVisible(true);
        Peliculas_Adquiridas.pop();
        Total_Pelis.setText("" + Peliculas_Adquiridas.size());
        JOptionPane.showMessageDialog(null, "Haz quitado la pelicula seleccionda."
                + "\n-Motel Hell"
                + "\n-Código: #5", "¡Genial!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Check_Label4MouseClicked

    private void Btn_add5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_add5MouseClicked
        Check_Label5.setVisible(true);
        Btn_add5.setVisible(false);
        Peliculas_Adquiridas.push(valor_Estreno);
        Total_Pelis.setText("" + Peliculas_Adquiridas.size());
        Calculo();
        JOptionPane.showMessageDialog(null, "Felicidades, ¡Haz adquirido una película!"
                + "\n-Mad Max", "¡Genial!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Btn_add5MouseClicked

    private void Check_Label5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Check_Label5MouseClicked
        Check_Label5.setVisible(false);
        Btn_add5.setVisible(true);
        Peliculas_Adquiridas.pop();
        Total_Pelis.setText("" + Peliculas_Adquiridas.size());
        JOptionPane.showMessageDialog(null, "Haz quitado la pelicula seleccionda."
                + "\n-Mad Max", "¡Genial!", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_Check_Label5MouseClicked

    private void Btn_add6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_add6MouseClicked
        Check_Label6.setVisible(true);
        Btn_add6.setVisible(false);
        Peliculas_Adquiridas.push(valor_Estreno);
        Total_Pelis.setText("" + Peliculas_Adquiridas.size());
        Calculo();
        JOptionPane.showMessageDialog(null, "Felicidades, ¡Haz adquirido una película!"
                + "\n-King Arthur", "¡Genial!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Btn_add6MouseClicked

    private void Check_Label6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Check_Label6MouseClicked
        Check_Label6.setVisible(false);
        Btn_add6.setVisible(true);
        Peliculas_Adquiridas.pop();
        Total_Pelis.setText("" + Peliculas_Adquiridas.size());
        JOptionPane.showMessageDialog(null, "Haz quitado la pelicula seleccionda."
                + "\n-King Arthur", "¡Genial!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_Check_Label6MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked


    }//GEN-LAST:event_jLabel29MouseClicked

    private void Btn_BuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_BuyMouseClicked

        int pocicion = this.JPanel_Usuario.getY();

        if (pocicion > 3) {
            Animacion.Animacion.bajar(0, 200, 5, 2, JPanel_Usuario);
            JPanel_Usuario.setVisible(true);
        }

        int pocicion2 = this.JPanel_Usuario.getX();

        if (pocicion < 3) {

            Animacion.Animacion.mover_derecha(0, 200, 5, 2, JPanel_Usuario);

        }


    }//GEN-LAST:event_Btn_BuyMouseClicked

    private void Principal_PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Principal_PanelMouseClicked
        JPanel_Usuario.setVisible(false);
    }//GEN-LAST:event_Principal_PanelMouseClicked

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
            java.util.logging.Logger.getLogger(Home_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_Buy;
    private javax.swing.JLabel Btn_add;
    private javax.swing.JLabel Btn_add1;
    private javax.swing.JLabel Btn_add2;
    private javax.swing.JLabel Btn_add3;
    private javax.swing.JLabel Btn_add4;
    private javax.swing.JLabel Btn_add5;
    private javax.swing.JLabel Btn_add6;
    private javax.swing.JLabel Check_Label;
    private javax.swing.JLabel Check_Label1;
    private javax.swing.JLabel Check_Label2;
    private javax.swing.JLabel Check_Label3;
    private javax.swing.JLabel Check_Label4;
    private javax.swing.JLabel Check_Label5;
    private javax.swing.JLabel Check_Label6;
    private javax.swing.JLabel Colones;
    private javax.swing.JLabel JLabel_1;
    private javax.swing.JLabel JLabel_3;
    private javax.swing.JLabel JLabel_4;
    private javax.swing.JLabel JLabel_5;
    private javax.swing.JLabel JLabel_6;
    private javax.swing.JLabel JLabel_7;
    private javax.swing.JLabel JLabel_8;
    private javax.swing.JLabel JLabel_Carrousel;
    private javax.swing.JPanel JPanel_Usuario;
    private javax.swing.JPanel JPanel_Usuario1;
    private javax.swing.JPanel Jpanel_Carrousel;
    private javax.swing.JLabel Label_Search;
    private javax.swing.JPanel Menu_JPanel;
    private javax.swing.JPanel Principal_Panel;
    private javax.swing.JLabel Quantity_Label;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel TotalDe_peliculas;
    private javax.swing.JLabel Total_Pelis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}

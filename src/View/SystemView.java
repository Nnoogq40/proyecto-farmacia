
package View;

import Controllers.SettingsControllers;

public class SystemView extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SystemView.class.getName());

   
    public SystemView() {
        initComponents();
        // para dimensionar el ancho y alto de pantalla
        setSize(1208,680);
        // para que el usuairo no pueda modificar el tamaño de pantalla
        setResizable(false);
        // el titulo de la ventana
        setTitle("Panel de Administracion");
        // para centrar el panel al abrirse
        setLocationRelativeTo(null);
      //creamos un setting que traera los valores que cambiaran de color nuestros componentess
       SettingsControllers setting = new SettingsControllers(this); 
        
        
        
        
        
          // para que se apliquen los cambios,como una recarga de cambios
        this.repaint();
        
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        jPanelProducts = new javax.swing.JPanel();
        jLabelProducts = new javax.swing.JLabel();
        jPanelPurchase = new javax.swing.JPanel();
        jLabelPurchase = new javax.swing.JLabel();
        jPanelCustomers = new javax.swing.JPanel();
        jLabelCustomers = new javax.swing.JLabel();
        jPanelEmployers = new javax.swing.JPanel();
        jLabelEmployers = new javax.swing.JLabel();
        jPanelSuppliers = new javax.swing.JPanel();
        jLabelSuppliers = new javax.swing.JLabel();
        jPanelCategories = new javax.swing.JPanel();
        jLabelCategories = new javax.swing.JLabel();
        jPanelReports = new javax.swing.JPanel();
        jLabelReports = new javax.swing.JLabel();
        jPanelSettings = new javax.swing.JPanel();
        jLabelSettings = new javax.swing.JLabel();
        logo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cabecera = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Btn_Bottom = new javax.swing.JButton();
        btn_loginOut = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(18, 45, 61));
        Menu.setForeground(new java.awt.Color(18, 45, 61));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelProducts.setBackground(new java.awt.Color(18, 45, 61));
        jPanelProducts.setForeground(new java.awt.Color(18, 45, 61));

        jLabelProducts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelProducts.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/productos.png"))); // NOI18N
        jLabelProducts.setText("Productos");

        javax.swing.GroupLayout jPanelProductsLayout = new javax.swing.GroupLayout(jPanelProducts);
        jPanelProducts.setLayout(jPanelProductsLayout);
        jPanelProductsLayout.setHorizontalGroup(
            jPanelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductsLayout.createSequentialGroup()
                .addComponent(jLabelProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        jPanelProductsLayout.setVerticalGroup(
            jPanelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProductsLayout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jLabelProducts))
        );

        Menu.add(jPanelProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 35));
        jPanelProducts.getAccessibleContext().setAccessibleName("");

        jPanelPurchase.setBackground(new java.awt.Color(18, 45, 61));
        jPanelPurchase.setForeground(new java.awt.Color(18, 45, 61));

        jLabelPurchase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPurchase.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPurchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/compras.png"))); // NOI18N
        jLabelPurchase.setText("Compras");

        javax.swing.GroupLayout jPanelPurchaseLayout = new javax.swing.GroupLayout(jPanelPurchase);
        jPanelPurchase.setLayout(jPanelPurchaseLayout);
        jPanelPurchaseLayout.setHorizontalGroup(
            jPanelPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPurchaseLayout.createSequentialGroup()
                .addComponent(jLabelPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 51, Short.MAX_VALUE))
        );
        jPanelPurchaseLayout.setVerticalGroup(
            jPanelPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPurchaseLayout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jLabelPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menu.add(jPanelPurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 35));

        jPanelCustomers.setBackground(new java.awt.Color(18, 45, 61));
        jPanelCustomers.setForeground(new java.awt.Color(18, 45, 61));

        jLabelCustomers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCustomers.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clientes-potenciales.png"))); // NOI18N
        jLabelCustomers.setText("Clientes");

        javax.swing.GroupLayout jPanelCustomersLayout = new javax.swing.GroupLayout(jPanelCustomers);
        jPanelCustomers.setLayout(jPanelCustomersLayout);
        jPanelCustomersLayout.setHorizontalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomersLayout.createSequentialGroup()
                .addComponent(jLabelCustomers)
                .addGap(0, 110, Short.MAX_VALUE))
        );
        jPanelCustomersLayout.setVerticalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomersLayout.createSequentialGroup()
                .addComponent(jLabelCustomers)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        Menu.add(jPanelCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 35));

        jPanelEmployers.setBackground(new java.awt.Color(18, 45, 61));
        jPanelEmployers.setForeground(new java.awt.Color(18, 45, 61));

        jLabelEmployers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEmployers.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmployers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/empleados.png"))); // NOI18N
        jLabelEmployers.setText("Empleados");

        javax.swing.GroupLayout jPanelEmployersLayout = new javax.swing.GroupLayout(jPanelEmployers);
        jPanelEmployers.setLayout(jPanelEmployersLayout);
        jPanelEmployersLayout.setHorizontalGroup(
            jPanelEmployersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmployersLayout.createSequentialGroup()
                .addComponent(jLabelEmployers, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 69, Short.MAX_VALUE))
        );
        jPanelEmployersLayout.setVerticalGroup(
            jPanelEmployersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmployersLayout.createSequentialGroup()
                .addComponent(jLabelEmployers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        Menu.add(jPanelEmployers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 200, 35));

        jPanelSuppliers.setBackground(new java.awt.Color(18, 45, 61));
        jPanelSuppliers.setForeground(new java.awt.Color(18, 45, 61));

        jLabelSuppliers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSuppliers.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSuppliers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/proveedor.png"))); // NOI18N
        jLabelSuppliers.setText("Proveedores");

        javax.swing.GroupLayout jPanelSuppliersLayout = new javax.swing.GroupLayout(jPanelSuppliers);
        jPanelSuppliers.setLayout(jPanelSuppliersLayout);
        jPanelSuppliersLayout.setHorizontalGroup(
            jPanelSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuppliersLayout.createSequentialGroup()
                .addComponent(jLabelSuppliers)
                .addGap(0, 77, Short.MAX_VALUE))
        );
        jPanelSuppliersLayout.setVerticalGroup(
            jPanelSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuppliersLayout.createSequentialGroup()
                .addComponent(jLabelSuppliers)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        Menu.add(jPanelSuppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 40));

        jPanelCategories.setBackground(new java.awt.Color(18, 45, 61));
        jPanelCategories.setForeground(new java.awt.Color(18, 45, 61));

        jLabelCategories.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCategories.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/categorias.png"))); // NOI18N
        jLabelCategories.setText("Categorias");

        javax.swing.GroupLayout jPanelCategoriesLayout = new javax.swing.GroupLayout(jPanelCategories);
        jPanelCategories.setLayout(jPanelCategoriesLayout);
        jPanelCategoriesLayout.setHorizontalGroup(
            jPanelCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoriesLayout.createSequentialGroup()
                .addComponent(jLabelCategories)
                .addGap(0, 90, Short.MAX_VALUE))
        );
        jPanelCategoriesLayout.setVerticalGroup(
            jPanelCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoriesLayout.createSequentialGroup()
                .addComponent(jLabelCategories)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        Menu.add(jPanelCategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, 40));

        jPanelReports.setBackground(new java.awt.Color(18, 45, 61));
        jPanelReports.setForeground(new java.awt.Color(18, 45, 61));

        jLabelReports.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelReports.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reportes.png"))); // NOI18N
        jLabelReports.setText("Reportes");

        javax.swing.GroupLayout jPanelReportsLayout = new javax.swing.GroupLayout(jPanelReports);
        jPanelReports.setLayout(jPanelReportsLayout);
        jPanelReportsLayout.setHorizontalGroup(
            jPanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReportsLayout.createSequentialGroup()
                .addComponent(jLabelReports)
                .addGap(0, 101, Short.MAX_VALUE))
        );
        jPanelReportsLayout.setVerticalGroup(
            jPanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReportsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelReports)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Menu.add(jPanelReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 200, 40));

        jPanelSettings.setBackground(new java.awt.Color(18, 45, 61));
        jPanelSettings.setForeground(new java.awt.Color(18, 45, 61));

        jLabelSettings.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSettings.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/configuraciones.png"))); // NOI18N
        jLabelSettings.setText("Configuraciones");

        javax.swing.GroupLayout jPanelSettingsLayout = new javax.swing.GroupLayout(jPanelSettings);
        jPanelSettings.setLayout(jPanelSettingsLayout);
        jPanelSettingsLayout.setHorizontalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                .addComponent(jLabelSettings)
                .addGap(0, 53, Short.MAX_VALUE))
        );
        jPanelSettingsLayout.setVerticalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                .addComponent(jLabelSettings)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        Menu.add(jPanelSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 200, 40));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 580));

        logo.setBackground(new java.awt.Color(255, 255, 255));
        logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Captura.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        logo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));
        logo.getAccessibleContext().setAccessibleName("");

        cabecera.setBackground(new java.awt.Color(18, 45, 61));
        cabecera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FARMACIA VIDA NATURAL");
        cabecera.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 340, 100));

        Btn_Bottom.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Bottom.setForeground(new java.awt.Color(0, 0, 0));
        cabecera.add(Btn_Bottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 80, 65));

        btn_loginOut.setBackground(new java.awt.Color(255, 255, 255));
        btn_loginOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_loginOut.setForeground(new java.awt.Color(0, 0, 0));
        btn_loginOut.setText("SALIR");
        cabecera.add(btn_loginOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 35, -1, 30));

        getContentPane().add(cabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1010, 100));
        cabecera.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab5", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab6", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab7", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab8", jPanel8);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1010, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new SystemView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Bottom;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton btn_loginOut;
    private javax.swing.JPanel cabecera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabelCategories;
    public javax.swing.JLabel jLabelCustomers;
    public javax.swing.JLabel jLabelEmployers;
    public javax.swing.JLabel jLabelProducts;
    public javax.swing.JLabel jLabelPurchase;
    public javax.swing.JLabel jLabelReports;
    public javax.swing.JLabel jLabelSettings;
    public javax.swing.JLabel jLabelSuppliers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    public javax.swing.JPanel jPanelCategories;
    public javax.swing.JPanel jPanelCustomers;
    public javax.swing.JPanel jPanelEmployers;
    public javax.swing.JPanel jPanelProducts;
    public javax.swing.JPanel jPanelPurchase;
    public javax.swing.JPanel jPanelReports;
    public javax.swing.JPanel jPanelSettings;
    public javax.swing.JPanel jPanelSuppliers;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel logo;
    // End of variables declaration//GEN-END:variables
}

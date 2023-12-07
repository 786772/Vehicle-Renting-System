package apps;
import DB.DBCon;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class MainWindow extends javax.swing.JFrame {
   public MainWindow() {
        initComponents();
    }
String user;
 public MainWindow(String str) {
        initComponents();
        user=str;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        AddVehicle = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        SearchUpdate = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
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
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        searchUpdate = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        VehicleList = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddCustomer = new javax.swing.JInternalFrame();
        jLabel28 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        UpdateDelete = new javax.swing.JInternalFrame();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        CustomerList = new javax.swing.JInternalFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        NewBooking = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        CustomerReport = new javax.swing.JInternalFrame();
        jPanel11 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jTextField46 = new javax.swing.JTextField();
        jButton29 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel10 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        searchupdate = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1109, 0, -1, -1));

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Info2.png"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/030.png"))); // NOI18N
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UI Details.png"))); // NOI18N
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/application_view_detail.png"))); // NOI18N
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_info.png"))); // NOI18N
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tag-sale-16.png"))); // NOI18N
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton7);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search.png"))); // NOI18N
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton8);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/030.png"))); // NOI18N
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton9);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/030.png"))); // NOI18N
        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton10);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton11);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UI Details.png"))); // NOI18N
        jButton12.setFocusable(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton12);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 59));

        jDesktopPane2.setBackground(new java.awt.Color(0, 204, 255));
        jDesktopPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddVehicle.setBackground(new java.awt.Color(51, 51, 255));
        AddVehicle.setClosable(true);
        AddVehicle.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        AddVehicle.setMaximizable(true);
        AddVehicle.setVisible(true);
        AddVehicle.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel1.setText("Add New Vehicle");
        AddVehicle.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 310, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Vehile Number");
        AddVehicle.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 120, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Vehicle Name");
        AddVehicle.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Catagery");
        AddVehicle.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Vehicle Color");
        AddVehicle.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Owner Name");
        AddVehicle.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Owner Mobile Number");
        AddVehicle.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Owner Address");
        AddVehicle.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Rent Amount");
        AddVehicle.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Discount");
        AddVehicle.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));
        AddVehicle.getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 520, -1));
        AddVehicle.getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 520, -1));
        AddVehicle.getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 520, -1));
        AddVehicle.getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 520, -1));
        AddVehicle.getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 520, -1));
        AddVehicle.getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 520, -1));
        AddVehicle.getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 520, -1));
        AddVehicle.getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 520, -1));
        AddVehicle.getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 520, -1));

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jButton13.setText("Submit");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        AddVehicle.getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, -1, -1));

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jButton14.setText("Reset");
        AddVehicle.getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 280, 110, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/car2.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 102))));
        AddVehicle.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 220, 300));

        jDesktopPane2.add(AddVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 1090, 570));

        SearchUpdate.setClosable(true);
        SearchUpdate.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        SearchUpdate.setMaximizable(true);
        SearchUpdate.setVisible(false);

        jPanel2.setBackground(new java.awt.Color(255, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel13.setText("Search/Update Vehicle");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Vehicle Number");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Vehicle Name");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Catagery");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Vehicle Color");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("OwnerName");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Owner Mobile Number");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Owner Address");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Rent Amount");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Discount");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 480, -1));
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 480, -1));

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 480, -1));
        jPanel2.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 480, -1));
        jPanel2.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 480, -1));
        jPanel2.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 480, -1));
        jPanel2.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 480, -1));
        jPanel2.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 480, -1));
        jPanel2.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 480, -1));

        searchUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search.png"))); // NOI18N
        searchUpdate.setText("Search");
        searchUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(searchUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 100, 30));

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jButton16.setText("Update");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 100, 30));

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tag-sale-16.png"))); // NOI18N
        jButton17.setText("Reset");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 100, 30));

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Info2.png"))); // NOI18N
        jButton18.setText("Delete");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 100, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/car1.jpg"))); // NOI18N
        jLabel23.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(51, 0, 255))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 190, 290));

        jInternalFrame1.setVisible(true);
        jPanel2.add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1130, 620));

        SearchUpdate.getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jDesktopPane2.add(SearchUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 990, 590));

        VehicleList.setClosable(true);
        VehicleList.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        VehicleList.setMaximizable(true);
        VehicleList.setResizable(true);
        VehicleList.setTitle("Vehicle List");
        VehicleList.setVisible(false);

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel24.setText("Vehicle List");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 5, -1, 36));

        VehicleList.getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(501, 501, 501)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        VehicleList.getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        jDesktopPane2.add(VehicleList, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 1020, 600));

        AddCustomer.setBackground(new java.awt.Color(255, 153, 153));
        AddCustomer.setClosable(true);
        AddCustomer.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        AddCustomer.setIconifiable(true);
        AddCustomer.setMaximizable(true);
        AddCustomer.setVisible(false);
        AddCustomer.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Customer Phone No");
        AddCustomer.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Add Customer");
        AddCustomer.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Aadhar Number");
        AddCustomer.getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Driving License No");
        AddCustomer.getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Customer Name");
        AddCustomer.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Email Address");
        AddCustomer.getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jTextField19.setText("ktjhkfjgh");
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        AddCustomer.getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 240, -1));
        AddCustomer.getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 240, -1));

        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        AddCustomer.getContentPane().add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 240, -1));
        AddCustomer.getContentPane().add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 240, -1));

        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });
        AddCustomer.getContentPane().add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 240, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Address");
        AddCustomer.getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Alternate Mobile");
        AddCustomer.getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Reference Name");
        AddCustomer.getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Reference Number");
        AddCustomer.getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, -1, -1));

        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });
        AddCustomer.getContentPane().add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 240, -1));
        AddCustomer.getContentPane().add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 240, -1));
        AddCustomer.getContentPane().add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 240, -1));
        AddCustomer.getContentPane().add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 240, -1));

        jButton15.setBackground(new java.awt.Color(51, 102, 255));
        jButton15.setText("Submit");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        AddCustomer.getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 90, 30));

        jButton19.setBackground(new java.awt.Color(255, 51, 51));
        jButton19.setText("Reset");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        AddCustomer.getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, 80, 30));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/car2.jpg"))); // NOI18N
        AddCustomer.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 560));

        jDesktopPane2.add(AddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1070, 590));

        UpdateDelete.setClosable(true);
        UpdateDelete.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        UpdateDelete.setIconifiable(true);
        UpdateDelete.setMaximizable(true);
        UpdateDelete.setVisible(false);
        UpdateDelete.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel38.setText("Update/Delete Customer");
        UpdateDelete.getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setText("Customer Phone No");
        UpdateDelete.getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setText("Customer Name");
        UpdateDelete.getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel41.setText("Aadhar Number");
        UpdateDelete.getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setText("Driving License No");
        UpdateDelete.getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel43.setText("Email Address");
        UpdateDelete.getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));
        UpdateDelete.getContentPane().add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 280, -1));

        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField29ActionPerformed(evt);
            }
        });
        UpdateDelete.getContentPane().add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 280, -1));
        UpdateDelete.getContentPane().add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 280, -1));
        UpdateDelete.getContentPane().add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 280, -1));
        UpdateDelete.getContentPane().add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 280, -1));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setText("Alternate Number");
        UpdateDelete.getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, -1));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setText("Customer Address");
        UpdateDelete.getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, -1, -1));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setText("Reference No");
        UpdateDelete.getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, -1, -1));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel47.setText("Reference Name");
        UpdateDelete.getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, -1, -1));
        UpdateDelete.getContentPane().add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 240, -1));
        UpdateDelete.getContentPane().add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 240, -1));
        UpdateDelete.getContentPane().add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 240, -1));
        UpdateDelete.getContentPane().add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 240, -1));

        jButton20.setBackground(new java.awt.Color(0, 204, 204));
        jButton20.setText("Update");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        UpdateDelete.getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 80, 30));

        jButton21.setBackground(new java.awt.Color(0, 102, 153));
        jButton21.setText("Delete");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        UpdateDelete.getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 80, 30));

        jButton22.setBackground(new java.awt.Color(255, 51, 102));
        jButton22.setText("Reset");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        UpdateDelete.getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 90, 30));

        jButton23.setBackground(new java.awt.Color(51, 153, 255));
        jButton23.setText("Search");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        UpdateDelete.getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 80, 30));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/car1.jpg"))); // NOI18N
        jLabel37.setText("jLabel37");
        UpdateDelete.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1120, 550));

        jDesktopPane2.add(UpdateDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 1130, 580));

        CustomerList.setClosable(true);
        CustomerList.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        CustomerList.setIconifiable(true);
        CustomerList.setMaximizable(true);
        CustomerList.setTitle("Customer List");
        CustomerList.setVisible(false);

        jPanel7.setBackground(new java.awt.Color(255, 255, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel48.setText("Customer Vehicle List");
        jPanel7.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1160, 550));

        javax.swing.GroupLayout CustomerListLayout = new javax.swing.GroupLayout(CustomerList.getContentPane());
        CustomerList.getContentPane().setLayout(CustomerListLayout);
        CustomerListLayout.setHorizontalGroup(
            CustomerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CustomerListLayout.setVerticalGroup(
            CustomerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane2.add(CustomerList, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1170, 630));

        NewBooking.setClosable(true);
        NewBooking.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        NewBooking.setIconifiable(true);
        NewBooking.setMaximizable(true);
        NewBooking.setTitle("New Booking");
        NewBooking.setVisible(false);
        NewBooking.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel49.setText("New Booking");
        jLabel49.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, 50));

        jPanel6.setBackground(new java.awt.Color(255, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel51.setText("Customer Id");
        jPanel6.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel52.setText("Booking Date");
        jPanel6.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel53.setText("Time");
        jPanel6.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel54.setText("Renting Time (Expected)");
        jPanel6.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jTextField38.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jPanel6.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 470, -1));

        jTextField39.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jPanel6.add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 470, -1));

        jTextField40.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jPanel6.add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 470, -1));

        jTextField41.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jPanel6.add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 470, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 820, 220));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel50.setText("Vehicle Number");
        jPanel5.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jTextField37.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jTextField37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField37ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 460, -1));

        jPanel8.setBackground(new java.awt.Color(102, 255, 102));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel55.setText("Return Date");
        jPanel8.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel56.setText("Return Time");
        jPanel8.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel57.setText("Discount");
        jPanel8.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel58.setText("Paybale Amount");
        jPanel8.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jTextField42.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jPanel8.add(jTextField42, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 460, -1));

        jTextField43.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jPanel8.add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 460, -1));

        jTextField44.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jPanel8.add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 460, -1));

        jTextField45.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jPanel8.add(jTextField45, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 460, -1));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 820, 210));

        jButton24.setBackground(new java.awt.Color(102, 102, 255));
        jButton24.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jButton24.setText("Search");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 120, -1, -1));

        jButton25.setBackground(new java.awt.Color(51, 51, 255));
        jButton25.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jButton25.setText("Booking");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 180, -1, -1));

        jButton26.setBackground(new java.awt.Color(51, 51, 255));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jButton26.setText("Return");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 230, -1, -1));

        jButton27.setBackground(new java.awt.Color(51, 51, 255));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jButton27.setText("Confirm Return");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 300, -1, -1));

        jButton28.setBackground(new java.awt.Color(102, 102, 255));
        jButton28.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jButton28.setText("Reset");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, -1, -1));

        NewBooking.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1150, 580));

        jDesktopPane2.add(NewBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1160, 640));

        CustomerReport.setClosable(true);
        CustomerReport.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        CustomerReport.setMaximizable(true);
        CustomerReport.setVisible(false);
        CustomerReport.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(102, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel59.setText("Customer Name And Mobile Number");
        jPanel11.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 340, 60));
        jPanel11.add(jTextField46, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 260, 20));

        jButton29.setText("Submit");
        jPanel11.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 120, -1, -1));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Customer Report");
        jPanel11.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 90));

        CustomerReport.getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 160));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable3);

        CustomerReport.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1120, 410));

        jDesktopPane2.add(CustomerReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1130, 600));

        jInternalFrame2.setClosable(true);
        jInternalFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setVisible(true);

        jPanel10.setBackground(new java.awt.Color(51, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel61.setText("Change Password");
        jPanel10.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 0, 395, 73));

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel62.setText("Old PASSWORD");
        jPanel10.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, 30));

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel63.setText("NEW PASSWORD");
        jPanel10.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel64.setText("CONFIRM PASSWORD");
        jPanel10.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        jPanel10.add(jTextField47, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 340, -1));
        jPanel10.add(jTextField48, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 340, -1));
        jPanel10.add(jTextField49, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 340, -1));

        jButton30.setText("SUBMIT");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setText("RESET");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton31)
                .addGap(37, 37, 37))
        );

        jPanel10.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 120, 140));

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane2.add(jInternalFrame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 1010, 520));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cardes.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jDesktopPane2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/car2.jpg"))); // NOI18N
        jDesktopPane2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jDesktopPane2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1200, 670));

        jMenu1.setText("Vehicle");

        jMenuItem2.setText("Add Vehicle");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        searchupdate.setText("Search/Update");
        searchupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchupdateActionPerformed(evt);
            }
        });
        jMenu1.add(searchupdate);

        jMenuItem4.setText("Add List");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Customer");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Add Customer");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Search/Update Customer");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Customer List");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Booking");

        jMenuItem1.setText("New Booking");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem8.setText("Return Booking");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Report");

        jMenuItem9.setText("Customer Report");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Booking Report");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Account");

        jMenuItem11.setText("jMenuItem11");
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("jMenuItem12");
        jMenu5.add(jMenuItem12);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
             try
     {
       DBCon db=new DBCon();
       db.pstmt=db.con.prepareStatement("insert into vehicle values(?,?,?,?,?,?,?,?,?,'1')");
       db.pstmt.setString(1, jTextField1.getText());
       db.pstmt.setString(2, jTextField2.getText());
       db.pstmt.setString(3, jTextField3.getText());
       db.pstmt.setString(4, jTextField4.getText());
       db.pstmt.setString(5, jTextField5.getText());
       db.pstmt.setString(6, jTextField6.getText());
       db.pstmt.setString(7, jTextField7.getText());
       db.pstmt.setString(8, jTextField8.getText());
       db.pstmt.setString(9, jTextField9.getText());
      int i=db.pstmt.executeUpdate();
      if(i>0)
       {
         JOptionPane.showMessageDialog(this, "Vehicle Added successfully");
          jTextField1.setText("");
          jTextField2.setText("");
          jTextField3.setText("");
          jTextField4.setText("");
          jTextField5.setText("");
          jTextField6.setText("");
          jTextField7.setText("");
          jTextField8.setText("");
          jTextField9.setText("");
                }

     }
     catch(Exception e)
     {
e.printStackTrace();
     }

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        AddVehicle.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void searchUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUpdateActionPerformed
        // TODO add your handling code here:
                try
        {
          String vno=jTextField10.getText();
    DBCon db=new DBCon();
    db.pstmt=db.con.prepareStatement("select * from vehicle where vehicle_number=?");
db.pstmt.setString(1, vno);
db.rst=db.pstmt.executeQuery();
          if(db.rst.next())
          {
           jTextField11.setText(db.rst.getString(2));
           jTextField12.setText(db.rst.getString(3));
           jTextField13.setText(db.rst.getString(4));
           jTextField14.setText(db.rst.getString(5));
           jTextField15.setText(db.rst.getString(6));
           jTextField16.setText(db.rst.getString(7));
           jTextField17.setText(db.rst.getString(8));
           jTextField18.setText(db.rst.getString(9));
          }
          else
          {
JOptionPane.showMessageDialog(this, "This Vehicle is not Registered");
          }
        }
        catch(Exception e)
        {
e.printStackTrace();
        }

    }//GEN-LAST:event_searchUpdateActionPerformed

    private void searchupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchupdateActionPerformed
        // TODO add your handling code here:
        SearchUpdate.setVisible(true);
    }//GEN-LAST:event_searchupdateActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        try
        {
        DBCon db=new DBCon();
        db.pstmt=db.con.prepareStatement("update vehicle set   `name`=?,`catg`=?,`color`=?,`owner`=?,`own_mob`=?,`own_addr` =?,`rent_amt`= ?,`dsc` =? where `vehicle_number`=?");
        db.pstmt.setString(1, jTextField11.getText());
        db.pstmt.setString(2, jTextField12.getText());
        db.pstmt.setString(3, jTextField13.getText());
        db.pstmt.setString(4, jTextField14.getText());
        db.pstmt.setString(5, jTextField15.getText());
        db.pstmt.setString(6, jTextField16.getText());
        db.pstmt.setString(7, jTextField17.getText());
        db.pstmt.setString(8, jTextField18.getText());
        db.pstmt.setString(9, jTextField10.getText());
        int i=db.pstmt.executeUpdate();
        if(i>0)
        {
        JOptionPane.showMessageDialog(this, "Vehicle detail Updated Successfully");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        jTextField10.setText("");

        }
        }
        catch(Exception e)
        {
         e.printStackTrace();
        }

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        
          jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
                try
        {
         String vno=jTextField10.getText();
DBCon db=new DBCon();
db.pstmt=db.con.prepareStatement("delete from vehicle where vehicle_number=?");
db.pstmt.setString(1, vno);
int r=JOptionPane.showConfirmDialog(this, "Do you want to Delete(Yes/No)");
         if(r==0)
         {
int i=db.pstmt.executeUpdate();
          if(i>0)
          {
JOptionPane.showMessageDialog(this, "record Deleted Successfully");
           // Code for Reset
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");

          }
         }
        }
        catch(Exception e)
        {
e.printStackTrace();
        }

    }//GEN-LAST:event_jButton18ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        //code for add customer
        AddCustomer.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
               try{
            Vector<String> header= new Vector<>();
            Vector<Vector<String>> data= new Vector<>();
            header.add("Vehicle Number");
            header.add("Vehicle Name");
            header.add("Catagery");
            header.add("Color");
            header.add("Owner Name");
            header.add("Owner Number");
            header.add("Owner Address");
            header.add("Rent Amount");
            header.add("Discount Amount");
            header.add("Vehicle Status");
            DBCon db=new DBCon();
            db.pstmt=db.con.prepareStatement("Select * from Vehicle");
            db.rst=db.pstmt.executeQuery();
            while(db.rst.next())
            {
                Vector<String> temp =new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                temp.add(db.rst.getString(6));
                temp.add(db.rst.getString(7));
                temp.add(db.rst.getString(8));
                temp.add(db.rst.getString(9));
                if(db.rst.getString(9).equals("1"))
                    temp.add("Booked");
                else
                    temp.add("Unbooked");
                data.add(temp);  
            }
            jTable1.setModel(new DefaultTableModel(data,header));
            VehicleList.setVisible(true);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // code for submit
        try
     {
      DBCon db=new DBCon();
      db.pstmt=db.con.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?,?,'1')");
      db.pstmt.setString(1, jTextField19.getText());
      db.pstmt.setString(2, jTextField20.getText());
      db.pstmt.setString(3, jTextField21.getText());
      db.pstmt.setString(4, jTextField22.getText());
      db.pstmt.setString(5, jTextField23.getText());
      db.pstmt.setString(6, jTextField24.getText());
      db.pstmt.setString(7, jTextField25.getText());
      db.pstmt.setString(8, jTextField26.getText());
      db.pstmt.setString(9, jTextField27.getText());
     

      int i=db.pstmt.executeUpdate();
      if(i>0)
      {
          JOptionPane.showMessageDialog(this, "Vehicle Added successfully");
          jTextField19.setText("");
          jTextField20.setText("");
          jTextField21.setText("");
          jTextField22.setText("");
          jTextField23.setText("");
          jTextField24.setText("");
          jTextField25.setText("");
          jTextField26.setText("");
          jTextField27.setText("");
                }
      
     }
     catch(Exception e)
     {
      e.printStackTrace();
     }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField29ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // code for customer update
        try
        {
            DBCon db=new DBCon();
            db.pstmt=db.con.prepareStatement("update customer set   `name` = ?,`aadhar` = ?,`dlno` = ?,`mail` =?,`addr` = ?,`alt_mob` = ?,`ref_name` = ?,`ref_num` = ?  where mobile =?");

            db.pstmt.setString(2, jTextField29.getText());
            db.pstmt.setString(3, jTextField30.getText());
            db.pstmt.setString(4, jTextField31.getText());
            db.pstmt.setString(5, jTextField32.getText());
            db.pstmt.setString(6, jTextField33.getText());
            db.pstmt.setString(7, jTextField34.getText());
            db.pstmt.setString(8, jTextField35.getText());
            db.pstmt.setString(9, jTextField36.getText());
            db.pstmt.setString(1, jTextField28.getText());

            int i=db.pstmt.executeUpdate();
            if(i>0)
            {
                JOptionPane.showMessageDialog(this, "Updated Successfully");
                jTextField28.setText("");
                jTextField29.setText("");
                jTextField30.setText("");
                jTextField31.setText("");
                jTextField32.setText("");
                jTextField33.setText("");
                jTextField34.setText("");
                jTextField35.setText("");
                jTextField36.setText("");

            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // code for customer search
        try
        {
            String vno=jTextField28.getText();
            DBCon db=new DBCon();
            db.pstmt=db.con.prepareStatement("select * from customer where mobile=?");
            db.pstmt.setString(1, vno);
            db.rst=db.pstmt.executeQuery();
            if(db.rst.next())
            {
                jTextField29.setText(db.rst.getString(2));
                jTextField30.setText(db.rst.getString(3));
                jTextField31.setText(db.rst.getString(4));
                jTextField32.setText(db.rst.getString(5));
                jTextField33.setText(db.rst.getString(6));
                jTextField34.setText(db.rst.getString(7));
                jTextField35.setText(db.rst.getString(8));
                jTextField36.setText(db.rst.getString(9));
            }
            else
            {
                JOptionPane.showMessageDialog(this, "This Vehicle is not Registered");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        jTextField19.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
        jTextField26.setText("");
        jTextField27.setText("");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // code for customer delete
        try
        {
            String vno=jTextField28.getText();
            DBCon db=new DBCon();
            db.pstmt=db.con.prepareStatement("delete from customer where mobile=?");
            db.pstmt.setString(1, vno);
            int r=JOptionPane.showConfirmDialog(this, "Do you want to Delete(Yes/No)");
            if(r==0)
            {
                int i=db.pstmt.executeUpdate();
                if(i>0)
                {
                    JOptionPane.showMessageDialog(this, "record Deleted Successfully");
                    
                    jTextField28.setText("");
                    jTextField29.setText("");
                    jTextField30.setText("");
                    jTextField31.setText("");
                    jTextField32.setText("");
                    jTextField33.setText("");
                    jTextField34.setText("");
                    jTextField35.setText("");
                    jTextField36.setText("");

                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
            // CODE FOR RESET
        jTextField28.setText("");
        jTextField29.setText("");
        jTextField30.setText("");
        jTextField31.setText("");
        jTextField32.setText("");
        jTextField33.setText("");
        jTextField34.setText("");
        jTextField35.setText("");
        jTextField36.setText("");
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        UpdateDelete.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
              try{
            Vector<String> header= new Vector<>();
            Vector<Vector<String>> data= new Vector<>();
            header.add("Customer Mobile No");
            header.add("Customer Name");
            header.add("Aadhar Number");
            header.add("Driving License No");
            header.add("Email Address");
            header.add("Customer Address");
            header.add("Alternate Number");
            header.add("Reference Name");
            header.add("Reference Number");
            header.add("relation");
            DBCon db=new DBCon();
            db.pstmt=db.con.prepareStatement("Select * from customer");
            db.rst=db.pstmt.executeQuery();
            while(db.rst.next())
            {
                Vector<String> temp =new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                temp.add(db.rst.getString(6));
                temp.add(db.rst.getString(7));
                temp.add(db.rst.getString(8));
                temp.add(db.rst.getString(9));
                if(db.rst.getString(10).equals("0"))
                    temp.add("Rented");
                else
                    temp.add("Not Rented");
                data.add(temp);  
            }
            jTable2.setModel(new DefaultTableModel(data,header));
            CustomerList.setVisible(true);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // CODE FOR SEARCH
              try
      {


        String vno=jTextField37.getText();
        DBCon db=new DBCon();
        db.pstmt=db.con.prepareStatement("SELECT cust_id,booking_date,booking_time,excp_duration,return_date FROM booking WHERE veh_no=?");
      db.pstmt.setString(1, vno);
      db.rst=db.pstmt.executeQuery();
     if(db.rst.next())
     {
    if(db.rst.getString(5)==null)
    {
        jPanel7.setVisible(true);

     jTextField38.setText(db.rst.getString(1));
     jTextField39.setText(db.rst.getString(2));
     jTextField40.setText(db.rst.getString(3));
     jTextField41.setText(db.rst.getString(4));
         }
    else
    {
     JOptionPane.showMessageDialog(this, "This Vehicle is not Booked");

    }
     }
     else
     {
     JOptionPane.showMessageDialog(this, "Invalid Vehicle Number");
     }
      }
      catch(Exception e)
      {
       e.printStackTrace();
      }

    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // CODE FOR BOOKING
              try
      {
       String vnumber=jTextField37.getText();
       String cid=jTextField38.getText();
       String bdate=jTextField39.getText();
       String btime=jTextField40.getText();
       String exptime=jTextField41.getText();
       DBCon db=new DBCon();
       //It check that vehicle is booked or not
       db.pstmt=db.con.prepareStatement("select veh_status from vehicle where vehicle_number=?");
       db.pstmt.setString(1, vnumber);
       db.rst=db.pstmt.executeQuery();
       //It check that customer id is valid or Not
       java.sql.PreparedStatement pst=db.con.prepareStatement("select * from customer where mobile=?");
       pst.setString(1, cid);
       java.sql.ResultSet rs=pst.executeQuery();
       if(db.rst.next() && rs.next())
       {
        String status=db.rst.getString(1);
        if(status.equals("1"))
        {
        db.pstmt=db.con.prepareStatement("insert into booking(cust_id,veh_no,booking_date,booking_time,excp_duration,booking_date_time) values(?,?,?,?,?,?)");
        db.pstmt.setString(1, cid);
        db.pstmt.setString(2, vnumber);
        db.pstmt.setString(3, bdate);
        db.pstmt.setString(4, btime);
        db.pstmt.setString(5, exptime);
        db.pstmt.setString(6, new java.util.Date().toString());
        int i1=db.pstmt.executeUpdate();
        db.pstmt=db.con.prepareStatement("update vehicle set veh_status=? where vehicle_number=?");
        db.pstmt.setString(1, "0");
        db.pstmt.setString(2, vnumber);
        int i2=db.pstmt.executeUpdate();
        if(i1>0 && i2>0)
        {
         JOptionPane.showMessageDialog(this,"Vehicle Booked Successfully");
       jTextField37.setText("");
       jTextField38.setText("");
       jTextField39.setText("");
       jTextField40.setText("");
       jTextField41.setText("");

        }
        }
        else
        {
        JOptionPane.showMessageDialog(this, vnumber +" is pre Booked, Please Select Another Vehicle");

        }
       }
       else
       {
        JOptionPane.showMessageDialog(this, "Error : Invalid Vehicle Number or Customer ID ");
       }

      }
      catch(Exception e)
      {
       e.printStackTrace();
      }

    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // Code for return
        jPanel8.setVisible(true);
        

    }//GEN-LAST:event_jButton26ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

        // TODO add your handling code here:\
        jPanel8.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
       NewBooking.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        //CODE FOR CONFIRM RETURN
                try
        {
        String veh_no=jTextField37.getText();
        String cust_id=jTextField38.getText();
        String rdate=jTextField42.getText();
        String rtime=jTextField43.getText();
        String disc=jTextField44.getText();
        String amt=jTextField45.getText();
        DBCon db=new DBCon();
        db.pstmt=db.con.prepareStatement("update booking set return_date=?,return_time=?,payble_amt=?,dsc_amt=?,return_date_time=? where cust_id=? and veh_no=?");
        db.pstmt.setString(1,rdate);
        db.pstmt.setString(2,rtime);
        db.pstmt.setString(3,amt);
        db.pstmt.setString(4,disc);
        db.pstmt.setString(5,new java.util.Date().toString());
        db.pstmt.setString(6,cust_id);
        db.pstmt.setString(7,veh_no);
        int i1=db.pstmt.executeUpdate();
        db.pstmt=db.con.prepareStatement("update vehicle set veh_status=? where vehicle_number=?");
        db.pstmt.setString(1, "1");
        db.pstmt.setString(2, veh_no);
        int i2=db.pstmt.executeUpdate();
        if(i1>0 && i2>0)
        {
         JOptionPane.showMessageDialog(this, "Vehicle Returned successfully");
         jTextField37.setText("");
         jTextField38.setText("");
         jTextField39.setText("");
         jTextField40.setText("");
         jTextField41.setText("");
         jTextField42.setText("");
         jTextField43.setText("");
         jTextField44.setText("");
         jTextField45.setText("");

        }
        }
        catch(Exception e)
        {
         e.printStackTrace();
        }

    }//GEN-LAST:event_jButton27ActionPerformed

    private void jTextField37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField37ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // CODE FOR RESET
         jTextField37.setText("");
        jTextField38.setText("");
        jTextField39.setText("");
        jTextField40.setText("");
        jTextField41.setText("");
        jTextField42.setText("");
        jTextField43.setText("");
        jTextField44.setText("");
        jTextField45.setText("");
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // CODE FOR CUSTOMER REPORT
                try
        {
CustomerReport.setVisible(true);
Vector<String> header=new Vector<String>();
Vector<Vector<String>> data=new Vector<Vector<String>>();
header.add("Customer NAME");
header.add("Address");
header.add("DL Number");
header.add("Mobile Number");
header.add("Vehicle Number");
header.add("Booking DATE");
header.add("RETURN DATE");
header.add("Paybale Amount");
DBCon db=new DBCon();
db.pstmt=db.con.prepareStatement("SELECT customer.name,customer.addr,customer.dlno,customer.mobile,booking.veh_no,booking.booking_date,booking.return_date,booking.payble_amt FROM customer,booking WHERE customer.mobile=booking.cust_id" );
db.rst=db.pstmt.executeQuery();
while(db.rst.next())
{
  Vector<String> temp=new Vector<String>();
temp.add(db.rst.getString(1));
temp.add(db.rst.getString(2));
temp.add(db.rst.getString(3));
temp.add(db.rst.getString(4));
temp.add(db.rst.getString(5));
temp.add(db.rst.getString(6));
temp.add(db.rst.getString(7));
temp.add(db.rst.getString(8));
data.add(temp);
}
 jTable3.setModel(new DefaultTableModel(data,header));
        }
        catch(Exception e)
        {
e.printStackTrace();
        }

    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // CODE FOR BOOKING REPORT
        try
        {
CustomerReport.setVisible(true);
Vector<String> header=new Vector<String>();
Vector<Vector<String>> data=new Vector<Vector<String>>();
header.add("Customer NAME");
header.add("Address");
header.add("DL Number");
header.add("Mobile Number");
header.add("Vehicle Number");
header.add("Booking DATE");
header.add("RETURN DATE");
header.add("Paybale Amount");
DBCon db=new DBCon();
db.pstmt=db.con.prepareStatement("SELECT customer.name,customer.addr,customer.dlno,customer.mobile,booking.veh_no,booking.booking_date,booking.return_date,booking.payble_amt FROM customer,booking WHERE customer.mobile=booking.cust_id and (customer.mobile=? or customer.name=?) " );
db.pstmt.setString(1,jTextField19.getText());
db.pstmt.setString(2,jTextField19.getText());
db.rst=db.pstmt.executeQuery();
while(db.rst.next())
{
  Vector<String> temp=new Vector<String>();
temp.add(db.rst.getString(1));
temp.add(db.rst.getString(2));
temp.add(db.rst.getString(3));
temp.add(db.rst.getString(4));
temp.add(db.rst.getString(5));
temp.add(db.rst.getString(6));
temp.add(db.rst.getString(7));
temp.add(db.rst.getString(8));
data.add(temp);
}
 jTable3.setModel(new DefaultTableModel(data,header));
        }
        catch(Exception e)
        {
e.printStackTrace();
        }

    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // CODE FOR PASSWORD SUBMIT
        try
        {
            String opswd=jTextField47.getText();
            String npswd=jTextField48.getText();;
           String cpswd=jTextField49.getText();
           DBCon db=new DBCon();
            db.pstmt=db.con.prepareStatement("select * from login where user=? and password=?");
            db.pstmt.setString(1, user);
            db.pstmt.setString(2, opswd);
            db.rst=db.pstmt.executeQuery();
            if(db.rst.next())
            {
           if(npswd.equals(cpswd))
           {
           db.pstmt=db.con.prepareStatement("update login set password=? where user=?");
           db.pstmt.setString(1,npswd);
           db.pstmt.setString(2, user);
           int i=db.pstmt.executeUpdate();
           if(i>0)
           {
            JOptionPane.showMessageDialog(this,"Password Updated Successfully");
                      }
           }
           else
           {
           JOptionPane.showMessageDialog(this, "Old and confirm Password does not Match");
           }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Incorrect User Name or Password");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton30ActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame AddCustomer;
    private javax.swing.JInternalFrame AddVehicle;
    private javax.swing.JInternalFrame CustomerList;
    private javax.swing.JInternalFrame CustomerReport;
    private javax.swing.JInternalFrame NewBooking;
    private javax.swing.JInternalFrame SearchUpdate;
    private javax.swing.JInternalFrame UpdateDelete;
    private javax.swing.JInternalFrame VehicleList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
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
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton searchUpdate;
    private javax.swing.JMenuItem searchupdate;
    // End of variables declaration//GEN-END:variables
}

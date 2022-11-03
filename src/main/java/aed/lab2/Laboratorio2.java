package aed.lab2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Laboratorio2 extends javax.swing.JPanel {

    //Variables a usar
    int tam, cuenta;
    int arregloA[] = new int[100];
    int arregloB[] = new int[100];int aux;
    
    public Laboratorio2() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpanelLaboratorio2 = new javax.swing.JTabbedPane();
        panelBurbuja = new javax.swing.JPanel();
        txtMBurbuja = new javax.swing.JLabel();
        txtTamBurbuja = new javax.swing.JLabel();
        txtbTamBurbuja = new javax.swing.JTextField();
        btnTamBurbuja = new javax.swing.JButton();
        txtArregloBurbuja = new javax.swing.JLabel();
        txtbArregloBurbuja = new javax.swing.JTextField();
        btnArregloBurbuja = new javax.swing.JButton();
        txtArregloCelda = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBurbuja = new javax.swing.JTable();
        btnOrdenarBurbuja = new javax.swing.JButton();
        btnDesordenarBurbuja = new javax.swing.JButton();
        panelInsercion = new javax.swing.JPanel();
        txtMInsercion = new javax.swing.JLabel();
        txtTamInsercion = new javax.swing.JLabel();
        txtbTamInsercion = new javax.swing.JTextField();
        btnTamInsercion = new javax.swing.JButton();
        txtArregloInsercion = new javax.swing.JLabel();
        txtbArregloInsercion = new javax.swing.JTextField();
        btnArregloInsercion = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableInsercion = new javax.swing.JTable();
        btnOrdenarInsercion = new javax.swing.JButton();
        btnDesordenarInsercion = new javax.swing.JButton();
        txtArregloCeldaInsercion = new javax.swing.JLabel();
        panelShell = new javax.swing.JPanel();
        txtMShell = new javax.swing.JLabel();
        txtTamShell = new javax.swing.JLabel();
        txtbTamShell = new javax.swing.JTextField();
        btnTamShell = new javax.swing.JButton();
        txtArregloShell = new javax.swing.JLabel();
        txtbArregloShell = new javax.swing.JTextField();
        btnArregloShell = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableShell = new javax.swing.JTable();
        btnOrdenarShell = new javax.swing.JButton();
        btnDesordenarShell = new javax.swing.JButton();
        txtArregloCeldaShell = new javax.swing.JLabel();
        panelSeleccion = new javax.swing.JPanel();
        txtMSeleccion = new javax.swing.JLabel();
        txtTamSeleccion = new javax.swing.JLabel();
        txtbTamSeleccion = new javax.swing.JTextField();
        btnTamSeleccion = new javax.swing.JButton();
        txtArregloSeleccion = new javax.swing.JLabel();
        txtbArregloSeleccion = new javax.swing.JTextField();
        btnArregloSeleccion = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableSeleccion = new javax.swing.JTable();
        btnOrdenarSeleccion = new javax.swing.JButton();
        btnDesordenarSeleccion = new javax.swing.JButton();
        txtArregloCeldaSeleccion = new javax.swing.JLabel();
        panelSacudida = new javax.swing.JPanel();
        txtMSacudida = new javax.swing.JLabel();
        txtTamSacudida = new javax.swing.JLabel();
        txtbTamSacudida = new javax.swing.JTextField();
        btnTamSacudida = new javax.swing.JButton();
        txtArregloSacudida = new javax.swing.JLabel();
        txtbArregloSacudida = new javax.swing.JTextField();
        btnArregloSacudida = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableSacudida = new javax.swing.JTable();
        btnOrdenarSacudida = new javax.swing.JButton();
        btnDesordenarSacudida = new javax.swing.JButton();
        txtArregloCeldaSacudida = new javax.swing.JLabel();
        panelBusqueda = new javax.swing.JPanel();
        txtMBusqueda = new javax.swing.JLabel();
        txtTamBusqueda = new javax.swing.JLabel();
        txtbTamBusqueda = new javax.swing.JTextField();
        btnTamBusqueda = new javax.swing.JButton();
        txtArregloBusqueda = new javax.swing.JLabel();
        txtbArregloBusqueda = new javax.swing.JTextField();
        btnArregloBusqueda = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableBusqueda = new javax.swing.JTable();
        btnBusqueda = new javax.swing.JButton();
        txtArregloCeldaBusqueda = new javax.swing.JLabel();
        txtbBusqueda = new javax.swing.JTextField();
        btnOriginal = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(580, 426));

        tpanelLaboratorio2.setBackground(new java.awt.Color(255, 255, 255));

        panelBurbuja.setBackground(new java.awt.Color(255, 255, 255));
        panelBurbuja.setToolTipText("");
        panelBurbuja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMBurbuja.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMBurbuja.setText("Método Burbuja");
        panelBurbuja.add(txtMBurbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtTamBurbuja.setBackground(new java.awt.Color(0, 0, 0));
        txtTamBurbuja.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTamBurbuja.setText("Ingrese el tamaño del arreglo:");
        panelBurbuja.add(txtTamBurbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtbTamBurbuja.setBackground(new java.awt.Color(102, 102, 102));
        txtbTamBurbuja.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbTamBurbuja.setForeground(new java.awt.Color(255, 255, 255));
        txtbTamBurbuja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBurbuja.add(txtbTamBurbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 190, -1));

        btnTamBurbuja.setBackground(new java.awt.Color(153, 102, 255));
        btnTamBurbuja.setForeground(new java.awt.Color(255, 255, 255));
        btnTamBurbuja.setText("Aceptar");
        btnTamBurbuja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnTamBurbuja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTamBurbujaMouseClicked(evt);
            }
        });
        panelBurbuja.add(btnTamBurbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 80, 30));

        txtArregloBurbuja.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloBurbuja.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtArregloBurbuja.setText("Ingrese el valor: ");
        panelBurbuja.add(txtArregloBurbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtbArregloBurbuja.setBackground(new java.awt.Color(102, 102, 102));
        txtbArregloBurbuja.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbArregloBurbuja.setForeground(new java.awt.Color(255, 255, 255));
        txtbArregloBurbuja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbArregloBurbuja.setEnabled(false);
        panelBurbuja.add(txtbArregloBurbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 190, -1));

        btnArregloBurbuja.setBackground(new java.awt.Color(153, 102, 255));
        btnArregloBurbuja.setForeground(new java.awt.Color(255, 255, 255));
        btnArregloBurbuja.setText("Aceptar");
        btnArregloBurbuja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnArregloBurbuja.setEnabled(false);
        btnArregloBurbuja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArregloBurbujaMouseClicked(evt);
            }
        });
        panelBurbuja.add(btnArregloBurbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 80, 30));

        txtArregloCelda.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloCelda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panelBurbuja.add(txtArregloCelda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        tableBurbuja.setBackground(new java.awt.Color(102, 102, 102));
        tableBurbuja.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tableBurbuja.setForeground(new java.awt.Color(255, 255, 255));
        tableBurbuja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableBurbuja);

        panelBurbuja.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 240, 330));

        btnOrdenarBurbuja.setBackground(new java.awt.Color(153, 102, 255));
        btnOrdenarBurbuja.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenarBurbuja.setText("Ordenar Arreglo");
        btnOrdenarBurbuja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnOrdenarBurbuja.setEnabled(false);
        btnOrdenarBurbuja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrdenarBurbujaMouseClicked(evt);
            }
        });
        panelBurbuja.add(btnOrdenarBurbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 100, 50));

        btnDesordenarBurbuja.setBackground(new java.awt.Color(153, 102, 255));
        btnDesordenarBurbuja.setForeground(new java.awt.Color(255, 255, 255));
        btnDesordenarBurbuja.setText("Ver Original");
        btnDesordenarBurbuja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDesordenarBurbuja.setEnabled(false);
        btnDesordenarBurbuja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDesordenarBurbujaMouseClicked(evt);
            }
        });
        panelBurbuja.add(btnDesordenarBurbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, 50));

        tpanelLaboratorio2.addTab("Burbuja", panelBurbuja);

        panelInsercion.setBackground(new java.awt.Color(255, 255, 255));
        panelInsercion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMInsercion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMInsercion.setText("Método Inserción");
        panelInsercion.add(txtMInsercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtTamInsercion.setBackground(new java.awt.Color(0, 0, 0));
        txtTamInsercion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTamInsercion.setText("Ingrese el tamaño del arreglo:");
        panelInsercion.add(txtTamInsercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtbTamInsercion.setBackground(new java.awt.Color(102, 102, 102));
        txtbTamInsercion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbTamInsercion.setForeground(new java.awt.Color(255, 255, 255));
        txtbTamInsercion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelInsercion.add(txtbTamInsercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 190, -1));

        btnTamInsercion.setBackground(new java.awt.Color(153, 102, 255));
        btnTamInsercion.setForeground(new java.awt.Color(255, 255, 255));
        btnTamInsercion.setText("Aceptar");
        btnTamInsercion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnTamInsercion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTamInsercionMouseClicked(evt);
            }
        });
        panelInsercion.add(btnTamInsercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 80, 30));

        txtArregloInsercion.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloInsercion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtArregloInsercion.setText("Ingrese el valor:");
        panelInsercion.add(txtArregloInsercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtbArregloInsercion.setBackground(new java.awt.Color(102, 102, 102));
        txtbArregloInsercion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbArregloInsercion.setForeground(new java.awt.Color(255, 255, 255));
        txtbArregloInsercion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbArregloInsercion.setEnabled(false);
        panelInsercion.add(txtbArregloInsercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 190, -1));

        btnArregloInsercion.setBackground(new java.awt.Color(153, 102, 255));
        btnArregloInsercion.setForeground(new java.awt.Color(255, 255, 255));
        btnArregloInsercion.setText("Aceptar");
        btnArregloInsercion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnArregloInsercion.setEnabled(false);
        btnArregloInsercion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArregloInsercionMouseClicked(evt);
            }
        });
        panelInsercion.add(btnArregloInsercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 80, 30));

        tableInsercion.setBackground(new java.awt.Color(102, 102, 102));
        tableInsercion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tableInsercion.setForeground(new java.awt.Color(255, 255, 255));
        tableInsercion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tableInsercion);

        panelInsercion.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 240, 330));

        btnOrdenarInsercion.setBackground(new java.awt.Color(153, 102, 255));
        btnOrdenarInsercion.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenarInsercion.setText("Ordenar Arreglo");
        btnOrdenarInsercion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnOrdenarInsercion.setEnabled(false);
        btnOrdenarInsercion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrdenarInsercionMouseClicked(evt);
            }
        });
        panelInsercion.add(btnOrdenarInsercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 100, 50));

        btnDesordenarInsercion.setBackground(new java.awt.Color(153, 102, 255));
        btnDesordenarInsercion.setForeground(new java.awt.Color(255, 255, 255));
        btnDesordenarInsercion.setText("Ver Original");
        btnDesordenarInsercion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDesordenarInsercion.setEnabled(false);
        btnDesordenarInsercion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDesordenarInsercionMouseClicked(evt);
            }
        });
        panelInsercion.add(btnDesordenarInsercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, 50));

        txtArregloCeldaInsercion.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloCeldaInsercion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panelInsercion.add(txtArregloCeldaInsercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        tpanelLaboratorio2.addTab("Inserción Directa", panelInsercion);

        panelShell.setBackground(new java.awt.Color(255, 255, 255));
        panelShell.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMShell.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMShell.setText("Método Shell");
        panelShell.add(txtMShell, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtTamShell.setBackground(new java.awt.Color(0, 0, 0));
        txtTamShell.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTamShell.setText("Ingrese el tamaño del arreglo:");
        panelShell.add(txtTamShell, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtbTamShell.setBackground(new java.awt.Color(102, 102, 102));
        txtbTamShell.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbTamShell.setForeground(new java.awt.Color(255, 255, 255));
        txtbTamShell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelShell.add(txtbTamShell, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 190, -1));

        btnTamShell.setBackground(new java.awt.Color(153, 102, 255));
        btnTamShell.setForeground(new java.awt.Color(255, 255, 255));
        btnTamShell.setText("Aceptar");
        btnTamShell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnTamShell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTamShellMouseClicked(evt);
            }
        });
        panelShell.add(btnTamShell, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 80, 30));

        txtArregloShell.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloShell.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtArregloShell.setText("Ingrese el valor:");
        panelShell.add(txtArregloShell, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtbArregloShell.setBackground(new java.awt.Color(102, 102, 102));
        txtbArregloShell.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbArregloShell.setForeground(new java.awt.Color(255, 255, 255));
        txtbArregloShell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbArregloShell.setEnabled(false);
        panelShell.add(txtbArregloShell, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 190, -1));

        btnArregloShell.setBackground(new java.awt.Color(153, 102, 255));
        btnArregloShell.setForeground(new java.awt.Color(255, 255, 255));
        btnArregloShell.setText("Aceptar");
        btnArregloShell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnArregloShell.setEnabled(false);
        btnArregloShell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArregloShellMouseClicked(evt);
            }
        });
        panelShell.add(btnArregloShell, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 80, 30));

        tableShell.setBackground(new java.awt.Color(102, 102, 102));
        tableShell.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tableShell.setForeground(new java.awt.Color(255, 255, 255));
        tableShell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tableShell);

        panelShell.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 240, 330));

        btnOrdenarShell.setBackground(new java.awt.Color(153, 102, 255));
        btnOrdenarShell.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenarShell.setText("Ordenar Arreglo");
        btnOrdenarShell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnOrdenarShell.setEnabled(false);
        btnOrdenarShell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrdenarShellMouseClicked(evt);
            }
        });
        panelShell.add(btnOrdenarShell, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 100, 50));

        btnDesordenarShell.setBackground(new java.awt.Color(153, 102, 255));
        btnDesordenarShell.setForeground(new java.awt.Color(255, 255, 255));
        btnDesordenarShell.setText("Ordenar Arreglo");
        btnDesordenarShell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDesordenarShell.setEnabled(false);
        btnDesordenarShell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDesordenarShellMouseClicked(evt);
            }
        });
        panelShell.add(btnDesordenarShell, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, 50));

        txtArregloCeldaShell.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloCeldaShell.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panelShell.add(txtArregloCeldaShell, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        tpanelLaboratorio2.addTab("Shell", panelShell);

        panelSeleccion.setBackground(new java.awt.Color(255, 255, 255));
        panelSeleccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMSeleccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMSeleccion.setText("Método Selección");
        panelSeleccion.add(txtMSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtTamSeleccion.setBackground(new java.awt.Color(0, 0, 0));
        txtTamSeleccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTamSeleccion.setText("Ingrese el tamaño del arreglo:");
        panelSeleccion.add(txtTamSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtbTamSeleccion.setBackground(new java.awt.Color(102, 102, 102));
        txtbTamSeleccion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbTamSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        txtbTamSeleccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelSeleccion.add(txtbTamSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 190, -1));

        btnTamSeleccion.setBackground(new java.awt.Color(153, 102, 255));
        btnTamSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        btnTamSeleccion.setText("Aceptar");
        btnTamSeleccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnTamSeleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTamSeleccionMouseClicked(evt);
            }
        });
        panelSeleccion.add(btnTamSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 80, 30));

        txtArregloSeleccion.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloSeleccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtArregloSeleccion.setText("Ingrese el valor:");
        panelSeleccion.add(txtArregloSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtbArregloSeleccion.setBackground(new java.awt.Color(102, 102, 102));
        txtbArregloSeleccion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbArregloSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        txtbArregloSeleccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbArregloSeleccion.setEnabled(false);
        panelSeleccion.add(txtbArregloSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 190, -1));

        btnArregloSeleccion.setBackground(new java.awt.Color(153, 102, 255));
        btnArregloSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        btnArregloSeleccion.setText("Aceptar");
        btnArregloSeleccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnArregloSeleccion.setEnabled(false);
        btnArregloSeleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArregloSeleccionMouseClicked(evt);
            }
        });
        panelSeleccion.add(btnArregloSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 80, 30));

        tableSeleccion.setBackground(new java.awt.Color(102, 102, 102));
        tableSeleccion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tableSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        tableSeleccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tableSeleccion);

        panelSeleccion.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 240, 330));

        btnOrdenarSeleccion.setBackground(new java.awt.Color(153, 102, 255));
        btnOrdenarSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenarSeleccion.setText("Ordenar Arreglo");
        btnOrdenarSeleccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnOrdenarSeleccion.setEnabled(false);
        btnOrdenarSeleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrdenarSeleccionMouseClicked(evt);
            }
        });
        panelSeleccion.add(btnOrdenarSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 100, 50));

        btnDesordenarSeleccion.setBackground(new java.awt.Color(153, 102, 255));
        btnDesordenarSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        btnDesordenarSeleccion.setText("Ver Original");
        btnDesordenarSeleccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDesordenarSeleccion.setEnabled(false);
        btnDesordenarSeleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDesordenarSeleccionMouseClicked(evt);
            }
        });
        panelSeleccion.add(btnDesordenarSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, 50));

        txtArregloCeldaSeleccion.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloCeldaSeleccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panelSeleccion.add(txtArregloCeldaSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        tpanelLaboratorio2.addTab("Selección", panelSeleccion);

        panelSacudida.setBackground(new java.awt.Color(255, 255, 255));
        panelSacudida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMSacudida.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMSacudida.setText("Método Sacudida");
        panelSacudida.add(txtMSacudida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtTamSacudida.setBackground(new java.awt.Color(0, 0, 0));
        txtTamSacudida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTamSacudida.setText("Ingrese el tamaño del arreglo:");
        panelSacudida.add(txtTamSacudida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtbTamSacudida.setBackground(new java.awt.Color(102, 102, 102));
        txtbTamSacudida.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbTamSacudida.setForeground(new java.awt.Color(255, 255, 255));
        txtbTamSacudida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelSacudida.add(txtbTamSacudida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 190, -1));

        btnTamSacudida.setBackground(new java.awt.Color(153, 102, 255));
        btnTamSacudida.setForeground(new java.awt.Color(255, 255, 255));
        btnTamSacudida.setText("Aceptar");
        btnTamSacudida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnTamSacudida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTamSacudidaMouseClicked(evt);
            }
        });
        panelSacudida.add(btnTamSacudida, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 80, 30));

        txtArregloSacudida.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloSacudida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtArregloSacudida.setText("Ingrese el valor:");
        panelSacudida.add(txtArregloSacudida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtbArregloSacudida.setBackground(new java.awt.Color(102, 102, 102));
        txtbArregloSacudida.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbArregloSacudida.setForeground(new java.awt.Color(255, 255, 255));
        txtbArregloSacudida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbArregloSacudida.setEnabled(false);
        panelSacudida.add(txtbArregloSacudida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 190, -1));

        btnArregloSacudida.setBackground(new java.awt.Color(153, 102, 255));
        btnArregloSacudida.setForeground(new java.awt.Color(255, 255, 255));
        btnArregloSacudida.setText("Aceptar");
        btnArregloSacudida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnArregloSacudida.setEnabled(false);
        btnArregloSacudida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArregloSacudidaMouseClicked(evt);
            }
        });
        panelSacudida.add(btnArregloSacudida, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 80, 30));

        tableSacudida.setBackground(new java.awt.Color(102, 102, 102));
        tableSacudida.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tableSacudida.setForeground(new java.awt.Color(255, 255, 255));
        tableSacudida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tableSacudida);

        panelSacudida.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 240, 330));

        btnOrdenarSacudida.setBackground(new java.awt.Color(153, 102, 255));
        btnOrdenarSacudida.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenarSacudida.setText("Ordenar Arreglo");
        btnOrdenarSacudida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnOrdenarSacudida.setEnabled(false);
        btnOrdenarSacudida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrdenarSacudidaMouseClicked(evt);
            }
        });
        panelSacudida.add(btnOrdenarSacudida, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 100, 50));

        btnDesordenarSacudida.setBackground(new java.awt.Color(153, 102, 255));
        btnDesordenarSacudida.setForeground(new java.awt.Color(255, 255, 255));
        btnDesordenarSacudida.setText("Ordenar Arreglo");
        btnDesordenarSacudida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDesordenarSacudida.setEnabled(false);
        btnDesordenarSacudida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDesordenarSacudidaMouseClicked(evt);
            }
        });
        panelSacudida.add(btnDesordenarSacudida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, 50));

        txtArregloCeldaSacudida.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloCeldaSacudida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panelSacudida.add(txtArregloCeldaSacudida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        tpanelLaboratorio2.addTab("Sacudida", panelSacudida);

        panelBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        panelBusqueda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMBusqueda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMBusqueda.setText("Método Búsqueda Binaria");
        panelBusqueda.add(txtMBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtTamBusqueda.setBackground(new java.awt.Color(0, 0, 0));
        txtTamBusqueda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTamBusqueda.setText("Ingrese el tamaño del arreglo:");
        panelBusqueda.add(txtTamBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        txtbTamBusqueda.setBackground(new java.awt.Color(102, 102, 102));
        txtbTamBusqueda.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbTamBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        txtbTamBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBusqueda.add(txtbTamBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 190, -1));

        btnTamBusqueda.setBackground(new java.awt.Color(153, 102, 255));
        btnTamBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        btnTamBusqueda.setText("Aceptar");
        btnTamBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnTamBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTamBusquedaMouseClicked(evt);
            }
        });
        panelBusqueda.add(btnTamBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 80, 30));

        txtArregloBusqueda.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloBusqueda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtArregloBusqueda.setText("Ingrese el valor:");
        panelBusqueda.add(txtArregloBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        txtbArregloBusqueda.setBackground(new java.awt.Color(102, 102, 102));
        txtbArregloBusqueda.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbArregloBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        txtbArregloBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbArregloBusqueda.setEnabled(false);
        panelBusqueda.add(txtbArregloBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 190, -1));

        btnArregloBusqueda.setBackground(new java.awt.Color(153, 102, 255));
        btnArregloBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        btnArregloBusqueda.setText("Aceptar");
        btnArregloBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnArregloBusqueda.setEnabled(false);
        btnArregloBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArregloBusquedaMouseClicked(evt);
            }
        });
        panelBusqueda.add(btnArregloBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 80, 30));

        tableBusqueda.setBackground(new java.awt.Color(102, 102, 102));
        tableBusqueda.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tableBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        tableBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tableBusqueda);

        panelBusqueda.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 240, 330));

        btnBusqueda.setBackground(new java.awt.Color(153, 102, 255));
        btnBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        btnBusqueda.setText("Buscar");
        btnBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBusqueda.setEnabled(false);
        btnBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBusquedaMouseClicked(evt);
            }
        });
        panelBusqueda.add(btnBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 80, 50));

        txtArregloCeldaBusqueda.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloCeldaBusqueda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panelBusqueda.add(txtArregloCeldaBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 0));

        txtbBusqueda.setBackground(new java.awt.Color(102, 102, 102));
        txtbBusqueda.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        txtbBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbBusqueda.setEnabled(false);
        panelBusqueda.add(txtbBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 190, -1));

        btnOriginal.setBackground(new java.awt.Color(153, 102, 255));
        btnOriginal.setForeground(new java.awt.Color(255, 255, 255));
        btnOriginal.setText("Original");
        btnOriginal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnOriginal.setEnabled(false);
        btnOriginal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOriginalMouseClicked(evt);
            }
        });
        panelBusqueda.add(btnOriginal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 80, 50));

        tpanelLaboratorio2.addTab("Búsqueda", panelBusqueda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpanelLaboratorio2, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpanelLaboratorio2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    //Ctrl + Minus (-) para abrir los folders, Ctrl + Plus (+) para cerrarlos
    
    // <editor-fold defaultstate="collapsed" desc="Burbuja">
    //Burbuja
    private void btnTamBurbujaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTamBurbujaMouseClicked
        String a = txtbTamBurbuja.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto del tamaño no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        tam = Integer.parseInt(a);
        txtbArregloBurbuja.setEnabled(true);
        btnArregloBurbuja.setEnabled(true);
        cuenta = 1; //Resetea el contador para que se pueda agregar de nuevo el arreglo

        String celda = String.valueOf(cuenta);
        txtArregloCelda.setText("<html>Celda No.: <html>" + celda);
        //<html> permite saltos de líneas en un JLabel. <br> es para salto de línea
    }//GEN-LAST:event_btnTamBurbujaMouseClicked

    private void btnArregloBurbujaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArregloBurbujaMouseClicked
        String a = txtbArregloBurbuja.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if((cuenta < tam) || (cuenta == tam)){
            if(cuenta == tam){
                //Agrega el último elemento del arreglo y se deshace del contador de celdas
                arregloA[cuenta - 1] = Integer.parseInt(txtbArregloBurbuja.getText());
                txtbArregloBurbuja.setText("");

                cuenta = cuenta + 1;
                txtArregloCelda.setText("");
            }
            else{
                //Agrega los elementos al arreglo y actualiza el contador de celdas
                arregloA[cuenta - 1] = Integer.parseInt(txtbArregloBurbuja.getText());
                txtbArregloBurbuja.setText("");

                cuenta = cuenta + 1;
                String celda = String.valueOf(cuenta);
                txtArregloCelda.setText("<html>Celda No.: <html>" + celda);
            }
        }

        if(cuenta > tam){
            //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
            DefaultTableModel model = (DefaultTableModel) tableBurbuja.getModel();
            model.setColumnCount(1);
            model.setRowCount(tam);

            //Copia el arreglo desordenado de A a B
            System.arraycopy(arregloA, 0, arregloB, 0, tam);

            for(int i = 0; i < tam; i++){
                tableBurbuja.setValueAt(arregloB[i], i, 0);
            }

            //Reinicia el ciclo para poder agregar un nuevo arreglo
            cuenta = 0;
            txtbArregloBurbuja.setEnabled(false);
            btnArregloBurbuja.setEnabled(false);
            btnOrdenarBurbuja.setEnabled(true);
            btnDesordenarBurbuja.setEnabled(true);
        }
    }//GEN-LAST:event_btnArregloBurbujaMouseClicked

    private void btnOrdenarBurbujaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdenarBurbujaMouseClicked
        int i, j;

        //Método de la Burbuja:
        //Recorre el arreglo en función del tamaño hasta ordenarlo mediante comparaciones
        for(i = 0; i < tam - 1; i++){
            for(j = 0; j < tam - i - 1; j++){
                if(arregloA[j + 1] < arregloA[j]){
                    aux = arregloA[j + 1];
                    arregloA[j + 1] = arregloA[j];
                    arregloA[j] = aux;
                }
            }
        }

        //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
        DefaultTableModel model = (DefaultTableModel) tableBurbuja.getModel();
        model.setColumnCount(1);
        model.setRowCount(tam);

        //Muestra arreglo ordenado
        for(i = 0; i < tam; i++){
            tableBurbuja.setValueAt(arregloA[i], i, 0);
        }
    }//GEN-LAST:event_btnOrdenarBurbujaMouseClicked

    private void btnDesordenarBurbujaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesordenarBurbujaMouseClicked
        //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
        DefaultTableModel model = (DefaultTableModel) tableBurbuja.getModel();
        model.setColumnCount(1);
        model.setRowCount(tam);

        //Muestra arreglo desordenado
        for(int i = 0; i < tam; i++){
            tableBurbuja.setValueAt(arregloB[i], i, 0);
        }
    }//GEN-LAST:event_btnDesordenarBurbujaMouseClicked
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Inserción">
    //Inserción
    private void btnTamInsercionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTamInsercionMouseClicked
        String a = txtbTamInsercion.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto del tamaño no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        tam = Integer.parseInt(a);
        txtbArregloInsercion.setEnabled(true);
        btnArregloInsercion.setEnabled(true);
        cuenta = 1; //Resetea el contador para que se pueda agregar de nuevo el arreglo

        String celda = String.valueOf(cuenta);
        txtArregloCeldaInsercion.setText("<html>Celda No.: <html>" + celda);
        //<html> permite saltos de líneas en un JLabel. <br> es para salto de línea
    }//GEN-LAST:event_btnTamInsercionMouseClicked

    private void btnArregloInsercionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArregloInsercionMouseClicked
        String a = txtbArregloInsercion.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if((cuenta < tam) || (cuenta == tam)){
            if(cuenta == tam){
                //Agrega el último elemento del arreglo y se deshace del contador de celdas
                arregloA[cuenta - 1] = Integer.parseInt(txtbArregloInsercion.getText());
                txtbArregloInsercion.setText("");

                cuenta = cuenta + 1;
                txtArregloCeldaInsercion.setText("");
            }
            else{
                //Agrega los elementos al arreglo y actualiza el contador de celdas
                arregloA[cuenta - 1] = Integer.parseInt(txtbArregloInsercion.getText());
                txtbArregloInsercion.setText("");

                cuenta = cuenta + 1;
                String celda = String.valueOf(cuenta);
                txtArregloCeldaInsercion.setText("<html>Celda No.: <html>" + celda);
            }
        }

        if(cuenta > tam){
            //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
            DefaultTableModel model = (DefaultTableModel) tableInsercion.getModel();
            model.setColumnCount(1);
            model.setRowCount(tam);

            //Copia el arreglo desordenado de A a B
            System.arraycopy(arregloA, 0, arregloB, 0, tam);

            for(int i = 0; i < tam; i++){
                tableInsercion.setValueAt(arregloB[i], i, 0);
            }

            //Reinicia el ciclo para poder agregar un nuevo arreglo
            cuenta = 0;
            txtbArregloInsercion.setEnabled(false);
            btnArregloInsercion.setEnabled(false);
            btnOrdenarInsercion.setEnabled(true);
            btnDesordenarInsercion.setEnabled(true);
        }
    }//GEN-LAST:event_btnArregloInsercionMouseClicked

    private void btnOrdenarInsercionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdenarInsercionMouseClicked
        int i, j;

        //Método de Inserción Directa o Baraja:
        //Recorre el arreglo ordenando las celdas hacia la derecha
        for (i = 1; i < tam; i++){
            aux = arregloA[i];
            j = i - 1;

            while ((j >= 0) && (aux < arregloA[j])){
                arregloA[j + 1] = arregloA[j];
                j = j - 1;
            }
            arregloA[j + 1] = aux;
        }

        //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
        DefaultTableModel model = (DefaultTableModel) tableInsercion.getModel();
        model.setColumnCount(1);
        model.setRowCount(tam);

        //Muestra arreglo ordenado
        for(i = 0; i < tam; i++){
            tableInsercion.setValueAt(arregloA[i], i, 0);
        }
    }//GEN-LAST:event_btnOrdenarInsercionMouseClicked

    private void btnDesordenarInsercionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesordenarInsercionMouseClicked
        //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
        DefaultTableModel model = (DefaultTableModel) tableInsercion.getModel();
        model.setColumnCount(1);
        model.setRowCount(tam);

        //Muestra arreglo desordenado
        for(int i = 0; i < tam; i++){
            tableInsercion.setValueAt(arregloB[i], i, 0);
        }
    }//GEN-LAST:event_btnDesordenarInsercionMouseClicked
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Shell">
    //Shell
    private void btnTamShellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTamShellMouseClicked
        String a = txtbTamShell.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto del tamaño no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        tam = Integer.parseInt(a);
        txtbArregloShell.setEnabled(true);
        btnArregloShell.setEnabled(true);
        cuenta = 1; //Resetea el contador para que se pueda agregar de nuevo el arreglo

        String celda = String.valueOf(cuenta);
        txtArregloCeldaShell.setText("<html>Celda No.: <html>" + celda);
        //<html> permite saltos de líneas en un JLabel. <br> es para salto de línea
    }//GEN-LAST:event_btnTamShellMouseClicked

    private void btnArregloShellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArregloShellMouseClicked
        String a = txtbArregloShell.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if((cuenta < tam) || (cuenta == tam)){
            if(cuenta == tam){
                //Agrega el último elemento del arreglo y se deshace del contador de celdas
                arregloA[cuenta - 1] = Integer.parseInt(txtbArregloShell.getText());
                txtbArregloShell.setText("");

                cuenta = cuenta + 1;
                txtArregloCeldaShell.setText("");
            }
            else{
                //Agrega los elementos al arreglo y actualiza el contador de celdas
                arregloA[cuenta - 1] = Integer.parseInt(txtbArregloShell.getText());
                txtbArregloShell.setText("");

                cuenta = cuenta + 1;
                String celda = String.valueOf(cuenta);
                txtArregloCeldaShell.setText("<html>Celda No.: <html>" + celda);
            }
        }

        if(cuenta > tam){
            //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
            DefaultTableModel model = (DefaultTableModel) tableShell.getModel();
            model.setColumnCount(1);
            model.setRowCount(tam);

            //Copia el arreglo desordenado de A a B
            System.arraycopy(arregloA, 0, arregloB, 0, tam);

            for(int i = 0; i < tam; i++){
                tableShell.setValueAt(arregloB[i], i, 0);
            }

            //Reinicia el ciclo para poder agregar un nuevo arreglo
            cuenta = 0;
            txtbArregloShell.setEnabled(false);
            btnArregloShell.setEnabled(false);
            btnOrdenarShell.setEnabled(true);
            btnDesordenarShell.setEnabled(true);
        }
    }//GEN-LAST:event_btnArregloShellMouseClicked

    private void btnOrdenarShellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdenarShellMouseClicked
        int i, ent = tam + 1;
        boolean band;

        //Método de Shell:
        //Ordena desde el centro hacia los lados
        while(ent > 0){
            ent = (ent / 2);
            band = true;

            while(band == true){
                band = false;
                i = 0;

                while((i + ent) < tam){
                    if(arregloA[i] > arregloA[i + ent]){
                        aux = arregloA[i];
                        arregloA[i] = arregloA[i + ent];
                        arregloA[i + ent] = aux;
                        band = true;
                    }

                    i = i + 1;
                }
            }
        }

        //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
        DefaultTableModel model = (DefaultTableModel) tableShell.getModel();
        model.setColumnCount(1);
        model.setRowCount(tam);

        //Muestra arreglo ordenado
        for(i = 0; i < tam; i++){
            tableShell.setValueAt(arregloA[i], i, 0);
        }
    }//GEN-LAST:event_btnOrdenarShellMouseClicked

    private void btnDesordenarShellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesordenarShellMouseClicked
        //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
        DefaultTableModel model = (DefaultTableModel) tableShell.getModel();
        model.setColumnCount(1);
        model.setRowCount(tam);

        //Muestra arreglo desordenado
        for(int i = 0; i < tam; i++){
            tableShell.setValueAt(arregloB[i], i, 0);
        }
    }//GEN-LAST:event_btnDesordenarShellMouseClicked
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Selección">
    //Selección
    private void btnTamSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTamSeleccionMouseClicked
        String a = txtbTamSeleccion.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto del tamaño no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        tam = Integer.parseInt(a);
        txtbArregloSeleccion.setEnabled(true);
        btnArregloSeleccion.setEnabled(true);
        cuenta = 1; //Resetea el contador para que se pueda agregar de nuevo el arreglo

        String celda = String.valueOf(cuenta);
        txtArregloCeldaSeleccion.setText("<html>Celda No.: <html>" + celda);
        //<html> permite saltos de líneas en un JLabel. <br> es para salto de línea
    }//GEN-LAST:event_btnTamSeleccionMouseClicked

    private void btnArregloSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArregloSeleccionMouseClicked
        String a = txtbArregloSeleccion.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if((cuenta < tam) || (cuenta == tam)){
            if(cuenta == tam){
                //Agrega el último elemento del arreglo y se deshace del contador de celdas
                arregloA[cuenta - 1] = Integer.parseInt(txtbArregloSeleccion.getText());
                txtbArregloSeleccion.setText("");

                cuenta = cuenta + 1;
                txtArregloCeldaSeleccion.setText("");
            }
            else{
                //Agrega los elementos al arreglo y actualiza el contador de celdas
                arregloA[cuenta - 1] = Integer.parseInt(txtbArregloSeleccion.getText());
                txtbArregloSeleccion.setText("");

                cuenta = cuenta + 1;
                String celda = String.valueOf(cuenta);
                txtArregloCeldaSeleccion.setText("<html>Celda No.: <html>" + celda);
            }
        }

        if(cuenta > tam){
            //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
            DefaultTableModel model = (DefaultTableModel) tableSeleccion.getModel();
            model.setColumnCount(1);
            model.setRowCount(tam);

            //Copia el arreglo desordenado de A a B
            System.arraycopy(arregloA, 0, arregloB, 0, tam);

            for(int i = 0; i < tam; i++){
                tableSeleccion.setValueAt(arregloB[i], i, 0);
            }

            //Reinicia el ciclo para poder agregar un nuevo arreglo
            cuenta = 0;
            txtbArregloSeleccion.setEnabled(false);
            btnArregloSeleccion.setEnabled(false);
            btnOrdenarSeleccion.setEnabled(true);
            btnDesordenarSeleccion.setEnabled(true);
        }
    }//GEN-LAST:event_btnArregloSeleccionMouseClicked

    private void btnOrdenarSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdenarSeleccionMouseClicked
        int i, j, pos, menor;

        //Método de Selección:
        //Elige al menor como el primero y luego ordena las demás celdas
        for (i = 0; i < tam - 1; i++) {
            menor = arregloA[i];
            pos = i;

            for (j = i + 1; j < tam; j++){ //Toma como menor el primero de los elementos por odenar
                if (arregloA[j] < menor) {
                    menor = arregloA[j];
                    pos = j;
                }
            }

            if (pos != i){ //Comprueba si alguno otro menor para intercambiarlo
                aux = arregloA[i];
                arregloA[i] = arregloA[pos];
                arregloA[pos] = aux;
            }
        }

        //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
        DefaultTableModel model = (DefaultTableModel) tableSeleccion.getModel();
        model.setColumnCount(1);
        model.setRowCount(tam);

        //Muestra arreglo ordenado
        for(i = 0; i < tam; i++){
            tableSeleccion.setValueAt(arregloA[i], i, 0);
        }
    }//GEN-LAST:event_btnOrdenarSeleccionMouseClicked

    private void btnDesordenarSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesordenarSeleccionMouseClicked
        //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
        DefaultTableModel model = (DefaultTableModel) tableSeleccion.getModel();
        model.setColumnCount(1);
        model.setRowCount(tam);

        //Muestra arreglo desordenado
        for(int i = 0; i < tam; i++){
            tableSeleccion.setValueAt(arregloB[i], i, 0);
        }
    }//GEN-LAST:event_btnDesordenarSeleccionMouseClicked
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Sacudida">
    //Sacudida
    private void btnTamSacudidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTamSacudidaMouseClicked
        String a = txtbTamSacudida.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto del tamaño no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        tam = Integer.parseInt(a);
        txtbArregloSacudida.setEnabled(true);
        btnArregloSacudida.setEnabled(true);
        cuenta = 1; //Resetea el contador para que se pueda agregar de nuevo el arreglo

        String celda = String.valueOf(cuenta);
        txtArregloCeldaSacudida.setText("<html>Celda No.: <html>" + celda);
        //<html> permite saltos de líneas en un JLabel. <br> es para salto de línea
    }//GEN-LAST:event_btnTamSacudidaMouseClicked

    private void btnArregloSacudidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArregloSacudidaMouseClicked
        String a = txtbArregloSacudida.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if((cuenta < tam) || (cuenta == tam)){
            if(cuenta == tam){
                //Agrega el último elemento del arreglo y se deshace del contador de celdas
                arregloA[cuenta - 1] = Integer.parseInt(txtbArregloSacudida.getText());
                txtbArregloSacudida.setText("");

                cuenta = cuenta + 1;
                txtArregloCeldaSacudida.setText("");
            }
            else{
                //Agrega los elementos al arreglo y actualiza el contador de celdas
                arregloA[cuenta - 1] = Integer.parseInt(txtbArregloSacudida.getText());
                txtbArregloSacudida.setText("");

                cuenta = cuenta + 1;
                String celda = String.valueOf(cuenta);
                txtArregloCeldaSacudida.setText("<html>Celda No.: <html>" + celda);
            }
        }

        if(cuenta > tam){
            //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
            DefaultTableModel model = (DefaultTableModel) tableSacudida.getModel();
            model.setColumnCount(1);
            model.setRowCount(tam);

            //Copia el arreglo desordenado de A a B
            System.arraycopy(arregloA, 0, arregloB, 0, tam);

            for(int i = 0; i < tam; i++){
                tableSacudida.setValueAt(arregloB[i], i, 0);
            }

            //Reinicia el ciclo para poder agregar un nuevo arreglo
            cuenta = 0;
            txtbArregloSacudida.setEnabled(false);
            btnArregloSacudida.setEnabled(false);
            btnOrdenarSacudida.setEnabled(true);
            btnDesordenarSacudida.setEnabled(true);
        }
    }//GEN-LAST:event_btnArregloSacudidaMouseClicked

    private void btnOrdenarSacudidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdenarSacudidaMouseClicked
        int i, j = tam - 1, izq = 1, der = tam - 1;

        //Método de Selección:
        //Elige al menor como el primero y luego ordena las demás celdas
        while(izq <= der){
            for(i = der; i >= izq; i--){ //Ascendente
                if(arregloA[i - 1] > arregloA[i]){
                    aux = arregloA[i - 1];
                    arregloA[i - 1] = arregloA[i];
                    arregloA[i] = aux;
                    j = i;
                }
            }

            izq = j + 1;

            for(i = izq; i <= der; i++){ //Descendente
                if(arregloA[i - 1] > arregloA[i]){
                    aux = arregloA[i - 1];
                    arregloA[i - 1] = arregloA[i];
                    arregloA[i] = aux;
                    j = i;
                }
            }

            der = j - 1;
        }

        //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
        DefaultTableModel model = (DefaultTableModel) tableSacudida.getModel();
        model.setColumnCount(1);
        model.setRowCount(tam);

        //Muestra arreglo ordenado
        for(i = 0; i < tam; i++){
            tableSacudida.setValueAt(arregloA[i], i, 0);
        }
    }//GEN-LAST:event_btnOrdenarSacudidaMouseClicked

    private void btnDesordenarSacudidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesordenarSacudidaMouseClicked
        //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
        DefaultTableModel model = (DefaultTableModel) tableSacudida.getModel();
        model.setColumnCount(1);
        model.setRowCount(tam);

        //Muestra arreglo desordenado
        for(int i = 0; i < tam; i++){
            tableSacudida.setValueAt(arregloB[i], i, 0);
        }
    }//GEN-LAST:event_btnDesordenarSacudidaMouseClicked
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Búsqueda">
    //Búsqueda
    private void btnTamBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTamBusquedaMouseClicked
        String a = txtbTamBusqueda.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto del tamaño no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        btnBusqueda.setEnabled(false);
        btnOriginal.setEnabled(false);
        txtbBusqueda.setEnabled(false);
        txtbBusqueda.setText("");
        tam = Integer.parseInt(a);
        txtbArregloBusqueda.setEnabled(true);
        btnArregloBusqueda.setEnabled(true);
        txtbTamBusqueda.setEnabled(false);
        btnTamBusqueda.setEnabled(false);
        cuenta = 1; //Resetea el contador para que se pueda agregar de nuevo el arreglo

        String celda = String.valueOf(cuenta);
        txtArregloCeldaBusqueda.setText("<html>Celda No.: <html>" + celda);
        //<html> permite saltos de líneas en un JLabel. <br> es para salto de línea
    }//GEN-LAST:event_btnTamBusquedaMouseClicked

    private void btnArregloBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArregloBusquedaMouseClicked
        String a = txtbArregloBusqueda.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if((cuenta < tam) || (cuenta == tam)){
            if(cuenta == tam){
                //Agrega el último elemento del arreglo y se deshace del contador de celdas
                arregloA[cuenta - 1] = Integer.parseInt(txtbArregloBusqueda.getText());
                txtbArregloBusqueda.setText("");

                cuenta = cuenta + 1;
                txtArregloCeldaBusqueda.setText("");
            }
            else{
                //Agrega los elementos al arreglo y actualiza el contador de celdas
                arregloA[cuenta - 1] = Integer.parseInt(txtbArregloBusqueda.getText());
                txtbArregloBusqueda.setText("");

                cuenta = cuenta + 1;
                String celda = String.valueOf(cuenta);
                txtArregloCeldaBusqueda.setText("<html>Celda No.: <html>" + celda);
            }
        }

        if(cuenta > tam){
            //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
            DefaultTableModel model = (DefaultTableModel) tableBusqueda.getModel();
            model.setColumnCount(1);
            model.setRowCount(tam);

            //Copia el arreglo desordenado de A a B
            System.arraycopy(arregloA, 0, arregloB, 0, tam);

            for(int i = 0; i < tam; i++){
                tableBusqueda.setValueAt(arregloB[i], i, 0);
            }

            //Reinicia el ciclo para poder agregar un nuevo arreglo
            cuenta = 0;
            txtbArregloBusqueda.setEnabled(false);
            btnArregloBusqueda.setEnabled(false);
            txtbBusqueda.setEnabled(true);
            btnBusqueda.setEnabled(true);
            txtbTamBusqueda.setEnabled(true);
            btnTamBusqueda.setEnabled(true);
            btnOriginal.setEnabled(true);
            txtbTamBusqueda.setText("");
        }
    }//GEN-LAST:event_btnArregloBusquedaMouseClicked

    private void btnBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMouseClicked
        int inicio = 0, fin = tam - 1;
        boolean band = false;

        String a = txtbBusqueda.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        aux = Integer.parseInt(a);

        while((inicio <= fin) && (band == false)){
            int centro = (inicio + fin)/2;

            if(aux == arregloA[centro]){
                band = true;
            }
            else{
                if(aux < arregloA[centro]){
                    fin = centro - 1;
                }
                else{
                    inicio = centro + 1;
                }
            }
        }

        if(band == true){
            //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
            DefaultTableModel model = (DefaultTableModel) tableBusqueda.getModel();
            model.setColumnCount(1);
            model.setRowCount(1);

            tableBusqueda.setValueAt(aux, 0, 0);
        }
    }//GEN-LAST:event_btnBusquedaMouseClicked

    private void btnOriginalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOriginalMouseClicked
       
        //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
        DefaultTableModel model = (DefaultTableModel) tableBusqueda.getModel();
        model.setColumnCount(1);
        model.setRowCount(tam);

        //Copia el arreglo desordenado de A a B
        System.arraycopy(arregloA, 0, arregloB, 0, tam);

        for(int i = 0; i < tam; i++){
            tableBusqueda.setValueAt(arregloB[i], i, 0);
        }
    }//GEN-LAST:event_btnOriginalMouseClicked
    //</editor-fold>
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArregloBurbuja;
    private javax.swing.JButton btnArregloBusqueda;
    private javax.swing.JButton btnArregloInsercion;
    private javax.swing.JButton btnArregloSacudida;
    private javax.swing.JButton btnArregloSeleccion;
    private javax.swing.JButton btnArregloShell;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnDesordenarBurbuja;
    private javax.swing.JButton btnDesordenarInsercion;
    private javax.swing.JButton btnDesordenarSacudida;
    private javax.swing.JButton btnDesordenarSeleccion;
    private javax.swing.JButton btnDesordenarShell;
    private javax.swing.JButton btnOrdenarBurbuja;
    private javax.swing.JButton btnOrdenarInsercion;
    private javax.swing.JButton btnOrdenarSacudida;
    private javax.swing.JButton btnOrdenarSeleccion;
    private javax.swing.JButton btnOrdenarShell;
    private javax.swing.JButton btnOriginal;
    private javax.swing.JButton btnTamBurbuja;
    private javax.swing.JButton btnTamBusqueda;
    private javax.swing.JButton btnTamInsercion;
    private javax.swing.JButton btnTamSacudida;
    private javax.swing.JButton btnTamSeleccion;
    private javax.swing.JButton btnTamShell;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel panelBurbuja;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelInsercion;
    private javax.swing.JPanel panelSacudida;
    private javax.swing.JPanel panelSeleccion;
    private javax.swing.JPanel panelShell;
    private javax.swing.JTable tableBurbuja;
    private javax.swing.JTable tableBusqueda;
    private javax.swing.JTable tableInsercion;
    private javax.swing.JTable tableSacudida;
    private javax.swing.JTable tableSeleccion;
    private javax.swing.JTable tableShell;
    private javax.swing.JTabbedPane tpanelLaboratorio2;
    private javax.swing.JLabel txtArregloBurbuja;
    private javax.swing.JLabel txtArregloBusqueda;
    private javax.swing.JLabel txtArregloCelda;
    private javax.swing.JLabel txtArregloCeldaBusqueda;
    private javax.swing.JLabel txtArregloCeldaInsercion;
    private javax.swing.JLabel txtArregloCeldaSacudida;
    private javax.swing.JLabel txtArregloCeldaSeleccion;
    private javax.swing.JLabel txtArregloCeldaShell;
    private javax.swing.JLabel txtArregloInsercion;
    private javax.swing.JLabel txtArregloSacudida;
    private javax.swing.JLabel txtArregloSeleccion;
    private javax.swing.JLabel txtArregloShell;
    private javax.swing.JLabel txtMBurbuja;
    private javax.swing.JLabel txtMBusqueda;
    private javax.swing.JLabel txtMInsercion;
    private javax.swing.JLabel txtMSacudida;
    private javax.swing.JLabel txtMSeleccion;
    private javax.swing.JLabel txtMShell;
    private javax.swing.JLabel txtTamBurbuja;
    private javax.swing.JLabel txtTamBusqueda;
    private javax.swing.JLabel txtTamInsercion;
    private javax.swing.JLabel txtTamSacudida;
    private javax.swing.JLabel txtTamSeleccion;
    private javax.swing.JLabel txtTamShell;
    private javax.swing.JTextField txtbArregloBurbuja;
    private javax.swing.JTextField txtbArregloBusqueda;
    private javax.swing.JTextField txtbArregloInsercion;
    private javax.swing.JTextField txtbArregloSacudida;
    private javax.swing.JTextField txtbArregloSeleccion;
    private javax.swing.JTextField txtbArregloShell;
    private javax.swing.JTextField txtbBusqueda;
    private javax.swing.JTextField txtbTamBurbuja;
    private javax.swing.JTextField txtbTamBusqueda;
    private javax.swing.JTextField txtbTamInsercion;
    private javax.swing.JTextField txtbTamSacudida;
    private javax.swing.JTextField txtbTamSeleccion;
    private javax.swing.JTextField txtbTamShell;
    // End of variables declaration//GEN-END:variables
}

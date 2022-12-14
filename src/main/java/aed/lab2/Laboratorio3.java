package aed.lab2;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class Laboratorio3 extends javax.swing.JPanel {

    //Variables a usar
    int tam, cuenta;
    int x ;
    int arregloA[] = new int[100];
    String arregloC = "";
    
    public Laboratorio3() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpanelLaboratorio3 = new javax.swing.JTabbedPane();
        panelEjercicio1 = new javax.swing.JPanel();
        txtEjercicio1 = new javax.swing.JLabel();
        txtTamEj1 = new javax.swing.JLabel();
        txtbTamEj1 = new javax.swing.JTextField();
        btnTamEj1 = new javax.swing.JButton();
        txtArregloEj1 = new javax.swing.JLabel();
        txtbArregloEj1 = new javax.swing.JTextField();
        btnArregloEj1 = new javax.swing.JButton();
        txtArregloCeldaEj1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEj1 = new javax.swing.JTable();
        panelEjercicio2 = new javax.swing.JPanel();
        txtEjercicio2 = new javax.swing.JLabel();
        txtArregloEj2 = new javax.swing.JLabel();
        txtbArregloEj2 = new javax.swing.JTextField();
        btnArregloEj2 = new javax.swing.JButton();
        txtArregloCeldaEj2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEj2 = new javax.swing.JTable();
        panelEjercicio3 = new javax.swing.JPanel();
        txtEjercicio3 = new javax.swing.JLabel();
        txtTamEj3 = new javax.swing.JLabel();
        txtbTamEj3 = new javax.swing.JTextField();
        btnTamEj3 = new javax.swing.JButton();
        txtArregloEj3 = new javax.swing.JLabel();
        txtbArregloEj3 = new javax.swing.JTextField();
        btnArregloEj3 = new javax.swing.JButton();
        txtArregloCeldaEj3 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableLab3_Eje3 = new javax.swing.JTable();
        txtResultado = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        panelEjercicio4 = new javax.swing.JPanel();
        txtEjercicio4 = new javax.swing.JLabel();
        txtResEj4 = new javax.swing.JLabel();
        txtbResEj4 = new javax.swing.JTextField();
        btnResEj4 = new javax.swing.JButton();
        txtArregloEj4 = new javax.swing.JLabel();
        txtbArregloEj4 = new javax.swing.JTextField();
        btnArregloEj4 = new javax.swing.JButton();
        txtArregloCeldaEj4 = new javax.swing.JLabel();
        panelEjercicio5 = new javax.swing.JPanel();
        txtEjercicio5 = new javax.swing.JLabel();
        btnCalcEj5 = new javax.swing.JButton();
        txtArregloCeldaEj5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableEj5 = new javax.swing.JTable();
        txtExpEj51 = new javax.swing.JLabel();
        txtExpEj352 = new javax.swing.JLabel();
        txtExpEj353 = new javax.swing.JLabel();
        txtExpEj54 = new javax.swing.JLabel();
        txtExpEj55 = new javax.swing.JLabel();
        panelEjercicio6 = new javax.swing.JPanel();
        txtEjercicio6 = new javax.swing.JLabel();
        txtTamEj6 = new javax.swing.JLabel();
        txtbTamEj6 = new javax.swing.JTextField();
        btnTamEj6 = new javax.swing.JButton();
        txtArregloCeldaEj6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableEj6 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        panelEjercicio1.setBackground(new java.awt.Color(255, 255, 255));
        panelEjercicio1.setToolTipText("");
        panelEjercicio1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEjercicio1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEjercicio1.setText("Ejercicio 1");
        panelEjercicio1.add(txtEjercicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txtTamEj1.setBackground(new java.awt.Color(0, 0, 0));
        txtTamEj1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTamEj1.setText("Ingrese el tama??o del arreglo:");
        panelEjercicio1.add(txtTamEj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txtbTamEj1.setBackground(new java.awt.Color(102, 102, 102));
        txtbTamEj1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbTamEj1.setForeground(new java.awt.Color(255, 255, 255));
        txtbTamEj1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEjercicio1.add(txtbTamEj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, -1));

        btnTamEj1.setBackground(new java.awt.Color(153, 102, 255));
        btnTamEj1.setForeground(new java.awt.Color(255, 255, 255));
        btnTamEj1.setText("Aceptar");
        btnTamEj1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnTamEj1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTamEj1MouseClicked(evt);
            }
        });
        panelEjercicio1.add(btnTamEj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 80, 30));

        txtArregloEj1.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloEj1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtArregloEj1.setText("A??adir numero: 1");
        panelEjercicio1.add(txtArregloEj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtbArregloEj1.setBackground(new java.awt.Color(102, 102, 102));
        txtbArregloEj1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbArregloEj1.setForeground(new java.awt.Color(255, 255, 255));
        txtbArregloEj1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbArregloEj1.setEnabled(false);
        panelEjercicio1.add(txtbArregloEj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 190, -1));

        btnArregloEj1.setBackground(new java.awt.Color(153, 102, 255));
        btnArregloEj1.setForeground(new java.awt.Color(255, 255, 255));
        btnArregloEj1.setText("Aceptar");
        btnArregloEj1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnArregloEj1.setEnabled(false);
        btnArregloEj1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArregloEj1MouseClicked(evt);
            }
        });
        panelEjercicio1.add(btnArregloEj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 80, 30));

        txtArregloCeldaEj1.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloCeldaEj1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panelEjercicio1.add(txtArregloCeldaEj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        tableEj1.setBackground(new java.awt.Color(102, 102, 102));
        tableEj1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tableEj1.setForeground(new java.awt.Color(255, 255, 255));
        tableEj1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableEj1);

        panelEjercicio1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 240, 330));

        tpanelLaboratorio3.addTab("Ejercicio 1", panelEjercicio1);

        panelEjercicio2.setBackground(new java.awt.Color(255, 255, 255));
        panelEjercicio2.setToolTipText("");
        panelEjercicio2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEjercicio2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEjercicio2.setText("Ejercicio 2");
        panelEjercicio2.add(txtEjercicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        txtArregloEj2.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloEj2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtArregloEj2.setText("Ingrese la cadena:");
        panelEjercicio2.add(txtArregloEj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtbArregloEj2.setBackground(new java.awt.Color(102, 102, 102));
        txtbArregloEj2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbArregloEj2.setForeground(new java.awt.Color(255, 255, 255));
        txtbArregloEj2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEjercicio2.add(txtbArregloEj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 250, -1));

        btnArregloEj2.setBackground(new java.awt.Color(153, 102, 255));
        btnArregloEj2.setForeground(new java.awt.Color(255, 255, 255));
        btnArregloEj2.setText("Aceptar");
        btnArregloEj2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnArregloEj2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArregloEj2MouseClicked(evt);
            }
        });
        panelEjercicio2.add(btnArregloEj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 80, 30));

        txtArregloCeldaEj2.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloCeldaEj2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panelEjercicio2.add(txtArregloCeldaEj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        tableEj2.setBackground(new java.awt.Color(102, 102, 102));
        tableEj2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tableEj2.setForeground(new java.awt.Color(255, 255, 255));
        tableEj2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableEj2);

        panelEjercicio2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 500, 110));

        tpanelLaboratorio3.addTab("Ejercicio 2", panelEjercicio2);

        panelEjercicio3.setBackground(new java.awt.Color(255, 255, 255));
        panelEjercicio3.setToolTipText("");
        panelEjercicio3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEjercicio3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEjercicio3.setText("Ejercicio 3");
        panelEjercicio3.add(txtEjercicio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtTamEj3.setBackground(new java.awt.Color(0, 0, 0));
        txtTamEj3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTamEj3.setText("Ingrese el tama??o del arreglo:");
        panelEjercicio3.add(txtTamEj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        txtbTamEj3.setBackground(new java.awt.Color(102, 102, 102));
        txtbTamEj3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbTamEj3.setForeground(new java.awt.Color(255, 255, 255));
        txtbTamEj3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEjercicio3.add(txtbTamEj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 220, -1));

        btnTamEj3.setBackground(new java.awt.Color(153, 102, 255));
        btnTamEj3.setForeground(new java.awt.Color(255, 255, 255));
        btnTamEj3.setText("Aceptar");
        btnTamEj3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnTamEj3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTamEj3MouseClicked(evt);
            }
        });
        panelEjercicio3.add(btnTamEj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 80, 30));

        txtArregloEj3.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloEj3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtArregloEj3.setText("A??adir numero: 1");
        panelEjercicio3.add(txtArregloEj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        txtbArregloEj3.setBackground(new java.awt.Color(102, 102, 102));
        txtbArregloEj3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbArregloEj3.setForeground(new java.awt.Color(255, 255, 255));
        txtbArregloEj3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbArregloEj3.setEnabled(false);
        panelEjercicio3.add(txtbArregloEj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 220, -1));

        btnArregloEj3.setBackground(new java.awt.Color(153, 102, 255));
        btnArregloEj3.setForeground(new java.awt.Color(255, 255, 255));
        btnArregloEj3.setText("Aceptar");
        btnArregloEj3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnArregloEj3.setEnabled(false);
        btnArregloEj3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArregloEj3MouseClicked(evt);
            }
        });
        panelEjercicio3.add(btnArregloEj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 80, 30));

        txtArregloCeldaEj3.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloCeldaEj3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panelEjercicio3.add(txtArregloCeldaEj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        tableLab3_Eje3.setBackground(new java.awt.Color(102, 102, 102));
        tableLab3_Eje3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tableLab3_Eje3.setForeground(new java.awt.Color(255, 255, 255));
        tableLab3_Eje3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Elementos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableLab3_Eje3.setRowHeight(30);
        jScrollPane7.setViewportView(tableLab3_Eje3);

        panelEjercicio3.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 150, 280));

        txtResultado.setBackground(new java.awt.Color(0, 0, 0));
        txtResultado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtResultado.setText("El producto total es:");
        panelEjercicio3.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 20));

        resultado.setBackground(new java.awt.Color(0, 0, 0));
        resultado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panelEjercicio3.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, 20));

        tpanelLaboratorio3.addTab("Ejercicio 3", panelEjercicio3);

        panelEjercicio4.setBackground(new java.awt.Color(255, 255, 255));
        panelEjercicio4.setToolTipText("");
        panelEjercicio4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEjercicio4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEjercicio4.setText("Ejercicio 4");
        panelEjercicio4.add(txtEjercicio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtResEj4.setBackground(new java.awt.Color(0, 0, 0));
        txtResEj4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panelEjercicio4.add(txtResEj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        txtbResEj4.setBackground(new java.awt.Color(102, 102, 102));
        txtbResEj4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbResEj4.setForeground(new java.awt.Color(255, 255, 255));
        txtbResEj4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbResEj4.setEnabled(false);
        panelEjercicio4.add(txtbResEj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 270, -1));

        btnResEj4.setBackground(new java.awt.Color(153, 102, 255));
        btnResEj4.setForeground(new java.awt.Color(255, 255, 255));
        btnResEj4.setText("Aceptar");
        btnResEj4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnResEj4.setEnabled(false);
        btnResEj4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResEj4MouseClicked(evt);
            }
        });
        panelEjercicio4.add(btnResEj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 130, 40));

        txtArregloEj4.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloEj4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtArregloEj4.setText("Ingrese una frase de su preferencia:");
        panelEjercicio4.add(txtArregloEj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txtbArregloEj4.setBackground(new java.awt.Color(102, 102, 102));
        txtbArregloEj4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbArregloEj4.setForeground(new java.awt.Color(255, 255, 255));
        txtbArregloEj4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEjercicio4.add(txtbArregloEj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 490, -1));

        btnArregloEj4.setBackground(new java.awt.Color(153, 102, 255));
        btnArregloEj4.setForeground(new java.awt.Color(255, 255, 255));
        btnArregloEj4.setText("Aceptar");
        btnArregloEj4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnArregloEj4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArregloEj4MouseClicked(evt);
            }
        });
        panelEjercicio4.add(btnArregloEj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 160, 40));

        txtArregloCeldaEj4.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloCeldaEj4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panelEjercicio4.add(txtArregloCeldaEj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        tpanelLaboratorio3.addTab("Ejercicio 4", panelEjercicio4);

        panelEjercicio5.setBackground(new java.awt.Color(255, 255, 255));
        panelEjercicio5.setToolTipText("");
        panelEjercicio5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEjercicio5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEjercicio5.setText("Ejercicio 5");
        panelEjercicio5.add(txtEjercicio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        btnCalcEj5.setBackground(new java.awt.Color(153, 102, 255));
        btnCalcEj5.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcEj5.setText("Aceptar");
        btnCalcEj5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCalcEj5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcEj5MouseClicked(evt);
            }
        });
        panelEjercicio5.add(btnCalcEj5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 170, 40));

        txtArregloCeldaEj5.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloCeldaEj5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panelEjercicio5.add(txtArregloCeldaEj5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        tableEj5.setBackground(new java.awt.Color(102, 102, 102));
        tableEj5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tableEj5.setForeground(new java.awt.Color(255, 255, 255));
        tableEj5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tableEj5);

        panelEjercicio5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 240, 330));

        txtExpEj51.setBackground(new java.awt.Color(0, 0, 0));
        txtExpEj51.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtExpEj51.setText("Cuando pulse \"Aceptar\" podr?? los a??os");
        panelEjercicio5.add(txtExpEj51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtExpEj352.setBackground(new java.awt.Color(0, 0, 0));
        txtExpEj352.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtExpEj352.setText("que tardar?? la cuenta de Pedro de 400$");
        panelEjercicio5.add(txtExpEj352, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtExpEj353.setBackground(new java.awt.Color(0, 0, 0));
        txtExpEj353.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtExpEj353.setText("en superar a la de Juan de 500$ si la tasa");
        panelEjercicio5.add(txtExpEj353, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtExpEj54.setBackground(new java.awt.Color(0, 0, 0));
        txtExpEj54.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtExpEj54.setText("de inter??s es de un 4% y ambos abrieron");
        panelEjercicio5.add(txtExpEj54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txtExpEj55.setBackground(new java.awt.Color(0, 0, 0));
        txtExpEj55.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtExpEj55.setText("sus cuentas en el a??o 2021.");
        panelEjercicio5.add(txtExpEj55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        tpanelLaboratorio3.addTab("Ejercicio 5", panelEjercicio5);

        panelEjercicio6.setBackground(new java.awt.Color(255, 255, 255));
        panelEjercicio6.setToolTipText("");
        panelEjercicio6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEjercicio6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEjercicio6.setText("Ejercicio 6");
        panelEjercicio6.add(txtEjercicio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txtTamEj6.setBackground(new java.awt.Color(0, 0, 0));
        txtTamEj6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTamEj6.setText("D?? un n??mero positivo mayor que 1:");
        panelEjercicio6.add(txtTamEj6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtbTamEj6.setBackground(new java.awt.Color(102, 102, 102));
        txtbTamEj6.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbTamEj6.setForeground(new java.awt.Color(255, 255, 255));
        txtbTamEj6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEjercicio6.add(txtbTamEj6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 210, -1));

        btnTamEj6.setBackground(new java.awt.Color(153, 102, 255));
        btnTamEj6.setForeground(new java.awt.Color(255, 255, 255));
        btnTamEj6.setText("Aceptar");
        btnTamEj6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnTamEj6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTamEj6MouseClicked(evt);
            }
        });
        panelEjercicio6.add(btnTamEj6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 80, 30));

        txtArregloCeldaEj6.setBackground(new java.awt.Color(0, 0, 0));
        txtArregloCeldaEj6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panelEjercicio6.add(txtArregloCeldaEj6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        tableEj6.setBackground(new java.awt.Color(102, 102, 102));
        tableEj6.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tableEj6.setForeground(new java.awt.Color(255, 255, 255));
        tableEj6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tableEj6);

        panelEjercicio6.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 240, 330));

        tpanelLaboratorio3.addTab("Ejercicio 6", panelEjercicio6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tpanelLaboratorio3, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tpanelLaboratorio3, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Ctrl + Minus (-) para abrir los folders, Ctrl + Plus (+) para cerrarlos
    
    // <editor-fold defaultstate="collapsed" desc="Ejercicio 1">
    //Ejercicio 1
    private void btnTamEj1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTamEj1MouseClicked
        String a = txtbTamEj1.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "El texto no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return ;
        }
        tam = Integer.parseInt(a);
        txtbArregloEj1.setEnabled(true);
        btnArregloEj1.setEnabled(true);
        cuenta = 0; //Resetea el contador para que se pueda agregar de nuevo el arreglo
        txtArregloEj1.setText("A??adir numero: " + (cuenta+1));
    }//GEN-LAST:event_btnTamEj1MouseClicked

    private void btnArregloEj1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArregloEj1MouseClicked
        int i = 0, n = tam;
        String a = txtbArregloEj1.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "El texto no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return ;
        }

        if(cuenta < tam){
            arregloA[cuenta] = Integer.parseInt(txtbArregloEj1.getText());
            txtbArregloEj1.setText("");
            cuenta = cuenta + 1;
            if(cuenta < tam){
                txtArregloEj1.setText("A??adir numero: " + (cuenta+1));
            }
            else{
                txtArregloEj1.setText("A??adir numero: 1");
            }
            
            DefaultTableModel model = (DefaultTableModel) tableEj1.getModel();
            model.setColumnCount(0);
            model.addColumn("Original");
            model.addColumn("Inverso");
            model.setRowCount(cuenta);

            original(arregloA, i, n);

            int j = 0;
            i = 0;
            n = tam;

            inverso(arregloA, i, n, j);
            txtbTamEj1.setText("");
        }
        else {
            JOptionPane.showMessageDialog(this, "Tama??o m??ximo del arreglo alcanzado", "Advertencia", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_btnArregloEj1MouseClicked
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Ejercicio 2">
    //Ejercicio 2
    private void btnArregloEj2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArregloEj2MouseClicked
        String a = txtbArregloEj2.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "El texto no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return ;
        }
        arregloC = txtbArregloEj2.getText();
        txtbArregloEj2.setText("");

        //Crea una tabla modificada para agregar en tiempo real el arreglo en funci??n del tama??o de este
        DefaultTableModel model = (DefaultTableModel) tableEj2.getModel();
        model.setColumnCount(0);
        model.addColumn("Original");
        model.addColumn("Inverso");
        model.setRowCount(1);

        tableEj2.setValueAt(arregloC, 0, 0);
        tableEj2.setValueAt(palabra(arregloC, arregloC.length()-1), 0, 1);

        arregloC = "";
    }//GEN-LAST:event_btnArregloEj2MouseClicked
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Ejercicio 3">
    //Ejercicio 3
    private void btnTamEj3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTamEj3MouseClicked
        String a = txtbTamEj3.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "El texto no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return ;
        }
        tam = Integer.parseInt(a);
        txtbArregloEj3.setEnabled(true);
        btnArregloEj3.setEnabled(true);
        btnTamEj3.setEnabled(false);
        txtbTamEj3.setEnabled(false);
        cuenta = 0;
        x = -1;
        txtArregloEj3.setText("A??adir numero: " + (cuenta+1));
    }//GEN-LAST:event_btnTamEj3MouseClicked

    private void btnArregloEj3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArregloEj3MouseClicked
        int i = 0, pro = 1;
       
        if(cuenta != tam){
            String a = txtbArregloEj3.getText();
            if(a.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "El texto no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
                return ;
            }
            int valor = Integer.parseInt(txtbArregloEj3.getText());
            arregloA[cuenta] = valor;
            txtbArregloEj3.setText("");
            
            DefaultTableModel model = (DefaultTableModel) tableLab3_Eje3.getModel();
            model.setColumnCount(1);
            model.setRowCount(cuenta+1);
            tableLab3_Eje3.setValueAt(arregloA[cuenta], x+1 , 0);
            cuenta = cuenta + 1;
            resultado.setText("" + producto(arregloA, i, pro, tam));
            if(cuenta < tam){
                txtArregloEj3.setText("A??adir numero: " + (cuenta+1));
            }
            else{
                txtArregloEj3.setText("A??adir numero: 1");
                txtbArregloEj3.setText("");
                btnArregloEj3.setEnabled(false);
                txtbArregloEj3.setEnabled(false);
                btnTamEj3.setEnabled(true);
                txtbTamEj3.setEnabled(true);
            }
            
            x++;
        }
        else{
            JOptionPane.showMessageDialog(this, "Tama??o m??ximo del arreglo alcanzado", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtbArregloEj3.setText("");
            btnArregloEj3.setEnabled(false);
            txtbArregloEj3.setEnabled(false);
            btnTamEj3.setEnabled(true);
            txtbTamEj3.setEnabled(true);
        }
    }//GEN-LAST:event_btnArregloEj3MouseClicked
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Ejercicio 4">
    //Ejercicio 4
    private void btnResEj4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResEj4MouseClicked
        btnArregloEj4.setEnabled(true);
        txtbResEj4.setEnabled(false);
        btnResEj4.setEnabled(false);
        txtbResEj4.setText("");
        txtResEj4.setText("");
        txtbArregloEj4.setText("");
    }//GEN-LAST:event_btnResEj4MouseClicked

    private void btnArregloEj4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArregloEj4MouseClicked
        String pala = null, a;
        int i = 0, cont = 0, result = 0;
        
        a = txtbArregloEj4.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        txtArregloEj4.setText("Ingrese una frase de su preferencia:");
        arregloC = txtbArregloEj4.getText();

        btnResEj4.setEnabled(true);
        txtbResEj4.setEnabled(true);
        btnArregloEj4.setEnabled(false);

        result = espacios(arregloC, arregloC.length(), i, cont, pala);

        arregloC = "";

        txtResEj4.setText("Precione 'Aceptar' para intentar otra vez.");
        txtbResEj4.setText("El texto contiene "+ result +" espacios en total.");
    }//GEN-LAST:event_btnArregloEj4MouseClicked
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Ejercicio 5">
    //Ejercicio 5
    private void btnCalcEj5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcEj5MouseClicked
        //Crea una tabla modificada para agregar en tiempo real el arreglo en funci??n del tama??o de este
        DefaultTableModel model = (DefaultTableModel) tableEj5.getModel();
        model.setColumnCount(0);
        model.addColumn("A??o");
        model.addColumn("Pedro");
        model.addColumn("Juan");
        model.setRowCount(15);

        int anyo = 2021, x = 0;
        float ahorroPE = 400, ahorroJU = 500;

        factorial(ahorroPE, ahorroJU, anyo, x);
    }//GEN-LAST:event_btnCalcEj5MouseClicked
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Ejercicio 6">
    //Ejercicio 6
    private void btnTamEj6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTamEj6MouseClicked
        String a = txtbTamEj6.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int z = Integer.parseInt(a);

        if(z < 1 || z == 1){
            JOptionPane.showMessageDialog(null, "El numero tiene que ser mayor que uno", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else if(z > 1){
            int x = 0, y;

            y = ULAM1(z, x);
            y = y + 1;

            //Crea una tabla modificada para agregar en tiempo real el arreglo en funci??n del tama??o de este
            DefaultTableModel model = (DefaultTableModel) tableEj6.getModel();
            model.setColumnCount(0);
            model.addColumn("ULAM");
            model.setRowCount(y);

            x = 0;

            ULAM2(z, x);
        }
    }//GEN-LAST:event_btnTamEj6MouseClicked
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="M??todos">
    //M??todos
    public void original(int num[], int x, int tam){
        if(x < tam)
        {
            tableEj1.setValueAt(num[x], x, 0);
            original(num, x+1,tam);
        }
    }
    
    public void inverso(int num[], int x, int tam, int y){
        if(x < tam)
        {
            tableEj1.setValueAt(num[tam-1], y, 1);
            inverso(num, x, tam-1, y+1);
        }
    }
    
    public String palabra(String pa, int longitud){
        if(longitud == 0)
        {
            return pa.charAt(longitud)+"";
        }
        else
        {
            return pa.charAt(longitud)+ (palabra(pa,longitud-1));
        }
    }
    
    public int producto(int num[], int x, int pro, int tam){
    	if(x < tam){
            pro *= num[x];
            return producto(num, x+1, pro,tam);
    	}
    	return pro;
    }
    
    public int espacios(String pa, int lon,int i, int cont, String pala){
        if (i<lon)
        {
            pala = pa.substring(i, i+1);
            
            if (pala.compareTo(" ")==0)
            {
                cont++;
            }
            
            return espacios(pa,lon,i+1,cont,pala);
        }
        return cont;
    }
    
    public void factorial(float ahorroPE, float ahorroJU, int anyo, int x){
        tableEj5.setValueAt(anyo, x, 0);
        tableEj5.setValueAt(ahorroJU, x, 1);
        tableEj5.setValueAt(ahorroPE, x, 2);
        //System.out.println(anyo +"\t  " + Math.round(ahorroPE) + "\t\t  " + Math.round(ahorroJU));

        if(ahorroPE < ahorroJU){
            anyo += 1;
            ahorroPE += ahorroPE * 0.04;
            ahorroJU += ahorroJU * 0.023; 
            factorial(ahorroPE, ahorroJU, anyo, x+1);
        }
    }
    
    public int ULAM1(int n, int x){
        //System.out.print(n+"   ");
        if (n == 1){
            return x;
        }
        else if(n%2 == 0){
            n =  ULAM1((n/2), x+1);
            return n;
        }
        else if (n%2 == 0){
            n =  ULAM1((n/2), x+1);
            return n;
        }
        else{
            n = ULAM1((n*3+1), x+1);
            return n;
        }
    }
    
    public int ULAM2(int n, int x){
        //System.out.print(n+"   ");
        tableEj6.setValueAt(n, x, 0);

        if (n == 1){
            return 1;
        }
        else if (n%2 == 0){
            n =  ULAM2((n/2), x+1);
            return n;
        }
        else{
            n = ULAM2((n*3+1), x+1);
            return n;
        }
    }
    //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArregloEj1;
    private javax.swing.JButton btnArregloEj2;
    private javax.swing.JButton btnArregloEj3;
    private javax.swing.JButton btnArregloEj4;
    private javax.swing.JButton btnCalcEj5;
    private javax.swing.JButton btnResEj4;
    private javax.swing.JButton btnTamEj1;
    private javax.swing.JButton btnTamEj3;
    private javax.swing.JButton btnTamEj6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel panelEjercicio1;
    private javax.swing.JPanel panelEjercicio2;
    private javax.swing.JPanel panelEjercicio3;
    private javax.swing.JPanel panelEjercicio4;
    private javax.swing.JPanel panelEjercicio5;
    private javax.swing.JPanel panelEjercicio6;
    private javax.swing.JLabel resultado;
    private javax.swing.JTable tableEj1;
    private javax.swing.JTable tableEj2;
    private javax.swing.JTable tableEj5;
    private javax.swing.JTable tableEj6;
    private javax.swing.JTable tableLab3_Eje3;
    private javax.swing.JTabbedPane tpanelLaboratorio3;
    private javax.swing.JLabel txtArregloCeldaEj1;
    private javax.swing.JLabel txtArregloCeldaEj2;
    private javax.swing.JLabel txtArregloCeldaEj3;
    private javax.swing.JLabel txtArregloCeldaEj4;
    private javax.swing.JLabel txtArregloCeldaEj5;
    private javax.swing.JLabel txtArregloCeldaEj6;
    private javax.swing.JLabel txtArregloEj1;
    private javax.swing.JLabel txtArregloEj2;
    private javax.swing.JLabel txtArregloEj3;
    private javax.swing.JLabel txtArregloEj4;
    private javax.swing.JLabel txtEjercicio1;
    private javax.swing.JLabel txtEjercicio2;
    private javax.swing.JLabel txtEjercicio3;
    private javax.swing.JLabel txtEjercicio4;
    private javax.swing.JLabel txtEjercicio5;
    private javax.swing.JLabel txtEjercicio6;
    private javax.swing.JLabel txtExpEj352;
    private javax.swing.JLabel txtExpEj353;
    private javax.swing.JLabel txtExpEj51;
    private javax.swing.JLabel txtExpEj54;
    private javax.swing.JLabel txtExpEj55;
    private javax.swing.JLabel txtResEj4;
    private javax.swing.JLabel txtResultado;
    private javax.swing.JLabel txtTamEj1;
    private javax.swing.JLabel txtTamEj3;
    private javax.swing.JLabel txtTamEj6;
    private javax.swing.JTextField txtbArregloEj1;
    private javax.swing.JTextField txtbArregloEj2;
    private javax.swing.JTextField txtbArregloEj3;
    private javax.swing.JTextField txtbArregloEj4;
    private javax.swing.JTextField txtbResEj4;
    private javax.swing.JTextField txtbTamEj1;
    private javax.swing.JTextField txtbTamEj3;
    private javax.swing.JTextField txtbTamEj6;
    // End of variables declaration//GEN-END:variables
}

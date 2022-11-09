package aed.lab2;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Laboratorio5 extends javax.swing.JPanel {

    public Laboratorio5() {
        initComponents();
    }
    
    Lab5_EJE_2 ejercicio2 =  new Lab5_EJE_2();
    Lab5_Eje_3_Lista_metodos ejercicio3 = new Lab5_Eje_3_Lista_metodos();
    Lab5_EJE_5 ejercicio5 =  new Lab5_EJE_5();
    List<String> pila = new ArrayList<String>();
    int i = -1, j =-1, x =-1, m=0;
    Lab5_Eje_1_Listado ejercicio1 = new Lab5_Eje_1_Listado();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpanelLaboratorio5 = new javax.swing.JTabbedPane();
        panelEjercicio1 = new javax.swing.JPanel();
        txtEjercicio1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtbCarrera = new javax.swing.JTextField();
        txtCarrera = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JLabel();
        txtbCarnet = new javax.swing.JTextField();
        btnAgregar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEj1 = new javax.swing.JTable();
        txtbNombre1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtNombre2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnOriginal = new javax.swing.JButton();
        panelEjercicio2 = new javax.swing.JPanel();
        txtEjercicio2 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JLabel();
        txtbNumero = new javax.swing.JTextField();
        btnAgregar2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEj2 = new javax.swing.JTable();
        panelEjercicio3 = new javax.swing.JPanel();
        txtEjercicio3 = new javax.swing.JLabel();
        txtNombre3 = new javax.swing.JLabel();
        txtbNumEmp = new javax.swing.JTextField();
        txtNumEmp = new javax.swing.JLabel();
        txtSalario = new javax.swing.JLabel();
        txtbNomina = new javax.swing.JTextField();
        btnAgregar3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableEj3 = new javax.swing.JTable();
        txtbNombre4 = new javax.swing.JTextField();
        txtNombre4 = new javax.swing.JLabel();
        txtbSalario = new javax.swing.JTextField();
        panelEjercicio4 = new javax.swing.JPanel();
        txtEjercicio4 = new javax.swing.JLabel();
        txtAaa = new javax.swing.JLabel();
        txtbPila = new javax.swing.JTextField();
        btnEliminar4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableEj4 = new javax.swing.JTable();
        btnAgregar4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtEjercicio5 = new javax.swing.JLabel();
        txtNumero2 = new javax.swing.JLabel();
        txtbNumero2 = new javax.swing.JTextField();
        btnAgregar5 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableEj5 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        tpanelLaboratorio5.setPreferredSize(new java.awt.Dimension(580, 380));

        panelEjercicio1.setBackground(new java.awt.Color(255, 255, 255));
        panelEjercicio1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEjercicio1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEjercicio1.setText("Ejercicio 1");
        panelEjercicio1.add(txtEjercicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtNombre.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre.setText("Carrera:");
        panelEjercicio1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        txtbCarrera.setBackground(new java.awt.Color(102, 102, 102));
        txtbCarrera.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbCarrera.setForeground(new java.awt.Color(255, 255, 255));
        txtbCarrera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEjercicio1.add(txtbCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, -1));

        txtCarrera.setBackground(new java.awt.Color(0, 0, 0));
        txtCarrera.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCarrera.setText("Ingrese la carrera que cursa:");
        panelEjercicio1.add(txtCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtCarnet.setBackground(new java.awt.Color(0, 0, 0));
        txtCarnet.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCarnet.setText("Ingrese el carnet del alumno:");
        panelEjercicio1.add(txtCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        txtbCarnet.setBackground(new java.awt.Color(102, 102, 102));
        txtbCarnet.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbCarnet.setForeground(new java.awt.Color(255, 255, 255));
        txtbCarnet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEjercicio1.add(txtbCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 210, -1));

        btnAgregar1.setBackground(new java.awt.Color(153, 102, 255));
        btnAgregar1.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar1.setText("Agregar");
        btnAgregar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });
        panelEjercicio1.add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 80, 30));

        tableEj1.setBackground(new java.awt.Color(102, 102, 102));
        tableEj1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tableEj1.setForeground(new java.awt.Color(255, 255, 255));
        tableEj1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Alumno", "Carrera", "Carnet"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableEj1);

        panelEjercicio1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 530, 150));

        txtbNombre1.setBackground(new java.awt.Color(102, 102, 102));
        txtbNombre1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbNombre1.setForeground(new java.awt.Color(255, 255, 255));
        txtbNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEjercicio1.add(txtbNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, -1));

        btnBuscar.setBackground(new java.awt.Color(153, 102, 255));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Imprimir por Carrera");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelEjercicio1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 130, 30));

        txtNombre2.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre2.setText("Ingrese el nombre del alumno:");
        panelEjercicio1.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtBuscar.setBackground(new java.awt.Color(102, 102, 102));
        txtBuscar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEjercicio1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 180, -1));

        btnOriginal.setBackground(new java.awt.Color(153, 102, 255));
        btnOriginal.setForeground(new java.awt.Color(255, 255, 255));
        btnOriginal.setText("Oiginal");
        btnOriginal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnOriginal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOriginalMouseClicked(evt);
            }
        });
        btnOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalActionPerformed(evt);
            }
        });
        panelEjercicio1.add(btnOriginal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 80, 30));

        tpanelLaboratorio5.addTab("Ejercicio 1", panelEjercicio1);

        panelEjercicio2.setBackground(new java.awt.Color(255, 255, 255));
        panelEjercicio2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEjercicio2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEjercicio2.setText("Ejercicio 2");
        panelEjercicio2.add(txtEjercicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        txtNombre1.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre1.setText(" Ingrese un número entero:");
        panelEjercicio2.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        txtbNumero.setBackground(new java.awt.Color(102, 102, 102));
        txtbNumero.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbNumero.setForeground(new java.awt.Color(255, 255, 255));
        txtbNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEjercicio2.add(txtbNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 210, -1));

        btnAgregar2.setBackground(new java.awt.Color(153, 102, 255));
        btnAgregar2.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar2.setText("Agregar");
        btnAgregar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2ActionPerformed(evt);
            }
        });
        panelEjercicio2.add(btnAgregar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 80, 30));

        tableEj2.setBackground(new java.awt.Color(102, 102, 102));
        tableEj2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tableEj2.setForeground(new java.awt.Color(255, 255, 255));
        tableEj2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableEj2.setRowHeight(30);
        jScrollPane2.setViewportView(tableEj2);

        panelEjercicio2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 400, 110));

        tpanelLaboratorio5.addTab("Ejercicio 2", panelEjercicio2);

        panelEjercicio3.setBackground(new java.awt.Color(255, 255, 255));
        panelEjercicio3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEjercicio3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEjercicio3.setText("Ejercicio 3");
        panelEjercicio3.add(txtEjercicio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        txtNombre3.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre3.setText("Nomina total:");
        panelEjercicio3.add(txtNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        txtbNumEmp.setBackground(new java.awt.Color(102, 102, 102));
        txtbNumEmp.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbNumEmp.setForeground(new java.awt.Color(255, 255, 255));
        txtbNumEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEjercicio3.add(txtbNumEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 210, -1));

        txtNumEmp.setBackground(new java.awt.Color(0, 0, 0));
        txtNumEmp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNumEmp.setText("Ingrese el número del empleado:");
        panelEjercicio3.add(txtNumEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txtSalario.setBackground(new java.awt.Color(0, 0, 0));
        txtSalario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSalario.setText("Ingrese el salario del empleado:");
        panelEjercicio3.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        txtbNomina.setBackground(new java.awt.Color(102, 102, 102));
        txtbNomina.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbNomina.setForeground(new java.awt.Color(255, 255, 255));
        txtbNomina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbNominaActionPerformed(evt);
            }
        });
        panelEjercicio3.add(txtbNomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 170, -1));

        btnAgregar3.setBackground(new java.awt.Color(153, 102, 255));
        btnAgregar3.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar3.setText("Agregar");
        btnAgregar3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar3ActionPerformed(evt);
            }
        });
        panelEjercicio3.add(btnAgregar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 80, 30));

        tableEj3.setBackground(new java.awt.Color(102, 102, 102));
        tableEj3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tableEj3.setForeground(new java.awt.Color(255, 255, 255));
        tableEj3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Num_Empleado", "Salario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableEj3);

        panelEjercicio3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 520, 140));

        txtbNombre4.setBackground(new java.awt.Color(102, 102, 102));
        txtbNombre4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbNombre4.setForeground(new java.awt.Color(255, 255, 255));
        txtbNombre4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEjercicio3.add(txtbNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 210, -1));

        txtNombre4.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre4.setText("Ingrese el nombre del empleado:");
        panelEjercicio3.add(txtNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtbSalario.setBackground(new java.awt.Color(102, 102, 102));
        txtbSalario.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbSalario.setForeground(new java.awt.Color(255, 255, 255));
        txtbSalario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEjercicio3.add(txtbSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 210, -1));

        tpanelLaboratorio5.addTab("Ejercicio3", panelEjercicio3);

        panelEjercicio4.setBackground(new java.awt.Color(255, 255, 255));
        panelEjercicio4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEjercicio4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEjercicio4.setText("Ejercicio 4");
        panelEjercicio4.add(txtEjercicio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        txtAaa.setBackground(new java.awt.Color(0, 0, 0));
        txtAaa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAaa.setText("Ingrese lo siguiente en la pila:");
        panelEjercicio4.add(txtAaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txtbPila.setBackground(new java.awt.Color(102, 102, 102));
        txtbPila.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbPila.setForeground(new java.awt.Color(255, 255, 255));
        txtbPila.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEjercicio4.add(txtbPila, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 210, -1));

        btnEliminar4.setBackground(new java.awt.Color(153, 102, 255));
        btnEliminar4.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar4.setText("Eliminar");
        btnEliminar4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar4ActionPerformed(evt);
            }
        });
        panelEjercicio4.add(btnEliminar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 80, 30));

        tableEj4.setBackground(new java.awt.Color(102, 102, 102));
        tableEj4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tableEj4.setForeground(new java.awt.Color(255, 255, 255));
        tableEj4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tableEj4);

        panelEjercicio4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 250, 330));

        btnAgregar4.setBackground(new java.awt.Color(153, 102, 255));
        btnAgregar4.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar4.setText("Agregar");
        btnAgregar4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar4ActionPerformed(evt);
            }
        });
        panelEjercicio4.add(btnAgregar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 80, 30));

        tpanelLaboratorio5.addTab("Ejercicio 4", panelEjercicio4);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEjercicio5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEjercicio5.setText("Ejercicio 5");
        jPanel1.add(txtEjercicio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        txtNumero2.setBackground(new java.awt.Color(0, 0, 0));
        txtNumero2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNumero2.setText("Ingrese un número entero:");
        jPanel1.add(txtNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txtbNumero2.setBackground(new java.awt.Color(102, 102, 102));
        txtbNumero2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbNumero2.setForeground(new java.awt.Color(255, 255, 255));
        txtbNumero2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtbNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 210, -1));

        btnAgregar5.setBackground(new java.awt.Color(153, 102, 255));
        btnAgregar5.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar5.setText("Agregar");
        btnAgregar5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 80, 30));

        tableEj5.setBackground(new java.awt.Color(102, 102, 102));
        tableEj5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tableEj5.setForeground(new java.awt.Color(255, 255, 255));
        tableEj5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableEj5.setRowHeight(30);
        jScrollPane5.setViewportView(tableEj5);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 490, 110));

        tpanelLaboratorio5.addTab("Ejercicio 5", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpanelLaboratorio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpanelLaboratorio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        String numero = txtbNumero.getText();
        if(numero.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto  no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int num = Integer.parseInt(numero);
        ejercicio2.lisNum.add(num);
        
        DefaultTableModel model = (DefaultTableModel) tableEj2.getModel();
        model.setColumnCount(1);
        model.setRowCount(3);
        
        ejercicio2.positivo_negativo(ejercicio2.lisNum, ejercicio2.positivo, ejercicio2.negativo);
    
        tableEj2.setValueAt("Lista de numeros: "+ejercicio2.lisNum, 0, 0);
        tableEj2.setValueAt("Lista de positivos: "+ejercicio2.positivo, 1, 0);
        tableEj2.setValueAt("Lista de negativos: "+ejercicio2.negativo, 2, 0);
        txtbNumero.setText("");
    }//GEN-LAST:event_btnAgregar2ActionPerformed

    private void btnAgregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar3ActionPerformed
        String nombre = txtbNombre4.getText();
        String numeroEmple = txtbNumEmp.getText();
        
        if(nombre.isEmpty() || numeroEmple.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Uno o varios campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        float salario =Integer.parseInt(txtbSalario.getText());
        ejercicio3.insertar(nombre, numeroEmple, salario);
        ejercicio3.calNomina(ejercicio3.Salario);

        DefaultTableModel model = (DefaultTableModel) tableEj3.getModel();
        model.setRowCount(ejercicio3.nom.size());

        tableEj3.setValueAt(ejercicio3.nom.get(ejercicio3.nom.size()-1), x+1 , 0);
        tableEj3.setValueAt(ejercicio3.nEmple.get(ejercicio3.nEmple.size()-1), x+1, 1);
        tableEj3.setValueAt(ejercicio3.Salario.get(ejercicio3.Salario.size()-1), x+1, 2);
        x++;

        txtbNomina.setText(String.valueOf(ejercicio3.nomina));

        txtbNombre4.setText("");
        txtbNumEmp.setText("");
        txtbSalario.setText("");
        
    }//GEN-LAST:event_btnAgregar3ActionPerformed

    private void btnEliminar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar4ActionPerformed
        if(pila.size() != 0){
            String vacio ="";
            pila.remove(pila.size()-1);
            DefaultTableModel model = (DefaultTableModel) tableEj4.getModel();
            model.setColumnCount(1);
            model.setRowCount(19);
            tableEj4.setValueAt(vacio, j , 0);
            j--;
        }     
        else
            JOptionPane.showMessageDialog(null, "Pila vacia");
    }//GEN-LAST:event_btnEliminar4ActionPerformed

    private void btnAgregar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar4ActionPerformed
        String cadena = txtbPila.getText();
        if(cadena.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto  no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        pila.add(cadena);
        DefaultTableModel model = (DefaultTableModel) tableEj4.getModel();
        model.setColumnCount(1);
        model.setRowCount(19);
        tableEj4.setValueAt(cadena, j+1 , 0);
        j++;
        txtbPila.setText("");
    }//GEN-LAST:event_btnAgregar4ActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        String alumno = txtbNombre1.getText();
        String carrera = txtbCarrera.getText();
        String carnet = txtbCarnet.getText();
        
        if(alumno.isEmpty() || carrera.isEmpty() || carnet.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Uno o varios campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        ejercicio1.insertar(alumno, carrera, carnet);
        
        DefaultTableModel model = (DefaultTableModel) tableEj1.getModel();
        model.setRowCount(ejercicio1.alumno.size());

        tableEj1.setValueAt(ejercicio1.alumno.get(ejercicio1.alumno.size()-1), i+1 , 0);
        tableEj1.setValueAt(ejercicio1.carrera.get(ejercicio1.carrera.size()-1), i+1, 1);
        tableEj1.setValueAt(ejercicio1.carnet.get(ejercicio1.carnet.size()-1), i+1, 2);
        i++;
        txtbNombre1.setText("");
        txtbCarrera.setText("");
        txtbCarnet.setText("");
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void btnAgregar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar5ActionPerformed
        String numero = txtbNumero2.getText();
        if(numero.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int num = Integer.parseInt(numero);
        ejercicio5.lisNum.add(num);

        DefaultTableModel model = (DefaultTableModel) tableEj5.getModel();
        model.setColumnCount(1);
        model.setRowCount(3);

        ejercicio5.mayor_menor(ejercicio5.lisNum, ejercicio5.mayor, ejercicio5.menor);

        tableEj5.setValueAt("Lista de numeros: "+ejercicio5.lisNum, 0, 0);
        tableEj5.setValueAt("Lista de >10: "+ejercicio5.mayor, 1, 0);
        tableEj5.setValueAt("Lista de <=10: "+ejercicio5.menor, 2, 0);
        txtbNumero2.setText("");
    }//GEN-LAST:event_btnAgregar5ActionPerformed

    private void txtbNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbNominaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbNominaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String a = txtBuscar.getText();
        if(a.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        mostrarFiltrado(tableEj1, a);
        txtBuscar.setText("");
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOriginalActionPerformed

    private void btnOriginalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOriginalMouseClicked
        mostrar(tableEj1);
    }//GEN-LAST:event_btnOriginalMouseClicked

    public void mostrar(JTable datos)
    {
        String nombreColumnas [] = {"Nombre", "Carrera", "Carnet"};
        String data [][] = new String[ejercicio1.alumno.size()][nombreColumnas.length];
        for (int y = 0 ; y < ejercicio1.alumno.size() ; y++)
        {
            data[y][0] = String.valueOf(ejercicio1.alumno.get(y));
            data[y][1] = String.valueOf(ejercicio1.carrera.get(y));
            data[y][2] = String.valueOf(ejercicio1.carnet.get(y));
        }
       datos.setModel(new DefaultTableModel(data, nombreColumnas));
    }
    
    public void mostrarFiltrado(JTable datos, String item)
    {
        String nombreColumnas [] = {"Nombre", "Carrera", "Carnet"};
        String data [][] = new String[ejercicio1.alumno.size()][nombreColumnas.length];
        int count = 0;
        for (int i = 0 ; i < ejercicio1.alumno.size() ; i++)
        {
            if(!item.equalsIgnoreCase(ejercicio1.carrera.get(i)))
                continue;
            data[count][0] = String.valueOf(ejercicio1.alumno.get(i));
            data[count][1] = String.valueOf(ejercicio1.carrera.get(i));
            data[count][2] = String.valueOf(ejercicio1.carnet.get(i));
            count++;
        }
       datos.setModel(new DefaultTableModel(data, nombreColumnas));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAgregar3;
    private javax.swing.JButton btnAgregar4;
    private javax.swing.JButton btnAgregar5;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar4;
    private javax.swing.JButton btnOriginal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel panelEjercicio1;
    private javax.swing.JPanel panelEjercicio2;
    private javax.swing.JPanel panelEjercicio3;
    private javax.swing.JPanel panelEjercicio4;
    private javax.swing.JTable tableEj1;
    private javax.swing.JTable tableEj2;
    private javax.swing.JTable tableEj3;
    private javax.swing.JTable tableEj4;
    private javax.swing.JTable tableEj5;
    private javax.swing.JTabbedPane tpanelLaboratorio5;
    private javax.swing.JLabel txtAaa;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JLabel txtCarnet;
    private javax.swing.JLabel txtCarrera;
    private javax.swing.JLabel txtEjercicio1;
    private javax.swing.JLabel txtEjercicio2;
    private javax.swing.JLabel txtEjercicio3;
    private javax.swing.JLabel txtEjercicio4;
    private javax.swing.JLabel txtEjercicio5;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtNombre1;
    private javax.swing.JLabel txtNombre2;
    private javax.swing.JLabel txtNombre3;
    private javax.swing.JLabel txtNombre4;
    private javax.swing.JLabel txtNumEmp;
    private javax.swing.JLabel txtNumero2;
    private javax.swing.JLabel txtSalario;
    private javax.swing.JTextField txtbCarnet;
    private javax.swing.JTextField txtbCarrera;
    private javax.swing.JTextField txtbNombre1;
    private javax.swing.JTextField txtbNombre4;
    private javax.swing.JTextField txtbNomina;
    private javax.swing.JTextField txtbNumEmp;
    private javax.swing.JTextField txtbNumero;
    private javax.swing.JTextField txtbNumero2;
    private javax.swing.JTextField txtbPila;
    private javax.swing.JTextField txtbSalario;
    // End of variables declaration//GEN-END:variables
}

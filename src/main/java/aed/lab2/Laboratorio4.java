
package aed.lab2;

import java.util.Stack;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Laboratorio4 extends javax.swing.JPanel {

 
    public Laboratorio4() {
        initComponents();
    }

    Lab4ColaCircular cola = new Lab4ColaCircular();
    Lab4PiLa pila = new Lab4PiLa();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpanelLaboratorio4 = new javax.swing.JTabbedPane();
        panelConversion = new javax.swing.JPanel();
        txtConversion = new javax.swing.JLabel();
        txtTamEj1 = new javax.swing.JLabel();
        txtbNotacion = new javax.swing.JTextField();
        btnNotacion = new javax.swing.JButton();
        txtbPosfija = new javax.swing.JTextField();
        txtTamEj2 = new javax.swing.JLabel();
        txtbPrefija = new javax.swing.JTextField();
        txtTamEj3 = new javax.swing.JLabel();
        panelColas = new javax.swing.JPanel();
        txtColas = new javax.swing.JLabel();
        txtAgregarCola = new javax.swing.JLabel();
        txtbCola = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnSacar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaSalida = new javax.swing.JTextArea();
        panelPilas = new javax.swing.JPanel();
        txtPilas = new javax.swing.JLabel();
        txtAgregarPila = new javax.swing.JLabel();
        txtbPila = new javax.swing.JTextField();
        btnPop = new javax.swing.JButton();
        btnPush = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePila = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(580, 380));

        tpanelLaboratorio4.setBackground(new java.awt.Color(255, 255, 255));

        panelConversion.setBackground(new java.awt.Color(255, 255, 255));
        panelConversion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtConversion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtConversion.setText("Conversión Polaca");
        panelConversion.add(txtConversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        txtTamEj1.setBackground(new java.awt.Color(0, 0, 0));
        txtTamEj1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTamEj1.setText("Notacion Prefija:");
        panelConversion.add(txtTamEj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        txtbNotacion.setBackground(new java.awt.Color(102, 102, 102));
        txtbNotacion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbNotacion.setForeground(new java.awt.Color(255, 255, 255));
        txtbNotacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelConversion.add(txtbNotacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 300, -1));

        btnNotacion.setBackground(new java.awt.Color(153, 102, 255));
        btnNotacion.setForeground(new java.awt.Color(255, 255, 255));
        btnNotacion.setText("Aceptar");
        btnNotacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnNotacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNotacionMouseClicked(evt);
            }
        });
        panelConversion.add(btnNotacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 80, 30));

        txtbPosfija.setEditable(false);
        txtbPosfija.setBackground(new java.awt.Color(102, 102, 102));
        txtbPosfija.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbPosfija.setForeground(new java.awt.Color(255, 255, 255));
        txtbPosfija.setText("Notación posfija");
        txtbPosfija.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelConversion.add(txtbPosfija, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 300, 40));

        txtTamEj2.setBackground(new java.awt.Color(0, 0, 0));
        txtTamEj2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTamEj2.setText("Ingrese la notación infija:");
        panelConversion.add(txtTamEj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        txtbPrefija.setEditable(false);
        txtbPrefija.setBackground(new java.awt.Color(102, 102, 102));
        txtbPrefija.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbPrefija.setForeground(new java.awt.Color(255, 255, 255));
        txtbPrefija.setText("Notación prefija");
        txtbPrefija.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbPrefija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbPrefijaActionPerformed(evt);
            }
        });
        panelConversion.add(txtbPrefija, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 300, 40));

        txtTamEj3.setBackground(new java.awt.Color(0, 0, 0));
        txtTamEj3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTamEj3.setText("Notacion Posfija:");
        panelConversion.add(txtTamEj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        tpanelLaboratorio4.addTab("Conversión", panelConversion);

        panelColas.setBackground(new java.awt.Color(255, 255, 255));
        panelColas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtColas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtColas.setText("Colas Circulares");
        panelColas.add(txtColas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        txtAgregarCola.setBackground(new java.awt.Color(0, 0, 0));
        txtAgregarCola.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAgregarCola.setText("Ingrese la siguiente:");
        panelColas.add(txtAgregarCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txtbCola.setBackground(new java.awt.Color(102, 102, 102));
        txtbCola.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbCola.setForeground(new java.awt.Color(255, 255, 255));
        txtbCola.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelColas.add(txtbCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 230, -1));

        btnInsertar.setBackground(new java.awt.Color(153, 102, 255));
        btnInsertar.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertar.setText("Insertar");
        btnInsertar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertarMouseClicked(evt);
            }
        });
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        panelColas.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 80, 30));

        btnSacar.setBackground(new java.awt.Color(153, 102, 255));
        btnSacar.setForeground(new java.awt.Color(255, 255, 255));
        btnSacar.setText("Sacar");
        btnSacar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSacarMouseClicked(evt);
            }
        });
        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarActionPerformed(evt);
            }
        });
        panelColas.add(btnSacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 80, 30));

        txtaSalida.setBackground(new java.awt.Color(51, 51, 51));
        txtaSalida.setColumns(20);
        txtaSalida.setForeground(new java.awt.Color(255, 255, 255));
        txtaSalida.setRows(5);
        jScrollPane2.setViewportView(txtaSalida);

        panelColas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 240, 330));

        tpanelLaboratorio4.addTab("Colas", panelColas);

        panelPilas.setBackground(new java.awt.Color(255, 255, 255));
        panelPilas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPilas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPilas.setText("Pilas");
        panelPilas.add(txtPilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        txtAgregarPila.setBackground(new java.awt.Color(0, 0, 0));
        txtAgregarPila.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAgregarPila.setText("Ingrese el centro comercial:");
        panelPilas.add(txtAgregarPila, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txtbPila.setBackground(new java.awt.Color(102, 102, 102));
        txtbPila.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtbPila.setForeground(new java.awt.Color(255, 255, 255));
        txtbPila.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPilas.add(txtbPila, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 220, -1));

        btnPop.setBackground(new java.awt.Color(153, 102, 255));
        btnPop.setForeground(new java.awt.Color(255, 255, 255));
        btnPop.setText("Pop");
        btnPop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPopMouseClicked(evt);
            }
        });
        panelPilas.add(btnPop, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 80, 30));

        btnPush.setBackground(new java.awt.Color(153, 102, 255));
        btnPush.setForeground(new java.awt.Color(255, 255, 255));
        btnPush.setText("Push");
        btnPush.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPush.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPushMouseClicked(evt);
            }
        });
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });
        panelPilas.add(btnPush, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 80, 30));

        tablePila.setBackground(new java.awt.Color(102, 102, 102));
        tablePila.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tablePila.setForeground(new java.awt.Color(255, 255, 255));
        tablePila.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablePila);

        panelPilas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 240, 330));

        tpanelLaboratorio4.addTab("Pilas", panelPilas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpanelLaboratorio4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpanelLaboratorio4)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNotacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotacionMouseClicked
        String cadena = txtbNotacion.getText();
        if(cadena.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto  no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Lab3Conversion.convertir(txtbNotacion.getText(), txtbPrefija, txtbPosfija);
        
        txtbNotacion.setText("");
    }//GEN-LAST:event_btnNotacionMouseClicked

    private void btnPopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPopMouseClicked
        //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
        DefaultTableModel model = (DefaultTableModel) tablePila.getModel();
        model.setColumnCount(1);
        model.setRowCount(19);
        
        pila.pop();
        //txtaPila.setText(pila.pila[pila.tope]);
        String vacio = "";
        tablePila.setValueAt(vacio, pila.tope+1, 0);
    }//GEN-LAST:event_btnPopMouseClicked

    private void btnInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertarMouseClicked

    
    private void btnPushMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPushMouseClicked
        String cadena = txtbPila.getText();
        if(cadena.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto  no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Crea una tabla modificada para agregar en tiempo real el arreglo en función del tamaño de este
        DefaultTableModel model = (DefaultTableModel) tablePila.getModel();
        model.setColumnCount(1);
        model.setRowCount(19);

        pila.push(cadena);

        tablePila.setValueAt(pila.pila[pila.tope], pila.tope, 0);
        txtbPila.setText("");
    }//GEN-LAST:event_btnPushMouseClicked

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        String dato = txtbCola.getText();
        if(dato.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El campo de texto  no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        cola.insertar(dato);
        txtaSalida.setText(cola.toString());
        txtbCola.setText("");
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnSacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSacarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSacarMouseClicked

    private void btnSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarActionPerformed
        cola.quitar().toString();
        txtaSalida.setText(cola.toString());
    }//GEN-LAST:event_btnSacarActionPerformed

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPushActionPerformed

    private void txtbPrefijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbPrefijaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbPrefijaActionPerformed
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnNotacion;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnSacar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelColas;
    private javax.swing.JPanel panelConversion;
    private javax.swing.JPanel panelPilas;
    private javax.swing.JTable tablePila;
    private javax.swing.JTabbedPane tpanelLaboratorio4;
    private javax.swing.JLabel txtAgregarCola;
    private javax.swing.JLabel txtAgregarPila;
    private javax.swing.JLabel txtColas;
    private javax.swing.JLabel txtConversion;
    private javax.swing.JLabel txtPilas;
    private javax.swing.JLabel txtTamEj1;
    private javax.swing.JLabel txtTamEj2;
    private javax.swing.JLabel txtTamEj3;
    private javax.swing.JTextArea txtaSalida;
    private javax.swing.JTextField txtbCola;
    private javax.swing.JTextField txtbNotacion;
    private javax.swing.JTextField txtbPila;
    private javax.swing.JTextField txtbPosfija;
    private javax.swing.JTextField txtbPrefija;
    // End of variables declaration//GEN-END:variables
}

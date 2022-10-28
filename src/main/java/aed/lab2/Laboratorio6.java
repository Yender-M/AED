/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package aed.lab2;

/**
 *
 * @author pavel
 */
public class Laboratorio6 extends javax.swing.JPanel {

    /**
     * Creates new form Laboratorio6
     */
    
    int vueltas = 0;
    Object dato;
    Nodo izq, der;
    NodosArbol nodoarbol = new NodosArbol(dato, izq, der);
    
    public Laboratorio6() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBoard = new javax.swing.JPanel();
        txtNodo = new javax.swing.JLabel();
        txtbNodo = new javax.swing.JTextField();
        txtLado = new javax.swing.JLabel();
        btnSi = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(580, 380));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBoard.setBackground(new java.awt.Color(251, 247, 255));
        panelBoard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 255)));

        javax.swing.GroupLayout panelBoardLayout = new javax.swing.GroupLayout(panelBoard);
        panelBoard.setLayout(panelBoardLayout);
        panelBoardLayout.setHorizontalGroup(
            panelBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );
        panelBoardLayout.setVerticalGroup(
            panelBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        add(panelBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 560, 290));

        txtNodo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNodo.setForeground(new java.awt.Color(0, 0, 0));
        txtNodo.setText("Nombre del nodo:");
        add(txtNodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtbNodo.setBackground(new java.awt.Color(102, 102, 102));
        txtbNodo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtbNodo.setForeground(new java.awt.Color(255, 255, 255));
        txtbNodo.setText("A");
        add(txtbNodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 50, -1));

        txtLado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtLado.setForeground(new java.awt.Color(0, 0, 0));
        add(txtLado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        btnSi.setBackground(new java.awt.Color(153, 102, 255));
        btnSi.setForeground(new java.awt.Color(255, 255, 255));
        btnSi.setBorderPainted(false);
        btnSi.setContentAreaFilled(false);
        btnSi.setEnabled(false);
        btnSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiMouseClicked(evt);
            }
        });
        add(btnSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 80, 30));

        btnNo.setBackground(new java.awt.Color(153, 102, 255));
        btnNo.setForeground(new java.awt.Color(255, 255, 255));
        btnNo.setBorderPainted(false);
        btnNo.setContentAreaFilled(false);
        btnNo.setEnabled(false);
        btnNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNoMouseClicked(evt);
            }
        });
        add(btnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 80, 30));

        btnAceptar.setBackground(new java.awt.Color(153, 102, 255));
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiMouseClicked
        if(vueltas == 1){
            vueltas = vueltas + 1;
            
            txtNodo.setText("Nombre del hijo:");
            txtbNodo.setEnabled(true);
            btnAceptar.setEnabled(true);
            
            txtLado.setText("¿Tiene un hijo a la derecha?");
        }
        else{
            vuelta2();
            vueltas = vueltas + 1;
        }
    }//GEN-LAST:event_btnSiMouseClicked

    private void btnNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoMouseClicked
        if(vueltas == 1){
            vueltas = vueltas + 1;
            
            txtLado.setText("¿Tiene un hijo a la derecha?");
        }
        else{
            vuelta2();
            vueltas = vueltas + 1;
        }
    }//GEN-LAST:event_btnNoMouseClicked

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        txtLado.setText("¿Tiene un hijo a la izquierda?");
        
        btnSi.setOpaque(true);
        btnSi.setContentAreaFilled(true);
        btnSi.setBorderPainted(true);
        btnSi.setEnabled(true);
        btnSi.setText("Sí");
        
        btnNo.setOpaque(true);
        btnNo.setContentAreaFilled(true);
        btnNo.setBorderPainted(true);
        btnNo.setEnabled(true);
        btnNo.setText("No");
        
        txtbNodo.setEditable(false);
        btnAceptar.setEnabled(false);
        
        vueltas = 1;
        //Pasarle alguna variable al método de la clase CrearArbol
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void vuelta2(){
        txtLado.setText("");
        
        btnSi.setOpaque(false);
        btnSi.setContentAreaFilled(false);
        btnSi.setBorderPainted(false);
        btnSi.setEnabled(false);
        btnSi.setText("");

        btnNo.setOpaque(false);
        btnNo.setContentAreaFilled(false);
        btnNo.setBorderPainted(false);
        btnNo.setEnabled(false);
        btnNo.setText("");

        txtbNodo.setText("");
        txtbNodo.setEditable(true);
        btnAceptar.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnSi;
    private javax.swing.JPanel panelBoard;
    private javax.swing.JLabel txtLado;
    private javax.swing.JLabel txtNodo;
    private javax.swing.JTextField txtbNodo;
    // End of variables declaration//GEN-END:variables
}

package aed.lab2;

import java.awt.Color;
import javax.swing.*;

public class Laboratorio6 extends javax.swing.JPanel {

    /**
     * Creates new form Laboratorio6
     */
    
    Nodo nodoarbol = new Nodo("A", null, null);
    int h = 0; int h_vieja = 0;
    int x = 280, y = 10;
    String nodoA;
    
    public Laboratorio6() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBoard = new javax.swing.JPanel();
        txtNodo = new javax.swing.JLabel();
        txtbNodo = new javax.swing.JTextField();
        txtLado = new javax.swing.JLabel();
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
        txtNodo.setText("Nombre del nodo:");
        add(txtNodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtbNodo.setBackground(new java.awt.Color(102, 102, 102));
        txtbNodo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtbNodo.setForeground(new java.awt.Color(255, 255, 255));
        txtbNodo.setText("A");
        add(txtbNodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 50, -1));

        txtLado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(txtLado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

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

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        String texto = txtbNodo.getText();
        if(texto.isEmpty() == false){
            nodoarbol.setDato(texto);

            txtbNodo.setText("");
            txtNodo.setForeground(Color.black);
            btnAceptar.setEnabled(false);
            
            x = 280; y = 10;
            Lab6Graficar.Nodo(panelBoard.getGraphics(), texto, x, y, x, y - 15);
            nodoarbol.setDato(texto);
            nodoA = texto;
            CrearArbol(nodoarbol);
        }
        else{
            txtNodo.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnAceptarMouseClicked
    
    private void CrearArbol(Nodo apnodo){
        String[] opc = {"Sí", "No"};
        
        JFrame f = new JFrame();
        f.setLocation(630, 480);
        f.setVisible(true);
        
        int op = JOptionPane.showOptionDialog(f, "¿Tiene "+ apnodo.dato +" un hijo a la izquierda?", "Cliquee un botón", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opc, opc[0]);
        
        f.setVisible(false);
        
        if(op == 0){
            h = h + 1;
            f.setLocation(630, 480);
            f.setVisible(true);
            String texto = JOptionPane.showInputDialog(f, "Ingrese el nombre:");
            f.setVisible(false);
            apnodo.setIzq(new Nodo(texto, null, null));
            btnsi(1, apnodo.getIzq().getDato().toString(), apnodo);
            CrearArbol(apnodo.izq);
        }
        else{
            apnodo.setIzq(null);
            if(h == 0){
                //Hace nada
            }
            else{
                x = x + 30; y = y - 30;
            }
        }
        
        f.setLocation(630, 480);
        f.setVisible(true);
        
        op = JOptionPane.showOptionDialog(f, "¿Tiene "+ apnodo.dato +" un hijo a la derecha?", "Cliquee un botón", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opc, opc[0]);
        
        f.setVisible(false);
        
        if(op == 0){
            if(apnodo.getIzq() == null && h != 1){
                h = h + 1;
            }
            if(nodoA.equalsIgnoreCase(apnodo.getDato().toString()) && apnodo.getIzq() != null){
                x = 280; y = 10;
                h = 1;
            }
            
            h_vieja = h;
            f.setLocation(630, 480);
            f.setVisible(true);
            String texto = JOptionPane.showInputDialog(f, "Ingrese el nombre:");
            f.setVisible(false);
            apnodo.setDer(new Nodo(texto, null, null));
            btnsi(2, apnodo.getDer().getDato().toString(), apnodo);
            CrearArbol(apnodo.der);
        }
        else{
            apnodo.setDer(null);
            if(h_vieja == h){
                y = y - 30;
                h = h - 1;
            }
            if(apnodo.getIzq() != null){
                x = x + 30; y = y - 30;
                h = h - 1;
                h_vieja = h;
            }
        }
    }
    
    private void btnsi(int lado, String nomn, Nodo original){
        //Guardan la posición anterior del círculo para dibujar las líneas
        int x1 = x; int y1 = y;
        
        if(lado == 1){ //Si agrega a la izquierda
            //Da un margen más amplio entre los hijos si la altura es 1
            if(h == 1){
                x = x - 70; y = y + 30;
            }
            else{
                x = x - 30; y = y + 30;
            }
            Lab6Graficar.Nodo(panelBoard.getGraphics(), nomn, x, y, x1, y1);
        }
        else if(lado == 2){ //Si agrega a la derecha
            if(h == 1 && original.getIzq() != null){
                x = x + 70; y = y + 30;
            }
            else if(h == 1 && original.getIzq() == null){
                x = x + 70; y = y + 30;
            }
            else{
                x = x + 30; y = y + 30;
            }
            Lab6Graficar.Nodo(panelBoard.getGraphics(), nomn, x, y, x1, y1);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JPanel panelBoard;
    private javax.swing.JLabel txtLado;
    private javax.swing.JLabel txtNodo;
    private javax.swing.JTextField txtbNodo;
    // End of variables declaration//GEN-END:variables
}

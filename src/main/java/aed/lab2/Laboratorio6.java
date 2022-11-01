package aed.lab2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Laboratorio6 extends javax.swing.JPanel {

    /**
     * Creates new form Laboratorio6
     */
    
    int vueltas = 0;
    Object nom = "A";
    Nodo i;
    Nodo d;
    Nodo nodoarbol = new Nodo(nom, i, d);
    int h = 0;
    int x = 280, y = 90;
    String txtizq = "¿Tiene un hijo a la izquierda?";
    String txtder = "¿Tiene un hijo en la derecha?";
    
    public Laboratorio6() {
        initComponents();
    }
      
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        dibujarArbol(g2d, nodoarbol, x, y);
    }
    
    private SimuladorArbolBinario simulador = new SimuladorArbolBinario();
    
    
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
        txtNodoActual = new javax.swing.JLabel();

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

        txtNodoActual.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNodoActual.setText("Nodo actual:");
        add(txtNodoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 90, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiMouseClicked
        String texto = txtbNodo.getText();
        //Comprueba que no esté vacía la caja de texto y que sea la primera vuelta
        if(texto.isEmpty() == false){
            nodoarbol.setDato(texto);
            txtNodoActual.setText("Nodo actual: "+ nodoarbol.dato);
            txtLado.setText("¿Tiene hijo a la izquierda?");
            
            if(txtLado.getText().equalsIgnoreCase(txtizq)){
                btnsi(1, texto, nodoarbol);
            }
            else if(txtLado.getText().equalsIgnoreCase(txtder)){
                btnsi(2, texto, nodoarbol);
            }
            
            //Se resta la vuelta para que se acumule el número
            vueltas = vueltas - 1;
            txtbNodo.setText("");
            txtNodo.setForeground(Color.black);
            txtLado.setText(txtizq);
        }
        /*if (this.simulador.insertar(texto, lado)) {
            complementos();
        }*/
        else if(texto.isEmpty() == true){
            //txtLado.setText(txtizq);
            txtNodo.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnSiMouseClicked

    private void btnNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoMouseClicked
        if(h == 0){
            //Falta dehabilitar los demás componentes activos
            vuelta2();
        }
        else if(vueltas <= 1){
            vueltas = vueltas + 1;
            txtNodo.setForeground(Color.black);
            txtNodoActual.setText("Nodo actual: "+ String.valueOf(nodoarbol.dato));
            if(txtLado.getText().equalsIgnoreCase(txtizq)){
                txtLado.setText("¿Tiene un hijo a la derecha?");
            }
            else if(txtLado.getText().equalsIgnoreCase(txtder)){
                h = h - 1;
                if(nodoarbol.getDer() != null){
                    x = x - 30; y = y - 30;
                }
                else if(nodoarbol.getDer() == null && nodoarbol.getIzq() != null){
                    x = x + 30; y = y - 30;
                }
            }
        }
        else{
            vuelta2();
            vueltas = vueltas + 1;
        }
    }//GEN-LAST:event_btnNoMouseClicked

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        String texto = txtbNodo.getText();
        if(vueltas == 0){
            nodoarbol.setDato(texto);
            txtNodoActual.setText("Nodo actual: "+ nodoarbol.dato);
            
            txtLado.setText("¿Tiene un hijo a la izquierda?");
            txtNodoActual.setText("Nodo actual: "+ String.valueOf(nodoarbol.dato));
            
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

            txtbNodo.setText("");
            txtNodo.setForeground(Color.black);
            btnAceptar.setEnabled(false);
            
            h = 1;
            x = 280; y = 80;
            vueltas = 1;
            //Pasarle alguna variable al método de la clase CrearArbol
        }
        else if(vueltas > 2){
            
        }
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnsi(int lado, String nomn, Nodo nd){
        if(h == 0){
            txtbNodo.setEnabled(false);
            btnAceptar.setEnabled(false);
            vuelta2();
        }
        else if(lado == 1 && h > 0){ //Si agrega a la izquierda
            nd.setIzq(nd);
            h = h + 1;
            x = x - 30; y = y + 30;
            //paint(x, y);
            repintarArbol();
        }
        else if(lado == 2 && h > 0){ //Si agrega a la derecha
            if(nd.getDer() == null){ //Si el nodo a agregar no existía
                nd.setDer(nd);
                h = h + 1;
                x = x + 30; y = y + 30;
                //paint(x, y);
                repintarArbol();
            }
            else{ //Si había algún nodo
                h = h - 1;
                if(h == 0){
                txtbNodo.setEnabled(false);
                btnAceptar.setEnabled(false);
                vuelta2();
                }
            }
        }
    }
    
    private void dibujarArbol(Graphics2D g, Nodo n, int x, int y) 
    {
        g.drawString(n.dato.toString(), x + 4, y + 11);
        g.drawOval(x, y, 15, 15);
   }
    
    private void repintarArbol() {
        this.panelBoard.removeAll();
        /*Rectangle tamaño = this.panelBoard1.getBounds();
        this.panelBoard1 = null;
        this.panelBoard1 = new JPanel();
        this.panelBoard.add(this.panelBoard1, JLayeredPane.DEFAULT_LAYER);
        this.panelBoard1.setVisible(true);
        this.panelBoard1.setBounds(tamaño);
        this.panelBoard1.setEnabled(false);
        this.panelBoard1.add(this.simulador.getDibujo(), BorderLayout.CENTER);*/
    }
    
    // <editor-fold defaultstate="collapsed" desc="Vuelta2">
    //Vuelta 2
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
        txtNodo.setForeground(Color.black);
        btnAceptar.setEnabled(true);
    }
    //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnSi;
    private javax.swing.JPanel panelBoard;
    private javax.swing.JLabel txtLado;
    private javax.swing.JLabel txtNodo;
    private javax.swing.JLabel txtNodoActual;
    private javax.swing.JTextField txtbNodo;
    // End of variables declaration//GEN-END:variables
}

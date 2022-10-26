/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aed.lab2;

import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author pavel
 */
public class ventanaPrincipal extends javax.swing.JFrame {

    int xMouse, yMouse;
    Color botonNuevo = new Color(204,204,255);
    Color botonViejo = new Color(189,165,240);
    
    /**
     * Creates new form ventanaPrincipal
     */
    public ventanaPrincipal() {
        initComponents();
        /*tpanelPrincipal.setSelectedIndex(0);
        txtMetodo.setText("Presentación");*/
        setLocationRelativeTo(null);
        Presentacion pre = new Presentacion();
        pre.setSize(580, 380);  
        panelDinamico.removeAll();
        panelDinamico.add(pre, BorderLayout.CENTER);
        panelDinamico.revalidate();
        panelDinamico.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelIzquierdo = new javax.swing.JPanel();
        btnLab1 = new javax.swing.JButton();
        txtMetodosOrdenacion = new javax.swing.JLabel();
        btnLab2 = new javax.swing.JButton();
        btnLab3 = new javax.swing.JButton();
        btnLaboratorio3 = new javax.swing.JButton();
        btnLab4 = new javax.swing.JButton();
        btnLab5 = new javax.swing.JButton();
        btnLab6 = new javax.swing.JButton();
        panelSuperior = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        txtMetodo = new javax.swing.JLabel();
        panelDinamico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("framePrincipal"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(240, 240, 240));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIzquierdo.setBackground(new java.awt.Color(40, 27, 58));

        btnLab1.setBackground(new java.awt.Color(189, 165, 240));
        btnLab1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnLab1.setForeground(new java.awt.Color(255, 255, 255));
        btnLab1.setText("Lab 1");
        btnLab1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLab1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLab1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLab1MouseExited(evt);
            }
        });

        txtMetodosOrdenacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMetodosOrdenacion.setForeground(new java.awt.Color(255, 255, 255));
        txtMetodosOrdenacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMetodosOrdenacion.setText("Laboratorios");

        btnLab2.setBackground(new java.awt.Color(189, 165, 240));
        btnLab2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnLab2.setForeground(new java.awt.Color(255, 255, 255));
        btnLab2.setText("Lab 2");
        btnLab2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLab2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLab2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLab2MouseExited(evt);
            }
        });

        btnLab3.setBackground(new java.awt.Color(189, 165, 240));
        btnLab3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnLab3.setForeground(new java.awt.Color(255, 255, 255));
        btnLab3.setText("Lab 3");
        btnLab3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLab3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLab3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLab3MouseExited(evt);
            }
        });

        btnLaboratorio3.setBackground(new java.awt.Color(153, 51, 255));
        btnLaboratorio3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLaboratorio3.setForeground(new java.awt.Color(255, 255, 255));
        btnLaboratorio3.setText("Proyecto de AED");
        btnLaboratorio3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLaboratorio3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLaboratorio3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLaboratorio3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLaboratorio3MouseExited(evt);
            }
        });
        btnLaboratorio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaboratorio3ActionPerformed(evt);
            }
        });

        btnLab4.setBackground(new java.awt.Color(189, 165, 240));
        btnLab4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnLab4.setForeground(new java.awt.Color(255, 255, 255));
        btnLab4.setText("Lab 4");
        btnLab4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLab4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLab4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLab4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLab4MouseExited(evt);
            }
        });

        btnLab5.setBackground(new java.awt.Color(189, 165, 240));
        btnLab5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnLab5.setForeground(new java.awt.Color(255, 255, 255));
        btnLab5.setText("Lab 5");
        btnLab5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLab5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLab5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLab5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLab5MouseExited(evt);
            }
        });

        btnLab6.setBackground(new java.awt.Color(189, 165, 240));
        btnLab6.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnLab6.setForeground(new java.awt.Color(255, 255, 255));
        btnLab6.setText("Lab 6");
        btnLab6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLab6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLab6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLab6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLab6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelIzquierdoLayout = new javax.swing.GroupLayout(panelIzquierdo);
        panelIzquierdo.setLayout(panelIzquierdoLayout);
        panelIzquierdoLayout.setHorizontalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtMetodosOrdenacion, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
            .addComponent(btnLab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLaboratorio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLab4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLab5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLab6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelIzquierdoLayout.setVerticalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addComponent(btnLaboratorio3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMetodosOrdenacion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLab1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLab3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLab4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLab5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLab6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 92, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 420));

        panelSuperior.setBackground(new java.awt.Color(153, 102, 255));
        panelSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelSuperiorMouseDragged(evt);
            }
        });
        panelSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelSuperiorMousePressed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(153, 102, 255));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        txtMetodo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMetodo.setForeground(new java.awt.Color(255, 255, 255));
        txtMetodo.setText("Presentación");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMetodo)))
        );

        panelPrincipal.add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 580, 40));

        panelDinamico.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelDinamicoLayout = new javax.swing.GroupLayout(panelDinamico);
        panelDinamico.setLayout(panelDinamicoLayout);
        panelDinamicoLayout.setHorizontalGroup(
            panelDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        panelDinamicoLayout.setVerticalGroup(
            panelDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        panelPrincipal.add(panelDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 580, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Ctrl + Minus (-) para abrir los folders, Ctrl + Plus (+) para cerrarlos
    
    // <editor-fold defaultstate="collapsed" desc="Funciones de la ventana">
    //Funciones de la ventana
    private void panelSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelSuperiorMousePressed

    private void panelSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - 170 - xMouse, y - yMouse);
    }//GEN-LAST:event_panelSuperiorMouseDragged
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Animaciones y funciones de botones">
    //Animaciones y funciones de botones
    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        Color salirViejo = new Color(153,102,255);
        btnSalir.setBackground(salirViejo);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        Color salirNuevo = new Color(118,63,228);
        btnSalir.setBackground(salirNuevo);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnLaboratorio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaboratorio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLaboratorio3ActionPerformed

    private void btnLaboratorio3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLaboratorio3MouseExited
        Color btnlabViejo = new Color(153,51,255);
        btnLaboratorio3.setBackground(btnlabViejo);
    }//GEN-LAST:event_btnLaboratorio3MouseExited

    private void btnLaboratorio3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLaboratorio3MouseEntered
        Color btnlabNuevo = new Color(153,102,255);
        btnLaboratorio3.setBackground(btnlabNuevo);
    }//GEN-LAST:event_btnLaboratorio3MouseEntered

    private void btnLaboratorio3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLaboratorio3MouseClicked
        Presentacion pre = new Presentacion();
        pre.setSize(580, 380);
        
        panelDinamico.removeAll();
        panelDinamico.add(pre, BorderLayout.CENTER);
        panelDinamico.revalidate();
        panelDinamico.repaint();
        
        txtMetodo.setText("Presentación");
    }//GEN-LAST:event_btnLaboratorio3MouseClicked

    private void btnLab3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLab3MouseExited
        btnLab3.setBackground(botonViejo);
    }//GEN-LAST:event_btnLab3MouseExited

    private void btnLab3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLab3MouseEntered
        btnLab3.setBackground(botonNuevo);
    }//GEN-LAST:event_btnLab3MouseEntered

    private void btnLab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLab3MouseClicked
        Laboratorio3 lab3 = new Laboratorio3();
        lab3.setSize(580, 380);
        
        panelDinamico.removeAll();
        panelDinamico.add(lab3, BorderLayout.CENTER);
        panelDinamico.revalidate();
        panelDinamico.repaint();
        
        txtMetodo.setText("Laboratorio 3");
    }//GEN-LAST:event_btnLab3MouseClicked

    private void btnLab2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLab2MouseExited
        btnLab2.setBackground(botonViejo);
    }//GEN-LAST:event_btnLab2MouseExited

    private void btnLab2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLab2MouseEntered
        btnLab2.setBackground(botonNuevo);
    }//GEN-LAST:event_btnLab2MouseEntered

    private void btnLab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLab2MouseClicked
        Laboratorio2 lab2 = new Laboratorio2();
        lab2.setSize(580, 380);
        
        panelDinamico.removeAll();
        panelDinamico.add(lab2, BorderLayout.CENTER);
        panelDinamico.revalidate();
        panelDinamico.repaint();
        
        txtMetodo.setText("Laboratorio 2");
    }//GEN-LAST:event_btnLab2MouseClicked

    private void btnLab1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLab1MouseExited
        btnLab1.setBackground(botonViejo);
    }//GEN-LAST:event_btnLab1MouseExited

    private void btnLab1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLab1MouseEntered
        btnLab1.setBackground(botonNuevo);
    }//GEN-LAST:event_btnLab1MouseEntered

    private void btnLab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLab1MouseClicked
        Laboratorio1 lab1 = new Laboratorio1();
        lab1.setSize(580, 380);
        
        panelDinamico.removeAll();
        panelDinamico.add(lab1, BorderLayout.CENTER);
        panelDinamico.revalidate();
        panelDinamico.repaint();
        
        txtMetodo.setText("Laboratorio 1");
    }//GEN-LAST:event_btnLab1MouseClicked

    private void btnLab4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLab4MouseClicked
        Laboratorio4 lab4 = new Laboratorio4();
        lab4.setSize(580, 380);
        
        panelDinamico.removeAll();
        panelDinamico.add(lab4, BorderLayout.CENTER);
        panelDinamico.revalidate();
        panelDinamico.repaint();
        
        txtMetodo.setText("Laboratorio 4");
    }//GEN-LAST:event_btnLab4MouseClicked

    private void btnLab4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLab4MouseEntered
        btnLab4.setBackground(botonNuevo);
    }//GEN-LAST:event_btnLab4MouseEntered

    private void btnLab4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLab4MouseExited
        btnLab4.setBackground(botonViejo);
    }//GEN-LAST:event_btnLab4MouseExited

    private void btnLab5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLab5MouseClicked
        Laboratorio5 lab5 = new Laboratorio5();
        lab5.setSize(580, 380);
        
        panelDinamico.removeAll();
        panelDinamico.add(lab5, BorderLayout.CENTER);
        panelDinamico.revalidate();
        panelDinamico.repaint();
        
        txtMetodo.setText("Laboratorio 5");
    }//GEN-LAST:event_btnLab5MouseClicked

    private void btnLab5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLab5MouseEntered
        btnLab5.setBackground(botonNuevo);
    }//GEN-LAST:event_btnLab5MouseEntered

    private void btnLab5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLab5MouseExited
        btnLab5.setBackground(botonViejo);
    }//GEN-LAST:event_btnLab5MouseExited

    private void btnLab6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLab6MouseClicked
        Laboratorio6 lab6 = new Laboratorio6();
        lab6.setSize(580, 380);
        
        panelDinamico.removeAll();
        panelDinamico.add(lab6, BorderLayout.CENTER);
        panelDinamico.revalidate();
        panelDinamico.repaint();
        
        txtMetodo.setText("Laboratorio 5");
    }//GEN-LAST:event_btnLab6MouseClicked

    private void btnLab6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLab6MouseEntered
        btnLab6.setBackground(botonNuevo);
    }//GEN-LAST:event_btnLab6MouseEntered

    private void btnLab6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLab6MouseExited
        btnLab5.setBackground(botonViejo);
    }//GEN-LAST:event_btnLab6MouseExited
    //</editor-fold>
        
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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLab1;
    private javax.swing.JButton btnLab2;
    private javax.swing.JButton btnLab3;
    private javax.swing.JButton btnLab4;
    private javax.swing.JButton btnLab5;
    private javax.swing.JButton btnLab6;
    private javax.swing.JButton btnLaboratorio3;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel panelDinamico;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JLabel txtMetodo;
    private javax.swing.JLabel txtMetodosOrdenacion;
    // End of variables declaration//GEN-END:variables
}

package practica;

import sm.sgp.iu.Lienzo2D;
import java.awt.Color;
import javax.swing.JFileChooser;
import javax.swing.JColorChooser;
import java.io.File;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        this.setTitle("Paint2D");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelCentral = new javax.swing.JPanel();
        barHerramientas = new javax.swing.JToolBar();
        toggleButtonLinea = new javax.swing.JToggleButton();
        toggleButtonCuadrado = new javax.swing.JToggleButton();
        toggleButtonElipse = new javax.swing.JToggleButton();
        toggleButtonFantasma = new javax.swing.JToggleButton();
        toggleButtonSeleccion = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jPanel2 = new javax.swing.JPanel();
        buttonColor = new javax.swing.JButton();
        toggleButtonRellenar = new javax.swing.JToggleButton();
        toggleButtonTransparencia = new javax.swing.JToggleButton();
        toggleButtonAlisar = new javax.swing.JToggleButton();
        sliderGrosor = new javax.swing.JSlider();
        lienzo = new sm.sgp.iu.Lienzo2D();
        panelBarraEstado = new javax.swing.JPanel();
        barraEstado = new javax.swing.JTextField();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuItemNuevo = new javax.swing.JMenuItem();
        menuItemAbrir = new javax.swing.JMenuItem();
        menuItemGuardar = new javax.swing.JMenuItem();

        jPanel1.setLayout(new java.awt.BorderLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(960, 540));

        panelCentral.setLayout(new java.awt.BorderLayout());

        barHerramientas.setRollover(true);
        barHerramientas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                barHerramientasMouseExited(evt);
            }
        });

        toggleButtonLinea.setBackground(new java.awt.Color(242, 242, 242));
        buttonGroup1.add(toggleButtonLinea);
        toggleButtonLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/linea.png"))); // NOI18N
        toggleButtonLinea.setSelected(true);
        toggleButtonLinea.setToolTipText("Línea");
        toggleButtonLinea.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        toggleButtonLinea.setFocusPainted(false);
        toggleButtonLinea.setFocusable(false);
        toggleButtonLinea.setHideActionText(true);
        toggleButtonLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleButtonLinea.setInheritsPopupMenu(true);
        toggleButtonLinea.setMaximumSize(new java.awt.Dimension(35, 35));
        toggleButtonLinea.setMinimumSize(new java.awt.Dimension(35, 35));
        toggleButtonLinea.setPreferredSize(new java.awt.Dimension(35, 35));
        toggleButtonLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toggleButtonLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonLineaActionPerformed(evt);
            }
        });
        barHerramientas.add(toggleButtonLinea);

        toggleButtonCuadrado.setBackground(new java.awt.Color(242, 242, 242));
        buttonGroup1.add(toggleButtonCuadrado);
        toggleButtonCuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rectangulo.png"))); // NOI18N
        toggleButtonCuadrado.setToolTipText("Cuadrado");
        toggleButtonCuadrado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        toggleButtonCuadrado.setFocusable(false);
        toggleButtonCuadrado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleButtonCuadrado.setInheritsPopupMenu(true);
        toggleButtonCuadrado.setMaximumSize(new java.awt.Dimension(35, 35));
        toggleButtonCuadrado.setMinimumSize(new java.awt.Dimension(35, 35));
        toggleButtonCuadrado.setPreferredSize(new java.awt.Dimension(35, 35));
        toggleButtonCuadrado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toggleButtonCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonCuadradoActionPerformed(evt);
            }
        });
        barHerramientas.add(toggleButtonCuadrado);

        toggleButtonElipse.setBackground(new java.awt.Color(242, 242, 242));
        buttonGroup1.add(toggleButtonElipse);
        toggleButtonElipse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/elipse.png"))); // NOI18N
        toggleButtonElipse.setToolTipText("Elipse");
        toggleButtonElipse.setAlignmentX(0.5F);
        toggleButtonElipse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        toggleButtonElipse.setFocusable(false);
        toggleButtonElipse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleButtonElipse.setInheritsPopupMenu(true);
        toggleButtonElipse.setMaximumSize(new java.awt.Dimension(35, 35));
        toggleButtonElipse.setMinimumSize(new java.awt.Dimension(35, 35));
        toggleButtonElipse.setPreferredSize(new java.awt.Dimension(35, 35));
        toggleButtonElipse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toggleButtonElipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonElipseActionPerformed(evt);
            }
        });
        barHerramientas.add(toggleButtonElipse);

        toggleButtonFantasma.setBackground(new java.awt.Color(242, 242, 242));
        buttonGroup1.add(toggleButtonFantasma);
        toggleButtonFantasma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fantasma.png"))); // NOI18N
        toggleButtonFantasma.setToolTipText("Fantasma");
        toggleButtonFantasma.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        toggleButtonFantasma.setFocusable(false);
        toggleButtonFantasma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleButtonFantasma.setMaximumSize(new java.awt.Dimension(35, 35));
        toggleButtonFantasma.setMinimumSize(new java.awt.Dimension(35, 35));
        toggleButtonFantasma.setPreferredSize(new java.awt.Dimension(35, 35));
        toggleButtonFantasma.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toggleButtonFantasma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonFantasmaActionPerformed(evt);
            }
        });
        barHerramientas.add(toggleButtonFantasma);

        toggleButtonSeleccion.setBackground(new java.awt.Color(242, 242, 242));
        buttonGroup1.add(toggleButtonSeleccion);
        toggleButtonSeleccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/seleccion.png"))); // NOI18N
        toggleButtonSeleccion.setToolTipText("Selección");
        toggleButtonSeleccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        toggleButtonSeleccion.setFocusable(false);
        toggleButtonSeleccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleButtonSeleccion.setMaximumSize(new java.awt.Dimension(35, 35));
        toggleButtonSeleccion.setMinimumSize(new java.awt.Dimension(35, 35));
        toggleButtonSeleccion.setPreferredSize(new java.awt.Dimension(35, 35));
        toggleButtonSeleccion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toggleButtonSeleccion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                toggleButtonSeleccionStateChanged(evt);
            }
        });
        barHerramientas.add(toggleButtonSeleccion);
        barHerramientas.add(jSeparator1);

        jPanel2.setLayout(new javax.swing.OverlayLayout(jPanel2));

        buttonColor.setBackground(new java.awt.Color(0, 0, 0));
        buttonColor.setToolTipText("Color");
        buttonColor.setBorder(null);
        buttonColor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonColor.setMaximumSize(new java.awt.Dimension(33, 33));
        buttonColor.setMinimumSize(new java.awt.Dimension(33, 33));
        buttonColor.setPreferredSize(new java.awt.Dimension(33, 33));
        buttonColor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColorActionPerformed(evt);
            }
        });
        jPanel2.add(buttonColor);

        barHerramientas.add(jPanel2);

        toggleButtonRellenar.setBackground(new java.awt.Color(242, 242, 242));
        toggleButtonRellenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rellenar.png"))); // NOI18N
        toggleButtonRellenar.setToolTipText("Rellenar");
        toggleButtonRellenar.setFocusable(false);
        toggleButtonRellenar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleButtonRellenar.setMaximumSize(new java.awt.Dimension(35, 35));
        toggleButtonRellenar.setMinimumSize(new java.awt.Dimension(35, 35));
        toggleButtonRellenar.setPreferredSize(new java.awt.Dimension(35, 35));
        toggleButtonRellenar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toggleButtonRellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonRellenarActionPerformed(evt);
            }
        });
        barHerramientas.add(toggleButtonRellenar);

        toggleButtonTransparencia.setBackground(new java.awt.Color(242, 242, 242));
        toggleButtonTransparencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/transparencia.png"))); // NOI18N
        toggleButtonTransparencia.setToolTipText("Transparencia");
        toggleButtonTransparencia.setFocusable(false);
        toggleButtonTransparencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleButtonTransparencia.setMaximumSize(new java.awt.Dimension(35, 35));
        toggleButtonTransparencia.setMinimumSize(new java.awt.Dimension(35, 35));
        toggleButtonTransparencia.setPreferredSize(new java.awt.Dimension(35, 35));
        toggleButtonTransparencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toggleButtonTransparencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonTransparenciaActionPerformed(evt);
            }
        });
        barHerramientas.add(toggleButtonTransparencia);

        toggleButtonAlisar.setBackground(new java.awt.Color(242, 242, 242));
        toggleButtonAlisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/alisar.png"))); // NOI18N
        toggleButtonAlisar.setToolTipText("Alisar");
        toggleButtonAlisar.setFocusable(false);
        toggleButtonAlisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleButtonAlisar.setMaximumSize(new java.awt.Dimension(35, 35));
        toggleButtonAlisar.setMinimumSize(new java.awt.Dimension(35, 35));
        toggleButtonAlisar.setPreferredSize(new java.awt.Dimension(35, 35));
        toggleButtonAlisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toggleButtonAlisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonAlisarActionPerformed(evt);
            }
        });
        barHerramientas.add(toggleButtonAlisar);

        sliderGrosor.setMaximum(10);
        sliderGrosor.setToolTipText("Grosor");
        sliderGrosor.setValue(0);
        sliderGrosor.setMaximumSize(new java.awt.Dimension(80, 20));
        sliderGrosor.setPreferredSize(new java.awt.Dimension(100, 20));
        sliderGrosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderGrosorStateChanged(evt);
            }
        });
        barHerramientas.add(sliderGrosor);

        panelCentral.add(barHerramientas, java.awt.BorderLayout.PAGE_START);

        lienzo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelCentral.add(lienzo, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

        panelBarraEstado.setLayout(new java.awt.BorderLayout());

        barraEstado.setEditable(false);
        barraEstado.setEnabled(false);
        barraEstado.setFocusable(false);
        panelBarraEstado.add(barraEstado, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelBarraEstado, java.awt.BorderLayout.PAGE_END);

        menuArchivo.setText("Archivo");

        menuItemNuevo.setText("Nuevo");
        menuItemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNuevoActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemNuevo);

        menuItemAbrir.setText("Abrir");
        menuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemAbrir);

        menuItemGuardar.setText("Guardar");
        menuItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGuardarActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemGuardar);

        barraMenu.add(menuArchivo);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toggleButtonLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonLineaActionPerformed
        this.lienzo.setHerramienta(Lienzo2D.Herramienta.LINEA);
        if (this.toggleButtonLinea.isSelected())
            this.barraEstado.setText("LINEA seleccionada");
    }//GEN-LAST:event_toggleButtonLineaActionPerformed

    private void toggleButtonCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonCuadradoActionPerformed
        this.lienzo.setHerramienta(Lienzo2D.Herramienta.RECTANGULO);
        if (this.toggleButtonCuadrado.isSelected())
            this.barraEstado.setText("CUADRADO seleccionado");
    }//GEN-LAST:event_toggleButtonCuadradoActionPerformed

    private void toggleButtonElipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonElipseActionPerformed
        this.lienzo.setHerramienta(Lienzo2D.Herramienta.ELIPSE);
        if (this.toggleButtonElipse.isSelected())
            this.barraEstado.setText("ELIPSE seleccionada");
    }//GEN-LAST:event_toggleButtonElipseActionPerformed

    private void menuItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNuevoActionPerformed
        this.lienzo.borrar();
        this.lienzo.repaint();
    }//GEN-LAST:event_menuItemNuevoActionPerformed

    private void menuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAbrirActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
        }
    }//GEN-LAST:event_menuItemAbrirActionPerformed

    private void menuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGuardarActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showSaveDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
        }
    }//GEN-LAST:event_menuItemGuardarActionPerformed

    private void buttonColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColorActionPerformed
        Color colorSeleccionado = JColorChooser.showDialog(this, "Seleccionar color", null);

        if (colorSeleccionado != null) {
            this.buttonColor.setBackground(colorSeleccionado);
            this.lienzo.setColor(colorSeleccionado);
            this.buttonColor.repaint();
        }
    }//GEN-LAST:event_buttonColorActionPerformed

    private void toggleButtonRellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonRellenarActionPerformed
        this.lienzo.setRellenoActivo(this.toggleButtonRellenar.isSelected());
        if (this.toggleButtonRellenar.isSelected())
            this.barraEstado.setText("Relleno activado");
        else
            this.barraEstado.setText("Relleno desactivado");
    }//GEN-LAST:event_toggleButtonRellenarActionPerformed

    private void toggleButtonTransparenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonTransparenciaActionPerformed
        this.lienzo.setTransparenciaActiva(this.toggleButtonTransparencia.isSelected());
        if (this.toggleButtonTransparencia.isSelected())
            this.barraEstado.setText("Transparencia activada");
        else
            this.barraEstado.setText("Transparencia desactivada");
    }//GEN-LAST:event_toggleButtonTransparenciaActionPerformed

    private void toggleButtonAlisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonAlisarActionPerformed
        this.lienzo.setAlisadoActivo(this.toggleButtonAlisar.isSelected());
        if (this.toggleButtonAlisar.isSelected())
            this.barraEstado.setText("Alisado activado");
        else
            this.barraEstado.setText("Alisado desactivado");
    }//GEN-LAST:event_toggleButtonAlisarActionPerformed

    private void sliderGrosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderGrosorStateChanged
        this.lienzo.setGrosor((int) this.sliderGrosor.getValue());
        this.barraEstado.setText("Modificando grosor");
    }//GEN-LAST:event_sliderGrosorStateChanged

    private void toggleButtonFantasmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonFantasmaActionPerformed
        this.lienzo.setHerramienta(Lienzo2D.Herramienta.FANTASMA);
        if (this.toggleButtonFantasma.isSelected())
            this.barraEstado.setText("FANTASMA seleccionado");
    }//GEN-LAST:event_toggleButtonFantasmaActionPerformed

    private void toggleButtonSeleccionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_toggleButtonSeleccionStateChanged
        this.lienzo.setMoverActivo(this.toggleButtonSeleccion.isSelected());
        if (this.toggleButtonSeleccion.isSelected())
            this.barraEstado.setText("SELECCION activado");
    }//GEN-LAST:event_toggleButtonSeleccionStateChanged

    private void barHerramientasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barHerramientasMouseExited
        this.barraEstado.setText("");
    }//GEN-LAST:event_barHerramientasMouseExited

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barHerramientas;
    private javax.swing.JTextField barraEstado;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton buttonColor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private sm.sgp.iu.Lienzo2D lienzo;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuItemAbrir;
    private javax.swing.JMenuItem menuItemGuardar;
    private javax.swing.JMenuItem menuItemNuevo;
    private javax.swing.JPanel panelBarraEstado;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JSlider sliderGrosor;
    private javax.swing.JToggleButton toggleButtonAlisar;
    private javax.swing.JToggleButton toggleButtonCuadrado;
    private javax.swing.JToggleButton toggleButtonElipse;
    private javax.swing.JToggleButton toggleButtonFantasma;
    private javax.swing.JToggleButton toggleButtonLinea;
    private javax.swing.JToggleButton toggleButtonRellenar;
    private javax.swing.JToggleButton toggleButtonSeleccion;
    private javax.swing.JToggleButton toggleButtonTransparencia;
    // End of variables declaration//GEN-END:variables
}

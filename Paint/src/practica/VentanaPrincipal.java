package practica;

import sm.sgp.iu.Lienzo2D;
import java.awt.Color;
import javax.swing.JFileChooser;
import java.io.File;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
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
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        lienzo = new sm.sgp.iu.Lienzo2D();
        barColores = new javax.swing.JPanel();
        panelColores = new javax.swing.JPanel();
        toggleButtonNegro = new javax.swing.JToggleButton();
        toggleButtonRojo = new javax.swing.JToggleButton();
        toggleButtonAzul = new javax.swing.JToggleButton();
        toggleButtonBlanco = new javax.swing.JToggleButton();
        toggleButtonAmarillo = new javax.swing.JToggleButton();
        toggleButtonVerde = new javax.swing.JToggleButton();
        panelCheckBox = new javax.swing.JPanel();
        spinnerGrosor = new javax.swing.JSpinner();
        checkBoxTransparencia = new javax.swing.JCheckBox();
        checkBoxAlisar = new javax.swing.JCheckBox();
        checkBoxMover = new javax.swing.JCheckBox();
        checkBoxRelleno = new javax.swing.JCheckBox();
        panelBarraEstado = new javax.swing.JPanel();
        barEstado = new javax.swing.JTextField();
        barMenu = new javax.swing.JMenuBar();
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                barHerramientasMouseEntered(evt);
            }
        });

        toggleButtonLinea.setBackground(new java.awt.Color(242, 242, 242));
        buttonGroup1.add(toggleButtonLinea);
        toggleButtonLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/linea.png"))); // NOI18N
        toggleButtonLinea.setSelected(true);
        toggleButtonLinea.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        toggleButtonLinea.setFocusPainted(false);
        toggleButtonLinea.setFocusable(false);
        toggleButtonLinea.setHideActionText(true);
        toggleButtonLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleButtonLinea.setInheritsPopupMenu(true);
        toggleButtonLinea.setPreferredSize(new java.awt.Dimension(32, 32));
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
        toggleButtonCuadrado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        toggleButtonCuadrado.setFocusPainted(false);
        toggleButtonCuadrado.setFocusable(false);
        toggleButtonCuadrado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleButtonCuadrado.setInheritsPopupMenu(true);
        toggleButtonCuadrado.setPreferredSize(new java.awt.Dimension(32, 32));
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
        toggleButtonElipse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        toggleButtonElipse.setFocusPainted(false);
        toggleButtonElipse.setFocusable(false);
        toggleButtonElipse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleButtonElipse.setInheritsPopupMenu(true);
        toggleButtonElipse.setPreferredSize(new java.awt.Dimension(32, 32));
        toggleButtonElipse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toggleButtonElipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonElipseActionPerformed(evt);
            }
        });
        barHerramientas.add(toggleButtonElipse);

        jToggleButton1.setBackground(new java.awt.Color(242, 242, 242));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fantasma.png"))); // NOI18N
        jToggleButton1.setFocusable(false);
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barHerramientas.add(jToggleButton1);

        jToggleButton2.setBackground(new java.awt.Color(242, 242, 242));
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/seleccion.png"))); // NOI18N
        jToggleButton2.setFocusable(false);
        jToggleButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barHerramientas.add(jToggleButton2);
        barHerramientas.add(jSeparator1);

        panelCentral.add(barHerramientas, java.awt.BorderLayout.PAGE_START);

        lienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lienzoMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelCentral.add(lienzo, java.awt.BorderLayout.CENTER);

        barColores.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barColores.setLayout(new java.awt.BorderLayout());

        panelColores.setPreferredSize(new java.awt.Dimension(112, 72));
        panelColores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelColoresMouseEntered(evt);
            }
        });
        panelColores.setLayout(new java.awt.GridLayout(2, 3, 1, 1));

        toggleButtonNegro.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(toggleButtonNegro);
        toggleButtonNegro.setSelected(true);
        toggleButtonNegro.setAlignmentX(0.5F);
        toggleButtonNegro.setBorder(null);
        toggleButtonNegro.setIconTextGap(0);
        toggleButtonNegro.setPreferredSize(new java.awt.Dimension(20, 20));
        toggleButtonNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonNegroActionPerformed(evt);
            }
        });
        panelColores.add(toggleButtonNegro);

        toggleButtonRojo.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup2.add(toggleButtonRojo);
        toggleButtonRojo.setAlignmentX(0.5F);
        toggleButtonRojo.setBorder(null);
        toggleButtonRojo.setMargin(new java.awt.Insets(1, 1, 1, 1));
        toggleButtonRojo.setPreferredSize(new java.awt.Dimension(25, 25));
        toggleButtonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonRojoActionPerformed(evt);
            }
        });
        panelColores.add(toggleButtonRojo);

        toggleButtonAzul.setBackground(new java.awt.Color(0, 0, 204));
        buttonGroup2.add(toggleButtonAzul);
        toggleButtonAzul.setAlignmentX(0.5F);
        toggleButtonAzul.setBorder(null);
        toggleButtonAzul.setMargin(new java.awt.Insets(1, 1, 1, 1));
        toggleButtonAzul.setPreferredSize(new java.awt.Dimension(25, 25));
        toggleButtonAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonAzulActionPerformed(evt);
            }
        });
        panelColores.add(toggleButtonAzul);

        buttonGroup2.add(toggleButtonBlanco);
        toggleButtonBlanco.setAlignmentX(0.5F);
        toggleButtonBlanco.setBorder(null);
        toggleButtonBlanco.setMargin(new java.awt.Insets(1, 1, 1, 1));
        toggleButtonBlanco.setPreferredSize(new java.awt.Dimension(25, 25));
        toggleButtonBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonBlancoActionPerformed(evt);
            }
        });
        panelColores.add(toggleButtonBlanco);

        toggleButtonAmarillo.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup2.add(toggleButtonAmarillo);
        toggleButtonAmarillo.setAlignmentX(0.5F);
        toggleButtonAmarillo.setBorder(null);
        toggleButtonAmarillo.setMargin(new java.awt.Insets(1, 1, 1, 1));
        toggleButtonAmarillo.setPreferredSize(new java.awt.Dimension(25, 25));
        toggleButtonAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonAmarilloActionPerformed(evt);
            }
        });
        panelColores.add(toggleButtonAmarillo);

        toggleButtonVerde.setBackground(new java.awt.Color(0, 255, 0));
        buttonGroup2.add(toggleButtonVerde);
        toggleButtonVerde.setAlignmentX(0.5F);
        toggleButtonVerde.setBorder(null);
        toggleButtonVerde.setMargin(new java.awt.Insets(1, 1, 1, 1));
        toggleButtonVerde.setPreferredSize(new java.awt.Dimension(25, 25));
        toggleButtonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonVerdeActionPerformed(evt);
            }
        });
        panelColores.add(toggleButtonVerde);

        barColores.add(panelColores, java.awt.BorderLayout.LINE_START);

        panelCheckBox.setLayout(new java.awt.GridBagLayout());

        spinnerGrosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerGrosorStateChanged(evt);
            }
        });
        panelCheckBox.add(spinnerGrosor, new java.awt.GridBagConstraints());

        checkBoxTransparencia.setText("Transparencia");
        checkBoxTransparencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxTransparenciaActionPerformed(evt);
            }
        });
        panelCheckBox.add(checkBoxTransparencia, new java.awt.GridBagConstraints());

        checkBoxAlisar.setText("Alisar");
        checkBoxAlisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAlisarActionPerformed(evt);
            }
        });
        panelCheckBox.add(checkBoxAlisar, new java.awt.GridBagConstraints());

        checkBoxMover.setText("Mover");
        checkBoxMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMoverActionPerformed(evt);
            }
        });
        panelCheckBox.add(checkBoxMover, new java.awt.GridBagConstraints());

        checkBoxRelleno.setText("Relleno");
        checkBoxRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxRellenoActionPerformed(evt);
            }
        });
        panelCheckBox.add(checkBoxRelleno, new java.awt.GridBagConstraints());

        barColores.add(panelCheckBox, java.awt.BorderLayout.LINE_END);

        panelCentral.add(barColores, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

        panelBarraEstado.setLayout(new java.awt.BorderLayout());

        barEstado.setEditable(false);
        barEstado.setEnabled(false);
        barEstado.setFocusable(false);
        panelBarraEstado.add(barEstado, java.awt.BorderLayout.CENTER);

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

        barMenu.add(menuArchivo);

        setJMenuBar(barMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toggleButtonLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonLineaActionPerformed
        this.lienzo.setHerramienta(Lienzo2D.Herramienta.LINEA);
    }//GEN-LAST:event_toggleButtonLineaActionPerformed

    private void toggleButtonCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonCuadradoActionPerformed
        this.lienzo.setHerramienta(Lienzo2D.Herramienta.RECTANGULO);
    }//GEN-LAST:event_toggleButtonCuadradoActionPerformed

    private void toggleButtonElipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonElipseActionPerformed
        this.lienzo.setHerramienta(Lienzo2D.Herramienta.ELIPSE);
    }//GEN-LAST:event_toggleButtonElipseActionPerformed

    private void toggleButtonNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonNegroActionPerformed
        this.lienzo.setColor(Color.black);
    }//GEN-LAST:event_toggleButtonNegroActionPerformed

    private void toggleButtonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonRojoActionPerformed
        this.lienzo.setColor(Color.red);
    }//GEN-LAST:event_toggleButtonRojoActionPerformed

    private void toggleButtonAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonAzulActionPerformed
        this.lienzo.setColor(Color.blue);
    }//GEN-LAST:event_toggleButtonAzulActionPerformed

    private void toggleButtonBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonBlancoActionPerformed
        this.lienzo.setColor(Color.white);
    }//GEN-LAST:event_toggleButtonBlancoActionPerformed

    private void toggleButtonAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonAmarilloActionPerformed
        this.lienzo.setColor(Color.yellow);
    }//GEN-LAST:event_toggleButtonAmarilloActionPerformed

    private void toggleButtonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonVerdeActionPerformed
        this.lienzo.setColor(Color.green);
    }//GEN-LAST:event_toggleButtonVerdeActionPerformed

    private void checkBoxRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxRellenoActionPerformed
        this.lienzo.setRellenoActivo(this.checkBoxRelleno.isSelected());
        if (this.checkBoxRelleno.isSelected())
            this.barEstado.setText("Relleno seleccionado");
        else
            this.barEstado.setText("Relleno desmarcado");
    }//GEN-LAST:event_checkBoxRellenoActionPerformed

    private void menuItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNuevoActionPerformed
        this.lienzo.borrar();
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

    private void lienzoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseEntered
        this.barEstado.setText("");
    }//GEN-LAST:event_lienzoMouseEntered

    private void barHerramientasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barHerramientasMouseEntered
        this.barEstado.setText("Seleccionando herramienta");
    }//GEN-LAST:event_barHerramientasMouseEntered

    private void panelColoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelColoresMouseEntered
        this.barEstado.setText("Seleccionando color");
    }//GEN-LAST:event_panelColoresMouseEntered

    private void checkBoxMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMoverActionPerformed
        this.lienzo.setMoverActivo(this.checkBoxMover.isSelected());
    }//GEN-LAST:event_checkBoxMoverActionPerformed

    private void checkBoxAlisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAlisarActionPerformed
        this.lienzo.setAlisadoActivo(this.checkBoxAlisar.isSelected());
    }//GEN-LAST:event_checkBoxAlisarActionPerformed

    private void checkBoxTransparenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxTransparenciaActionPerformed
        this.lienzo.setTransparenciaActiva(this.checkBoxTransparencia.isSelected());
    }//GEN-LAST:event_checkBoxTransparenciaActionPerformed

    private void spinnerGrosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerGrosorStateChanged
        this.lienzo.setGrosor((int) this.spinnerGrosor.getValue());
    }//GEN-LAST:event_spinnerGrosorStateChanged

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
    private javax.swing.JPanel barColores;
    private javax.swing.JTextField barEstado;
    private javax.swing.JToolBar barHerramientas;
    private javax.swing.JMenuBar barMenu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox checkBoxAlisar;
    private javax.swing.JCheckBox checkBoxMover;
    private javax.swing.JCheckBox checkBoxRelleno;
    private javax.swing.JCheckBox checkBoxTransparencia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private sm.sgp.iu.Lienzo2D lienzo;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuItemAbrir;
    private javax.swing.JMenuItem menuItemGuardar;
    private javax.swing.JMenuItem menuItemNuevo;
    private javax.swing.JPanel panelBarraEstado;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelCheckBox;
    private javax.swing.JPanel panelColores;
    private javax.swing.JSpinner spinnerGrosor;
    private javax.swing.JToggleButton toggleButtonAmarillo;
    private javax.swing.JToggleButton toggleButtonAzul;
    private javax.swing.JToggleButton toggleButtonBlanco;
    private javax.swing.JToggleButton toggleButtonCuadrado;
    private javax.swing.JToggleButton toggleButtonElipse;
    private javax.swing.JToggleButton toggleButtonLinea;
    private javax.swing.JToggleButton toggleButtonNegro;
    private javax.swing.JToggleButton toggleButtonRojo;
    private javax.swing.JToggleButton toggleButtonVerde;
    // End of variables declaration//GEN-END:variables
}

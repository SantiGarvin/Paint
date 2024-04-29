package practica;

import sm.sgp.iu.Lienzo2D;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.RescaleOp;
import java.awt.image.WritableRaster;
import javax.swing.JFileChooser;
import javax.swing.JColorChooser;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.filechooser.FileNameExtensionFilter;
import sm.image.KernelProducer;
import sm.sgp.graficos.AbstractShape;
import sm.sgp.iu.Lienzo2D.LienzoEvent;
import sm.sgp.iu.Lienzo2D.LienzoListener;

public class VentanaPrincipal extends javax.swing.JFrame {

    private BufferedImage imgFuente;
    MiManejadorLienzo manejador = new MiManejadorLienzo();

    public VentanaPrincipal() {
        initComponents();
        this.setTitle("Paint2D");
        this.setSize(new Dimension(1000, 900));
    }

    private Lienzo2D getSelectedLienzo() {
        VentanaInterna vi;
        vi = (VentanaInterna) escritorio.getSelectedFrame();
        return vi != null ? vi.getLienzo2D() : null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        panelCentral = new javax.swing.JPanel();
        barraHerramientas = new javax.swing.JToolBar();
        buttonNuevo = new javax.swing.JButton();
        buttonAbrir = new javax.swing.JButton();
        buttonGuardar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        toggleButtonLinea = new javax.swing.JToggleButton();
        toggleButtonRectangulo = new javax.swing.JToggleButton();
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
        jSeparator3 = new javax.swing.JToolBar.Separator();
        buttonVolcado = new javax.swing.JButton();
        escritorio = new javax.swing.JDesktopPane();
        barraImagenes = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        sliderBrillo = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        sliderContraste = new javax.swing.JSlider();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        seleccionMascara = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        sliderCometa = new javax.swing.JSlider();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        panelBarraEstado = new javax.swing.JPanel();
        barraEstado = new javax.swing.JTextField();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuItemNuevo = new javax.swing.JMenuItem();
        menuItemAbrir = new javax.swing.JMenuItem();
        menuItemGuardar = new javax.swing.JMenuItem();
        menuImagen = new javax.swing.JMenu();
        menuRescaleOp = new javax.swing.JMenuItem();
        menuConvolveOp = new javax.swing.JMenuItem();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 900));
        setSize(new java.awt.Dimension(960, 540));

        panelCentral.setLayout(new java.awt.BorderLayout());

        barraHerramientas.setRollover(true);
        barraHerramientas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                barraHerramientasMouseExited(evt);
            }
        });

        buttonNuevo.setBackground(new java.awt.Color(242, 242, 242));
        buttonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo.png"))); // NOI18N
        buttonNuevo.setToolTipText("Nuevo");
        buttonNuevo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonNuevo.setFocusable(false);
        buttonNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonNuevo.setMaximumSize(new java.awt.Dimension(35, 35));
        buttonNuevo.setMinimumSize(new java.awt.Dimension(35, 35));
        buttonNuevo.setPreferredSize(new java.awt.Dimension(35, 35));
        buttonNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNuevoActionPerformed(evt);
            }
        });
        barraHerramientas.add(buttonNuevo);

        buttonAbrir.setBackground(new java.awt.Color(242, 242, 242));
        buttonAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/abrir.png"))); // NOI18N
        buttonAbrir.setToolTipText("Abrir archivo");
        buttonAbrir.setFocusable(false);
        buttonAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAbrir.setMaximumSize(new java.awt.Dimension(35, 35));
        buttonAbrir.setMinimumSize(new java.awt.Dimension(35, 35));
        buttonAbrir.setPreferredSize(new java.awt.Dimension(35, 35));
        buttonAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAbrirActionPerformed(evt);
            }
        });
        barraHerramientas.add(buttonAbrir);

        buttonGuardar.setBackground(new java.awt.Color(242, 242, 242));
        buttonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        buttonGuardar.setToolTipText("Guardar");
        buttonGuardar.setFocusable(false);
        buttonGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonGuardar.setMaximumSize(new java.awt.Dimension(35, 35));
        buttonGuardar.setMinimumSize(new java.awt.Dimension(35, 35));
        buttonGuardar.setPreferredSize(new java.awt.Dimension(35, 35));
        buttonGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });
        barraHerramientas.add(buttonGuardar);
        barraHerramientas.add(jSeparator2);

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
        barraHerramientas.add(toggleButtonLinea);

        toggleButtonRectangulo.setBackground(new java.awt.Color(242, 242, 242));
        buttonGroup1.add(toggleButtonRectangulo);
        toggleButtonRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rectangulo.png"))); // NOI18N
        toggleButtonRectangulo.setToolTipText("Cuadrado");
        toggleButtonRectangulo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        toggleButtonRectangulo.setFocusable(false);
        toggleButtonRectangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleButtonRectangulo.setInheritsPopupMenu(true);
        toggleButtonRectangulo.setMaximumSize(new java.awt.Dimension(35, 35));
        toggleButtonRectangulo.setMinimumSize(new java.awt.Dimension(35, 35));
        toggleButtonRectangulo.setPreferredSize(new java.awt.Dimension(35, 35));
        toggleButtonRectangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toggleButtonRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonRectanguloActionPerformed(evt);
            }
        });
        barraHerramientas.add(toggleButtonRectangulo);

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
        barraHerramientas.add(toggleButtonElipse);

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
        barraHerramientas.add(toggleButtonFantasma);

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
        barraHerramientas.add(toggleButtonSeleccion);
        barraHerramientas.add(jSeparator1);

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

        barraHerramientas.add(jPanel2);

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
        barraHerramientas.add(toggleButtonRellenar);

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
        barraHerramientas.add(toggleButtonTransparencia);

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
        barraHerramientas.add(toggleButtonAlisar);

        sliderGrosor.setMaximum(10);
        sliderGrosor.setToolTipText("Grosor");
        sliderGrosor.setValue(0);
        sliderGrosor.setPreferredSize(new java.awt.Dimension(50, 20));
        sliderGrosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderGrosorStateChanged(evt);
            }
        });
        barraHerramientas.add(sliderGrosor);
        barraHerramientas.add(jSeparator3);

        buttonVolcado.setBackground(new java.awt.Color(242, 242, 242));
        buttonVolcado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/volcado.png"))); // NOI18N
        buttonVolcado.setToolTipText("Volcado");
        buttonVolcado.setFocusable(false);
        buttonVolcado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonVolcado.setMaximumSize(new java.awt.Dimension(35, 35));
        buttonVolcado.setMinimumSize(new java.awt.Dimension(35, 35));
        buttonVolcado.setPreferredSize(new java.awt.Dimension(35, 35));
        buttonVolcado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonVolcado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVolcadoActionPerformed(evt);
            }
        });
        barraHerramientas.add(buttonVolcado);

        panelCentral.add(barraHerramientas, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        panelCentral.add(escritorio, java.awt.BorderLayout.CENTER);

        barraImagenes.setRollover(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/brillo.png"))); // NOI18N
        barraImagenes.add(jLabel1);

        sliderBrillo.setMaximum(255);
        sliderBrillo.setMinimum(-255);
        sliderBrillo.setValue(0);
        sliderBrillo.setPreferredSize(new java.awt.Dimension(50, 20));
        sliderBrillo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBrilloStateChanged(evt);
            }
        });
        sliderBrillo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sliderBrilloFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sliderBrilloFocusLost(evt);
            }
        });
        barraImagenes.add(sliderBrillo);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/contraste.png"))); // NOI18N
        barraImagenes.add(jLabel2);

        sliderContraste.setMaximum(10);
        sliderContraste.setMinimum(-10);
        sliderContraste.setValue(0);
        sliderContraste.setPreferredSize(new java.awt.Dimension(50, 20));
        sliderContraste.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderContrasteStateChanged(evt);
            }
        });
        sliderContraste.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sliderContrasteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sliderContrasteFocusLost(evt);
            }
        });
        barraImagenes.add(sliderContraste);
        barraImagenes.add(jSeparator4);

        seleccionMascara.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Media", "Binomial", "Enfoque", "Relieve", "Laplaciano", "EI3X3", "EI5X5" }));
        seleccionMascara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionMascaraActionPerformed(evt);
            }
        });
        barraImagenes.add(seleccionMascara);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cometa.png"))); // NOI18N
        barraImagenes.add(jLabel3);

        sliderCometa.setMaximum(10);
        sliderCometa.setValue(0);
        sliderCometa.setPreferredSize(new java.awt.Dimension(50, 20));
        sliderCometa.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderCometaStateChanged(evt);
            }
        });
        barraImagenes.add(sliderCometa);
        barraImagenes.add(jSeparator5);

        panelCentral.add(barraImagenes, java.awt.BorderLayout.PAGE_END);

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

        menuImagen.setText("Imagen");

        menuRescaleOp.setText("RescaleOp");
        menuRescaleOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRescaleOpActionPerformed(evt);
            }
        });
        menuImagen.add(menuRescaleOp);

        menuConvolveOp.setText("ConvolveOp");
        menuConvolveOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConvolveOpActionPerformed(evt);
            }
        });
        menuImagen.add(menuConvolveOp);

        barraMenu.add(menuImagen);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toggleButtonLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonLineaActionPerformed
        Lienzo2D lienzo = getSelectedLienzo();
        if (lienzo != null) {
            lienzo.setHerramienta(Lienzo2D.Herramienta.LINEA);
            if (this.toggleButtonLinea.isSelected()) {
                this.barraEstado.setText("LINEA seleccionada");
            }
        }
    }//GEN-LAST:event_toggleButtonLineaActionPerformed

    private void toggleButtonRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonRectanguloActionPerformed
        Lienzo2D lienzo = getSelectedLienzo();
        if (lienzo != null) {
            lienzo.setHerramienta(Lienzo2D.Herramienta.RECTANGULO);
            if (this.toggleButtonRectangulo.isSelected()) {
                this.barraEstado.setText("CUADRADO seleccionado");
            }
        }
    }//GEN-LAST:event_toggleButtonRectanguloActionPerformed

    private void toggleButtonElipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonElipseActionPerformed
        Lienzo2D lienzo = getSelectedLienzo();
        if (lienzo != null) {
            lienzo.setHerramienta(Lienzo2D.Herramienta.ELIPSE);
            if (this.toggleButtonElipse.isSelected()) {
                this.barraEstado.setText("ELIPSE seleccionada");
            }
        }
    }//GEN-LAST:event_toggleButtonElipseActionPerformed

    private void updateDefault(Lienzo2D lienzo) {
        // Establecer los valores por defecto para los atributos y herramientas
        lienzo.setHerramienta(Lienzo2D.Herramienta.LINEA);
        lienzo.setRellenoActivo(false);
        lienzo.setAlisadoActivo(false);
        lienzo.setTransparenciaActiva(false);
        lienzo.setGrosor(1);
        lienzo.setColor(Color.BLACK);
        lienzo.setMoverActivo(false);

        // Actualizar el estado de los botones y atributos en la barra de herramientas
        toggleButtonLinea.setSelected(true);
        toggleButtonRectangulo.setSelected(false);
        toggleButtonElipse.setSelected(false);
        toggleButtonFantasma.setSelected(false);
        toggleButtonRellenar.setSelected(false);
        toggleButtonAlisar.setSelected(false);
        toggleButtonTransparencia.setSelected(false);
        sliderGrosor.setValue(0);
        buttonColor.setBackground(Color.BLACK);
        toggleButtonSeleccion.setSelected(false);
    }

    private void menuItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNuevoActionPerformed
        VentanaInterna vi = new VentanaInterna();

        escritorio.add(vi);
        vi.setVisible(true);

        vi.addInternalFrameListener(new ManejadorVentanaInterna());

        int width = Lienzo2D.getAREA_SIZE();
        int height = Lienzo2D.getAREA_SIZE();

        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = img.createGraphics();

        // Establecer el color de fondo a blanco
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);

        g2d.dispose();

        vi.getLienzo2D().setImage(img);
        vi.getLienzo2D().setPreferredSize(new Dimension(width, height));

        Lienzo2D lienzo = vi.getLienzo2D();
        updateDefault(lienzo);

        lienzo.addLienzoListener(manejador);
    }//GEN-LAST:event_menuItemNuevoActionPerformed

    private void menuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAbrirActionPerformed
       JFileChooser dlg = new JFileChooser("/home/santi/Escritorio/SMM/img_prueba");

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imágenes (*.png, *.jpg, *.jpeg, *.gif, *.bmp)", "png", "jpg", "jpeg", "gif", "bmp");
        dlg.addChoosableFileFilter(filter);

        dlg.setAcceptAllFileFilterUsed(true);

        int resp = dlg.showOpenDialog(this);

        if (resp == JFileChooser.APPROVE_OPTION) {
            try {
                File f = dlg.getSelectedFile();
                BufferedImage img = ImageIO.read(f);
                VentanaInterna vi = new VentanaInterna();
                vi.getLienzo2D().setImage(img);
                this.escritorio.add(vi);
                String extension = getFileExtension(f.getName());
                vi.setTitle(f.getName() + " (" + extension.toUpperCase() + ")");

                vi.addInternalFrameListener(new ManejadorVentanaInterna());

                vi.setVisible(true);
            } catch (IOException ex) {
                System.err.println("Error al leer la imagen: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_menuItemAbrirActionPerformed

    private String getFileExtension(String fileName) {
        String extension = "";
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
            extension = fileName.substring(dotIndex + 1).toLowerCase();
        }
        return extension;
    }

    private void menuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGuardarActionPerformed
        VentanaInterna vi = (VentanaInterna) escritorio.getSelectedFrame();
        if (vi != null) {
            BufferedImage imgModificada = vi.getLienzo2D().getPaintedImage();
            if (imgModificada != null) {
                JFileChooser dlg = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Imágenes (*.png, *.jpg, *.jpeg, *.gif, *.bmp)", "png", "jpg", "jpeg", "gif", "bmp");
                dlg.setFileFilter(filter);
                int resp = dlg.showSaveDialog(this);
                if (resp == JFileChooser.APPROVE_OPTION) {
                    File f = dlg.getSelectedFile();
                    String fileName = f.getAbsolutePath();
                    String extension = getFileExtension(fileName);
                    String selectedFormat = extension;
                    if (extension.isEmpty()) {
                        String[] formatNames = {"png", "jpg", "jpeg", "gif", "bmp"};
                        selectedFormat = (String) JOptionPane.showInputDialog(this, "Seleccione el formato de imagen:", "Formato de imagen", JOptionPane.PLAIN_MESSAGE, null, formatNames, formatNames[0]);
                        if (selectedFormat != null) {
                            fileName += "." + selectedFormat;
                        }
                    }
                    if (selectedFormat != null) {
                        try {
                            File file = new File(fileName);
                            BufferedImage convertedImage = new BufferedImage(imgModificada.getWidth(), imgModificada.getHeight(), BufferedImage.TYPE_INT_RGB);
                            Graphics2D g2d = convertedImage.createGraphics();
                            g2d.drawImage(imgModificada, 0, 0, null);
                            g2d.dispose();
                            ImageIO.write(convertedImage, selectedFormat, file);
                            vi.setTitle(file.getName());
                        } catch (IOException ex) {
                            System.err.println("Error al guardar la imagen: " + ex.getMessage());
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_menuItemGuardarActionPerformed

    private void buttonColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColorActionPerformed
        Color colorSeleccionado = JColorChooser.showDialog(this, "Seleccionar color", null);

        if (colorSeleccionado != null) {
            this.buttonColor.setBackground(colorSeleccionado);
            Lienzo2D lienzo = this.getSelectedLienzo();
            if (lienzo != null) {
                lienzo.setColor(colorSeleccionado);
                lienzo.updateFiguraSeleccionada();
            }
            this.buttonColor.repaint();
        }
    }//GEN-LAST:event_buttonColorActionPerformed

    private void toggleButtonRellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonRellenarActionPerformed
        Lienzo2D lienzo = getSelectedLienzo();
        if (lienzo != null) {
            lienzo.setRellenoActivo(this.toggleButtonRellenar.isSelected());
            lienzo.updateFiguraSeleccionada();
            if (this.toggleButtonRellenar.isSelected()) {
                this.barraEstado.setText("Relleno activado");
            } else {
                this.barraEstado.setText("Relleno desactivado");
            }
        }
    }//GEN-LAST:event_toggleButtonRellenarActionPerformed

    private void toggleButtonTransparenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonTransparenciaActionPerformed
        Lienzo2D lienzo = getSelectedLienzo();
        if (lienzo != null) {
            lienzo.setTransparenciaActiva(this.toggleButtonTransparencia.isSelected());
            lienzo.updateFiguraSeleccionada();
            if (this.toggleButtonTransparencia.isSelected()) {
                this.barraEstado.setText("Transparencia activada");
            } else {
                this.barraEstado.setText("Transparencia desactivada");
            }
        }
    }//GEN-LAST:event_toggleButtonTransparenciaActionPerformed

    private void toggleButtonAlisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonAlisarActionPerformed
        Lienzo2D lienzo = getSelectedLienzo();
        if (lienzo != null) {
            lienzo.setAlisadoActivo(this.toggleButtonAlisar.isSelected());
            lienzo.updateFiguraSeleccionada();
            if (this.toggleButtonAlisar.isSelected()) {
                this.barraEstado.setText("Alisado activado");
            } else {
                this.barraEstado.setText("Alisado desactivado");
            }
        }
    }//GEN-LAST:event_toggleButtonAlisarActionPerformed

    private void sliderGrosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderGrosorStateChanged
        Lienzo2D lienzo = getSelectedLienzo();
        if (lienzo != null) {
            lienzo.setGrosor((int) this.sliderGrosor.getValue());
            lienzo.updateFiguraSeleccionada();
            this.barraEstado.setText("Modificando grosor");
        }
    }//GEN-LAST:event_sliderGrosorStateChanged

    private void toggleButtonFantasmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonFantasmaActionPerformed
        Lienzo2D lienzo = getSelectedLienzo();
        if (lienzo != null) {
            lienzo.setHerramienta(Lienzo2D.Herramienta.FANTASMA);
            if (this.toggleButtonFantasma.isSelected()) {
                this.barraEstado.setText("FANTASMA seleccionado");
            }
        }
    }//GEN-LAST:event_toggleButtonFantasmaActionPerformed

    private void toggleButtonSeleccionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_toggleButtonSeleccionStateChanged
        Lienzo2D lienzo = getSelectedLienzo();
        if (lienzo != null) {
            lienzo.setMoverActivo(this.toggleButtonSeleccion.isSelected());
            if (this.toggleButtonSeleccion.isSelected()) {
                this.barraEstado.setText("Edición");
            }
            this.repaint();
        }
    }//GEN-LAST:event_toggleButtonSeleccionStateChanged

    private void barraHerramientasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraHerramientasMouseExited
        this.barraEstado.setText("");
    }//GEN-LAST:event_barraHerramientasMouseExited

    private void buttonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuevoActionPerformed
        menuItemNuevoActionPerformed(evt);
    }//GEN-LAST:event_buttonNuevoActionPerformed

    private void buttonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAbrirActionPerformed
        menuItemAbrirActionPerformed(evt);
    }//GEN-LAST:event_buttonAbrirActionPerformed

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        menuItemGuardarActionPerformed(evt);
    }//GEN-LAST:event_buttonGuardarActionPerformed

    private void buttonVolcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVolcadoActionPerformed
        Lienzo2D lienzo = getSelectedLienzo();
        if (lienzo != null) {
            lienzo.volcarFiguraSeleccionada();
        }
    }//GEN-LAST:event_buttonVolcadoActionPerformed

    private void menuRescaleOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRescaleOpActionPerformed
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    RescaleOp rop = new RescaleOp(1.0f, 100.0f, null);
                    rop.filter(img, img);
                    vi.getLienzo2D().repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_menuRescaleOpActionPerformed

    private void menuConvolveOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConvolveOpActionPerformed
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    float filtro[] = {0.1f, 0.1f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.1f, 0.1f};
                    Kernel k = new Kernel(3, 3, filtro);
                    ConvolveOp cop = new ConvolveOp(k);

                    BufferedImage imgDest = cop.filter(img, null);
                    vi.getLienzo2D().setImage(imgDest);

                    vi.getLienzo2D().repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_menuConvolveOpActionPerformed

    private void sliderBrilloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderBrilloFocusGained
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            ColorModel cm = vi.getLienzo2D().getImage().getColorModel();
            WritableRaster raster = vi.getLienzo2D().getImage().copyData(null);
            boolean alfaPre = vi.getLienzo2D().getImage().isAlphaPremultiplied();
            imgFuente = new BufferedImage(cm, raster, alfaPre, null);
        }
    }//GEN-LAST:event_sliderBrilloFocusGained

    private void sliderBrilloStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBrilloStateChanged
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null && imgFuente != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    int brillo = sliderBrillo.getValue();
                    RescaleOp rop = new RescaleOp(1.0f, brillo, null);
                    rop.filter(imgFuente, vi.getLienzo2D().getImage());
                    vi.getLienzo2D().repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_sliderBrilloStateChanged

    private void sliderBrilloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderBrilloFocusLost
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null && imgFuente != null) {
            vi.getLienzo2D().setImage(imgFuente);
            vi.getLienzo2D().repaint();
        }

        imgFuente = null;
        sliderBrillo.setValue(0);
    }//GEN-LAST:event_sliderBrilloFocusLost

    private void seleccionMascaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionMascaraActionPerformed
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();

            Kernel k = this.getKernel(this.seleccionMascara.getSelectedIndex());

            if (img != null && k != null) {
                try {
                    ConvolveOp cop = new ConvolveOp(k);

                    BufferedImage imgDest = cop.filter(img, null);
                    vi.getLienzo2D().setImage(imgDest);

                    vi.getLienzo2D().repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_seleccionMascaraActionPerformed

    private void sliderContrasteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderContrasteFocusGained
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            ColorModel cm = vi.getLienzo2D().getImage().getColorModel();
            WritableRaster raster = vi.getLienzo2D().getImage().copyData(null);
            boolean alfaPre = vi.getLienzo2D().getImage().isAlphaPremultiplied();
            imgFuente = new BufferedImage(cm, raster, alfaPre, null);
        }
    }//GEN-LAST:event_sliderContrasteFocusGained

    private void sliderContrasteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderContrasteFocusLost
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null && imgFuente != null) {
            vi.getLienzo2D().setImage(imgFuente);
            vi.getLienzo2D().repaint();
        }

        imgFuente = null;
        sliderContraste.setValue(0);
    }//GEN-LAST:event_sliderContrasteFocusLost

    private void sliderContrasteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderContrasteStateChanged
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null && imgFuente != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    float contraste = sliderContraste.getValue() / 10.0F + 1.0F;
                    RescaleOp rop = new RescaleOp(contraste, 0.0F, null);
                    rop.filter(imgFuente, img);
                    vi.getLienzo2D().repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_sliderContrasteStateChanged

    private void sliderCometaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderCometaStateChanged
//        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
//        if (vi != null) {
//            BufferedImage img = vi.getLienzo2D().getImage();
//            if (img != null) {
//                int tamanoMascara = sliderCometa.getValue();
//                vi.getLienzo2D().filtroCometa(tamanoMascara);
//            }
//        }
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                int tamanoMascara = sliderCometa.getValue();
                BufferedImage imgCopia = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2d = imgCopia.createGraphics();
                g2d.drawImage(img, 0, 0, null);
                g2d.dispose();

                vi.getLienzo2D().setImage(imgCopia);
                vi.getLienzo2D().filtroCometa(tamanoMascara);
            }
        }
    }//GEN-LAST:event_sliderCometaStateChanged

    private Kernel getKernel(int seleccion) {
        Kernel k = null;

        switch (seleccion) {
            case 0:
                k = KernelProducer.createKernel(KernelProducer.TYPE_MEDIA_3x3);
                break;
            case 1:
                k = KernelProducer.createKernel(KernelProducer.TYPE_BINOMIAL_3x3);
                break;
            case 2:
                k = KernelProducer.createKernel(KernelProducer.TYPE_ENFOQUE_3x3);
                break;
            case 3:
                k = KernelProducer.createKernel(KernelProducer.TYPE_RELIEVE_3x3);
                break;
            case 4:
                k = KernelProducer.createKernel(KernelProducer.TYPE_LAPLACIANA_3x3);
                break;
            case 5:
                k = createKernelEI3x3();
                break;
            case 6:
                k = createKernelEI5x5();
                break;
            default:
                throw new AssertionError();
        }
        return k;
    }

    /**
     * Crea un kernel para aplicar un emborronamiento iluminado con una máscara
     * 3x3. La máscara de 2/9 en una matriz 3x3 emborrona la imagen a la vez que
     * le incrementa la luminosidad porque la suma de los valores de la máscara
     * es mayor a 1. Esto hace que cada píxel resultante sea una combinación
     * ponderada de los píxeles vecinos, pero con un factor de escala mayor a 1,
     * lo que resulta en un aumento de la luminosidad general de la imagen.
     *
     * @return el kernel para aplicar el emborronamiento iluminado 3x3
     */
    private Kernel createKernelEI3x3() {
        float[] data = {
            2f / 9f, 2f / 9f, 2f / 9f,
            2f / 9f, 2f / 9f, 2f / 9f,
            2f / 9f, 2f / 9f, 2f / 9f
        };
        return new Kernel(3, 3, data);
    }

    /**
     * Crea un kernel para aplicar un emborronamiento iluminado con una máscara
     * 5x5. Los valores de la máscara 5x5 se han ajustado para que la suma sea
     * mayor a 1, lo que resulta en un emborronamiento iluminado similar al de
     * la máscara 3x3.
     *
     * @return el kernel para aplicar el emborronamiento iluminado 5x5
     */
    private Kernel createKernelEI5x5() {
        float[] data = {
            1f / 25f, 1f / 25f, 1f / 25f, 1f / 25f, 1f / 25f,
            1f / 25f, 2f / 25f, 2f / 25f, 2f / 25f, 1f / 25f,
            1f / 25f, 2f / 25f, 3f / 25f, 2f / 25f, 1f / 25f,
            1f / 25f, 2f / 25f, 2f / 25f, 2f / 25f, 1f / 25f,
            1f / 25f, 1f / 25f, 1f / 25f, 1f / 25f, 1f / 25f
        };
        return new Kernel(5, 5, data);
    }

    private class ManejadorVentanaInterna extends InternalFrameAdapter {

        @Override
        public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            VentanaInterna vi = (VentanaInterna) evt.getInternalFrame();
            Lienzo2D lienzo = vi.getLienzo2D();

            // Actualizar el estado de los botones de herramientas
            toggleButtonLinea.setSelected(lienzo.getHerramienta() == Lienzo2D.Herramienta.LINEA);
            toggleButtonRectangulo.setSelected(lienzo.getHerramienta() == Lienzo2D.Herramienta.RECTANGULO);
            toggleButtonElipse.setSelected(lienzo.getHerramienta() == Lienzo2D.Herramienta.ELIPSE);
            toggleButtonFantasma.setSelected(lienzo.getHerramienta() == Lienzo2D.Herramienta.FANTASMA);

            // Actualizar el estado de otros atributos
            toggleButtonRellenar.setSelected(lienzo.isRellenoActivo());
            toggleButtonAlisar.setSelected(lienzo.isAlisadoActivo());
            toggleButtonTransparencia.setSelected(lienzo.isTransparenciaActiva());
            sliderGrosor.setValue(lienzo.getGrosor());
            buttonColor.setBackground(lienzo.getColor());

            // Actualizar el estado del botón de selección
            toggleButtonSeleccion.setSelected(lienzo.isMoverActivo());
        }
    }

    public class MiManejadorLienzo implements LienzoListener {

        @Override
        public void shapeAdded(LienzoEvent evt) {
            AbstractShape abstractShape = evt.getForma();
            String tipoFigura = abstractShape.getTipoFigura();
            barraEstado.setText("Figura añadida: " + tipoFigura);
        }

        @Override
        public void shapeSelected(LienzoEvent evt) {
            AbstractShape abstractShape = evt.getForma();
            String tipoFigura = abstractShape.getTipoFigura();
            barraEstado.setText("Figura seleccionada: " + tipoFigura);
        }
    }

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
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barraEstado;
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JToolBar barraImagenes;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton buttonAbrir;
    private javax.swing.JButton buttonColor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonNuevo;
    private javax.swing.JButton buttonVolcado;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuConvolveOp;
    private javax.swing.JMenu menuImagen;
    private javax.swing.JMenuItem menuItemAbrir;
    private javax.swing.JMenuItem menuItemGuardar;
    private javax.swing.JMenuItem menuItemNuevo;
    private javax.swing.JMenuItem menuRescaleOp;
    private javax.swing.JPanel panelBarraEstado;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JComboBox<String> seleccionMascara;
    private javax.swing.JSlider sliderBrillo;
    private javax.swing.JSlider sliderCometa;
    private javax.swing.JSlider sliderContraste;
    private javax.swing.JSlider sliderGrosor;
    private javax.swing.JToggleButton toggleButtonAlisar;
    private javax.swing.JToggleButton toggleButtonElipse;
    private javax.swing.JToggleButton toggleButtonFantasma;
    private javax.swing.JToggleButton toggleButtonLinea;
    private javax.swing.JToggleButton toggleButtonRectangulo;
    private javax.swing.JToggleButton toggleButtonRellenar;
    private javax.swing.JToggleButton toggleButtonSeleccion;
    private javax.swing.JToggleButton toggleButtonTransparencia;
    // End of variables declaration//GEN-END:variables
}

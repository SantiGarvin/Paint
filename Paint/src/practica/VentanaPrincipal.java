package practica;

import sm.sgp.iu.Lienzo2D;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BandCombineOp;
import java.awt.image.BufferedImage;
import java.awt.image.ByteLookupTable;
import java.awt.image.ColorConvertOp;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.ConvolveOp;
import java.awt.image.DataBuffer;
import java.awt.image.Kernel;
import java.awt.image.LookupOp;
import java.awt.image.LookupTable;
import java.awt.image.RescaleOp;
import java.awt.image.WritableRaster;
import javax.swing.JFileChooser;
import javax.swing.JColorChooser;
import java.io.File;
import java.io.IOException;
import static java.lang.Math.pow;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.filechooser.FileNameExtensionFilter;
import sm.image.EqualizationOp;
import sm.image.KernelProducer;
import sm.sgp.graficos.AbstractShape;
import sm.sgp.iu.Lienzo2D.LienzoEvent;
import sm.sgp.iu.Lienzo2D.LienzoListener;
import sm.image.LookupTableProducer;
import sm.image.SepiaOp;
import sm.image.TintOp;
import sm.sgp.imagen.PosterizarOp;
import sm.sgp.imagen.RojoOp;

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
        buttonDuplicar = new javax.swing.JButton();
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
        buttonContraste = new javax.swing.JButton();
        buttonOscurecer = new javax.swing.JButton();
        buttonIluminar = new javax.swing.JButton();
        buttonOscurecerZonasClaras = new javax.swing.JButton();
        labelTransformLineal = new javax.swing.JLabel();
        sliderRotacion = new javax.swing.JSlider();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        rotar180Button = new javax.swing.JButton();
        ampliarButton = new javax.swing.JButton();
        reducirButton = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        labelTransformacionLineal = new javax.swing.JLabel();
        sliderTransformLineal = new javax.swing.JSlider();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        buttonShowBandas = new javax.swing.JButton();
        seleccionEspacioColor = new javax.swing.JComboBox<>();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        buttonCombinacionBandas = new javax.swing.JButton();
        buttonTintar = new javax.swing.JButton();
        buttonSepia = new javax.swing.JButton();
        buttonEcualizar = new javax.swing.JButton();
        buttonRojo = new javax.swing.JButton();
        labelPosterizar = new javax.swing.JLabel();
        sliderPosterizar = new javax.swing.JSlider();
        jPanel3 = new javax.swing.JPanel();
        buttonColorSrc = new javax.swing.JButton();
        sliderTonoColor = new javax.swing.JSlider();
        jPanel4 = new javax.swing.JPanel();
        buttonColorDst = new javax.swing.JButton();
        panelBarraEstado = new javax.swing.JPanel();
        barraEstado = new javax.swing.JTextField();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuNuevo = new javax.swing.JMenuItem();
        menuAbrir = new javax.swing.JMenuItem();
        menuGuardar = new javax.swing.JMenuItem();
        menuImagen = new javax.swing.JMenu();
        menuRescaleOp = new javax.swing.JMenuItem();
        menuConvolveOp = new javax.swing.JMenuItem();
        menuAffineTransform = new javax.swing.JMenuItem();
        menuLookupOp = new javax.swing.JMenuItem();
        menuBandCombineOp = new javax.swing.JMenuItem();
        menuColorConvertOp = new javax.swing.JMenuItem();

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

        buttonDuplicar.setBackground(new java.awt.Color(242, 242, 242));
        buttonDuplicar.setText(".2X");
        buttonDuplicar.setFocusable(false);
        buttonDuplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonDuplicar.setMinimumSize(new java.awt.Dimension(35, 35));
        buttonDuplicar.setPreferredSize(new java.awt.Dimension(35, 35));
        buttonDuplicar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonDuplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDuplicarActionPerformed(evt);
            }
        });
        barraHerramientas.add(buttonDuplicar);
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
        buttonColor.setFocusable(false);
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
            .addGap(0, 1219, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        panelCentral.add(escritorio, java.awt.BorderLayout.CENTER);

        barraImagenes.setRollover(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/brillo.png"))); // NOI18N
        barraImagenes.add(jLabel1);

        sliderBrillo.setMaximum(255);
        sliderBrillo.setMinimum(-255);
        sliderBrillo.setToolTipText("Brillo");
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
        sliderContraste.setToolTipText("Contraste");
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

        seleccionMascara.setBackground(new java.awt.Color(242, 242, 242));
        seleccionMascara.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Media", "Binomial", "Enfoque", "Relieve", "Laplaciano", "EI3X3", "EI5X5" }));
        seleccionMascara.setToolTipText("Máscara");
        seleccionMascara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionMascaraActionPerformed(evt);
            }
        });
        barraImagenes.add(seleccionMascara);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cometa.png"))); // NOI18N
        barraImagenes.add(jLabel3);

        sliderCometa.setMaximum(150);
        sliderCometa.setToolTipText("Cometa");
        sliderCometa.setValue(0);
        sliderCometa.setPreferredSize(new java.awt.Dimension(50, 20));
        sliderCometa.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderCometaStateChanged(evt);
            }
        });
        sliderCometa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sliderCometaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sliderCometaFocusLost(evt);
            }
        });
        barraImagenes.add(sliderCometa);
        barraImagenes.add(jSeparator5);

        buttonContraste.setBackground(new java.awt.Color(242, 242, 242));
        buttonContraste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/contraste2.png"))); // NOI18N
        buttonContraste.setToolTipText("Contraste");
        buttonContraste.setFocusable(false);
        buttonContraste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonContraste.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonContraste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonContrasteActionPerformed(evt);
            }
        });
        barraImagenes.add(buttonContraste);

        buttonOscurecer.setBackground(new java.awt.Color(242, 242, 242));
        buttonOscurecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ocurecer.png"))); // NOI18N
        buttonOscurecer.setToolTipText("Oscurecer");
        buttonOscurecer.setFocusable(false);
        buttonOscurecer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonOscurecer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonOscurecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOscurecerActionPerformed(evt);
            }
        });
        barraImagenes.add(buttonOscurecer);

        buttonIluminar.setBackground(new java.awt.Color(242, 242, 242));
        buttonIluminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iluminar.png"))); // NOI18N
        buttonIluminar.setToolTipText("Iluminar");
        buttonIluminar.setFocusable(false);
        buttonIluminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonIluminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonIluminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIluminarActionPerformed(evt);
            }
        });
        barraImagenes.add(buttonIluminar);

        buttonOscurecerZonasClaras.setBackground(new java.awt.Color(242, 242, 242));
        buttonOscurecerZonasClaras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/operador1.png"))); // NOI18N
        buttonOscurecerZonasClaras.setToolTipText("Modo noche");
        buttonOscurecerZonasClaras.setFocusable(false);
        buttonOscurecerZonasClaras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonOscurecerZonasClaras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonOscurecerZonasClaras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOscurecerZonasClarasActionPerformed(evt);
            }
        });
        barraImagenes.add(buttonOscurecerZonasClaras);

        labelTransformLineal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/operador2.png"))); // NOI18N
        barraImagenes.add(labelTransformLineal);

        sliderRotacion.setMaximum(360);
        sliderRotacion.setMinimum(-360);
        sliderRotacion.setToolTipText("Rotar");
        sliderRotacion.setValue(0);
        sliderRotacion.setPreferredSize(new java.awt.Dimension(50, 20));
        sliderRotacion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderRotacionStateChanged(evt);
            }
        });
        sliderRotacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sliderRotacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sliderRotacionFocusLost(evt);
            }
        });
        barraImagenes.add(sliderRotacion);
        barraImagenes.add(jSeparator6);

        rotar180Button.setBackground(new java.awt.Color(242, 242, 242));
        rotar180Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rotar180.png"))); // NOI18N
        rotar180Button.setToolTipText("Giro 180");
        rotar180Button.setFocusable(false);
        rotar180Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rotar180Button.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rotar180Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotar180ButtonActionPerformed(evt);
            }
        });
        barraImagenes.add(rotar180Button);

        ampliarButton.setBackground(new java.awt.Color(242, 242, 242));
        ampliarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mas.png"))); // NOI18N
        ampliarButton.setToolTipText("Ampliar");
        ampliarButton.setFocusable(false);
        ampliarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ampliarButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ampliarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ampliarButtonActionPerformed(evt);
            }
        });
        barraImagenes.add(ampliarButton);

        reducirButton.setBackground(new java.awt.Color(242, 242, 242));
        reducirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menos.png"))); // NOI18N
        reducirButton.setToolTipText("Disminuir");
        reducirButton.setFocusable(false);
        reducirButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reducirButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        reducirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reducirButtonActionPerformed(evt);
            }
        });
        barraImagenes.add(reducirButton);
        barraImagenes.add(jSeparator7);

        labelTransformacionLineal.setText("TL");
        barraImagenes.add(labelTransformacionLineal);

        sliderTransformLineal.setMaximum(255);
        sliderTransformLineal.setToolTipText("Transformación Lineal");
        sliderTransformLineal.setValue(0);
        sliderTransformLineal.setPreferredSize(new java.awt.Dimension(50, 20));
        sliderTransformLineal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderTransformLinealStateChanged(evt);
            }
        });
        sliderTransformLineal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sliderTransformLinealFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sliderTransformLinealFocusLost(evt);
            }
        });
        barraImagenes.add(sliderTransformLineal);
        barraImagenes.add(jSeparator8);

        buttonShowBandas.setBackground(new java.awt.Color(242, 242, 242));
        buttonShowBandas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/bandas.png"))); // NOI18N
        buttonShowBandas.setToolTipText("Bandas");
        buttonShowBandas.setFocusable(false);
        buttonShowBandas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonShowBandas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonShowBandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowBandasActionPerformed(evt);
            }
        });
        barraImagenes.add(buttonShowBandas);

        seleccionEspacioColor.setBackground(new java.awt.Color(242, 242, 242));
        seleccionEspacioColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sRGB", "YCC", "Grey" }));
        seleccionEspacioColor.setToolTipText("Espacio color");
        seleccionEspacioColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionEspacioColorActionPerformed(evt);
            }
        });
        barraImagenes.add(seleccionEspacioColor);
        barraImagenes.add(jSeparator9);

        buttonCombinacionBandas.setBackground(new java.awt.Color(242, 242, 242));
        buttonCombinacionBandas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/combinar.png"))); // NOI18N
        buttonCombinacionBandas.setToolTipText("Combinar");
        buttonCombinacionBandas.setFocusable(false);
        buttonCombinacionBandas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonCombinacionBandas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonCombinacionBandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCombinacionBandasActionPerformed(evt);
            }
        });
        barraImagenes.add(buttonCombinacionBandas);

        buttonTintar.setBackground(new java.awt.Color(242, 242, 242));
        buttonTintar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tintar.png"))); // NOI18N
        buttonTintar.setToolTipText("Tintar");
        buttonTintar.setFocusable(false);
        buttonTintar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonTintar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonTintar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTintarActionPerformed(evt);
            }
        });
        barraImagenes.add(buttonTintar);

        buttonSepia.setBackground(new java.awt.Color(242, 242, 242));
        buttonSepia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sepia.png"))); // NOI18N
        buttonSepia.setToolTipText("Filtro sepia");
        buttonSepia.setFocusable(false);
        buttonSepia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSepia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonSepia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSepiaActionPerformed(evt);
            }
        });
        barraImagenes.add(buttonSepia);

        buttonEcualizar.setBackground(new java.awt.Color(242, 242, 242));
        buttonEcualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ecualizar.png"))); // NOI18N
        buttonEcualizar.setToolTipText("Ecualizar");
        buttonEcualizar.setFocusable(false);
        buttonEcualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonEcualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonEcualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEcualizarActionPerformed(evt);
            }
        });
        barraImagenes.add(buttonEcualizar);

        buttonRojo.setBackground(new java.awt.Color(242, 242, 242));
        buttonRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rojo.png"))); // NOI18N
        buttonRojo.setToolTipText("Filtro rojo");
        buttonRojo.setFocusable(false);
        buttonRojo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonRojo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRojoActionPerformed(evt);
            }
        });
        barraImagenes.add(buttonRojo);

        labelPosterizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/posterizar.png"))); // NOI18N
        barraImagenes.add(labelPosterizar);

        sliderPosterizar.setMaximum(20);
        sliderPosterizar.setMinimum(2);
        sliderPosterizar.setToolTipText("Posterizar");
        sliderPosterizar.setValue(2);
        sliderPosterizar.setPreferredSize(new java.awt.Dimension(50, 20));
        sliderPosterizar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderPosterizarStateChanged(evt);
            }
        });
        sliderPosterizar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sliderPosterizarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sliderPosterizarFocusLost(evt);
            }
        });
        barraImagenes.add(sliderPosterizar);

        jPanel3.setLayout(new javax.swing.OverlayLayout(jPanel3));

        buttonColorSrc.setBackground(new java.awt.Color(0, 0, 0));
        buttonColorSrc.setToolTipText("Color fuente");
        buttonColorSrc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonColorSrc.setMaximumSize(new java.awt.Dimension(15, 15));
        buttonColorSrc.setMinimumSize(new java.awt.Dimension(15, 15));
        buttonColorSrc.setPreferredSize(new java.awt.Dimension(15, 15));
        buttonColorSrc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonColorSrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColorSrcActionPerformed(evt);
            }
        });
        jPanel3.add(buttonColorSrc);

        barraImagenes.add(jPanel3);

        sliderTonoColor.setMaximum(360);
        sliderTonoColor.setToolTipText("Cambio tono");
        sliderTonoColor.setValue(0);
        sliderTonoColor.setPreferredSize(new java.awt.Dimension(50, 20));
        sliderTonoColor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderTonoColorStateChanged(evt);
            }
        });
        sliderTonoColor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sliderTonoColorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sliderTonoColorFocusLost(evt);
            }
        });
        barraImagenes.add(sliderTonoColor);

        jPanel4.setLayout(new javax.swing.OverlayLayout(jPanel4));

        buttonColorDst.setBackground(new java.awt.Color(0, 0, 0));
        buttonColorDst.setToolTipText("Color destino");
        buttonColorDst.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonColorDst.setMaximumSize(new java.awt.Dimension(15, 15));
        buttonColorDst.setMinimumSize(new java.awt.Dimension(15, 15));
        buttonColorDst.setPreferredSize(new java.awt.Dimension(15, 15));
        buttonColorDst.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonColorDst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColorDstActionPerformed(evt);
            }
        });
        jPanel4.add(buttonColorDst);

        barraImagenes.add(jPanel4);

        panelCentral.add(barraImagenes, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(panelCentral, java.awt.BorderLayout.CENTER);

        panelBarraEstado.setLayout(new java.awt.BorderLayout());

        barraEstado.setEditable(false);
        barraEstado.setEnabled(false);
        barraEstado.setFocusable(false);
        panelBarraEstado.add(barraEstado, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelBarraEstado, java.awt.BorderLayout.PAGE_END);

        menuArchivo.setText("Archivo");

        menuNuevo.setText("Nuevo");
        menuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoActionPerformed(evt);
            }
        });
        menuArchivo.add(menuNuevo);

        menuAbrir.setText("Abrir");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuAbrir);

        menuGuardar.setText("Guardar");
        menuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarActionPerformed(evt);
            }
        });
        menuArchivo.add(menuGuardar);

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

        menuAffineTransform.setText("AffineTransformOp");
        menuAffineTransform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAffineTransformActionPerformed(evt);
            }
        });
        menuImagen.add(menuAffineTransform);

        menuLookupOp.setText("LookupOp");
        menuLookupOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLookupOpActionPerformed(evt);
            }
        });
        menuImagen.add(menuLookupOp);

        menuBandCombineOp.setText("BandCombineOp");
        menuBandCombineOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBandCombineOpActionPerformed(evt);
            }
        });
        menuImagen.add(menuBandCombineOp);

        menuColorConvertOp.setText("ColorConvertOp");
        menuColorConvertOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuColorConvertOpActionPerformed(evt);
            }
        });
        menuImagen.add(menuColorConvertOp);

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

    private void menuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoActionPerformed
        VentanaInterna vi = new VentanaInterna(escritorio);

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
    }//GEN-LAST:event_menuNuevoActionPerformed

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        JFileChooser dlg = new JFileChooser("/home/santi/Escritorio/SMM/img_prueba");

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imágenes (*.png, *.jpg, *.jpeg, *.gif, *.bmp)", "png", "jpg", "jpeg", "gif", "bmp");
        dlg.addChoosableFileFilter(filter);

        dlg.setAcceptAllFileFilterUsed(true);

        int resp = dlg.showOpenDialog(this);

        if (resp == JFileChooser.APPROVE_OPTION) {
            try {
                File f = dlg.getSelectedFile();
                BufferedImage img = ImageIO.read(f);
                VentanaInterna vi = new VentanaInterna(escritorio);
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
    }//GEN-LAST:event_menuAbrirActionPerformed

    private String getFileExtension(String fileName) {
        String extension = "";
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
            extension = fileName.substring(dotIndex + 1).toLowerCase();
        }
        return extension;
    }

    private void menuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarActionPerformed
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
    }//GEN-LAST:event_menuGuardarActionPerformed

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
        menuNuevoActionPerformed(evt);
    }//GEN-LAST:event_buttonNuevoActionPerformed

    private void buttonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAbrirActionPerformed
        menuAbrirActionPerformed(evt);
    }//GEN-LAST:event_buttonAbrirActionPerformed

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        menuGuardarActionPerformed(evt);
    }//GEN-LAST:event_buttonGuardarActionPerformed

    private void buttonVolcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVolcadoActionPerformed
        Lienzo2D lienzo = getSelectedLienzo();
        if (lienzo != null) {
            lienzo.volcarFiguraSeleccionada();
        }
    }//GEN-LAST:event_buttonVolcadoActionPerformed

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
                    rop.filter(imgFuente, img);
                    escritorio.repaint();
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
                    escritorio.repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_sliderContrasteStateChanged

    public void filtroCometa(BufferedImage imgDest, int tamanoMascara) {
        if (imgDest == null) {
            return;
        }

        float[] mascara = new float[tamanoMascara];
        float suma = 0;

        for (int i = 0; i < tamanoMascara / 2; i++) {
            mascara[i] = 0;
        }

        for (int i = (tamanoMascara / 2); i < tamanoMascara; i++) {
            float peso = (float) (1.0f / pow(i + 1, 2));
            mascara[i] = peso;
            suma += peso;
        }

        System.out.print("[ ");
        for (int i = 0; i < tamanoMascara; i++) {
            if (mascara[i] > 0) {
                mascara[i] /= suma;
            }
            System.out.print(mascara[i] + " ");

            if ((i + 1) % 6 == 0) {
                System.out.println("");
            }
        }

        float sumaNormalizada = 0;
        for (int i = 0; i < tamanoMascara; i++) {
            sumaNormalizada += mascara[i];
        }

        System.out.print("]\n Suma: " + sumaNormalizada + "\n");

        Kernel kernel = new Kernel(tamanoMascara, 1, mascara);
        ConvolveOp convolveOp = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP, null);
        convolveOp.filter(imgFuente, imgDest);
    }

    private void sliderCometaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderCometaStateChanged
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null && imgFuente != null) {
            try {
                BufferedImage img = vi.getLienzo2D().getImage();
                int tamanoMascara = sliderCometa.getValue();

                filtroCometa(img, tamanoMascara);
                vi.getLienzo2D().repaint();
            } catch (IllegalArgumentException e) {
                System.err.println(e.getLocalizedMessage());
            }
        }
    }//GEN-LAST:event_sliderCometaStateChanged

    private void sliderCometaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderCometaFocusGained
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            ColorModel cm = vi.getLienzo2D().getImage().getColorModel();
            WritableRaster raster = vi.getLienzo2D().getImage().copyData(null);
            boolean alfaPre = vi.getLienzo2D().getImage().isAlphaPremultiplied();
            imgFuente = new BufferedImage(cm, raster, alfaPre, null);
        }
    }//GEN-LAST:event_sliderCometaFocusGained

    private void sliderCometaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderCometaFocusLost
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null && imgFuente != null) {
            vi.getLienzo2D().setImage(imgFuente);
            vi.getLienzo2D().repaint();
        }
        sliderCometa.setValue(0);
    }//GEN-LAST:event_sliderCometaFocusLost

    private void aplicarLookup(LookupTable tabla) {
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    BufferedImage imgCopy = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());
                    Graphics2D g2d = imgCopy.createGraphics();
                    g2d.drawImage(img, 0, 0, null);
                    g2d.dispose();

                    LookupOp lop = new LookupOp(tabla, null);
                    lop.filter(imgCopy, imgCopy);
                    vi.getLienzo2D().setImage(imgCopy);
                    vi.getLienzo2D().repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }

    private void buttonContrasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonContrasteActionPerformed
        LookupTable tabla = LookupTableProducer.createLookupTable(LookupTableProducer.TYPE_SFUNCION);
        aplicarLookup(tabla);
    }//GEN-LAST:event_buttonContrasteActionPerformed

    private void buttonOscurecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOscurecerActionPerformed
        LookupTable tabla = LookupTableProducer.powerFuction(LookupTableProducer.DEFAULT_POWER);
        aplicarLookup(tabla);
    }//GEN-LAST:event_buttonOscurecerActionPerformed

    private void buttonIluminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIluminarActionPerformed
        LookupTable tabla = LookupTableProducer.rootFuction(LookupTableProducer.DEFAULT_ROOT);
        aplicarLookup(tabla);
    }//GEN-LAST:event_buttonIluminarActionPerformed

    private void rotar180ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotar180ButtonActionPerformed
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    AffineTransform at = AffineTransform.getRotateInstance(Math.toRadians(180), img.getWidth() / 2, img.getHeight() / 2);
                    AffineTransformOp atop = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
                    BufferedImage imgdest = atop.filter(img, null);
                    vi.getLienzo2D().setImage(imgdest);
                    vi.getLienzo2D().repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_rotar180ButtonActionPerformed

    private void sliderRotacionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderRotacionStateChanged
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            if (imgFuente != null) {
                try {
                    double radians = Math.toRadians(this.sliderRotacion.getValue());
                    AffineTransform at = AffineTransform.getRotateInstance(radians, imgFuente.getWidth() / 2, imgFuente.getHeight() / 2);
                    AffineTransformOp atop = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
                    BufferedImage imgdest = atop.filter(imgFuente, null);
                    vi.getLienzo2D().setImage(imgdest);
                    vi.getLienzo2D().repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_sliderRotacionStateChanged

    private void sliderRotacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderRotacionFocusGained
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            this.imgFuente = vi.getLienzo2D().getImage();
        }
    }//GEN-LAST:event_sliderRotacionFocusGained

    private void sliderRotacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderRotacionFocusLost
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null && imgFuente != null) {
            vi.getLienzo2D().setImage(imgFuente);
            vi.getLienzo2D().repaint();
        }
        this.sliderRotacion.setValue(0);
    }//GEN-LAST:event_sliderRotacionFocusLost

    private void ampliarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ampliarButtonActionPerformed
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    AffineTransform at = AffineTransform.getScaleInstance(1.3, 1.3);
                    AffineTransformOp atop = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
                    BufferedImage imgdest = atop.filter(img, null);
                    vi.getLienzo2D().setImage(imgdest);
                    vi.getLienzo2D().repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_ampliarButtonActionPerformed

    private void reducirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reducirButtonActionPerformed
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    AffineTransform at = AffineTransform.getScaleInstance(0.7, 0.7);
                    AffineTransformOp atop = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
                    BufferedImage imgdest = atop.filter(img, null);
                    vi.getLienzo2D().setImage(imgdest);
                    vi.getLienzo2D().repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_reducirButtonActionPerformed

    private void menuLookupOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLookupOpActionPerformed
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    byte funcionT[] = new byte[256];
                    for (int x = 0; x < 256; x++) {
                        funcionT[x] = (byte) (255 - x); // Negativo
                    }
                    LookupTable tabla = new ByteLookupTable(0, funcionT);
                    LookupOp lop = new LookupOp(tabla, null);

                    BufferedImage imgdest = lop.filter(img, null);
                    vi.getLienzo2D().setImage(imgdest);
                    vi.getLienzo2D().repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_menuLookupOpActionPerformed

    private void menuAffineTransformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAffineTransformActionPerformed
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    AffineTransform at = AffineTransform.getScaleInstance(1.5, 1.5);
                    AffineTransformOp atop = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
                    BufferedImage imgdest = atop.filter(img, null);
                    vi.getLienzo2D().setImage(imgdest);
                    vi.getLienzo2D().repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_menuAffineTransformActionPerformed

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

    /**
     * Genera una tabla de búsqueda para aplicar la transformación lineal con un
     * punto de control.
     *
     * El efecto de esta transformación es ajustar el contraste y el brillo de
     * la imagen basándose en el valor del parámetro "a". El parámetro "a" actúa
     * como un punto de control en el rango [0, 255]. Para valores de píxel
     * inferiores a 128, se aplica una transformación lineal que mapea el rango
     * [0, 127] al rango [0, a]. Para valores de píxel mayores o iguales a 128,
     * se aplica una transformación lineal que mapea el rango [128, 255] al
     * rango [a, 255].
     *
     * Cuando "a" es menor que 128, se reducirá el contraste en las zonas
     * oscuras y se aumentará en las zonas claras. Cuando "a" es mayor o igual
     * que 128, se aumentará el contraste en las zonas oscuras y se reducirá en
     * las zonas claras.
     *
     * @param a el valor del parámetro de control en el rango [0, 255]
     * @return la tabla de búsqueda para la transformación
     */
    public LookupTable tablaTransformacionLineal(int a) {
        byte[] lookupTable = new byte[256];
        for (int i = 0; i < 256; i++) {
            if (i < 128) {
                lookupTable[i] = (byte) ((a * i) / 128);
            } else {
                lookupTable[i] = (byte) (((255 - a) * (i - 128)) / 127 + a);
            }
        }
        return new ByteLookupTable(0, lookupTable);
    }

    private void sliderTransformLinealStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderTransformLinealStateChanged
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null && imgFuente != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    BufferedImage imgCopy = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());
                    Graphics2D g2d = imgCopy.createGraphics();
                    g2d.drawImage(img, 0, 0, null);
                    g2d.dispose();

                    int sliderValue = sliderTransformLineal.getValue();
                    LookupTable tablaTransformacion = tablaTransformacionLineal(sliderValue);
                    LookupOp lop = new LookupOp(tablaTransformacion, null);
                    lop.filter(imgCopy, imgCopy);

                    vi.getLienzo2D().setImage(imgCopy);
                    vi.getLienzo2D().repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_sliderTransformLinealStateChanged

    private void sliderTransformLinealFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderTransformLinealFocusGained
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            this.imgFuente = vi.getLienzo2D().getImage();
        }
    }//GEN-LAST:event_sliderTransformLinealFocusGained

    private void sliderTransformLinealFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderTransformLinealFocusLost
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null && imgFuente != null) {
            vi.getLienzo2D().setImage(imgFuente);
            vi.getLienzo2D().repaint();
        }
        this.sliderTransformLineal.setValue(0);
    }//GEN-LAST:event_sliderTransformLinealFocusLost

    public LookupTable tablaOscurecerZonasClaras(int umbral) {
        byte[] lookupTable = new byte[256];
        for (int i = 0; i < 256; i++) {
            if (i < umbral) {
                lookupTable[i] = (byte) i;
            } else {
                lookupTable[i] = (byte) (255 - (255 - umbral) * (i - umbral) / (255 - umbral));
            }
        }

        System.out.println("Lookup Table:");
        for (int i = 0; i < 256; i++) {
            System.out.print(lookupTable[i] + " ");
        }
        System.out.println();

        return new ByteLookupTable(0, lookupTable);
    }

    private void buttonOscurecerZonasClarasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOscurecerZonasClarasActionPerformed
        aplicarLookup(tablaOscurecerZonasClaras(128));
    }//GEN-LAST:event_buttonOscurecerZonasClarasActionPerformed

    private void menuBandCombineOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBandCombineOpActionPerformed
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    float[][] matriz = {
                        {1.0F, 0.0F, 0.0F},
                        {0.0F, 0.0F, 1.0F},
                        {0.0F, 1.0F, 0.0F}
                    };
                    BandCombineOp bcop = new BandCombineOp(matriz, null);
                    bcop.filter(img.getRaster(), img.getRaster());
                    vi.getLienzo2D().repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_menuBandCombineOpActionPerformed

    private void menuColorConvertOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuColorConvertOpActionPerformed
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    ColorSpace cs = new sm.image.color.GreyColorSpace();
                    ColorConvertOp op = new ColorConvertOp(cs, null);
                    BufferedImage imgdest = op.filter(img, null);
                    vi.getLienzo2D().setImage(imgdest);
                    vi.getLienzo2D().repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_menuColorConvertOpActionPerformed

    private void buttonShowBandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShowBandasActionPerformed
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                for (int i = 0; i < img.getRaster().getNumBands(); i++) {
                    BufferedImage imgBanda = getImageBand(img, i);
                    vi = new VentanaInterna(escritorio);
                    vi.getLienzo2D().setImage(imgBanda);
                    escritorio.add(vi);
                    vi.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_buttonShowBandasActionPerformed

    private void seleccionEspacioColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionEspacioColorActionPerformed
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    ColorSpace cs = getEspacioColor(this.seleccionEspacioColor.getSelectedIndex());
                    String colorSpaceName = getNombreEspacioColor(this.seleccionEspacioColor.getSelectedIndex());

                    // Verificar si es necesario realizar la conversión
                    if (cs != null && !img.getColorModel().getColorSpace().equals(cs)) {
                        ColorConvertOp op = new ColorConvertOp(cs, null);
                        BufferedImage imgdest = op.filter(img, null);

                        // Mostrar la nueva imagen en una ventana interna
                        showBandasVentanaNueva(imgdest, vi.getTitle(), colorSpaceName);
                    } else {
                        // Si no es necesario cambiar, mostrar la imagen original en una nueva ventana
                        nuevaVentanaInterna(img, vi.getTitle(), "Original");
                    }
                } catch (IllegalArgumentException e) {
                    System.err.println("Error converting image: " + e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_seleccionEspacioColorActionPerformed

    private void showBandasVentanaNueva(BufferedImage img, String titulo, String nombreEspacio) {
        for (int i = 0; i < img.getRaster().getNumBands(); i++) {
            BufferedImage imgBanda = getImageBand(img, i);
            VentanaInterna newWindow = new VentanaInterna(escritorio);
            newWindow.setTitle(titulo + " (" + nombreEspacio + " - Banda " + (i + 1) + ")");
            newWindow.getLienzo2D().setImage(imgBanda);
            escritorio.add(newWindow);
            newWindow.setVisible(true);
        }
    }

    private ColorSpace getEspacioColor(int selection) {
        switch (selection) {
            case 0:
                return ColorSpace.getInstance(ColorSpace.CS_sRGB);
            case 1:
                return ColorSpace.getInstance(ColorSpace.CS_PYCC);
            case 2:
                return ColorSpace.getInstance(ColorSpace.CS_GRAY);
            default:
                System.err.println("Invalid color space selection: " + selection);
                return null;
        }
    }

    private String getNombreEspacioColor(int selection) {
        switch (selection) {
            case 0:
                return "sRGB";
            case 1:
                return "YCC";
            case 2:
                return "GREY";
            default:
                return "Unknown";
        }
    }

    private void nuevaVentanaInterna(BufferedImage img, String title, String spaceName) {
        VentanaInterna newWindow = new VentanaInterna(escritorio);
        newWindow.setTitle(title + " (" + spaceName + ")");
        newWindow.getLienzo2D().setImage(img);
        escritorio.add(newWindow);
        newWindow.setVisible(true);
    }

    private BufferedImage combinarBandas(BufferedImage imagenOriginal) {
        BufferedImage imagenCombinada = new BufferedImage(imagenOriginal.getWidth(),
                imagenOriginal.getHeight(),
                BufferedImage.TYPE_INT_ARGB); // 32-bit con alpha

        for (int x = 0; x < imagenOriginal.getWidth(); x++) {
            for (int y = 0; y < imagenOriginal.getHeight(); y++) {
                int pixelOriginal = imagenOriginal.getRGB(x, y);

                // Extraer valores RGB y alpha a arrays
                int[] rgbOriginal = new int[3];
                rgbOriginal[0] = (pixelOriginal >> 16) & 0xFF; // Rojo
                rgbOriginal[1] = (pixelOriginal >> 8) & 0xFF;  // Verde
                rgbOriginal[2] = pixelOriginal & 0xFF;      // Azul

                int alphaOriginal = pixelOriginal >>> 24; // Extraer alpha

                // Combinar bandas
                float mediaRojo = (rgbOriginal[1] + rgbOriginal[2]) / 2f;
                mediaRojo = Math.max(0, Math.min(255, mediaRojo));

                float mediaVerde = (rgbOriginal[0] + rgbOriginal[2]) / 2f;
                mediaVerde = Math.max(0, Math.min(255, mediaVerde));

                float mediaAzul = (rgbOriginal[0] + rgbOriginal[1]) / 2f;
                mediaAzul = Math.max(0, Math.min(255, mediaAzul));

                int[] rgbCombinado = new int[3];
                rgbCombinado[0] = (int) mediaRojo;
                rgbCombinado[1] = (int) mediaVerde;
                rgbCombinado[2] = (int) mediaAzul;

                // Crear nuevo pixel con alpha
                int pixelCombinado = (alphaOriginal << 24)
                        | (rgbCombinado[0] << 16)
                        | (rgbCombinado[1] << 8)
                        | rgbCombinado[2];
                imagenCombinada.setRGB(x, y, pixelCombinado);
            }
        }

        return imagenCombinada;
    }

    private void buttonCombinacionBandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCombinacionBandasActionPerformed
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    BufferedImage imgCombinada = combinarBandas(img);
                    vi = new VentanaInterna(escritorio);
                    vi.getLienzo2D().setImage(imgCombinada);
                    escritorio.add(vi);
                    vi.setVisible(true);
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_buttonCombinacionBandasActionPerformed

    private void buttonDuplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDuplicarActionPerformed
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    VentanaInterna viNueva = new VentanaInterna(escritorio, vi);
                    escritorio.add(viNueva);
                    viNueva.setVisible(true);
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_buttonDuplicarActionPerformed

    private void buttonTintarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTintarActionPerformed
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            Color nuevoColor = JColorChooser.showDialog(null, "Elige un color", null);
            if (nuevoColor != null) {
                BufferedImage img = vi.getLienzo2D().getImage();
                if (img != null) {
                    try {
                        TintOp tintado = new TintOp(nuevoColor, 0.5f);
                        BufferedImage imgDest = tintado.filter(img, img);
                        vi.getLienzo2D().setImage(imgDest);
                        escritorio.repaint();
                    } catch (IllegalArgumentException e) {
                        System.err.println(e.getLocalizedMessage());
                    }
                }
            }
        }
    }//GEN-LAST:event_buttonTintarActionPerformed

    private void buttonSepiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSepiaActionPerformed
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    SepiaOp sepia = new SepiaOp();
                    BufferedImage imgDest = sepia.filter(img, img);
                    vi.getLienzo2D().setImage(imgDest);
                    escritorio.repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_buttonSepiaActionPerformed

    private void buttonEcualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEcualizarActionPerformed
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    EqualizationOp ecualizacion = new EqualizationOp();
                    BufferedImage imgDest = ecualizacion.filter(img, img);
                    vi.getLienzo2D().setImage(imgDest);
                    vi.getLienzo2D().repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_buttonEcualizarActionPerformed

    private void buttonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRojoActionPerformed
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getImage();
            if (img != null) {
                try {
                    RojoOp rojo = new RojoOp(20);
                    BufferedImage imgDest = rojo.filter(img, img);
                    vi.getLienzo2D().setImage(imgDest);
                    escritorio.repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_buttonRojoActionPerformed

    private void buttonColorSrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColorSrcActionPerformed
        Color colorSeleccionado = JColorChooser.showDialog(this, "Seleccionar color", null);

        if (colorSeleccionado != null) {
            this.buttonColorSrc.setBackground(colorSeleccionado);
            Lienzo2D lienzo = this.getSelectedLienzo();
            if (lienzo != null) {
                lienzo.setColor(colorSeleccionado);
                lienzo.updateFiguraSeleccionada();
            }
            this.buttonColorSrc.repaint();
        }
    }//GEN-LAST:event_buttonColorSrcActionPerformed

    private void buttonColorDstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColorDstActionPerformed
        Color colorSeleccionado = JColorChooser.showDialog(this, "Seleccionar color", null);

        if (colorSeleccionado != null) {
            this.buttonColorDst.setBackground(colorSeleccionado);
            Lienzo2D lienzo = this.getSelectedLienzo();
            if (lienzo != null) {
                lienzo.setColor(colorSeleccionado);
                lienzo.updateFiguraSeleccionada();
            }
            this.buttonColorDst.repaint();
        }
    }//GEN-LAST:event_buttonColorDstActionPerformed

    private void sliderPosterizarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderPosterizarStateChanged
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            if (imgFuente != null) {
                try {
                    PosterizarOp poster = new PosterizarOp(this.sliderPosterizar.getValue());
                    BufferedImage imgDest = poster.filter(imgFuente, null);
                    vi.getLienzo2D().setImage(imgDest);
                    escritorio.repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_sliderPosterizarStateChanged

    private void sliderPosterizarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderPosterizarFocusGained
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            this.imgFuente = vi.getLienzo2D().getImage();
        }
    }//GEN-LAST:event_sliderPosterizarFocusGained

    private void sliderPosterizarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderPosterizarFocusLost
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null && imgFuente != null) {
            vi.getLienzo2D().setImage(imgFuente);
            vi.getLienzo2D().repaint();
        }
        this.sliderPosterizar.setValue(2);
    }//GEN-LAST:event_sliderPosterizarFocusLost

    private void sliderTonoColorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderTonoColorStateChanged
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            if (imgFuente != null) {
                try {
                    Color colorC1 = buttonColorSrc.getBackground();
                    Color colorC2 = buttonColorDst.getBackground();

                    // Convertir los colores a sus valores de tono (H)
                    float[] hsbC1 = Color.RGBtoHSB(colorC1.getRed(), colorC1.getGreen(), colorC1.getBlue(), null);
                    float[] hsbC2 = Color.RGBtoHSB(colorC2.getRed(), colorC2.getGreen(), colorC2.getBlue(), null);

                    float C1 = hsbC1[0] * 360; // Convertir H de [0,1] a [0,360]
                    float C2 = hsbC2[0] * 360; // Convertir H de [0,1] a [0,360]

                    float T = sliderTonoColor.getValue();

                    BufferedImage imgDest = cambiarTonoImagen(imgFuente, C1, C2, T);
                    vi.getLienzo2D().setImage(imgDest);
                    escritorio.repaint();
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getLocalizedMessage());
                }
            }
        }
    }//GEN-LAST:event_sliderTonoColorStateChanged

    private BufferedImage cambiarTonoImagen(BufferedImage img, float C1, float C2, float T) {
        int width = img.getWidth();
        int height = img.getHeight();
        BufferedImage result = new BufferedImage(width, height, img.getType());

        float[] valoresHSB = new float[3];

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int rgb = img.getRGB(x, y);

//                int alpha = (rgb >> 24) & 0xFF; // Extraer el valor del canal alfa
                int rojo = (rgb >> 16) & 0xFF;  // Extraer el valor del canal rojo
                int verde = (rgb >> 8) & 0xFF;  // Extraer el valor del canal verde
                int azul = rgb & 0xFF;          // Extraer el valor del canal azul

                // Convertir RGB a HSB
                Color.RGBtoHSB(rojo, verde, azul, valoresHSB);

                float H_px = valoresHSB[0] * 360; // Convertir H de [0,1] a [0,360]
                float S_px = valoresHSB[1]; // Saturación
                float B_px = valoresHSB[2]; // Brillo

                float distancia = calcularDistancia(H_px, C1);

                float H_resultado;
                if (distancia <= T) {
                    H_resultado = C2;
                } else {
                    H_resultado = H_px;
                }

                int rgbResultado = Color.HSBtoRGB(H_resultado / 360, S_px, B_px); // Convertir H de nuevo a [0,1]
                result.setRGB(x, y, rgbResultado);
            }
        }

        return result;
    }

    private float calcularDistancia(float H1, float H2) {
        float distancia = Math.abs(H1 - H2);
        if (distancia > 180) {
            distancia = 360 - distancia;
        }
        return distancia;
    }

    private void sliderTonoColorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderTonoColorFocusGained
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null) {
            this.imgFuente = vi.getLienzo2D().getImage();
        }
    }//GEN-LAST:event_sliderTonoColorFocusGained

    private void sliderTonoColorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sliderTonoColorFocusLost
        VentanaInterna vi = (VentanaInterna) (escritorio.getSelectedFrame());
        if (vi != null && imgFuente != null) {
            vi.getLienzo2D().setImage(imgFuente);
            vi.getLienzo2D().repaint();
        }
        this.sliderTonoColor.setValue(0);
    }//GEN-LAST:event_sliderTonoColorFocusLost

    private BufferedImage getImageBand(BufferedImage img, int banda) {
        //Creamos el modelo de color de la nueva imagen basado en un espcio de color GRAY
        ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
        ComponentColorModel cm = new ComponentColorModel(cs, false, false,
                Transparency.OPAQUE,
                DataBuffer.TYPE_BYTE);
        //Creamos el nuevo raster a partir del raster de la imagen original
        int vband[] = {banda};
        WritableRaster bRaster = (WritableRaster) img.getRaster().createWritableChild(0, 0,
                img.getWidth(), img.getHeight(), 0, 0, vband);

        //Creamos una nueva imagen que contiene como raster el correspondiente a la banda
        return new BufferedImage(cm, bRaster, false, null);
    }

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
                k = createKernelEmborronamientoIluminado3x3();
                break;
            case 6:
                k = createKernelEmborronamientoIluminado5x5();
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
    private Kernel createKernelEmborronamientoIluminado3x3() {
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
    private Kernel createKernelEmborronamientoIluminado5x5() {
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
    private javax.swing.JButton ampliarButton;
    private javax.swing.JTextField barraEstado;
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JToolBar barraImagenes;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton buttonAbrir;
    private javax.swing.JButton buttonColor;
    private javax.swing.JButton buttonColorDst;
    private javax.swing.JButton buttonColorSrc;
    private javax.swing.JButton buttonCombinacionBandas;
    private javax.swing.JButton buttonContraste;
    private javax.swing.JButton buttonDuplicar;
    private javax.swing.JButton buttonEcualizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonIluminar;
    private javax.swing.JButton buttonNuevo;
    private javax.swing.JButton buttonOscurecer;
    private javax.swing.JButton buttonOscurecerZonasClaras;
    private javax.swing.JButton buttonRojo;
    private javax.swing.JButton buttonSepia;
    private javax.swing.JButton buttonShowBandas;
    private javax.swing.JButton buttonTintar;
    private javax.swing.JButton buttonVolcado;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JLabel labelPosterizar;
    private javax.swing.JLabel labelTransformLineal;
    private javax.swing.JLabel labelTransformacionLineal;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenuItem menuAffineTransform;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuBandCombineOp;
    private javax.swing.JMenuItem menuColorConvertOp;
    private javax.swing.JMenuItem menuConvolveOp;
    private javax.swing.JMenuItem menuGuardar;
    private javax.swing.JMenu menuImagen;
    private javax.swing.JMenuItem menuLookupOp;
    private javax.swing.JMenuItem menuNuevo;
    private javax.swing.JMenuItem menuRescaleOp;
    private javax.swing.JPanel panelBarraEstado;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JButton reducirButton;
    private javax.swing.JButton rotar180Button;
    private javax.swing.JComboBox<String> seleccionEspacioColor;
    private javax.swing.JComboBox<String> seleccionMascara;
    private javax.swing.JSlider sliderBrillo;
    private javax.swing.JSlider sliderCometa;
    private javax.swing.JSlider sliderContraste;
    private javax.swing.JSlider sliderGrosor;
    private javax.swing.JSlider sliderPosterizar;
    private javax.swing.JSlider sliderRotacion;
    private javax.swing.JSlider sliderTonoColor;
    private javax.swing.JSlider sliderTransformLineal;
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

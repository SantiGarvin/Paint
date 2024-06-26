package practica;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import sm.sgp.iu.Lienzo2D;

public class VentanaInterna extends javax.swing.JInternalFrame {

    private static int xOffset = 30;
    private static int yOffset = 30;

    /**
     * Creates new form VentanaInterna
     *
     * @param escritorio
     */
    public VentanaInterna(JDesktopPane escritorio) {
        initComponents();
        this.setTitle("Nueva ventana");
        this.setSize(800, 800);

        posicionVentana(escritorio);
    }
    
    public VentanaInterna(JDesktopPane escritorio, VentanaInterna original) {
        this(escritorio);
        this.lienzo2D.setImage(original.getLienzo2D().getPaintedImage());
    }

    public Lienzo2D getLienzo2D() {
        return lienzo2D;
    }

    private void posicionVentana(JDesktopPane escritorio) {
        JInternalFrame[] allFrames = escritorio.getAllFrames();
        int x = 0, y = 0;
        if (allFrames.length > 0) {
            JInternalFrame lastFrame = allFrames[0];
            x = lastFrame.getX() + xOffset;
            y = lastFrame.getY() + yOffset;
        }

        if (x + this.getWidth() > escritorio.getWidth()) {
            x = 0;
        }
        if (y + this.getHeight() > escritorio.getHeight()) {
            y = 0;
        }

        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lienzo2D = new sm.sgp.iu.Lienzo2D();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout lienzo2DLayout = new javax.swing.GroupLayout(lienzo2D);
        lienzo2D.setLayout(lienzo2DLayout);
        lienzo2DLayout.setHorizontalGroup(
            lienzo2DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        lienzo2DLayout.setVerticalGroup(
            lienzo2DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(lienzo2D);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private sm.sgp.iu.Lienzo2D lienzo2D;
    // End of variables declaration//GEN-END:variables
}

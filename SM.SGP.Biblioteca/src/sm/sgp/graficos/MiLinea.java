package sm.sgp.graficos;

import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Clase que representa una línea en el sistema de gráficos. Extiende la clase
 * AbstractShape y proporciona funcionalidades específicas para líneas.
 */
public class MiLinea extends AbstractShape {

    private Line2D.Float linea;

    /**
     * Constructor por defecto de la clase MiLinea. Crea una nueva línea vacía.
     */
    public MiLinea() {
        linea = new Line2D.Float();
    }

    /**
     * Constructor de la clase MiLinea que recibe dos puntos. Crea una nueva
     * línea que va desde el punto p1 hasta el punto p2.
     *
     * @param p1 El punto de inicio de la línea.
     * @param p2 El punto final de la línea.
     */
    public MiLinea(Point2D p1, Point2D p2) {
        linea = new Line2D.Float(p1, p2);
    }

    /**
     * Verifica si un punto está cerca de la línea.
     *
     * @param p El punto a verificar.
     * @return true si el punto está cerca de la línea, false de lo contrario.
     */
    public boolean isNear(Point2D p) {
        if (linea.getP1().equals(linea.getP2())) {
            return linea.getP1().distance(p) <= 2.0; //p1=p2
        }
        return linea.ptLineDist(p) <= 2.0; // p1!=p2
    }

    /**
     * Establece los puntos de inicio y fin de la línea.
     *
     * @param p1 El nuevo punto de inicio de la línea.
     * @param p2 El nuevo punto final de la línea.
     */
    public void setLine(Point2D p1, Point2D p2) {
        linea.setLine(p1, p2);
    }

    /**
     * Obtiene la ubicación de la línea (punto de inicio).
     *
     * @return El punto de inicio de la línea.
     */
    @Override
    public Point2D getLocation() {
        return linea.getP1();
    }

    /**
     * Establece la ubicación de la línea moviendo ambos puntos.
     *
     * @param pos La nueva ubicación del punto de inicio de la línea.
     */
    @Override
    public void setLocation(Point2D pos) {
        double dx = pos.getX() - linea.getX1();
        double dy = pos.getY() - linea.getY1();
        Point2D newp2 = new Point2D.Double(linea.getX2() + dx, linea.getY2() + dy);
        linea.setLine(pos, newp2);
    }

    // Métodos de la interfaz Shape
    /**
     * Obtiene los límites de la línea como un rectángulo.
     *
     * @return Los límites de la línea como un rectángulo.
     */
    @Override
    public Rectangle getBounds() {
        return linea.getBounds();
    }

    /**
     * Obtiene los límites de la línea como un rectángulo de precisión doble.
     *
     * @return Los límites de la línea como un rectángulo de precisión doble.
     */
    @Override
    public Rectangle2D getBounds2D() {
        return linea.getBounds2D();
    }

    /**
     * Verifica si la línea contiene un punto.
     *
     * @param p El punto a verificar.
     * @return true si la línea contiene el punto, false de lo contrario.
     */
    @Override
    public boolean contains(Point2D p) {
        return this.isNear(p);
    }

    /**
     * Verifica si la línea contiene completamente un rectángulo.
     *
     * @param r El rectángulo a verificar.
     * @return true si la línea contiene completamente el rectángulo, false de
     * lo contrario.
     */
    @Override
    public boolean contains(Rectangle2D r) {
        return linea.contains(r);
    }

    /**
     * Verifica si la línea contiene un punto especificado por sus coordenadas.
     *
     * @param x La coordenada x del punto.
     * @param y La coordenada y del punto.
     * @return true si la línea contiene el punto, false de lo contrario.
     */
    @Override
    public boolean contains(double x, double y) {
        return linea.contains(x, y);
    }

    /**
     * Verifica si la línea contiene completamente un rectángulo especificado
     * por sus coordenadas.
     *
     * @param x La coordenada x del rectángulo.
     * @param y La coordenada y del rectángulo.
     * @param w El ancho del rectángulo.
     * @param h La altura del rectángulo.
     * @return true si la línea contiene completamente el rectángulo, false de
     * lo contrario.
     */
    @Override
    public boolean contains(double x, double y, double w, double h) {
        return linea.contains(x, y, w, h);
    }

    /**
     * Verifica si la línea intersecta con un rectángulo.
     *
     * @param r El rectángulo a verificar.
     * @return true si la línea intersecta con el rectángulo, false de lo
     * contrario.
     */
    @Override
    public boolean intersects(Rectangle2D r) {
        return linea.intersects(r);
    }

    /**
     * Verifica si la línea intersecta con un rectángulo especificado por sus
     * coordenadas.
     *
     * @param x La coordenada x del rectángulo.
     * @param y La coordenada y del rectángulo.
     * @param w El ancho del rectángulo.
     * @param h La altura del rectángulo.
     * @return true si la línea intersecta con el rectángulo, false de lo
     * contrario.
     */
    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return linea.intersects(x, y, w, h);
    }

    /**
     * Obtiene un iterador de ruta para la línea con la transformación
     * especificada.
     *
     * @param at La transformación afín a aplicar.
     * @return Un iterador de ruta para la línea transformada.
     */
    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return linea.getPathIterator(at);
    }

    /**
     * Obtiene un iterador de ruta para la línea con la transformación y la
     * tolerancia especificadas.
     *
     * @param at La transformación afín a aplicar.
     * @param flatness La tolerancia para la aproximación de la ruta.
     * @return Un iterador de ruta para la línea transformada.
     */
    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return linea.getPathIterator(at, flatness);
    }
}

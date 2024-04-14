package sm.sgp.graficos;

import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Clase que representa una elipse en el sistema de gráficos. Extiende la clase
 * AbstractShapeFilled y proporciona funcionalidades específicas para elipses.
 */
public class MiElipse extends AbstractShapeFilled {

    private Ellipse2D.Float elipse;

    /**
     * Constructor por defecto de la clase MiElipse. Crea una nueva elipse
     * vacía.
     */
    public MiElipse() {
        elipse = new Ellipse2D.Float();
    }

    /**
     * Constructor de la clase MiElipse que recibe dos puntos. Crea una nueva
     * elipse con los puntos especificados como esquinas opuestas del rectángulo
     * que la encierra.
     *
     * @param p1 El primer punto de la elipse.
     * @param p2 El segundo punto de la elipse.
     */
    public MiElipse(Point2D p1, Point2D p2) {
        elipse = new Ellipse2D.Float();
        elipse.setFrameFromDiagonal(p1, p2);
    }

    /**
     * Establece la elipse a partir de dos puntos que representan las esquinas
     * opuestas del rectángulo que la encierra.
     *
     * @param p1 El primer punto de la elipse.
     * @param p2 El segundo punto de la elipse.
     */
    public void setFrameFromDiagonal(Point2D p1, Point2D p2) {
        elipse.setFrameFromDiagonal(p1, p2);
    }

    /**
     * Obtiene la ubicación de la elipse (esquina superior izquierda del
     * rectángulo que la encierra).
     *
     * @return La ubicación de la elipse.
     */
    @Override
    public Point2D getLocation() {
        return new Point2D.Double(elipse.getX(), elipse.getY());
    }

    /**
     * Establece la ubicación de la elipse (esquina superior izquierda del
     * rectángulo que la encierra).
     *
     * @param pos La nueva ubicación de la elipse.
     */
    @Override
    public void setLocation(Point2D pos) {
        elipse.setFrame(pos.getX(), pos.getY(), elipse.getWidth(), elipse.getHeight());
    }

    // Métodos de la interfaz Shape
    /**
     * Obtiene los límites de la elipse como un objeto Rectangle.
     *
     * @return Los límites de la elipse.
     */
    @Override
    public Rectangle getBounds() {
        return elipse.getBounds();
    }

    /**
     * Obtiene los límites de la elipse como un objeto Rectangle2D.
     *
     * @return Los límites de la elipse.
     */
    @Override
    public Rectangle2D getBounds2D() {
        return elipse.getBounds2D();
    }

    /**
     * Verifica si la elipse contiene un punto específico.
     *
     * @param p El punto a verificar.
     * @return true si la elipse contiene el punto, false de lo contrario.
     */
    @Override
    public boolean contains(Point2D p) {
        return elipse.contains(p);
    }

    /**
     * Verifica si la elipse contiene completamente un rectángulo.
     *
     * @param r El rectángulo a verificar.
     * @return true si la elipse contiene completamente el rectángulo, false de
     * lo contrario.
     */
    @Override
    public boolean contains(Rectangle2D r) {
        return elipse.contains(r);
    }

    /**
     * Verifica si la elipse contiene un punto especificado por sus coordenadas.
     *
     * @param x La coordenada x del punto.
     * @param y La coordenada y del punto.
     * @return true si la elipse contiene el punto, false de lo contrario.
     */
    @Override
    public boolean contains(double x, double y) {
        return elipse.contains(x, y);
    }

    /**
     * Verifica si la elipse contiene completamente un rectángulo especificado
     * por sus coordenadas.
     *
     * @param x La coordenada x del rectángulo.
     * @param y La coordenada y del rectángulo.
     * @param w El ancho del rectángulo.
     * @param h La altura del rectángulo.
     * @return true si la elipse contiene completamente el rectángulo, false de
     * lo contrario.
     */
    @Override
    public boolean contains(double x, double y, double w, double h) {
        return elipse.contains(x, y, w, h);
    }

    /**
     * Verifica si la elipse intersecta con un rectángulo.
     *
     * @param r El rectángulo a verificar.
     * @return true si la elipse intersecta con el rectángulo, false de lo
     * contrario.
     */
    @Override
    public boolean intersects(Rectangle2D r) {
        return elipse.intersects(r);
    }

    /**
     * Verifica si la elipse intersecta con un rectángulo especificado por sus
     * coordenadas.
     *
     * @param x La coordenada x del rectángulo.
     * @param y La coordenada y del rectángulo.
     * @param w El ancho del rectángulo.
     * @param h La altura del rectángulo.
     * @return true si la elipse intersecta con el rectángulo, false de lo
     * contrario.
     */
    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return elipse.intersects(x, y, w, h);
    }

    /**
     * Obtiene un iterador de ruta para la elipse con la transformación
     * especificada.
     *
     * @param at La transformación afín a aplicar.
     * @return Un iterador de ruta para la elipse transformada.
     */
    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return elipse.getPathIterator(at);
    }

    /**
     * Obtiene un iterador de ruta para la elipse con la transformación y la
     * tolerancia especificadas.
     *
     * @param at La transformación afín a aplicar.
     * @param flatness La tolerancia para la aproximación de la ruta.
     * @return Un iterador de ruta para la elipse transformada.
     */
    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return elipse.getPathIterator(at, flatness);
    }
}

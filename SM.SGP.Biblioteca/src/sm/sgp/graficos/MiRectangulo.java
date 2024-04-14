package sm.sgp.graficos;

import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Clase que representa un rectángulo en el sistema de gráficos. Extiende la
 * clase AbstractShapeFilled y proporciona funcionalidades específicas para
 * rectángulos.
 */
public class MiRectangulo extends AbstractShapeFilled {

    private Rectangle2D.Float rectangulo;

    /**
     * Constructor por defecto de la clase MiRectangulo. Crea un nuevo
     * rectángulo vacío.
     */
    public MiRectangulo() {
        rectangulo = new Rectangle2D.Float();
    }

    /**
     * Constructor de la clase MiRectangulo que recibe dos puntos. Crea un nuevo
     * rectángulo con los puntos especificados como esquinas opuestas.
     *
     * @param p1 El primer punto del rectángulo.
     * @param p2 El segundo punto del rectángulo.
     */
    public MiRectangulo(Point2D p1, Point2D p2) {
        rectangulo = new Rectangle2D.Float();
        rectangulo.setFrameFromDiagonal(p1, p2);
    }

    /**
     * Establece el rectángulo a partir de dos puntos que representan las
     * esquinas opuestas.
     *
     * @param p1 El primer punto del rectángulo.
     * @param p2 El segundo punto del rectángulo.
     */
    public void setFrameFromDiagonal(Point2D p1, Point2D p2) {
        rectangulo.setFrameFromDiagonal(p1, p2);
    }

    /**
     * Obtiene la ubicación del rectángulo (esquina superior izquierda).
     *
     * @return La ubicación del rectángulo.
     */
    @Override
    public Point2D getLocation() {
        return new Point2D.Double(rectangulo.getX(), rectangulo.getY());
    }

    /**
     * Establece la ubicación del rectángulo (esquina superior izquierda).
     *
     * @param pos La nueva ubicación del rectángulo.
     */
    @Override
    public void setLocation(Point2D pos) {
        rectangulo.setFrame(pos.getX(), pos.getY(), rectangulo.getWidth(), rectangulo.getHeight());
    }

    // Métodos de la interfaz Shape
    /**
     * Obtiene los límites del rectángulo como un objeto Rectangle.
     *
     * @return Los límites del rectángulo.
     */
    @Override
    public Rectangle getBounds() {
        return rectangulo.getBounds();
    }

    /**
     * Obtiene los límites del rectángulo como un objeto Rectangle2D.
     *
     * @return Los límites del rectángulo.
     */
    @Override
    public Rectangle2D getBounds2D() {
        return rectangulo.getBounds2D();
    }

    /**
     * Verifica si el rectángulo contiene un punto específico.
     *
     * @param p El punto a verificar.
     * @return true si el rectángulo contiene el punto, false de lo contrario.
     */
    @Override
    public boolean contains(Point2D p) {
        return rectangulo.contains(p);
    }

    /**
     * Verifica si el rectángulo contiene completamente otro rectángulo.
     *
     * @param r El rectángulo a verificar.
     * @return true si el rectángulo contiene completamente el otro rectángulo,
     * false de lo contrario.
     */
    @Override
    public boolean contains(Rectangle2D r) {
        return rectangulo.contains(r);
    }

    /**
     * Verifica si el rectángulo contiene un punto especificado por sus
     * coordenadas.
     *
     * @param x La coordenada x del punto.
     * @param y La coordenada y del punto.
     * @return true si el rectángulo contiene el punto, false de lo contrario.
     */
    @Override
    public boolean contains(double x, double y) {
        return rectangulo.contains(x, y);
    }

    /**
     * Verifica si el rectángulo contiene completamente un rectángulo
     * especificado por sus coordenadas.
     *
     * @param x La coordenada x del rectángulo.
     * @param y La coordenada y del rectángulo.
     * @param w El ancho del rectángulo.
     * @param h La altura del rectángulo.
     * @return true si el rectángulo contiene completamente el otro rectángulo,
     * false de lo contrario.
     */
    @Override
    public boolean contains(double x, double y, double w, double h) {
        return rectangulo.contains(x, y, w, h);
    }

    /**
     * Verifica si el rectángulo intersecta con otro rectángulo.
     *
     * @param r El rectángulo a verificar.
     * @return true si el rectángulo intersecta con el otro rectángulo, false de
     * lo contrario.
     */
    @Override
    public boolean intersects(Rectangle2D r) {
        return rectangulo.intersects(r);
    }

    /**
     * Verifica si el rectángulo intersecta con un rectángulo especificado por
     * sus coordenadas.
     *
     * @param x La coordenada x del rectángulo.
     * @param y La coordenada y del rectángulo.
     * @param w El ancho del rectángulo.
     * @param h La altura del rectángulo.
     * @return true si el rectángulo intersecta con el otro rectángulo, false de
     * lo contrario.
     */
    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return rectangulo.intersects(x, y, w, h);
    }

    /**
     * Obtiene un iterador de ruta para el rectángulo con la transformación
     * especificada.
     *
     * @param at La transformación afín a aplicar.
     * @return Un iterador de ruta para el rectángulo transformado.
     */
    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return rectangulo.getPathIterator(at);
    }

    /**
     * Obtiene un iterador de ruta para el rectángulo con la transformación y la
     * tolerancia especificadas.
     *
     * @param at La transformación afín a aplicar.
     * @param flatness La tolerancia para la aproximación de la ruta.
     * @return Un iterador de ruta para el rectángulo transformado.
     */
    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return rectangulo.getPathIterator(at, flatness);
    }
}

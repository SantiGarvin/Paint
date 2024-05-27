package sm.sgp.graficos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Clase que representa un marcador de selección en forma de elipse. Esta clase
 * extiende la clase AbstractShape.
 */
public class MarcadorSeleccion extends AbstractShape {

    private static final int RADIO = 10;
    private static final Stroke STROKE = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, new float[]{5}, 0);
    private static final Color COLOR = Color.RED;

    MiElipse elipse;

    private Point2D ubicacion;

    /**
     * Constructor de la clase MarcadorSeleccion.
     *
     * @param ubicacion La ubicación inicial del marcador.
     */
    public MarcadorSeleccion(Point2D ubicacion) {
        this.ubicacion = ubicacion;
        this.color = COLOR;
        this.grosor = STROKE;
        this.elipse = new MiElipse(ubicacion.getX(), ubicacion.getY(), RADIO);
    }

    /**
     * Obtiene la ubicación del marcador.
     *
     * @return La ubicación del marcador.
     */
    @Override
    public Point2D getLocation() {
        return ubicacion;
    }

    /**
     * Establece la ubicación del marcador.
     *
     * @param pos La nueva ubicación del marcador.
     */
    @Override
    public void setLocation(Point2D pos) {
        ubicacion = pos;
    }

    /**
     * Dibuja el marcador en el contexto gráfico especificado.
     *
     * @param g2d El contexto gráfico en el que se dibujará el marcador.
     */
    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.setStroke(grosor);
        g2d.draw(new Ellipse2D.Double(ubicacion.getX() - RADIO, ubicacion.getY() - RADIO, RADIO * 2, RADIO * 2));
    }

    /**
     * Obtiene los límites del marcador como un rectángulo.
     *
     * @return Los límites del marcador como un rectángulo.
     */
    @Override
    public Rectangle getBounds() {
        return elipse.getBounds();
    }

    /**
     * Obtiene los límites del marcador como un rectángulo de precisión doble.
     *
     * @return Los límites del marcador como un rectángulo de precisión doble.
     */
    @Override
    public Rectangle2D getBounds2D() {
        return elipse.getBounds2D();
    }

    /**
     * Verifica si el marcador contiene el punto especificado.
     *
     * @param x La coordenada x del punto.
     * @param y La coordenada y del punto.
     * @return true si el marcador contiene el punto, false de lo contrario.
     */
    @Override
    public boolean contains(double x, double y) {
        return elipse.contains(x, y);
    }

    /**
     * Verifica si el marcador contiene el rectángulo especificado.
     *
     * @param x La coordenada x del rectángulo.
     * @param y La coordenada y del rectángulo.
     * @param w El ancho del rectángulo.
     * @param h La altura del rectángulo.
     * @return true si el marcador contiene el rectángulo, false de lo
     * contrario.
     */
    @Override
    public boolean contains(double x, double y, double w, double h) {
        return elipse.contains(x, y, w, h);
    }

    /**
     * Verifica si el marcador contiene el punto especificado.
     *
     * @param p El punto a verificar.
     * @return true si el marcador contiene el punto, false de lo contrario.
     */
    @Override
    public boolean contains(Point2D p) {
        return elipse.contains(p);
    }

    /**
     * Verifica si el marcador contiene el rectángulo especificado.
     *
     * @param r El rectángulo a verificar.
     * @return true si el marcador contiene el rectángulo, false de lo
     * contrario.
     */
    @Override
    public boolean contains(Rectangle2D r) {
        return elipse.contains(r);
    }

    /**
     * Verifica si el marcador intersecta con el rectángulo especificado.
     *
     * @param x La coordenada x del rectángulo.
     * @param y La coordenada y del rectángulo.
     * @param w El ancho del rectángulo.
     * @param h La altura del rectángulo.
     * @return true si el marcador intersecta con el rectángulo, false de lo
     * contrario.
     */
    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return elipse.intersects(x, y, w, h);
    }

    /**
     * Verifica si el marcador intersecta con el rectángulo especificado.
     *
     * @param r El rectángulo a verificar.
     * @return true si el marcador intersecta con el rectángulo, false de lo
     * contrario.
     */
    @Override
    public boolean intersects(Rectangle2D r) {
        return elipse.intersects(r);
    }

    /**
     * Obtiene un iterador de ruta para el marcador con la transformación
     * especificada.
     *
     * @param at La transformación afín a aplicar.
     * @return Un iterador de ruta para el marcador transformado.
     */
    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return elipse.getPathIterator(at);
    }

    /**
     * Obtiene un iterador de ruta para el marcador con la transformación y la
     * tolerancia especificadas.
     *
     * @param at La transformación afín a aplicar.
     * @param flatness La tolerancia para la aproximación de la ruta.
     * @return Un iterador de ruta para el marcador transformado.
     */
    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return elipse.getPathIterator(at, flatness);
    }
}

package sm.sgp.graficos;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Clase abstracta que representa una forma geométrica y proporciona
 * funcionalidades comunes.
 */
public abstract class AbstractShape implements Shape {

    protected Color color;
    protected Stroke grosor;

    protected boolean transparenciaActiva;
    protected boolean alisadoActivo;

    protected Composite transparencia;
    protected RenderingHints alisado;

    /**
     * Constructor de la clase AbstractShape. Inicializa los valores
     * predeterminados para las propiedades de la forma.
     */
    public AbstractShape() {
        color = Color.BLACK;
        grosor = new BasicStroke();
        transparenciaActiva = false;
        alisadoActivo = false;
        transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        alisado = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
    }

    /**
     *
     * Devuelve el tipo de figura basado en la instancia de la clase.
     *
     * @return El tipo de figura como una cadena de texto.
     */
    public String getTipoFigura() {
        if (this instanceof MiLinea) {
            return "Línea";
        } else if (this instanceof MiRectangulo) {
            return "Rectángulo";
        } else if (this instanceof MiElipse) {
            return "Elipse";
        } else if (this instanceof MiFantasma) {
            return "Fantasma";
        } else {
            return "Desconocido";
        }
    }

    /**
     * Obtiene el color de la forma.
     *
     * @return El color de la forma.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Establece el color de la forma.
     *
     * @param color El color a establecer.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Obtiene el grosor del trazo de la forma.
     *
     * @return El grosor del trazo de la forma.
     */
    public Stroke getGrosor() {
        return grosor;
    }

    /**
     * Establece el grosor del trazo de la forma.
     *
     * @param grosor El grosor del trazo a establecer.
     */
    public void setGrosor(Stroke grosor) {
        this.grosor = grosor;
    }

    /**
     * Verifica si la transparencia está activa en la forma.
     *
     * @return true si la transparencia está activa, false de lo contrario.
     */
    public boolean isTransparenciaActiva() {
        return transparenciaActiva;
    }

    /**
     * Establece el estado de la transparencia en la forma.
     *
     * @param t true para activar la transparencia, false para desactivarla.
     */
    public void setTransparenciaActiva(boolean t) {
        this.transparenciaActiva = t;
    }

    /**
     * Verifica si el alisado está activo en la forma.
     *
     * @return true si el alisado está activo, false de lo contrario.
     */
    public boolean isAlisadoActivo() {
        return alisadoActivo;
    }

    /**
     * Establece el estado del alisado en la forma.
     *
     * @param a true para activar el alisado, false para desactivarlo.
     */
    public void setAlisadoActivo(boolean a) {
        this.alisadoActivo = a;
    }

    /**
     * Actualiza las propiedades de transparencia y alisado de la forma.
     */
    protected void update() {
        if (transparenciaActiva) {
            transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
        } else {
            transparencia = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        }

        if (alisadoActivo) {
            alisado = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        } else {
            alisado = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        }
    }

    /**
     * Dibuja la forma en el contexto gráfico especificado.
     *
     * @param g2d El contexto gráfico en el que se dibujará la forma.
     */
    public void draw(Graphics2D g2d) {
        this.update();

        g2d.setRenderingHints(alisado);
        g2d.setComposite(transparencia);
        g2d.setColor(color);
        g2d.setStroke(grosor);

        g2d.draw(this);
    }

    /**
     * Obtiene la ubicación de la forma.
     *
     * @return La ubicación de la forma.
     */
    public abstract Point2D getLocation();

    /**
     * Establece la ubicación de la forma.
     *
     * @param pos La nueva ubicación de la forma.
     */
    public abstract void setLocation(Point2D pos);

    // Métodos de la interfaz Shape
    /**
     * Obtiene los límites de la forma como un rectángulo.
     *
     * @return Los límites de la forma como un rectángulo.
     */
    @Override
    public abstract Rectangle getBounds();

    /**
     * Obtiene los límites de la forma como un rectángulo de precisión doble.
     *
     * @return Los límites de la forma como un rectángulo de precisión doble.
     */
    @Override
    public abstract Rectangle2D getBounds2D();

    /**
     * Verifica si la forma contiene el punto especificado.
     *
     * @param x La coordenada x del punto.
     * @param y La coordenada y del punto.
     * @return true si la forma contiene el punto, false de lo contrario.
     */
    @Override
    public abstract boolean contains(double x, double y);

    /**
     * Verifica si la forma contiene el rectángulo especificado.
     *
     * @param x La coordenada x del rectángulo.
     * @param y La coordenada y del rectángulo.
     * @param w El ancho del rectángulo.
     * @param h La altura del rectángulo.
     * @return true si la forma contiene el rectángulo, false de lo contrario.
     */
    @Override
    public abstract boolean contains(double x, double y, double w, double h);

    /**
     * Verifica si la forma contiene el punto especificado.
     *
     * @param p El punto a verificar.
     * @return true si la forma contiene el punto, false de lo contrario.
     */
    @Override
    public abstract boolean contains(Point2D p);

    /**
     * Verifica si la forma contiene el rectángulo especificado.
     *
     * @param r El rectángulo a verificar.
     * @return true si la forma contiene el rectángulo, false de lo contrario.
     */
    @Override
    public abstract boolean contains(Rectangle2D r);

    /**
     * Verifica si la forma intersecta con el rectángulo especificado.
     *
     * @param x La coordenada x del rectángulo.
     * @param y La coordenada y del rectángulo.
     * @param w El ancho del rectángulo.
     * @param h La altura del rectángulo.
     * @return true si la forma intersecta con el rectángulo, false de lo
     * contrario.
     */
    @Override
    public abstract boolean intersects(double x, double y, double w, double h);

    /**
     * Verifica si la forma intersecta con el rectángulo especificado.
     *
     * @param r El rectángulo a verificar.
     * @return true si la forma intersecta con el rectángulo, false de lo
     * contrario.
     */
    @Override
    public abstract boolean intersects(Rectangle2D r);

    /**
     * Obtiene un iterador de ruta para la forma con la transformación
     * especificada.
     *
     * @param at La transformación afín a aplicar.
     * @return Un iterador de ruta para la forma transformada.
     */
    @Override
    public abstract PathIterator getPathIterator(AffineTransform at);

    /**
     * Obtiene un iterador de ruta para la forma con la transformación y la
     * tolerancia especificadas.
     *
     * @param at La transformación afín a aplicar.
     * @param flatness La tolerancia para la aproximación de la ruta.
     * @return Un iterador de ruta para la forma transformada.
     */
    @Override
    public abstract PathIterator getPathIterator(AffineTransform at, double flatness);
}

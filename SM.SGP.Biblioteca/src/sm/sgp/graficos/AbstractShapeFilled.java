package sm.sgp.graficos;

import java.awt.Graphics2D;

/**
 * Clase abstracta que representa una forma geométrica con la opción de relleno.
 * Extiende la clase AbstractShape y agrega la funcionalidad de relleno.
 */
public abstract class AbstractShapeFilled extends AbstractShape {

    protected boolean relleno;

    /**
     * Constructor de la clase AbstractShapeFilled. Inicializa el valor
     * predeterminado para la propiedad de relleno.
     */
    public AbstractShapeFilled() {
        super();
        relleno = false;
    }

    /**
     * Verifica si la forma está rellena.
     *
     * @return true si la forma está rellena, false de lo contrario.
     */
    public boolean isRelleno() {
        return relleno;
    }

    /**
     * Establece el estado de relleno de la forma.
     *
     * @param relleno true para rellenar la forma, false para no rellenarla.
     */
    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    /**
     * Dibuja la forma en el contexto gráfico especificado. Si la forma está
     * configurada para ser rellenada, se rellena la forma antes de dibujar el
     * contorno.
     *
     * @param g2d El contexto gráfico en el que se dibujará la forma.
     */
    @Override
    public void draw(Graphics2D g2d) {
        super.update();

        g2d.setColor(color);
        g2d.setStroke(grosor);
        g2d.setRenderingHints(alisado);
        g2d.setComposite(transparencia);

        if (relleno) {
            g2d.fill(this);
        }

        g2d.draw(this);
    }
}

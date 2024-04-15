package sm.sgp.graficos;

import java.awt.*;
import java.awt.geom.*;

/**
 * Clase que representa un fantasma en el sistema de gráficos. Extiende la clase
 * AbstractShapeFilled y proporciona funcionalidades específicas para fantasmas.
 */
public class MiFantasma extends AbstractShapeFilled {

    private Area fantasma;
    private Point2D posicion;
    private double alto = 45;
    private double ancho = 40;

    /**
     * Constructor de la clase MiFantasma. Crea un nuevo fantasma en la posición
     * especificada.
     *
     * @param posicion La posición inicial del fantasma.
     */
    public MiFantasma(Point2D posicion) {
        this.posicion = posicion;
        this.fantasma = createFantasma();
    }

    /**
     * Crea el área del fantasma con su forma característica.
     *
     * @return El área del fantasma.
     */
    private Area createFantasma() {
        Area areaFantasma = new Area();

        // Semicircunferencia superior (más alta)
        double altoCabeza = alto * 0.7;
        Ellipse2D.Double semicirculo = new Ellipse2D.Double(posicion.getX(), posicion.getY(), ancho, altoCabeza);
        areaFantasma.add(new Area(semicirculo));

        // Cuerpo
        double parteSuperiorCuerpo = posicion.getY() + altoCabeza / 2;
        double parteInferiorCuerpo = posicion.getY() + alto;

        // Picos inferiores
        int numeroPicos = 5;
        double alturaPico = (alto - altoCabeza) / 3;
        double anchoPico = ancho / numeroPicos;
        GeneralPath picos = new GeneralPath();
        picos.moveTo(posicion.getX(), parteSuperiorCuerpo);
        for (int i = 0; i < numeroPicos; i++) {
            picos.lineTo(posicion.getX() + i * anchoPico, parteInferiorCuerpo);
            picos.lineTo(posicion.getX() + (i + 0.5) * anchoPico, parteInferiorCuerpo - alturaPico);
            picos.lineTo(posicion.getX() + (i + 1) * anchoPico, parteInferiorCuerpo);
        }
        picos.lineTo(posicion.getX() + ancho, parteSuperiorCuerpo);
        picos.closePath();

        // Agregar los picos al área del fantasma
        areaFantasma.add(new Area(picos));

        // Ojos
        double tamanoOjo = ancho / 5;
        double alturaOjo = posicion.getY() + altoCabeza / 2;
        double espacioEntreOjos = ancho / 8; // Ajusta este valor para cambiar la separación entre los ojos
        Ellipse2D.Double ojoIzquierdo = new Ellipse2D.Double(posicion.getX() + ancho / 2 - tamanoOjo - espacioEntreOjos, alturaOjo, tamanoOjo, tamanoOjo);
        Ellipse2D.Double ojoDerecho = new Ellipse2D.Double(posicion.getX() + ancho / 2 + espacioEntreOjos, alturaOjo, tamanoOjo, tamanoOjo);
        areaFantasma.subtract(new Area(ojoIzquierdo));
        areaFantasma.subtract(new Area(ojoDerecho));

        return areaFantasma;
    }

    /**
     * Obtiene la ubicación del fantasma.
     *
     * @return La ubicación del fantasma.
     */
    @Override
    public Point2D getLocation() {
        return posicion;
    }

    /**
     * Establece la ubicación del fantasma.
     *
     * @param pos La nueva ubicación del fantasma.
     */
    @Override
    public void setLocation(Point2D pos) {
        double dx = pos.getX() - posicion.getX();
        double dy = pos.getY() - posicion.getY();
        posicion = pos;
        fantasma.transform(AffineTransform.getTranslateInstance(dx, dy));
    }

    /**
     * Obtiene los límites del fantasma como un objeto Rectangle.
     *
     * @return Los límites del fantasma.
     */
    @Override
    public Rectangle getBounds() {
        return fantasma.getBounds();
    }

    /**
     * Obtiene los límites del fantasma como un objeto Rectangle2D.
     *
     * @return Los límites del fantasma.
     */
    @Override
    public Rectangle2D getBounds2D() {
        return fantasma.getBounds2D();
    }

    /**
     * Verifica si el fantasma contiene un punto especificado por sus
     * coordenadas.
     *
     * @param x La coordenada x del punto.
     * @param y La coordenada y del punto.
     * @return true si el fantasma contiene el punto, false de lo contrario.
     */
    @Override
    public boolean contains(double x, double y) {
        return fantasma.contains(x, y);
    }

    /**
     * Verifica si el fantasma contiene un punto específico.
     *
     * @param p El punto a verificar.
     * @return true si el fantasma contiene el punto, false de lo contrario.
     */
    @Override
    public boolean contains(Point2D p) {
        return fantasma.contains(p);
    }

    /**
     * Verifica si el fantasma intersecta con un rectángulo especificado por sus
     * coordenadas.
     *
     * @param x La coordenada x del rectángulo.
     * @param y La coordenada y del rectángulo.
     * @param w El ancho del rectángulo.
     * @param h La altura del rectángulo.
     * @return true si el fantasma intersecta con el rectángulo, false de lo
     * contrario.
     */
    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return fantasma.intersects(x, y, w, h);
    }

    /**
     * Verifica si el fantasma intersecta con un rectángulo.
     *
     * @param r El rectángulo a verificar.
     * @return true si el fantasma intersecta con el rectángulo, false de lo
     * contrario.
     */
    @Override
    public boolean intersects(Rectangle2D r) {
        return fantasma.intersects(r);
    }

    /**
     * Verifica si el fantasma contiene completamente un rectángulo especificado
     * por sus coordenadas.
     *
     * @param x La coordenada x del rectángulo.
     * @param y La coordenada y del rectángulo.
     * @param w El ancho del rectángulo.
     * @param h La altura del rectángulo.
     * @return true si el fantasma contiene completamente el rectángulo, false
     * de lo contrario.
     */
    @Override
    public boolean contains(double x, double y, double w, double h) {
        return fantasma.contains(x, y, w, h);
    }

    /**
     * Verifica si el fantasma contiene completamente un rectángulo.
     *
     * @param r El rectángulo a verificar.
     * @return true si el fantasma contiene completamente el rectángulo, false
     * de lo contrario.
     */
    @Override
    public boolean contains(Rectangle2D r) {
        return fantasma.contains(r);
    }

    /**
     * Obtiene un iterador de ruta para el fantasma con la transformación
     * especificada.
     *
     * @param at La transformación afín a aplicar.
     * @return Un iterador de ruta para el fantasma transformado.
     */
    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return fantasma.getPathIterator(at);
    }

    /**
     * Obtiene un iterador de ruta para el fantasma con la transformación y la
     * tolerancia especificadas.
     *
     * @param at La transformación afín a aplicar.
     * @param flatness La tolerancia para la aproximación de la ruta.
     * @return Un iterador de ruta para el fantasma transformado.
     */
    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return fantasma.getPathIterator(at, flatness);
    }
}

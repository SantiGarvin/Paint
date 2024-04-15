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

public class MarcadorSeleccion extends AbstractShape {

    private static final int RADIO = 10;
    private static final Stroke STROKE = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, new float[]{5}, 0);
    private static final Color COLOR = Color.RED;

    MiElipse elipse;

    private Point2D ubicacion;

    public MarcadorSeleccion(Point2D ubicacion) {
        this.ubicacion = ubicacion;
        this.color = COLOR;
        this.grosor = STROKE;
        this.elipse = new MiElipse(ubicacion.getX(), ubicacion.getY(), RADIO);
    }

    @Override
    public Point2D getLocation() {
        return ubicacion;
    }

    @Override
    public void setLocation(Point2D pos) {
        ubicacion = pos;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.setStroke(grosor);
        g2d.draw(new Ellipse2D.Double(ubicacion.getX() - RADIO, ubicacion.getY() - RADIO, RADIO * 2, RADIO * 2));
    }

    @Override
    public Rectangle getBounds() {
        return elipse.getBounds();
    }

    @Override
    public Rectangle2D getBounds2D() {
        return elipse.getBounds2D();
    }

    @Override
    public boolean contains(double x, double y) {
        return elipse.contains(x, y);
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return elipse.contains(x, y, w, h);
    }

    @Override
    public boolean contains(Point2D p) {
        return elipse.contains(p);
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return elipse.contains(r);
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return elipse.intersects(x, y, w, h);
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return elipse.intersects(r);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return elipse.getPathIterator(at);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return elipse.getPathIterator(at, flatness);
    }
}

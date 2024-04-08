package sm.sgp.graficos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class MiLinea extends Line2D.Float implements MiShape {

    private Color color;
    private float grosor;
    private boolean relleno;

    public MiLinea(Point2D p1, Point2D p2) {
        super(p1, p2);
    }

    public boolean isNear(Point2D p) {
        if (getP1().equals(getP2())) {
            return getP1().distance(p) <= 2.0; //p1=p2
        }
        return ptLineDist(p) <= 2.0; // p1!=p2
    }

    @Override
    public boolean contains(Point2D p) {
        return isNear(p);
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(grosor));
        g2d.draw(this);
    }

    @Override
    public Point2D getLocation() {
        return getP1();
    }

    @Override
    public void setLocation(Point2D pos) {
        double dx = pos.getX() - getX1();
        double dy = pos.getY() - getY1();
        Point2D newp2 = new Point2D.Double(getX2() + dx, getY2() + dy);
        setLine(pos, newp2);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getGrosor() {
        return grosor;
    }

    public void setGrosor(float grosor) {
        this.grosor = grosor;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
}

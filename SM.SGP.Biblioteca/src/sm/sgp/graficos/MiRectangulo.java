package sm.sgp.graficos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class MiRectangulo extends Rectangle2D.Float implements MiShape {
    private Color color;
    private float grosor;
    private boolean relleno;

    public MiRectangulo() {
        super();
    }

    public MiRectangulo(Point2D p1, Point2D p2) {
        super();
        this.setFrameFromDiagonal(p1, p2);
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(grosor));
        if (relleno) {
            g2d.fill(this);
        } else {
            g2d.draw(this);
        }
    }

    @Override
    public Point2D getLocation() {
        return new Point2D.Double(this.getX(), this.getY());
    }

    @Override
    public void setLocation(Point2D pos) {
        this.setFrame(pos.getX(), pos.getY(), this.getWidth(), this.getHeight());
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
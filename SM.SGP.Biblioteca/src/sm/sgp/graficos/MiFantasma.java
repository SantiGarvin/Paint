package sm.sgp.graficos;

import java.awt.*;
import java.awt.geom.*;

public class MiFantasma extends AbstractShape {

    private Area fantasma;
    private Point2D posicion;
    private double alto = 50;
    private double ancho = 60;

    public MiFantasma(Point2D posicion) {
        this.posicion = posicion;
        this.fantasma = createFantasma();
    }

    private Area createFantasma() {
        Area fantasmaArea = new Area();

        // Semicircunferencia superior
        Ellipse2D.Double semicircle = new Ellipse2D.Double(posicion.getX(), posicion.getY(), ancho, alto / 2);
        fantasmaArea.add(new Area(semicircle));

        // Rectángulo del cuerpo
        Rectangle2D.Double body = new Rectangle2D.Double(posicion.getX(), posicion.getY() + alto / 4, ancho, alto * 3 / 4);
        fantasmaArea.add(new Area(body));

        // Ojos
        double eyeSize = ancho / 5;
        double eyeY = posicion.getY() + alto / 6;
        Ellipse2D.Double leftEye = new Ellipse2D.Double(posicion.getX() + ancho / 4 - eyeSize / 2, eyeY, eyeSize, eyeSize);
        Ellipse2D.Double rightEye = new Ellipse2D.Double(posicion.getX() + ancho * 3 / 4 - eyeSize / 2, eyeY, eyeSize, eyeSize);
        fantasmaArea.subtract(new Area(leftEye));
        fantasmaArea.subtract(new Area(rightEye));

        // Picos inferiores
        double peakHeight = alto / 8;
        double peakWidth = ancho / 6;
        GeneralPath peaksPath = new GeneralPath();
        peaksPath.moveTo(posicion.getX(), posicion.getY() + alto);

        for (int i = 0; i < 6; i++) {
            peaksPath.lineTo(posicion.getX() + i * peakWidth, posicion.getY() + alto - peakHeight);
            peaksPath.lineTo(posicion.getX() + (i + 0.5) * peakWidth, posicion.getY() + alto);
        }

        peaksPath.lineTo(posicion.getX() + ancho, posicion.getY() + alto);
        peaksPath.closePath(); // Asegúrate de cerrar el camino

        fantasmaArea.add(new Area(peaksPath));

        return fantasmaArea;
    }

    @Override
    public Point2D getLocation() {
        return posicion;
    }

    @Override
    public void setLocation(Point2D pos) {
        double dx = pos.getX() - posicion.getX();
        double dy = pos.getY() - posicion.getY();
        posicion = pos;
        fantasma.transform(AffineTransform.getTranslateInstance(dx, dy));
    }

    @Override
    public Rectangle getBounds() {
        return fantasma.getBounds();
    }

    @Override
    public Rectangle2D getBounds2D() {
        return fantasma.getBounds2D();
    }

    @Override
    public boolean contains(double x, double y) {
        return fantasma.contains(x, y);
    }

    @Override
    public boolean contains(Point2D p) {
        return fantasma.contains(p);
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return fantasma.intersects(x, y, w, h);
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return fantasma.intersects(r);
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return fantasma.contains(x, y, w, h);
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return fantasma.contains(r);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return fantasma.getPathIterator(at);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return fantasma.getPathIterator(at, flatness);
    }
}

//    private Area createFantasmaShape() {
//        Area fantasmaArea = new Area();
//
//        // Semicircunferencia superior
//        Ellipse2D.Double semicircle = new Ellipse2D.Double(location.getX(), location.getY(), width, height / 2);
//        fantasmaArea.add(new Area(semicircle));
//
//        // Rectángulo del cuerpo
//        Rectangle2D.Double body = new Rectangle2D.Double(location.getX(), location.getY() + height / 4, width, height * 3 / 4);
//        fantasmaArea.add(new Area(body));
//
//        // Ojos
//        double eyeSize = width / 5;
//        double eyeY = location.getY() + height / 6;
//        Ellipse2D.Double leftEye = new Ellipse2D.Double(location.getX() + width / 4 - eyeSize / 2, eyeY, eyeSize, eyeSize);
//        Ellipse2D.Double rightEye = new Ellipse2D.Double(location.getX() + width * 3 / 4 - eyeSize / 2, eyeY, eyeSize, eyeSize);
//        fantasmaArea.subtract(new Area(leftEye));
//        fantasmaArea.subtract(new Area(rightEye));
//
//        // Picos inferiores
//        double peakHeight = height / 8;
//        double peakWidth = width / 6;
//        GeneralPath peaksPath = new GeneralPath();
//        peaksPath.moveTo(location.getX(), location.getY() + height);
//        for (int i = 0; i < 6; i++) {
//            peaksPath.lineTo(location.getX() + i * peakWidth, location.getY() + height - peakHeight);
//            peaksPath.lineTo(location.getX() + (i + 0.5) * peakWidth, location.getY() + height);
//        }
//        peaksPath.lineTo(location.getX() + width, location.getY() + height);
//        peaksPath.closePath();
//        fantasmaArea.add(new Area(peaksPath));
//
//        return fantasmaArea;
//    }

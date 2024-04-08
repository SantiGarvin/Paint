package sm.sgp.graficos;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;

public interface MiShape {

    void draw(Graphics2D g2d);

    Point2D getLocation();

    void setLocation(Point2D pos);
}

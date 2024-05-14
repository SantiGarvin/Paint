package sm.sgp.imagen;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import sm.image.BufferedImageOpAdapter;

public class RojoOp extends BufferedImageOpAdapter {

    private int umbral;

    public RojoOp(int umbral) {
        this.umbral = umbral;
    }

    public BufferedImage filter(BufferedImage src, BufferedImage dest) {
        if (src == null) {
            throw new NullPointerException("src image is null");
        }
        if (dest == null) {
            dest = createCompatibleDestImage(src, null);
        }
        WritableRaster srcRaster = src.getRaster();
        WritableRaster destRaster = dest.getRaster();
        int[] pixelComp = new int[srcRaster.getNumBands()];
        int[] pixelCompDest = new int[srcRaster.getNumBands()];

        for (int x = 0; x < src.getWidth(); x++) {
            for (int y = 0; y < src.getHeight(); y++) {
                srcRaster.getPixel(x, y, pixelComp);
                int red = pixelComp[0];
                int green = pixelComp[1];
                int blue = pixelComp[2];

                if (red - green - blue >= umbral) {
                    // Mantener el color original si el píxel es predominantemente rojo
                    pixelCompDest[0] = red;   // Componente rojo
                    pixelCompDest[1] = green; // Componente verde
                    pixelCompDest[2] = blue;  // Componente azul
                } else {
                    // Convertir el píxel a escala de grises si no es predominantemente rojo
                    int gris = (red + green + blue) / 3;
                    pixelCompDest[0] = gris;   // Componente rojo
                    pixelCompDest[1] = gris;   // Componente verde
                    pixelCompDest[2] = gris;   // Componente azul
                }
                destRaster.setPixel(x, y, pixelCompDest);
            }
        }
        return dest;
    }
}

package sm.sgp.imagen;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import sm.image.BufferedImageOpAdapter;

public class PosterizarOp extends BufferedImageOpAdapter {

    private final int niveles;

    public PosterizarOp(int niveles) {
        this.niveles = niveles;
    }

    @Override
    public BufferedImage filter(BufferedImage src, BufferedImage dest) {
        if (src == null) {
            throw new NullPointerException("src image is null");
        }
        if (dest == null) {
            dest = createCompatibleDestImage(src, null);
        }
        WritableRaster srcRaster = src.getRaster();
        WritableRaster destRaster = dest.getRaster();
        int sample;

        float K = 256.0f / niveles;
        for (int x = 0; x < src.getWidth(); x++) {
            for (int y = 0; y < src.getHeight(); y++) {
                for (int band = 0; band < srcRaster.getNumBands(); band++) {
                    sample = srcRaster.getSample(x, y, band);
                    int posterizado = (int) K * (int) (sample / K);
                    destRaster.setSample(x, y, band, posterizado);
                }
            }
        }
        return dest;
    }

}

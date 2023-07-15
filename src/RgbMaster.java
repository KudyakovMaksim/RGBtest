


import java.awt.image.BufferedImage;

public class RgbMaster {
    BufferedImage image;
    private final int width;
    private final int height;
    private boolean hesAlphaChannel;
    private final int[]pixels;
    public RgbMaster(BufferedImage image){
        this.image = image;
        width=image.getWidth();
        height=image.getHeight();
        hesAlphaChannel = image.getAlphaRaster()!=null;
        pixels = image.getRGB(0,0,width,height, null,0, width);

    }
    public BufferedImage getImage(){

        return image;
    }
  public   void changeImage(ImageOperation operation) throws Exception {
        for (int i = 0; i < pixels.length; i++) {
            float[] pixel = ImageUtils.rbgIntToArray(pixels[i]);
            float[]newPixel = operation.execute(pixel);
            pixels[i]=ImageUtils.arrayToRgbInt(newPixel);
        }
      image.setRGB(0,0,width,height,pixels,0,width);
    }

}

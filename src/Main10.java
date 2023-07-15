
import java.awt.image.BufferedImage;

public class Main10 {
    public static void main(String[] args) throws Exception {
       final BufferedImage image =  ImageUtils.getImage("C:\\Users\\79104\\IdeaProjects\\untitled\\.idea\\Images/1.png");
       final RgbMaster rgbMaster = new RgbMaster(image);
       rgbMaster.changeImage(FilterOperation::onlyBlue);
       ImageUtils.saveImage(image,"C:\\Users\\79104\\IdeaProjects\\untitled\\.idea\\Images/cloned_1.png");

    }
}

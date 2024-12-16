import java.awt.Color;

public class Editor4 {
    public static void main(String[] args) {
        String fileName = args[0];
        int n = Integer.parseInt(args[1]);
        Color[][] sourceImage = Runigram.read(fileName);
        Color[][] targetImage = Runigram.read(fileName);
        Runigram.setCanvas(sourceImage);
        targetImage = Runigram.grayScaled(targetImage);
        Runigram.morph(sourceImage, targetImage, n);
    }
}

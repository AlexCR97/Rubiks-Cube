package org.yourorghere.render;

import com.sun.opengl.util.texture.Texture;
import com.sun.opengl.util.texture.TextureIO;
import java.io.File;
import java.io.IOException;
import javax.media.opengl.GLException;

public class TextureManager {
    
    public static final String IMAGE_STICKER_RED = "res\\red.png";
    public static final String IMAGE_STICKER_GREEN = "res\\green.png";
    public static final String IMAGE_STICKER_BLUE = "res\\blue.png";
    public static final String IMAGE_STICKER_WHITE = "res\\white.png";
    public static final String IMAGE_STICKER_YELLOW = "res\\yellow.png";
    public static final String IMAGE_STICKER_ORANGE = "res\\orange.png";
    public static final String IMAGE_DUCK = "res\\duck.png";
    public static final String IMAGE_ASH = "res\\ash.jpg";
    public static final String IMAGE_ZSS = "res\\zss.png";
    public static final String IMAGE_PIKA = "res\\pika.png";
    
    public static Texture getTexture(String imagePath) {
        File image = new File(imagePath);
        try {
            return TextureIO.newTexture(image, true);
        } catch (IOException ex) {
            System.out.println(ex);
            return null;
        } catch (GLException ex) {
            System.out.println(ex);
            return null;
        }
    }
}

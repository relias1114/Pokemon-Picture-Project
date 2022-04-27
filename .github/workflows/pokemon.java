import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;

public class testPokemon extends FlexiblePictureExplorer implements ImageObserver{
	public testPokemon(Picture picture) {
		super(picture);
		displayImage(new Picture());
	}
	
	public void mouseClickedAction(DigitalPicture pict, Pixel pix) {
		
	}
	
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5) {
		return false;
	}
	
	public static void main(String[] args) {
		testPokemon pokemon = new testPokemon(new Picture());
	}
	
	public void displayImage(Picture picture) {
		picture = new Picture("PokrmonPics\\Fireball (1).png");
		Picture picture1 = new Picture("PokrmonPics\\charmander.png").scale(.25, .25);
		Picture picture2 = new Picture("PokrmonPics\\squirtle.png").scale(.25, .25);
		Graphics2D graphics = picture.createGraphics();
		graphics.drawImage(picture1.getBufferedImage(), 0, 0, this);
		graphics.drawImage(picture2.getBufferedImage(), 20, 20, this);
		setImage(picture);
	}
}

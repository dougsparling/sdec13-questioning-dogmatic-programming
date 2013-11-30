package errors;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import javax.imageio.ImageIO;

public class Errors {
	
	public class ImageKeyNotFoundException extends RuntimeException {

		public ImageKeyNotFoundException() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ImageKeyNotFoundException(String arg0, Throwable arg1) {
			super(arg0, arg1);
			// TODO Auto-generated constructor stub
		}

		public ImageKeyNotFoundException(String arg0) {
			super(arg0);
			// TODO Auto-generated constructor stub
		}

		public ImageKeyNotFoundException(Throwable arg0) {
			super(arg0);
			// TODO Auto-generated constructor stub
		}

		

	}

	Map<String, File> imagesMap = create();
	
	public void errors() {
		
		File imageFile = getImageFile("expectedImage");
		Image image = ImageUtil.read(imageFile);
		
		// do something with image
		
		image.getGraphics();
	}
	
	public File getImageFile(String imageKey) {
		if (imagesMap.get(imageKey) == null) {
			throw new ImageKeyNotFoundException("image key not found: " + imageKey);
		}
		
		return imagesMap.get(imageKey);
	}

	private Map<String, File> create() {
		// TODO Auto-generated method stub
		return null;
	}
	
	static class ImageUtil {
		static BufferedImage read(File imageFile) {
			try {
				return ImageIO.read(imageFile);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}

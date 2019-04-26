package colorsRGB;

public class ColorRGBException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ColorRGBException() {
		super("Error");
	}
	public ColorRGBException(String e) {
		System.out.println(e);
	}
}

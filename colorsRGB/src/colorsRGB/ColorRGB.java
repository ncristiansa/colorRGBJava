package colorsRGB;

public class ColorRGB {
	private int r;
	private int g;
	private int b;
	
	public ColorRGB(int r, int g, int b) {
		super();
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public void setR(int r) {
		this.r = r;
	}
	public void setG(int g) {
		this.g = g;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	public int getR() {
		return r;
	}
	public int getG() {
		return g;
	}
	public int getB() {
		return b;
	}
	
	public int[] obtenerColor() {
		int array[] = {this.r, this.g, this.b};
		return  array;
	}
	
	

}

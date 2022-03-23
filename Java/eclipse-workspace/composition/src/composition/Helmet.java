package composition;

public class Helmet {
	private double size;
	private String color;
	
	//constsructors
	public Helmet(double size, String color)
	{
		this.setSize(size);
		this.color = color;
	}
	
	public double getSize() {
		return size;
		
	}
	
	public void setSize(double size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		
	}
}

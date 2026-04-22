
public class Rectangle extends Shape implements Drawable {
	
	private double height;
	private double width;
	
	public Rectangle(String string, double value,double value2) {
		super();
	}
	
	public Rectangle(double height, double width,String color) {
		super(color);
		this.height = height;
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	@Override
	public String howToDraw() {
		
	return "Draw a square with side " + width+height;

	}
	@Override
	public double getArea() {
		return width*height;
	}
	
	@Override
	
	public double getPerimeter() {
		return 2*(width+height);
	}

    @Override
    public String toString() {
        return super.toString() + "\n Width" + width+"Height"+height;
    }

}

public class Cube extends ThreeDShape implements Drawable {
    private double side;

    public Cube() {
        super();
        this.side = 0;
    }

    public Cube(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getPerimeter() {
    	
        return 12*side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }

    @Override
    public String howToDraw() {
        return "Draw a square with side " + side;
    }

    @Override
    public String toString() {
        return super.toString() + "\nside: " + side;
    }
}

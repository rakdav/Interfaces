public class Rectangle  extends Figure{
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimetr() {
        return 2*(width+height);
    }

    @Override
    public double getArea() {
        return width*height;
    }
}

public class Circle extends Figure
{
    private double R;

    public Circle(double x, double y, double r) {
        super(x, y);
        R = r;
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*R;
    }

    @Override
    public double getArea() {
        return Math.PI*R*R;
    }
}

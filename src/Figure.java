public abstract class Figure {
    private double x,y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public abstract double getPerimetr();
    public abstract double getArea();
}

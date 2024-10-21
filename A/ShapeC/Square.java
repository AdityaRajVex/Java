package H.A.ShapeC;

public class Square extends GeometricShape {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Getter
    public double getSide() {
        return side;
    }

    // Setter
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
package day9.Task2;

public class Triangle extends Figure {

    private double sideOne, sideTwo, sideThree;

    public Triangle(String color, double sideOne, double sideTwo, double sideThree) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public double area() {
        double halfPerimeter = perimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideOne) * (halfPerimeter - sideTwo) * (halfPerimeter - sideThree));
    }

    @Override
    public double perimeter() {
        return sideOne + sideTwo + sideThree;
    }
}

package ru.mirea.task3.exs1;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getType() {
        return "square";
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
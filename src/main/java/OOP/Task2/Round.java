 package OOP.Task2;

import OOP.Task2.Shape;

abstract class Round implements Shape {
    private final double radius;
    final double pi = Math.PI;
    double s;

    public Round() {
        this(1);
    }

    public Round (double radius)

    {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        // S = π r^2
        return pi * Math.pow(radius, 2);
    }

}
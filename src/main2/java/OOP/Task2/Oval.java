 package OOP.Task2;

public class Oval extends Round {
    double x;
    double y;
    double width;
    double height;

    public void setValues (double x, double y, double width, double height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSquare() {
        // S = \pi a b
        s = pi * x * y;

        return  s;

    }
}

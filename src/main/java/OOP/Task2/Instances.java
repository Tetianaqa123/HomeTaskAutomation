package OOP.Task2;

public class Instances {
    public static void main(String[] args)
    {
        // Rectangle1 test
        Rectangle1 rect = new Rectangle1();

        rect.setValues(78, 5);

        System.out.println("Area of rectangle : " + rect.getSquare());

        // Circle test
       // double radius = 5;
        Circle c = new Circle();
        System.out.println("Area of circle: " + c.getSquare());

       // Oval test
        Oval o = new Oval();
        o.setValues(6,4, 6,8);
        System.out.println("Area of oval : " + o.getSquare());

        // Square test
        Square sq = new Square();
        System.out.println("Area of Square is: "+ sq.getSquare());

    }
}

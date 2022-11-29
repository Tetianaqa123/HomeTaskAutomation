 package OOP.Task2;

 public class Circle extends Round {
     private final double radius;
     final double pi = Math.PI;

     public Circle() {
         this(1);
     }
     public Circle(double radius) {
         this.radius = radius;
     }
}

package OOP.Task2;

 public class Square extends Rectangle {
     private double a;

     public Square(){
         a = 6.0;
     }

     public Square(double inLength){
         a = inLength;
     }

     public void setLength(double inLength){
         a = inLength;
     }

     public double getLength(){
         return a;
     }
     @Override
     public double getSquare(){
         return a*a;
     }


}

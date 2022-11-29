/* 3. 	What's wrong with the following program? Fix the program called SomethingIsWrong.
public class SomethingIsWrong {
    public static void main(String[] args) {
        OOP.Task2.Shape.Rectangle myRect;
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }
}
 Answer. An instance of OOP.Task2.Shape.Rectangle is not created with new and the object reference is not assigned to myRect so the compiler will generate an error. If myRect was initialised to null the program would compile but generate a NullPointerException at runtime.



public class SomethingIsWrong {
    public static void main(String[] args) {
        OOP.Task2.Shape.Rectangle myRect = new Rectange();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's" + myRect.area());
    }
}  */

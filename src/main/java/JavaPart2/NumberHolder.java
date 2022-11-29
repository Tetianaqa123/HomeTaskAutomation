package JavaPart2;/* 4.	Given the following class, called JavaPart2.NumberHolder, write some code that creates an instance of the class, initializes its two member variables, and then displays the value of each member variable.

public class JavaPart2.NumberHolder {
    public int anInt;
    public float aFloat;
}

Answer */

public class NumberHolder {
    public int anInt;
    public float aFloat;

    public NumberHolder(int anInt, float aFloat) {
        this.anInt = anInt;
        this.aFloat = aFloat;
    }
    public static void main(String[] args) {
        NumberHolder newNumber = new NumberHolder(12, 24F);
    }
}

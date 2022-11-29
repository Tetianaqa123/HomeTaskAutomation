package JavaPart2;/* 2.	Design such Java class with name JavaPart2.Computer and such properties as:
        -	Brand
        -	Screen size
        -	Number of cores
        -	Type (laptop,desktop,etc.)
        •	Make `Brand` and `Screen size` properties required in order to create an object(instance).
        •	Create two auxiliary object of JavaPart2.Computer class. */

public class Computer {
    // Instance Variables
    private String brand;
    private String screensize;
    private int numberofcores;
    String type;

    // Constructor Declaration of Class
    public Computer(String brand, String screensize) {
        this.brand = brand;
        this.screensize = screensize;
    }

    // method 1
    public String getBrand() {
        return brand;
    }

    // method 2
    public String getScreensize() {
        return screensize;
    }

    public String toString() {
        return ("JavaPart2.Computer is" + this.getBrand() + "screen size is" + this.getScreensize());
    }
    public static void main(String[] args)
    {
        Computer laptop1 = new Computer("laptop1","desktop1");
        System.out.println(laptop1.toString());
        Computer laptop2 = new Computer("laptop2","desktop2");
        System.out.println(laptop2.toString());
    }

}
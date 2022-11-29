/*
import java.util.Vector;
public class arraylist {

    // Create an instance of type vector which accepts
    // elements of String type
    static Vector<String> vector;

    // getRandomElements() method which accesses random
    // elements from the vector
    static void getRandomElements()
    {
        // Run a loop as many times as the number of
        // elements you want to access
        for (int i = 0; i < vector.size(); i++)
        {
            // Generate a random int value between 0 and the
            // last index of the vector
            int index = (int)(Math.random() * vector.size());

            // get the element at the generated random index
            System.out.println(vector.get(index));
        }
    }

    // Driver method
    public static void main(String[] args)
    {
        // Instantiate the vector instance
        vector = new Vector<String>();

        // Add elements into the vector
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");
        vector.add("5");

        // Call the getElements() method on this vector
        // object
        getRandomElements();
    }
}

 */
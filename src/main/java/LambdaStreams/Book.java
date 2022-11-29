package LambdaStreams;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Locale.filter;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.apache.commons.lang3.RandomUtils.nextDouble;
import static org.apache.commons.lang3.RandomUtils.nextInt;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Book {
    private String name;
    private double price;

    //Constructors
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }


    //Get-methods
    // Returns the name of this book
    public String getName() {
        return name;
    }

    // Returns the price
    public double getPrice() {
        return price;
    }

    // Sets the price
    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Returns a self-descriptive String
    public String toString() {
        return "name:" + name + ", " + "price:" + price;  // author.toString()
    }


    public static List<Book> generateBooks(int count) {

        List<Book> bookList = new ArrayList<>();

        for (int i = 0; i < count; i++) {

            String randomName = randomAlphabetic(3, 10);
            Integer randomPrice = nextInt(1, 99);

            bookList.add(new Book(randomName, randomPrice));
        }

        return bookList;
    }

    public static Double sumPrice(List<Double> list) {
        Double sum = 0.00;

        for (Double i : list)
            sum = sum + i;

        return sum;
    }

    // method max price
    public static Book findMaxPrice(List<Book> list) {
        double max = 0;
        Book maxPriceBook = null;
        for (int i = 0; i < list.size(); i++) {
            if (max <= list.get(i).getPrice()) {
                max = list.get(i).getPrice();
                maxPriceBook = list.get(i);
            }
        }
        return maxPriceBook;
    }

    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Book or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Book)) {
            return false;
        }

        // typecast o to Book so that we can compare data members
        Book c = (Book) o;

        // Compare the data members and return accordingly
        return name.equals(c.name)
                && Double.compare(price, c.price) == 0;
    }

    public static void main(String[] args) {
        // print all books using method toString (information should be consistent, e.g. “name: Book1, price: 10”)
        List<Book> myList = generateBooks(10);
        System.out.println(myList);

        // get List<String> of all book names and print them
        List<String> filteredPersonNameList = new ArrayList();
        filteredPersonNameList = myList.stream()
                .map(Book::getName)
                .collect(Collectors.toList());
        System.out.println(filteredPersonNameList);

        // get total price of all books and print it
        List<Double> pricesList = new ArrayList();
        pricesList = myList.stream()
                .map(Book::getPrice)
                .collect(Collectors.toList());
        System.out.println(sumPrice(pricesList));

        // get any book with “A” or “a” character in name and print its name
        List<String> filteredCharacter = new ArrayList();
        filteredCharacter = myList.stream()
                .map(Book::getName)
                .filter(item -> item.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(filteredCharacter);

        //  print book name with highest price
        System.out.println("Book with highest price: " + findMaxPrice(myList).getName());


        //  get number of books where name consists of 5 letters
        List<String> filteredNameFiveLetters = new ArrayList();
        filteredNameFiveLetters = myList.stream()
                .map(Book::getName)
                .filter(s -> s.length() == 5)
                .collect(Collectors.toList());

        System.out.println("Books where name consists of 5 letters: " + filteredNameFiveLetters.size());

        // get all books except books with price higher then 30
        List<Book> filteredBooks = new ArrayList();
        filteredBooks = myList.stream()
                //  .map(Book::getPrice)
                .filter(s -> s.getPrice() < 30)
                .collect(Collectors.toList());

        System.out.println("All books except books with price higher then 30: " + filteredBooks);

        // Sort books by name in desc order, if name equals then sort by price
        List<Book> sortedList = new ArrayList();
        sortedList = myList.stream()
                .sorted(Comparator.comparing(Book::getName).reversed()
                        .thenComparing(Book::getPrice).reversed())
                .collect(Collectors.toList());

        System.out.println("Books by name in desc order, if name equals then sort by price: " + sortedList);

        //Creating objects

        Book book1 = new Book("myBook", 5);
        Book book2 = new Book("myBook", 5);



        // add Book1 to map Map<Book, String> mapWithBook -> key = Book1, value - some library name
        Map<Book, String> mapWithBook = new HashMap<>();
        mapWithBook.put(book1, "library1");

        //  get library name using book2 object
        String libraryName = "";

        for (var entry : mapWithBook.entrySet()) {
            if (entry.getKey().equals(book2)){
                libraryName = entry.getValue();
            }
        }

        System.out.println("library name: " + libraryName);


    }
}









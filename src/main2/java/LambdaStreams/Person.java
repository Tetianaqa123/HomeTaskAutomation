package LambdaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;



public class Person {
    private String firstName, lastName;
    int age;

    //Constructors
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    //Methods
//Get-methods
    public String getName() {
        return firstName + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;

    }

    //Set-methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Peter", "Patterson", 21));
        personList.add(new Person("Paul", "Walker", 31));
        personList.add(new Person("Steve", "Runner", 17));
        personList.add(new Person("Arnold", "", -1));
        personList.add(new Person(" ", "Stevenson", 19));
        personList.add(new Person("   ", "Stevenson", 19));
        personList.add(new Person("      ", "Stevenson", 19));
        personList.add(new Person(" Arnold", "Stevenson", 19));
        personList.add(null);
        personList.add(new Person("Aaron", "Bortnicker", 18));

        List<String> filteredPersonNameList = new ArrayList<String>();

        filteredPersonNameList = personList.stream()
                .filter(Objects::nonNull)
                .filter(person -> person.getAge() >= 18)
                .map(Person::getFirstName)
                .map(String::toUpperCase)
                .map(String::trim)
                .filter(Predicate.not(String::isEmpty))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(filteredPersonNameList);


    }


}



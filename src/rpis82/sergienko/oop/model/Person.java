package rpis82.sergienko.oop.model;

public class Person {

    public static Person UNKNOWN_PERSON = new Person("", "");

    private String lastName; //Фамилия
    private String firstName; //Имя

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }

}

/*Create a collection of Person objects in which each Person has a firstName and a lastName. Use streams to locate the first Person
        object containing the last name Jones. Ensure that several Person objects in your collection have that last name.*/

import java.util.ArrayList;
import java.util.List;

public class PersonObjects {

    String firstName;
    String lastName;

    PersonObjects(String fname, String lname){

        this.firstName = fname;
        this.lastName = lname;
    }

    public static void main(String args[]){

        List<PersonObjects> list = new ArrayList<>();
        list.add(new PersonObjects("Kate", "Jones"));
        list.add(new PersonObjects("John", "Yellow"));
        list.add(new PersonObjects("Kim", "Jones"));
        list.add(new PersonObjects("Yun", "Green"));
        list.add(new PersonObjects("Tim", "Jones"));
        list.add(new PersonObjects("Tom", "White"));

        list.stream()
                .filter(person -> person.lastName == "Jones")
                .findFirst().ifPresent(person -> System.out.print(person.firstName));
    }
}

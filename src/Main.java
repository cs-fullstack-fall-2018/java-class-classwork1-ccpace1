import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
//30a creating people in classes
    public static void main(String[] args) {
     Person person1 = new Person();
     person1.setHeight(72);
     person1.setWeight(250);
     System.out.println(person1.bodyMassIndex());

     Person person2 = new Person();
     person2.setHeight(75);
     person2.setWeight(245);
     System.out.println(person2.bodyMassIndex());


     Person person3 = new Person();
     person3.setHeight(72);
     person3.setWeight(195);
     System.out.println(person3.bodyMassIndex());
//30b putting objects in an array
        ArrayList<Person> personList = new ArrayList<Person>();
            personList.add(person1);
            personList.add(person2);
            personList.add(person3);
            System.out.println(personList);
//30c Printing the second person
        System.out.println();
    }
}


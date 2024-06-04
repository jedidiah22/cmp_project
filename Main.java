import Encapsulation.person;
import OOP.RAM;
import OOP.computer;
import OOP.processor;
import OOP.storage;

public class Main {

    static void addnumber(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {

        addnumber(7,6);

        cmp202 printUser = new cmp202();
        printUser.printUserDetails();
        // Person student = new Person("Dan", "Bingham", "1234", "bhu/22/04/05/0054", 123);
        person staff = new person("Staff Name", "Bingham", "23424", null, 445);
        System.out.println(staff);

        // System.out.println(person.getName());
        // System.out.println(person.setPassword("1243533"));;
        // person.password = "12344";

        computer hp250 =
                new computer(new RAM(), new processor(), new storage());
        System.out.println(hp250);
    }
}
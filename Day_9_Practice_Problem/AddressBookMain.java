package Day_9_Practice_Problem;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("---------- Welcome to Address Book System ----------");
        Contacts persons1 = getContactDetails();
        System.out.println(persons1);
    }

    private static Contacts getContactDetails() {
        Scanner sc = new Scanner(System.in);
        Contacts person = new Contacts();
        System.out.print("Enter your First Name : ");
        person.setFirstName(sc.next());
        System.out.print("Enter your Last Name : ");
        person.setLastName(sc.next());
        System.out.print("Enter your Email Id : ");
        person.setEmail(sc.next());
        System.out.print("Enter your City : ");
        person.setCity(sc.next());
        System.out.print("Enter your Address : ");
        person.setAddress(sc.next());
        System.out.print("Enter your Phone No : ");
        person.setPhoneNo(sc.next());
        System.out.print("Enter your Pin Code : ");
        person.setPinCode(sc.next());
        System.out.println();
        sc.close();
        return person;
    }
}

/**
 *  create a program that implements a simple phone with capabilities
 *  Store, modify, remove and query contact name.
 */

package contactApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MobileApp {
    private static ArrayList<Contact> allContacts = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean showOptions = true;

        while (showOptions){
            menuOptions();
            int selection = scan.nextInt();

            switch (selection){
                case 1 :
                    showOptions = false;
                    break;

                case 2:
                    printExistingContacts();
                    break;

                case 3:
                    addContacts();
                    break;

                case 4:
                    updateContact();
                    break;

                case 5:
                    removeContact();
                    break;
            }
        }
    }
    private static void menuOptions(){
        System.out.println("\nSelect an option: \n1. Quit " +
                "\n2. Print list of contacts \n3. Add new contacts " +
                "\n4. Update Existing contacts \n5. Remove contact");
    }

    private static void printExistingContacts(){
        if(allContacts.size() < 1){
            System.out.println("There is no contact, press 3 to add contact");
        }
        else {
            allContacts.forEach((contact) -> {
                System.out.println("Contact name is "+contact.getName());
                System.out.println("Contact number is "+contact.getPhoneNumber());
            });
        }
    }

    private static void addContacts(){
        System.out.println("Enter name: ");
        String name = scan.next();

        System.out.println("Enter number: ");
        int number = scan.nextInt();

        Contact contact = new Contact(name, number);
        allContacts.add(contact);

        System.out.println("Contact saved!");
    }

    private static void removeContact() {
        System.out.println("Enter name you want to remove ");
        String name = scan.next();
        boolean foundName = false;

        Iterator contactList = allContacts.iterator();
        while (contactList.hasNext()){
            Contact user = (Contact) contactList.next();
            if(user.getName().equals(name)){
                foundName = true;
                contactList.remove();
            }
        }

        if(!foundName) {
            System.out.println("Name not found");
        }
    }

    private static void updateContact() {
        System.out.println("Press 1 to update name, 2 to update number\n");
        int selection = scan.nextInt();
        boolean nameFound = false;
        int nameIndex = 0;

        if(selection == 1){
            System.out.println("Enter old name: ");
            String oldName = scan.next();

            for (int i = 0; i < allContacts.size(); i++) {
                if(allContacts.get(i).getName().equals(oldName)){

                    nameFound = true;
                    nameIndex = i;
                }
            }

            if(nameFound){
                System.out.println("Enter new name: ");
                String newName = scan.next();
                allContacts.get(nameIndex).setName(newName);
            }
            else {
                System.out.println("Invalid name");
            }
        }
        else if(selection == 2) {
            System.out.println("Enter old number: ");
            int oldNumber = scan.nextInt();

            for (int i = 0; i < allContacts.size(); i++) {
                if(allContacts.get(i).getPhoneNumber() == oldNumber){
                    nameFound = true;
                    nameIndex = i;
                }
            }

            if(nameFound){
                System.out.println("Enter new number: ");
                int newNumber = scan.nextInt();
                allContacts.get(nameIndex).setPhoneNumber(newNumber);
            }
            else {
                System.out.println("Invalid number");
            }
        }
    }
}

package Day28;
import java.util.*;
class Contact{
    private String contactName;
    private String phoneNumber;
    private String email;
    public Contact(String contactName,String phoneNumber,String email){
        this.contactName=contactName;
        this.phoneNumber=phoneNumber;
        this.email=email; 
    }
    public String getName() { return contactName; }
    public void setName(String name) { this.contactName = name; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
public class code112 {
    private static final ArrayList<Contact> contactList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Contact Management System ---");
            System.out.println("1. Add New Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Delete Contact by Name");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1 -> addContact();
                case 2 -> viewContacts();
                case 3 -> searchContact();
                case 4 -> deleteContact();
                case 5 -> {
                    System.out.println("Exiting system. Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! Choose between 1 and 5.");
            }
        }
    }

    private static void addContact() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine().trim();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine().trim();

        if (name.isEmpty() || phone.isEmpty()) {
            System.out.println("Error: Name and Phone Number cannot be empty.");
            return;
        }

        contactList.add(new Contact(name, phone, email));
        System.out.println("Contact added successfully!");
    }

    private static void viewContacts() {
        if (contactList.isEmpty()) {
            System.out.println("Your contact list is empty.");
            return;
        }
        System.out.println("\n--- Contact List ---");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i + 1) + ". " + contactList.get(i));
        }
    }

    private static void searchContact() {
        System.out.print("Enter name to search: ");
        String searchName = scanner.nextLine().trim();
        boolean found = false;

        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Found: " + contact);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contact found with the name: " + searchName);
        }
    }

    private static void deleteContact() {
        System.out.print("Enter name to delete: ");
        String targetName = scanner.nextLine().trim();
        Contact toRemove = null;

        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(targetName)) {
                toRemove = contact;
                break;
            }
        }

        if (toRemove != null) {
            contactList.remove(toRemove);
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Contact not found.");
        }
    }
}


package Day28;
import java.util.*;
class Book{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    public Book(String isbn,String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    }
    public String getIsbn(){return isbn;}
    public String getTitle(){return title;}
    public String getAuthor(){return author;}
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean Available){isAvailable=Available;}
    @Override
    public String toString() {
        return "ISBN: " + isbn + " | Title: " + title + " | Author: " + author + " | Status: " + (isAvailable ? "Available" : "Borrowed");
    }
}
class Member{
private String memberId;
private String name;
private ArrayList <Book> borrowedBooks;
public Member(String name,String memberId){
    this.name=name;
    this.memberId=memberId;
    this.borrowedBooks=new ArrayList<>();
}
    public String getName() { return name; }
    public String getMemberId() { return memberId; }
    public ArrayList<Book> getborrowedBooks() { return borrowedBooks; }
        public void borrowBook(Book book) {
     borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
     borrowedBooks.remove(book);
    }
        @Override
    public String toString() {
        return "ID: " + memberId + " | Name: " + name + " | Borrowed Count: " + borrowedBooks.size();
    }
}
class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    // --- Book Management Operations ---
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' added successfully!");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in inventory.");
            return;
        }
        System.out.println("\n--- Library Books ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }
public void registerMember(Member member) {
        members.add(member);
        System.out.println("Member '" + member.getName() + "' registered successfully!");
    }

    public void displayMembers() {
        if (members.isEmpty()) {
            System.out.println("No registered members.");
            return;
        }
        System.out.println("\n--- Library Members ---");
        for (Member member : members) {
            System.out.println(member);
        }
    }public void borrowBook(String memberId, String isbn) {
        Member member = findMember(memberId);
        Book book = findBook(isbn);

        if (member == null) {
            System.out.println("Error: Member with ID " + memberId + " not found.");
            return;
        }
        if (book == null) {
            System.out.println("Error: Book with ISBN " + isbn + " not found.");
            return;
        }
        if (!book.isAvailable()) {
            System.out.println("Error: '" + book.getTitle() + "' is already borrowed.");
            return;
        }

        book.setAvailable(false);
        member.borrowBook(book);
        System.out.println("Success: " + member.getName() + " borrowed " + book.getTitle());
    }

    public void returnBook(String memberId, String isbn) {
        Member member = findMember(memberId);
        Book book = findBook(isbn);
         if (member == null) {
            System.out.println("Error: Member with ID " + memberId + " not found.");
            return;
        }
        if (book == null) {
            System.out.println("Error: Book with ISBN " + isbn + " not found.");
            return;
        }
        if (!member.getborrowedBooks().contains(book)) {
            System.out.println("Error: This member did not borrow this book.");
            return;
        }

        book.setAvailable(true);
        member.returnBook(book);
        System.out.println("Success: " + member.getName() + " returned " + book.getTitle());
    }

    // --- Helper Search Elements ---
    private Book findBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) return b;
        }
        return null;
    }
        private Member findMember(String memberId) {
        for (Member m : members) {
            if (m.getMemberId().equals(memberId)) return m;
        }
        return null;
    }
}
public class code109 {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Seed initial mock system database data
        library.addBook(new Book("Effective Java", "Joshua Bloch", "101"));
        library.addBook(new Book("Clean Code", "Robert Martin", "102"));
        library.registerMember(new Member("Alice Smith", "M01"));
        library.registerMember(new Member("Bob Jones", "M02"));

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add New Book");
            System.out.println("2. View All Books");
            System.out.println("3. Register New Member");
            System.out.println("4. View All Members");
            System.out.println("5. Issue/Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit System");
            System.out.print("Select Menu Option (1-7): ");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Provide an integer choice.");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Flush dynamic scan inputs

            switch (choice) {
                case 1:
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter Member Name: ");
                    String mName = scanner.nextLine();
                    System.out.print("Enter Member ID: ");
                    String mId = scanner.nextLine();
                    library.registerMember(new Member(mName, mId));
                    break;
                case 4:
                    library.displayMembers();
                    break;
                case 5:
                    System.out.print("Enter Member ID: ");
                    String bMemId = scanner.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String bIsbn = scanner.nextLine();
                    library.borrowBook(bMemId, bIsbn);
                    break;
                case 6:
                    System.out.print("Enter Member ID: ");
                    String rMemId = scanner.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String rIsbn = scanner.nextLine();
                    library.returnBook(rMemId, rIsbn);
                    break;
                case 7:
                    System.out.println("Shutting down core engine. Goodbye!");
                    break;
                default:
                    System.out.println("Error: Selection choice out of limits.");
            }
        } while (choice != 7);

        scanner.close();
    }
}

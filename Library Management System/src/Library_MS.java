import java.util.Scanner;
import java.util.ArrayList;

class Book {
    String name;
    String author;
    int ID;
    boolean issued;
    Book(String name, String author, int ID, boolean issued) {
        this.name = name;
        this.author = author;
        this.ID = ID;
        this.issued = issued;
    }
}

public class Library_MS {    
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
        System.out.println("Welcome to the Library Management System");
        System.out.println("1. Add a book");
        System.out.println("2. Issue a book");
        System.out.println("3. Return a book");
        System.out.println("4. Search a book");
        System.out.println("5. Display the book");
        System.out.println("6. Exit");
        choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                
                System.out.println("Enter the name of the book");
                String name = sc.nextLine();
                System.out.println("Enter the author of the book");
                String author = sc.nextLine();
                System.out.println("Enter the ID of the book");
                int ID = sc.nextInt();
                Boolean issued = false;
                books.add(new Book(name, author, ID, issued));
                System.out.println("Book added successfully");
                System.out.println("--------------------");

                break;

            case 2:
                boolean found = false;

                System.out.println("Enter the ID of the book to be issued");
                int n = sc.nextInt();
                for (Book book : books) {
                    if (book.ID == n) {
                        if (book.issued == false) {
                            book.issued = true;
                            System.out.println("Book issued successfully");
                            found = true;
                            break;
                        } 
                        else {
                            System.out.println("Book is already issued");
                            break;
                        }
                    }

                }
                if (!found) {
                    System.out.println("Book not found");
                }
                System.out.println("--------------------");
                
                break;
                
                case 3:
                {
                    boolean found1 = false;

                    System.out.println("Enter the ID of the book to be Returned");
                    int p = sc.nextInt();
                    for (Book book : books) {
                        if (book.ID == p) {
                            if (book.issued == true) {
                                book.issued = false;                     
                                System.out.println("Book Returned successfully");
                                found1 = true;
                                break;
                            } else {
                                System.out.println("Book is not issued");
                                break;
                            }
                        }
                        
                    }
                    if (!found1) {
                        System.out.println("Book not found");
                    }
                    System.out.println("--------------------");
                    
                }
                
                break;
                
                case 4:
                {
                    boolean found2 = false;
                    System.out.println("Enter the ID of the book to be searched");
                    int f = sc.nextInt();
                    for (Book book : books) {
                        if(book.ID == f) {
                            System.out.println("Name: " + book.name);
                            System.out.println("Author: " + book.author);
                            System.out.println("ID: " + book.ID);
                            
                            if (book.issued == true) {
                                System.out.println("Book is issued");
                            } else {
                                System.out.println("Book is not issued");
                                break; 
                            }
                        }
                        found2 = true;
                        break;
                    }
                    if (!found2) {
                        System.out.println("Book not found");
                    }
                    System.out.println("--------------------");
                
                }
                
                break;
                
                case 5:
                {
                    Boolean found5 = false;
                    int BookNumber = 1;
                    for (Book book : books) {
                        System.out.println(BookNumber+"st :Book detail");
                        System.out.println("--------------------");
                        System.out.println("Name: " + book.name);
                        System.out.println("Author: " + book.author);
                        System.out.println("ID: " + book.ID);
                        System.out.println((book.issued == true) ? "Book is issued" : "Book is not issued");
                        System.out.println("--------------------");
                        BookNumber++;
                        found5 = true;
                    }
                    if (!found5) {
                        System.out.println("No books found"); 
                    }
                    
                }
                
                break;
                
                case 6:
                {
                    System.out.println("Exiting the Library Management System");
                    System.out.println("--------------------");                
                }

                default:

                System.out.println("Invalid choice");
                
                break;
        }

        }while (choice != 6);

    
        sc.close();           
    }
}

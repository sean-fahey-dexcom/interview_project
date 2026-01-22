package Java_questions;

import java.util.ArrayList;
import java.util.List;

public class question8 {
    public static void main(String[] args) {
        // Goal: You are building a simple library system. Create a method that can search
        // for books by different criteria: by title (exact match), by author (contains), 
        // or by year range.
        //
        // Steps:
        //   1. The list of books is already given to you, along with methods in the Book 
        //      class to get the title, author, and year.
        //   2. Implement search methods for searching by title, author, and year range.
        //      - Right now, these methods return ALL books. You need to modify them to return
        //       only the books that match the search criteria.
        //      - You may want to loop through each book in the list and add it to a results
        //        list if it matches the criteria.
        //   3. The results should be returned as a list of Book objects.

        List<Book> library = generateBooks();

        System.out.println("Question 8 - Library Search System");
        System.out.println("Library contents:");
        for (Book book : library) {
            System.out.println("    " + book);
        }

        // Test different search methods
        String searchTitle = "To Kill a Mockingbird";
        String searchAuthor = "King";
        int startYear = 1950;
        int endYear = 1980;

        System.out.println("\nSearch Results:");

        // Search by exact title
        List<Book> titleResults = searchByTitle(library, searchTitle);
        System.out.println("Books with exact title '" + searchTitle + "':");
        printSearchResults(titleResults);

        // Search by author (contains)
        List<Book> authorResults = searchByAuthor(library, searchAuthor);
        System.out.println("\nBooks by authors containing '" + searchAuthor + "':");
        printSearchResults(authorResults);

        // Search by year range
        List<Book> yearResults = searchByYearRange(library, startYear, endYear);
        System.out.println("\nBooks published between " + startYear + " and " + endYear + ":");
        printSearchResults(yearResults);
    }

    private static List<Book> searchByTitle(List<Book> books, String title) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                results.add(book);
            }
        }
        return results;
    }

    private static List<Book> searchByAuthor(List<Book> books, String author) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                results.add(book);
            }
        }
        return results;
    }

    private static List<Book> searchByYearRange(List<Book> books, int startYear, int endYear) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() >= startYear && book.getYear() <= endYear) {
                results.add(book);
            }
        }
        return results;
    }

    private static void printSearchResults(List<Book> results) {
        if (results.isEmpty()) {
            System.out.println("    No books found.");
        } else {
            for (Book book : results) {
                System.out.println("    " + book);
            }
        }
    }

    private static List<Book> generateBooks() {
        List<Book> books = new ArrayList<>();

        // Pre-defined books for consistent testing
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("The Shining", "Stephen King", 1977));
        books.add(new Book("The Silmarillion", "J.R.R. Tolkien", 1977));
        books.add(new Book("It", "Stephen King", 1986));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("Dune", "Frank Herbert", 1965));
        books.add(new Book("Lucky Jim", "Kingsley Amis", 1954));

        return books;
    }

    enum SearchCriteria {
        TITLE, AUTHOR, YEAR
    }
}

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author + " (" + year + ")";
    }
}

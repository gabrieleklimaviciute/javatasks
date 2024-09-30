package lt.techin.library.pt;


import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookCatalogGabrieleK implements BookCatalog {
    ArrayList<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        if (book == null || book.getIsbn() == null
                || book.getTitle() == null
                || book.getIsbn().isEmpty()
                || book.getTitle().isEmpty()) {
            throw new IllegalArgumentException();
        } else if (!isBookInCatalog(book.getIsbn())) {
            books.add(book);
        }

    }

    @Override
    public int getTotalNumberOfBooks() {

        return books.size();
    }

    @Override
    public void printBookTitles() {
        books.stream()
                .map(Book::getTitle)
                .forEach(System.out::println);
    }

    @Override
    public void printTitlesOfBooksPublishedAfter(int i) {
        books.stream()
                .filter(book -> book.getPublicationYear() > i)
                .map(Book::getTitle)
                .forEach(System.out::println);

    }

    @Override
    public Book getBookByIsbn(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }
        return books.stream()
                .filter(book -> book.getIsbn().equals(s))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException("Book with this ISBN not found."));
    }

    @Override
    public List<Book> searchBooksByAuthor(String s) {
        if (s == null) {
            return Collections.emptyList();
        }
        return books.stream()
                .filter(book -> book.getAuthor()
                        .getName().equals(s)).toList();

    }

    @Override
    public boolean isBookInCatalog(String s) {
        if (s == null) {
            return false;
        }
        return books.stream()
                .anyMatch(book -> book.getIsbn().equals(s));

    }

    @Override
    public boolean isBookAvailable(String s) {
        if (s == null) {
            return false;
        }
        return books.stream()
                .filter(book -> book.getIsbn().equals(s))
                .anyMatch(Book::isAvailable);
    }

    @Override
    public double calculateTotalPrice() {
        return books.stream()
                .mapToDouble(Book::getPrice).sum();
    }

    @Override
    public double calculateAveragePrice() {
        return books.stream()
                .mapToDouble(Book::getPrice)
                .average().orElse(0.0);
    }

    @Override
    public List<Book> getSortedBooks() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getPublicationYear))
                .toList();
    }

    @Override
    public List<Book> searchBooksByTitleContaining(String s) {
        if (!s.isEmpty()) {
            return Collections.emptyList();
        }
        return books.stream().filter(book -> book.getTitle().equalsIgnoreCase(s)).toList();
    }

    @Override
    public Book findNewestBookByPublisher(String s) {

        return books.stream()
                .filter(book -> book.getPublisher()
                        .equals(s))
                .max(Comparator.comparingInt(Book::getPublicationYear))
                .orElseThrow(() -> new BookNotFoundException("No books found"));

    }

    @Override
    public List<Book> filterBooks(Predicate<Book> predicate) {
        if (predicate == null) {
            return Collections.emptyList();
        }
        return books.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    @Override
    public Map<String, List<Book>> groupBooksByPublisher() {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getPublisher));
    }
}

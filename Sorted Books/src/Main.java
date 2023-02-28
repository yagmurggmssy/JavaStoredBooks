import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>();
        Book b1 = new Book("The Catcher in the Rye", 146, "J.D. Salinger", "12.02.1986");
        Book b2 = new Book("Nine Stories", 457, "F. Scott. Fitzgerald", "18.05.1988");
        Book b3 = new Book("Franny and Zoey", 138,"Scott Hanselman", "03.11.2000");
        Book b4 = new Book("The Great Gatsby", 278,"Christian Wenz", "19.03.1965");
        Book b5 = new Book("Pride and Prejudice", 486, "Jane Austen", "18.04.1864");
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        System.out.println("--- EKLENME SIRASINA GÖRE KİTAP İSİMLERİ ----");
        for(Book book: books){
            System.out.println("Kitap Adı: " + book.getBook_name());
        }

        TreeSet<Book> sortedBooks  =new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return 0;
            }
        });
        System.out.println();
        sortedBooks.addAll(books);
        System.out.println("---- ALFABETİK SIRALANMIŞ KİTAP İSİMLERİ ----");
        for(Book book: books){
            System.out.println("Kitap Adı: " + book.getBook_name());
        }
    }
}
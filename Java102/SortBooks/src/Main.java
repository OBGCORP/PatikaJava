import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", 208, "Paulo Coelho", "1988");
        Book book2 = new Book("Samarkand", 276, "Amin Maalouf", "1988");
        Book book3 = new Book("The Royal Game", 84, "Stefan Zweig", "1943");
        Book book4 = new Book("Meditations", 208, "Marcus Aurelius", "167");
        Book book5 = new Book("Enchiridion", 104, "Epictetus", "135");

        Set<Book> sortByName = new TreeSet<>();
        sortByName.add(book1);
        sortByName.add(book2);
        sortByName.add(book3);
        sortByName.add(book4);
        sortByName.add(book5);



        for (Book book : sortByName) {
            System.out.println(book);
        }

        System.out.println("----------------------");

        Set<Book> sortByPages = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageCount() - o2.getPageCount();
            }
        });

        sortByPages.addAll(sortByName);

        for (Book book : sortByPages) {
            System.out.println(book);
        }
    }
}
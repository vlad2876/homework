package by.belhard.j24.homeworks.hw05;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", 1220, Format.Standard, new Author("Patrick", "Niemeyer", 42));
        System.out.println(book.toString());
    }
}

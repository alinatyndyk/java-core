package lessons.lesson3.Printable;

import lombok.ToString;

@ToString
public class Book implements Printable {

    String name;
    int pages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }
}

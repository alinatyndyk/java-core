package lessons.lesson2.chain_of_succession;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
@ToString

public class Book extends Papirus {

    String title;
    int pages;

    public Book() {
        super();
    }

    public Book(String size, String color, String title, int pages) {
        super(size, color);
        this.title = title;
        this.pages = pages;
    }

    @Override
    public void greeting(String title){
        System.out.println("You are reading " + title);
    }
}

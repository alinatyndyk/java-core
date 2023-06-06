package lessons.lesson2.chain_of_succession;


import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
@ToString

public final class Magazine extends Book {

    String frontPhrase;
    String about;

    public Magazine(String size, String color, String title, int pages, String frontPhrase, String about) {
        super(size, color, title, pages);
        this.frontPhrase = frontPhrase;
        this.about = about;
    }
}

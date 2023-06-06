package lessons.lesson2.chain_of_succession;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
@ToString

public final class Comix extends Book{

    String mainCharacter;
    int chapters;

    private Comix(){

    }

    public Comix(String size, String color, String title, int pages, String mainCharacter, int chapters) {
        super(size, color, title, pages);
        this.mainCharacter = mainCharacter;
        this.chapters = chapters;
    }
}

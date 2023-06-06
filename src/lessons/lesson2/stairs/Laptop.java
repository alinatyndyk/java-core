package lessons.lesson2.stairs;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString

public class Laptop extends PC {

    String screenSize;
    String displayType;

    public Laptop(){
        super();
    }

    public Laptop(String model, String memory, String screenSize, String displayType) {
        super(model, memory);
        this.screenSize = screenSize;
        this.displayType = displayType;
    }
}

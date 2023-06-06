package lessons.lesson2.stairs;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
public class PC {

    String model;
    String memory;

    public PC() {
    }

    public PC(String model, String memory) {
        this.model = model;
        this.memory = memory;
    }
}

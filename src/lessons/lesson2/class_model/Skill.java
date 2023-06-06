package lessons.lesson2.class_model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Skill {

    String title;
    int exp;

    public Skill(String title, int exp) {
        this.title = title;
        this.exp = exp;
    }
}

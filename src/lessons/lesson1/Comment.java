package lessons.lesson1;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Comment {

    int postId;
    int id;
    String name;
    String email;
    String body;

}

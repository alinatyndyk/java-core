package lessons.lesson1;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book {
     String title;
     int pages;
     String genre;
     ArrayList<String> authors = new ArrayList<>();
}

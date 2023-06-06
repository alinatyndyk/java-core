package lessons.lesson2.agre_compo;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Geo {
    String lat;
    String lng;
}

//"geo": {
//        "lat": "-37.3159",
//        "lng": "81.1496"
//        }
package lessons.lesson2.chain_of_succession;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
@ToString

public class Papirus {

    String size;
    String color;

    public Papirus(){

    }
    public Papirus(String size, String color) {
        this.size = size;
        this.color = color;
    }

    public void greeting(String size){
        System.out.println("The format is" + size);
    }

}

package lessons.lesson3.Printable;

import lombok.ToString;

@ToString
public class Magazine implements Printable{

    String color;
    String topic;

    public Magazine(String color, String topic) {
        this.color = color;
        this.topic = topic;
    }
}

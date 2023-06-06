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
final class Ultrabook extends Laptop {

    String thickness;
    boolean intelProcessor;

    private Ultrabook(){
        super();
    }

    public Ultrabook(String model, String memory, String screenSize, String displayType, String thickness, boolean intelProcessor) {
        super(model, memory, screenSize, displayType);
        this.thickness = thickness;
        this.intelProcessor = intelProcessor;
    }
}

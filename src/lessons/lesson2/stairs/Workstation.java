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
final class Workstation extends Laptop {
    int someParam;
    boolean someParamBl;

    private Workstation() {
        super();
    }

    public Workstation(String model, String memory, String screenSize, String displayType, int someParam, boolean someParamBl) {
        super(model, memory, screenSize, displayType);
        this.someParam = someParam;
        this.someParamBl = someParamBl;
    }
}

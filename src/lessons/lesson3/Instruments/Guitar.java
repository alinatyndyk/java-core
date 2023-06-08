package lessons.lesson3.Instruments;

public class Guitar implements Instrument {

    String Title = "Guitar";
    int strings;

    public Guitar(int strings) {
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.println("Играет " + Title + " инструмент c такими " + strings + " струн характеристиками");
    }
}

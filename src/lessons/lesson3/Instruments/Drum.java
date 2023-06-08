package lessons.lesson3.Instruments;

public class Drum implements Instrument{

    String Title = "Drums";
    int size;


    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет " + Title + " инструмент c такими " + size + " см размер характеристиками");
    }
}

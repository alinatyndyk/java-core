package lessons.lesson3.Instruments;

public class Truba implements Instrument{

    String Title = "Truba";
    int diametr;

    public Truba(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("Играет " + Title + " инструмент c такими " + diametr + " диаметр характеристиками");
    }
}

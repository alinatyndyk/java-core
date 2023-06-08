package lessons.lesson3.Instruments;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Instrument instrument1 = new Guitar(5);
        Instrument instrument2 = new Drum(30);
        Instrument instrument3 = new Truba(10);


        ArrayList<Instrument> list = new ArrayList<>();
        list.add(instrument1);
        list.add(instrument2);
        list.add(instrument3);

        for (Instrument instrument : list) {
            instrument.play();

        }


    }

}

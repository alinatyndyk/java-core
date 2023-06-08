package lessons.lesson3.Printable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Printable printable1 = new Book("Instance", 265);
        Printable printable2 = new Magazine("blue", "beauty");

        ArrayList<Printable> list = new ArrayList<>();

        list.add(printable1);
        list.add(printable2);

        printable1.print("Hello.");
        printable2.print("Guten tag!");

        System.out.println(list);

    }
}

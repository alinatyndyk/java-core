package lessons.lesson3.Printable;

public interface Printable {

    default void print(String text){
        System.out.println("Print out - " + text);
    }

}

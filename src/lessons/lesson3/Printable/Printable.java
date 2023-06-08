package lessons.lesson3.Printable;

public interface Printable {

    default void print(String text){
        System.out.println("Print out - " + text);
    }

}

//а) Определить интерфейс Printable, содержащий метод void print().
//        б) Определить класс Book, реализующий интерфейс Printable.
//        в) Определить класс Magazine, реализующий интерфейс Printable.
//        г) Создать массив типа Printable, который будет содержать книги и журналы.

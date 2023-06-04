package lessons.lesson1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Java lection 1");


        ArrayList<String> authors = new ArrayList<>();
        authors.add("Linda Fall");
        authors.add("Derek Hale");

        Book book1 = new Book("hi", 3, "hi", authors);

        book1.setGenre("horror");
        book1.getAuthors().add("Klaus Mikelson");

        System.out.println(book1);

        Car car1 = new Car("x5", 1, 200, true);
        System.out.println(car1);

        Dog dog1 = new Dog("Bim", 2, "Vivcharka");
        dog1.setBreed("Labrador");
        System.out.println(dog1);

        Post post1 = new Post(123, 456, "Lorem ipsum", "Lorem ipsum 17");
        System.out.println(post1);

        Comment comment1 = new Comment(789, 653, "Valerie Fall", "valerie.fall@gmail.com", "Congratulations!");
        System.out.println(comment1);

    }
}

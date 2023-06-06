package lessons.lesson2.chain_of_succession;


public class Main {

    public static void main(String[] args) {

        System.out.println(new Papirus("A4", "White"));

        Book book = new Book("A2", "white", "Brain", 237);

        String title = book.getTitle();
        book.greeting(title);

        String size = book.getSize();
        System.out.println(size);

        System.out.println(book);

        Magazine magazine = new Magazine("A4", "Grey", "Magazine", 65, "Beauty", "Magazine about beauty");
        magazine.greeting(magazine.getTitle());
        System.out.println(magazine);

        Comix comix = new Comix("A4", "Blue", "Adventures of Batman", 125, "Batman", 40);
        System.out.println(comix);

    }

}

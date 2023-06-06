package lessons.lesson2.stairs;

public class Main {

    public static void main(String[] args) {

        PC pc = new PC("xxxmodel", "500gb");
        System.out.println(pc);

        Laptop laptop = new Laptop("xxxmodel", "500gb","yyy*xxx", "LED");
        System.out.println(laptop);

        Ultrabook ultrabook = new Ultrabook("xxxmodel", "500gb", "yyy*xxx", "LED", "1.7", true);
        System.out.println(ultrabook);

        Workstation workstation = new Workstation("xxxmodel", "500gb", "yyy*xxx", "LED", 2397832, false);
        System.out.println(workstation);

    }

}

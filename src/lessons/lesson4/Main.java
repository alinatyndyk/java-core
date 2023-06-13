package lessons.lesson4;

import lessons.lesson2.class_model.Gender;
import lessons.lesson2.class_model.Skill;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        List<Skill> skills1 = new ArrayList<>();
        List<Skill> skills2 = new ArrayList<>();
        List<Skill> skills3 = new ArrayList<>();
        List<Skill> skills4 = new ArrayList<>();

        //mark
        skills1.add(new Skill("Python", 5));
        skills1.add(new Skill("Java", 8));
        skills1.add(new Skill("JS", 3));
        skills1.add(new Skill("Kotlin", 2));

        //emily
        skills2.add(new Skill("Java", 3));
        skills2.add(new Skill("JS", 5));

        //john
        skills3.add(new Skill("JS", 5));
        skills3.add(new Skill("React", 3));
        skills3.add(new Skill("Angular", 7));

        //anna
        skills4.add(new Skill("Python", 10));



        User user1 = new User(2, "Mark", "Wesley", "mw@gmail.com", 32, Gender.MALE, skills1, "BMW", 2021, 250);
        User user2 = new User(7, "Emily", "Buch", "mw@gmail.com", 33, Gender.FEMALE, skills2, "AUDI", 2023, 300);
        User user3 = new User(4, "John", "Tick", "mw@gmail.com", 18, Gender.MALE, skills3, "SKODA", 2007, 210);
        User user4 = new User(1, "Anna", "Almond", "mw@gmail.com", 49, Gender.FEMALE, skills4, "TOYOTA", 2011, 100);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println(users);

        users.sort(Comparator.comparingInt(User::getAge).reversed());
        System.out.println(users);

        users.sort(Comparator.comparing(User::getName));
        System.out.println(users);

        users.sort(Comparator.comparing(User::getName).reversed());
        System.out.println(users);

        //-----------------------------------

        ArrayList<String> countries = new ArrayList<>();
        countries.add("Ukraine");
        countries.add("United States");
        countries.add("China");
        countries.add("Japan");
        countries.add("Germany");
        countries.add("France");
        countries.add("Italy");
        countries.add("Spain");
        countries.add("Canada");
        countries.add("Mexico");
        countries.add("Brazil");
        countries.add("Argentina");
        countries.add("Australia");
        countries.add("Switzerland");
        countries.add("India");

        Collections.sort(countries);
        System.out.println(countries);

        //-----------------------

        HashSet<User> usersHash = new HashSet<>();

        usersHash.add(user1);
        usersHash.add(user2);
        usersHash.add(user3);
        usersHash.add(user4);

        usersHash.removeIf(person -> person.getGender() == Gender.MALE);

        System.out.println(usersHash);

    TreeSet<User> usersTree = new TreeSet<>();

        usersTree.add(user1);
        usersTree.add(user2);
        usersTree.add(user3);
        usersTree.add(user4);

        System.out.println(usersTree);

    }

}

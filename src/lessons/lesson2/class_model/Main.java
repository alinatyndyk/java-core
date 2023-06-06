package lessons.lesson2.class_model;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Skill> skills = new ArrayList<>();
        skills.add(new Skill("Python", 5));
        skills.add(new Skill("Java", 8));

        Person person = new Person(1, "Tony", "Maged", "tony@gmail.com", 32, Gender.MALE, skills, "BMW X6", 2017, 250);

        System.out.println(skills);
        System.out.println(person);

    }

}

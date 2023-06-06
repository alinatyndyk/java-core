package lessons.lesson2.class_model;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Person {

    int id;
    String name;
    String surname;
    String email;
    int age;
    Gender gender;
    List<Skill> skills;
    Car car;

    public Person(int id, String name, String surname, String email, int age, Gender gender, List<Skill> skills, String carModel, int carYear, int carPower) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = new Car(carModel, carYear, carPower);
    }
}

//    Створити клас котрий відповідає наступній моделі
//{
//        id: 1,
//        name: 'vasya',
//        surname: 'pupkin',
//        email: 'asd@asd.com',
//        age: 31,
//        gender: 'MALE',
//        skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//        car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.

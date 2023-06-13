package lessons.lesson4;

import lessons.lesson2.class_model.Car;
import lessons.lesson2.class_model.Gender;
import lessons.lesson2.class_model.Skill;
import lombok.*;

import java.util.List;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class User implements Comparable<User> {

        int id;
        String name;
        String surname;
        String email;
        int age;
        Gender gender;
        List<Skill> skills;
        Car car;


        public User (int id, String name, String surname, String email, int age, Gender gender, List<Skill> skills, String carModel, int carYear, int carPower) {
                this.id = id;
                this.name = name;
                this.surname = surname;
                this.email = email;
                this.age = age;
                this.gender = gender;
                this.skills = skills;
                this.car = new Car(carModel, carYear, carPower);
        }

        @Override
        public int compareTo(User o) {
                return this.getSkills().size() - o.getSkills().size();
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
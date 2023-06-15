package lessons.lesson4_p2;

import java.util.*;

public class ZooClub {

    private final Map<Person, List<Pet>> club;

    public ZooClub() {
        club = new HashMap<>();
    }

    public void GetMembers() {
        System.out.println(club);
    }

    public void AddMember(Person person) {

        club.put(person, new ArrayList<>());
        System.out.println("The member " + person + "was added");

    }

    public void RemoveMember(Person person) {

        club.remove(person);
        System.out.println("The member " + person + "was removed");

    }

    public void AddPetToMember(Person person, Pet pet) {
        if (club.containsKey(person)) {
            List<Pet> pets = club.get(person);
            pets.add(pet);
            club.put(person, pets);

            System.out.println(pet + " was added to " + person);
        } else {
            System.out.println("This person is not the member of the club");
        }
    }

    public void AddPetToMemberById(int Id, Pet pet) {

        Set<Person> people = club.keySet();

        for (Person person : people) {
            if (person.getId() == Id) {

                List<Pet> pets = club.get(person);
                pets.add(pet);
                club.put(person, pets);

                System.out.println(pet + " was added to " + person);

            }
        }
    }

    public void RemovePetFromOwner(Person person, Pet pet) {
        if (club.containsKey(person)) {
            List<Pet> pets = club.get(person);
            pets.remove(pet);
            System.out.println(pet + " was removed from " + person);
        } else {
            System.out.println("This person is not the member of the club");
        }
    }

    public void RemovePetFromAllOwners(Pet pet) {

        Set<Map.Entry<Person, List<Pet>>> entries = club.entrySet();

        Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();

        while (iterator.hasNext()) {

            Map.Entry<Person, List<Pet>> next = iterator.next();

            List<Pet> pets = next.getValue();
            Person person = next.getKey();

            if (pets.contains(pet)) {

                pets.remove(pet);
                club.put(person, pets);

            }

            System.out.println(pet + " was removed");
        }

    }

}

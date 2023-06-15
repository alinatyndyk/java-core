package lessons.lesson4_p2;

public class Main {

    public static void main(String[] args) {

        ZooClub zooClub = new ZooClub();

        Person person1 = new Person(1, "John"); // створювання учасників
        Person person2 = new Person(2, "Matt");

        Pet pet1 = new Pet(11, "Kiko"); // створювання тварин
        Pet pet2 = new Pet(22, "Koko");
        Pet pet3 = new Pet(33, "Katze");




        zooClub.AddMember(person1); // додавання учасників
        zooClub.AddMember(person2);


        zooClub.AddPetToMember(person1, pet1);  // додавання тварин до конкретних учасників

        zooClub.AddPetToMember(person2, pet2);
        zooClub.AddPetToMember(person2, pet1);
        zooClub.AddPetToMemberById(2, pet3);


        zooClub.RemovePetFromOwner(person1, pet1); // видалити тваринку для конкретного учасника


        zooClub.RemoveMember(person1); //видалити учасника

        zooClub.RemovePetFromAllOwners(pet1); //видалити тваринку для усіх учасників

        zooClub.GetMembers(); //отримати клуб
    }
}

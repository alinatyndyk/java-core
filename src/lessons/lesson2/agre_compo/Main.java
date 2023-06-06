package lessons.lesson2.agre_compo;

public class Main {

    public static void main(String[] args) {


        Geo geo = new Geo("-37.3159", "81.1496");
        Address address = new Address("bahnhofstrasse", "Apt. 5", "Zurich", "7000", geo);
        Company company = new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets");


        User user = new User(1, "Lolita", "lolitaUser", "lolita@gmail.com", address, "+41768873749", "http/lolita.com", company);
        System.out.println(user);


        User user1 = new User(2, "Max", "userMax", "max@gmail.com", "schwarzstrasse", "apt. 7", "Basel", "5000", "-37.3159", "81.1496", "+4176853756843", "http/max.com", "MaxCompany", "MaxPhrase", "MaxMax123");
        System.out.println(user1);

    }

}

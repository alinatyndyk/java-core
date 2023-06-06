package lessons.lesson2.agre_compo;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {

    int id;
    String name;
    String userName;
    String email;
    Address address;
    String phone;
    String website;
    Company company;

    public User(int id, String name, String userName, String email, String addressStreet, String addressSuite, String addressCity, String addressZipcode, String geoLat, String geoLng, String phone, String website, String companyName, String companyCatchPhrase, String companyBs) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.email = email;

        Geo geo = new Geo(geoLat, geoLng);
        this.address = new Address(addressStreet, addressSuite, addressCity, addressZipcode, geo);

        this.phone = phone;
        this.website = website;

        this.company = new Company(companyName, companyCatchPhrase, companyBs);

    }
}



//"id": 1,
//        "name": "Leanne Graham",
//        "username": "Bret",
//        "email": "Sincere@april.biz",
//        "address": {
//        "street": "Kulas Light",
//        "suite": "Apt. 556",
//        "city": "Gwenborough",
//        "zipcode": "92998-3874",
//        "geo": {
//        "lat": "-37.3159",
//        "lng": "81.1496"
//        }
//        },
//        "phone": "1-770-736-8031 x56442",
//        "website": "hildegard.org",
//        "company": {
//        "name": "Romaguera-Crona",
//        "catchPhrase": "Multi-layered client-server neural-net",
//        "bs": "harness real-time e-markets"
//        }
//        },

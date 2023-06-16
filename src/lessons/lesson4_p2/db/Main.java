package lessons.lesson4_p2.db;

import lombok.Data;
import lombok.SneakyThrows;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");

        CallableStatement callableStatement = connection.prepareCall("select * from city where id < ?");
        callableStatement.setInt(1, 20);
        ResultSet resultSet = callableStatement.executeQuery();

        List<City> cities = new ArrayList<>();

        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String title = resultSet.getString(2);

            cities.add(new City(id, title));
        }

        System.out.println(cities);


        connection.close();

    }

}
@Data
class City {

    int id;
    String title;

    public City(int id, String title) {
        this.id = id;
        this.title = title;
    }
}

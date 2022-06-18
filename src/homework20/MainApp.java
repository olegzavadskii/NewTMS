package homework20;

import homework20.services.CreateTableService;
import homework20.services.PhoneServiceImpl;
import homework20.services.PhoneValidatorImpl;
import homework20.entity.Brand;
import homework20.entity.Phone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/homework20",
                "postgres",
                "ghbdtn")) {
            CreateTableService cts = new CreateTableService(connection);
            cts.createTable();

            List<Phone> phonesList = Arrays.asList(
                    new Phone(Brand.SAMSUNG, "Galaxy A52", 6.5, 256),
                    new Phone(Brand.APPLE, "iPhone 11", 6.1, 64),
                    new Phone(Brand.GOOGLE, "Pixel 6", 6.4, 128),
                    new Phone(Brand.XIAOMI, "Mi 11", 6.81, 256),
                    new Phone(Brand.HONOR, "50", 6.57, 128),
                    new Phone(Brand.HUAWEI, "P40", 6.4, 128),
                    new Phone(Brand.XIAOMI, "Redmi Note 7", 6.3, 64),
                    new Phone(Brand.SAMSUNG, "Galaxy S22", 6.1, 128),
                    new Phone(Brand.APPLE, "iPhone 13", 6.1, 128),
                    new Phone(Brand.GOOGLE, "Pixel 5", 6, 128));

            PhoneServiceImpl psi = new PhoneServiceImpl(connection, new PhoneValidatorImpl());
            for (Phone el : phonesList) {
                psi.save(el);
            }

            System.out.println(psi.get(4));

            System.out.println(psi.getAll());

            System.out.println(psi.getByBrand(Brand.APPLE));

            psi.delete(6);

            System.out.println(psi.getByStorage(256));

            Phone phoneForSaveOrUpdate = new Phone(2, Brand.APPLE, "b", 1, 1);
            psi.update(phoneForSaveOrUpdate);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
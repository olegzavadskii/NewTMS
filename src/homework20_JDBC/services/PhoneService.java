package homework20_JDBC.services;

import homework20_JDBC.entity.Brand;
import homework20_JDBC.entity.Phone;

import java.util.List;

public interface PhoneService {
    void save(Phone phone);

    Phone getById(int id);

    List<Phone> getAll();

    List<Phone> getByBrand(Brand brand);

    void delete(int id);

    List<Phone> getByStorage(double storage);

    void update(Phone phone);
}
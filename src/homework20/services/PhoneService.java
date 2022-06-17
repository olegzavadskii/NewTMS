package homework20.services;

import homework20.entity.Brand;
import homework20.entity.Phone;

import java.util.List;

public interface PhoneService {
    void save(Phone phone);

    Phone get(int id);

    List<Phone> getAll();

    List<Phone> getByBrand(Brand brand);

    void delete(int id);

    List<Phone> getByStorage(double storage);

    void update(Phone phone);
}
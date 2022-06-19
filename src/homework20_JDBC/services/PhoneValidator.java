package homework20_JDBC.services;

import homework20_JDBC.entity.Phone;

public interface PhoneValidator {

    boolean validateSave(Phone phone);

    boolean validateUpdate(Phone phone);
}
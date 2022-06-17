package homework20.services;

import homework20.entity.Phone;

public interface PhoneValidator {

    boolean validateSave(Phone phone);

    boolean validateUpdate(Phone phone);
}
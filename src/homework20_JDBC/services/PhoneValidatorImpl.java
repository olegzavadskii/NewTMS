package homework20_JDBC.services;

import homework20_JDBC.entity.Phone;

public class PhoneValidatorImpl implements PhoneValidator {

    @Override
    public boolean validateSave(Phone phone) {
        if (!validateWithGeneralFields(phone)) {
            return false;
        } else if (phone.getId() != 0) {
            System.out.println("ID must be null or zero");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean validateUpdate(Phone phone) {
        if (!validateWithGeneralFields(phone)) {
            return false;
        } else if (phone.getId() == 0) {
            System.out.println("ID mustn't be zero or lower than zero");
            return false;
        } else {
            return true;
        }
    }

    private boolean validateWithGeneralFields(Phone phone) {
        if (phone.getBrand() == null || phone.getBrand().toString().isEmpty()) {
            System.out.println("You wrote a wrong brand");
            return false;
        } else if (phone.getModel() == null || phone.getModel().isEmpty()) {
            System.out.println("You wrote a wrong model");
            return false;
        } else if (phone.getDiagonal() <= 0) {
            System.out.println("You wrote wrong diagonal");
            return false;
        } else if (phone.getStorage() <= 0) {
            System.out.println("You wrote wrong storage");
            return false;
        } else {
            return true;
        }
    }
}
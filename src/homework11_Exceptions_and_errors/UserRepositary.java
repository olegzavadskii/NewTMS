package homework11_Exceptions_and_errors;

import java.util.ArrayList;

public class UserRepositary {
    protected ArrayList<String> dataBase;
    private int i = 5;

    public UserRepositary() {
        this.dataBase = new ArrayList<String>(i);
    }

    public ArrayList<String> addToDataBase(String word) {
        dataBase.add(word);
        return dataBase;
    }

    public ArrayList<String> deleteFromDataBase(String word) {
        dataBase.remove(word);
        return dataBase;
    }

    public ArrayList<String> getDataBase() {
        return dataBase;
    }

    //метод для выброса ошибки в случае заполнения коллекции
    public void validateToFull() throws FullArrException {
        if (dataBase.size() >= 5) {
            throw new FullArrException("База данных заполнена. Введите clear для очищения базы данных");
        }
    }

    //метод для выброса ошибки в случае обращения к пустой коллекции
    public void validateToEmpty() throws EmptyArrException {
        if (dataBase.size() == 0) {
            throw new EmptyArrException("База данных пуста. Заполните базу данных");
        }
    }

    @Override
    public String toString() {
        return "" + dataBase;
    }
}

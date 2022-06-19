package homework20_JDBC.services;

import homework20_JDBC.entity.Brand;
import homework20_JDBC.entity.Phone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhoneServiceImpl implements PhoneService {

    private Connection connection;
    private PhoneValidatorImpl phoneValidator;
    public static final String SAVE = "insert into phones " +
            "(brand, model, diagonal, storage) " +
            "values (?,?,?,?)";
    public static final String UPDATE = "update phones set brand = ?, model = ?, diagonal = ?, storage = ? where id = ?";

    public PhoneServiceImpl(Connection connection, PhoneValidatorImpl phoneValidator) {
        this.connection = connection;
        this.phoneValidator = phoneValidator;
    }

    @Override
    public void save(Phone phone) {
        if (phoneValidator.validateSave(phone)) {
            String brand = phone.getBrand().toString();
            String model = phone.getModel();
            double diagonal = phone.getDiagonal();
            double storage = phone.getStorage();
            try (PreparedStatement preparedStatement = connection.prepareStatement(SAVE)) {
                preparedStatement.setString(1, brand);
                preparedStatement.setString(2, model);
                preparedStatement.setDouble(3, diagonal);
                preparedStatement.setDouble(4, storage);
                preparedStatement.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("You can't save a phone");
        }
    }

    @Override
    public Phone getById(int id) {
        Phone phoneFromTable = null;
        if (id > 0) {
            try (PreparedStatement preparedStatement = connection.prepareStatement
                    ("select * from phones where id = ?")) {
                preparedStatement.setInt(1, id);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        phoneFromTable = getPhoneFromTable(resultSet);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            return phoneFromTable = new Phone();
        }
        return phoneFromTable;
    }

    @Override
    public List<Phone> getAll() {
        List<Phone> phoneList = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement("select * from phones")) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Phone phoneFromTable = getPhoneFromTable(resultSet);
                    phoneList.add(phoneFromTable);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return phoneList;
    }

    @Override
    public List<Phone> getByBrand(Brand brand) {
        List<Phone> phoneList = new ArrayList<>();
        if (brand != null) {
            try (PreparedStatement preparedStatement = connection.prepareStatement
                    ("select * from phones where brand = ?")) {
                preparedStatement.setString(1, brand.toString());
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        Phone phoneFromTable = getPhoneFromTable(resultSet);
                        phoneList.add(phoneFromTable);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return phoneList;
    }

    @Override
    public void delete(int id) {
        if (id > 0) {
            try (PreparedStatement preparedStatement = connection.prepareStatement
                    ("delete from phones where id = ?")) {
                preparedStatement.setInt(1, id);
                preparedStatement.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Phone> getByStorage(double storage) {
        List<Phone> phoneList = new ArrayList<>();
        if (storage > 0) {
            try (PreparedStatement preparedStatement = connection.prepareStatement
                    ("select * from phones where storage >= ?")) {
                preparedStatement.setDouble(1, storage);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        Phone phoneFromTable = getPhoneFromTable(resultSet);
                        phoneList.add(phoneFromTable);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return phoneList;
    }

    @Override
    public void update(Phone phone) {
        if (phoneValidator.validateUpdate(phone)) {
            int id = phone.getId();
            String brand = phone.getBrand().toString();
            String model = phone.getModel();
            double diagonal = phone.getDiagonal();
            double storage = phone.getStorage();
            try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {
                preparedStatement.setString(1, brand);
                preparedStatement.setString(2, model);
                preparedStatement.setDouble(3, diagonal);
                preparedStatement.setDouble(4, storage);
                preparedStatement.setInt(5, id);
                preparedStatement.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("You can't update a phone");
        }
    }

    private Phone getPhoneFromTable(ResultSet resultSet) throws SQLException {
        int idFromTable = resultSet.getInt("id");
        String brandFromTable = resultSet.getString("brand");
        String modelFromTable = resultSet.getString("model");
        double diagonalFromTable = resultSet.getDouble("diagonal");
        double storageFromTable = resultSet.getDouble("storage");
        return new Phone(idFromTable, Brand.valueOf(brandFromTable), modelFromTable, diagonalFromTable, storageFromTable);
    }
}
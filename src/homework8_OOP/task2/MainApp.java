package homework8_OOP.task2;

public class MainApp {
    public static void main(String[] args) {
        //создание экземпляров класса
        Phone phone1 = new Phone("4125746", "Samsung", 189);
        Phone phone2 = new Phone("5423479", "Xiaomi", 205);
        Phone phone3 = new Phone("1347415", "iPhone", 175);

        //вывод на консоль значений их переменных
        System.out.println("Phone1 " + phone1.toString());
        System.out.println("Phone2 " + phone2.toString());
        System.out.println("Phone3 " + phone3.toString());
        System.out.println();

        //вывод на консоль сообщения "Звонит "name"
        phone1.receiveCall("Николай");
        phone2.receiveCall("Дмитрий");
        phone3.receiveCall("Максим");
        System.out.println();

        //возврат номеров телефонов
        System.out.println("Номер Phone1 " + phone1.getNumber());
        System.out.println("Номер Phone2 " + phone2.getNumber());
        System.out.println("Номер Phone3 " + phone3.getNumber());
        System.out.println();

        //вызов перегруженного метода
        phone1.receiveCall("Николай", "4125746");
        phone2.receiveCall("Дмитрий", "5423479");
        phone3.receiveCall("Максим", "1347415");
        System.out.println();

        //вызов метода с аргументами переменной длины
        phone1.sendMessage("5423479", "1347415", "7561234", "3254612", "9562134");
    }
}

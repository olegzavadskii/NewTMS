package homework15.dateapi.task1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

//вывода на консоль названия дня недели по дате
public class MainApp {
    public static void main(String[] args) {
        //вводим дату
        LocalDate localDate = LocalDate.of(2012, 5, 7);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        //вывод на английском языке
        System.out.println(dayOfWeek);

        //вывод на русском (просто решил поискать, как сделать, чтобы было на русском)
        Locale localeRu = new Locale("ru", "RU");
        String displayName = dayOfWeek.getDisplayName(TextStyle.FULL, localeRu);
        System.out.println(displayName);

    }
}

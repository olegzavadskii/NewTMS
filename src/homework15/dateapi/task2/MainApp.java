package homework15.dateapi.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

//Написать программу для вывода на экран дату следующего вторника
public class MainApp {
    public static void main(String[] args) {
        //поиск следующего вторника от текущей даты
        LocalDate nextTuesday = LocalDate.now().
                with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(nextTuesday);

    }
}

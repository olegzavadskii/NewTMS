package homework4_Onedimensional_arrays.task1;

import java.util.Arrays;

public class ArrayWithNames {
    public static void main(String[] args) {
        String[] names = {"Саша", "Ольга", "Алина", "Марина", "Юлия", "Олег"};
        System.out.println("Массив до сортировки " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Массив после сортировки " + Arrays.toString(names));
    }
}

package homework15.lambda;

public class FactorialFinder {

    //метод для поиска факториала
    int findFactorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return findFactorial(number - 1) * number;
        }

    }
}

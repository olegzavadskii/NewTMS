package homework15.lambda;

public class FunctionalClass {
    void reverseOrFindFactorial(int numberForLogic, String textForReverse, int numberForFactorial,
                                InterfaceForReverse interfaceForReverse, InterfaceForFactorial interfaceForFactorial) {
        if (numberForLogic == 1) {
            interfaceForReverse.toReverseText(textForReverse);
        } else if (numberForLogic == 2) {
            interfaceForFactorial.toFindFactorial(numberForFactorial);
        } else {
            System.out.println("Введите 1 или 2");
        }
    }
}

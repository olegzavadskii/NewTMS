package homework15.lambda;

public class FunctionalClass {
    void doSomething(int numberForLogic, String textForReverse, int numberForFactorial,
                     MyInterface theFirstInterface, MyInterface theSecondInterface) {
        if (numberForLogic == 1) {
            theFirstInterface.doSomething(textForReverse, numberForFactorial);
        } else if (numberForLogic == 2) {
            theSecondInterface.doSomething(textForReverse, numberForFactorial);
        } else {
            System.out.println("Введите 1 или 2");
        }
    }
}

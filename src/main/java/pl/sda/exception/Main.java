package pl.sda.exception;

/**
 * Created by michal on 23.02.17.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();


//        try {
//            calculator.divide(5,0);
//        } catch (DivideByZeroException e) {
//            e.printStackTrace();
//        }

        int[] tab = new int[] {1, 2,3,4,5,6};

        try {
            calculator.sumArray(tab, 0, 11);
        } catch (WrongArgumentException e) {
            e.printStackTrace();
        }

    }
}

package pl.sda.exception;

/**
 * Created by michal on 23.02.17.
 */
public class Calculator {

    public float divide(float a, float b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Nie dziel przez 0!");
        }
        return a / b;
    }

    public float sumArray(int[] array, int a, int b) throws WrongArgumentException {
        try {
            return array[a] + array[b];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new WrongArgumentException(e.getMessage(), e);
        }
    }
}

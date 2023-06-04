package task;

/**
 * task1
 */
public class task1 {

    public static int divide(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("Деление на ноль не допустимо!");
        }
        return a / b;
    }

    public static int getValue(int[] array, int index) {
        if(index > array.length) {
            throw new IndexOutOfBoundsException("Индекс не может быть за пределами массива!");
        }
        return array[index];
    }

    public static int[] createArray(int size) {
        if(size < 0) {
            throw new NegativeArraySizeException("Размер массива не может быть отрицательным!");
        }
        return new int[size];
    }
}
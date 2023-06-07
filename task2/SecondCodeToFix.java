package task2;

public class SecondCodeToFix {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);


            int[] abc = {1, 2, 3, 4};
            abc [3] = 9;

        }catch (NullPointerException ex) {
            System.out.println("Указаткль не может указывать на null!");
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера!");
        }catch (Throwable ex) {
            System.out.println("Что-то пошло не так..!");
        }
    }

    public static void printSum(Integer a, Integer b) throws ArithmeticException {
        System.out.println(a + b);
        
    }
    
}

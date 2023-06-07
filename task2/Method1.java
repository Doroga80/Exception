package task2;

import java.util.Scanner;

public class Method1 {

    public void method() {
        int x = 0;
        while (x != 1) {
            System.out.println("Введите число: ");
            Scanner scanner = new Scanner(System.in);
            String num = scanner.nextLine();

            try {
                float number = Float.parseFloat(num);
                System.out.println(number);
                System.out.println("Вcе верно, продолжаем!");
            }catch(Exception NumberFormat) {
                System.out.println("Exception NumberFormat: Секоки вводить нельзя, попробуйте еще раз!");
            }
        }
    }
    
}

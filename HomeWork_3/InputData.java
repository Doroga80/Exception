package HomeWork_3;

import java.util.Scanner;

public class InputData {
    /**
     * @return
     */
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while(true){
            System.out.println("Введите строку через Пробел (строка должна содержать Ф.И.О, дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m) : ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if(arrayData.length == 6) {
                return arrayData;
            }else if (arrayData.length < 6) {
                System.out.println("Неверный ввод данных, попробуйтк еще раз!");
            }else System.out.println("Вы ввели больше данных, попробуйте еще раз!");
        }
    }
    
}

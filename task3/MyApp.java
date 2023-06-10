package task3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные в формате: ФИО Дата_рождения Номер_телефона Пол");
        String input = sc.nextLine();
        String[] data = input.split(" ");
        if (data.length != 4) {
            System.out.println("Ошибка: введено неверное количество параметров");
            return;
        }
        String surname = "";
        String name = "";
        String patronymic = "";
        String dateOfBirth = "";
        long phoneNumber = 0;
        char gender = 1;
        try {
            String[] fio = data[0].split(" ");
            switch (fio.length) {
                case 3:
                    surname = fio[0];
                    name = fio[1];
                    patronymic = fio[2];
                    break;
                case 2:
                    surname = fio[0];
                    name = fio[1];
                    break;
                default:
                    throw new IllegalArgumentException("Ошибка: неверный формат ФИО");
            }
            if (!data[1].matches("\\d{2}.\\d{2}.\\d{4}")) {
                throw new IllegalArgumentException("Ошибка: неверный формат даты рождения");
            }
            dateOfBirth = data[1];
            phoneNumber = Long.parseLong(data[2]);
            if (!(data[3].equals("m") || data[3].equals("f"))) {
                throw new IllegalArgumentException("Ошибка: неверный формат пола");
            }
            gender = data[3].charAt(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        String fileName = surname + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(surname + name + patronymic + dateOfBirth + " " + phoneNumber + gender);
            writer.newLine();
            System.out.println("Данные успешно записаны в файл " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    

package HomeWork_3;

public class DateException extends Exception{
    public DateException() {

    }
    public void dataException(String i) {
        System.out.println("Exseption: DataNotCorrectFormat");
        System.out.printf("Неправильный формат даты: %s", i);
        System.out.println();
    }
    
}

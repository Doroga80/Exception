package HomeWork_3;

/**
 * DataException
 */
public class DataException extends Exception {
    public DataException() {

    }
    public void dataException(String i) {
        System.out.println("Exseption: DataNotCorrectFormat");
        System.out.printf("Неправильный формат: %s", i);
        System.out.println();
    }
    
}
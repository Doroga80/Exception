package HomeWork_3;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("Данные введены не верно: %s", i);
        System.out.println();
    }
}
    
package task;

public class task3 {
    public static int[] diffArray(int[] a, int[] b) {
        if(a.length != b.length) {
            throw new RuntimeException("Длинны массивов не равны!");
        }
        int[] result = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            result[i] = a[i] + b[i];
        }
        return result;
    }
    
}

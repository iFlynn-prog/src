package Arrays2Task3;
import java.util.Arrays;

/* - Удалите последний и начальный элемент из массива (аналогично). */


public class App5 {
    public static void main(String[] args) {
        DeleteFirstLastValueInArray();
        
    }
    private static void DeleteFirstLastValueInArray() {

        int arr[] = new int [] {20, 1, 3, 4, 5, 2, 1, -4, -1, 10, 55};
        int newarr[] = new int [arr.length -2];


        for (int i = 1; i < arr.length -1; i++) {
            newarr[i - 1] = arr[i];            
            
        }
        System.out.print(Arrays.toString(newarr));
        
        
    }
}

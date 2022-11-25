import java.util.Arrays;

/* - Удалите последний и начальный элемент из массива (аналогично). */


public class App5 {
    public static void main(String[] args) {
        DeleteFirstLastValueInArray();
        
    }
    private static void DeleteFirstLastValueInArray() {
        int arr[] = new int [] {0, 1, 3, 4, 5, 2, 1, -4, -1, 10, 55};
        


        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i + 1];

            
        }
        System.out.print(Arrays.toString(arr));

        
    }
}

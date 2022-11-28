package Arrays2Task3;
import java.util.Arrays;
import java.util.Scanner;

/*- Добавьте любой элемент в конец массива (грубо говоря, задача в том, чтобы создать новый массив размером на 1 
    больше предыдущего, загнать в него элементы предыдущего, а дальше присвоить предыдущему массиву ссылку на новый);*/


public class App3 {
    public static void main(String[] args) {
        AddLastIndexOfArray();   
    }
    
    public static void AddLastIndexOfArray() {
                            // 0, 1, 2, 3, 4, 5, 6,  7,  8,  9, 10 
        int arr[] = new int[] {0, 1, 3, 4, 5, 2, 1, -4, -1, 10, 55};
        int newarr[] = new int[12];
        Scanner in = new Scanner(System.in);
        

        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];             
        }
        
        System.out.print("Введите число которое отобразится в конце массива" + " ");
        int number = in.nextInt();
        in.close();
        
        newarr[newarr.length -1] = number;     
        System.out.print(Arrays.toString(newarr));     
        
    }

}

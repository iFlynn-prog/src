import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

/*
 * 3. Создайте массив из элементов `0, 1, 3, 4, 5, 2, 1, -4, -1, 10, 55`. Выполните следующие пункты задания:
    Отсортировать массив по возрастанию и по убыванию
 */


public class App6 {
    public static void main(String[] args) {
       
        BubbleSort();
       
                 
    }

    public static void BubbleSort() {
        int arr[] = new int [] {0, 1, 3, 4, 5, 2, 1, -4, -1, 10, 55};
        int temp;
        boolean unsorted  = true;

        while (unsorted){
                unsorted = false;
            for (int i = 0; i < arr.length -1; i++) { 

                for (int j = i + 1; j < arr.length; j++) {
                    
                    if(arr[i] > arr[i + 1])
                    {
                        temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        unsorted = true;
                    }     
                }    
            }
        
        }                 
        System.out.println(Arrays.toString(arr));
    }   
            
}


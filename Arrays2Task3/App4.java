package Arrays2Task3;
import  java.util.Arrays;
import java.util.Scanner;

/*- Добавьте любой элемент в начало массива (аналогично); */

public class App4 
{
    public static void main(String[] args) {
        AddFirstIndexOfArray();
    }    
        
    public static void AddFirstIndexOfArray() 
    {
                            // 0, 1, 2, 3, 4, 5, 6,  7,  8,  9, 10 
        int arr[] = new int[] {21, 1, 3, 4, 5, 2, 1, -4, -1, 10, 55};
        int newarr[] = new int[arr.length +1];
        Scanner in  = new Scanner(System.in);
            

         for (int i = 1; i < newarr.length; i++) {
        newarr[i] = arr[i-1]; 
        }
        
        System.out.print("Введите число которое будет поставлено в начало массива:" + " ");
        int number = in.nextInt();
        in.close();  
        
        newarr[0] = number;

            System.out.print(Arrays.toString(newarr));                                    
    }        
    
}   
    /* public static int[] insertAnElementAtAGivenIndex(final int[] srcArray, int index, int newElement) {
        int[] destArray = new int[srcArray.length+1];
        int j = 0;
        for(int i = 0; i < destArray.length-1; i++) {
    
            if(i == index) {
                destArray[i] = newElement;
            } else {
                destArray[i] = srcArray[j];
                j++;
            }
        }
        return destArray;
        }   */



/* 
 * for (int i = 0; i < newarr.length; i++) {
            if (i == count){ 
                newarr[i] = number;               
            } else {
                newarr[i] = arr[count];
                count++;                    
            }             
         }    
 */
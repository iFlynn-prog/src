package Arrays2Task3;
/*Создайте массив из элементов `0, 1, 3, 4, 5, 2, 1, -4, -1, 10, 55`.
- Выведите элементы массива в обратном порядке;*/


public class App2 {
    public static void main(String[] args) {       
       RepeatArr();

    }

         public static void RepeatArr() {
        int arr[] = new int [] {0, 1, 3, 4, 5, 2, 1, -4, -1, 10, 55};
            int rezerv[] = new int [11];
            int temp = 0;

            for (int i = 0; i < arr.length; i++) {
                               
                temp = arr[arr.length -1 -i];
                rezerv[i] = temp;
                
                System.out.print(rezerv[i]);
                
            }


    
        }
    
}

/*
 * 3. Создайте массив из элементов `0, 1, 3, 4, 5, 2, 1, -4, -1, 10, 55`. Выполните следующие пункты задания:
    - Выведите все элементы массива, пока не встретится элемент -1; (Готово)
    - Выведите все элементы массива через 1; (Готово)
    - Выведите элементы массива в обратном порядке;(Готово)
    - Добавьте любой элемент в конец массива (грубо говоря, задача в том, чтобы создать новый массив размером на 1 
    больше предыдущего, загнать в него элементы предыдущего, а дальше присвоить предыдущему массиву ссылку на новый);(Готово)
    - Добавьте любой элемент в начало массива (аналогично); (Готово)
    - Удалите последний и начальный элемент из массива (аналогично).
 */


public class App {
    public static void main(String[] args) {
       
        showarray();
       
                 
    }

    public static int showarray() {
        int arr[] = new int [] {0, 1, 3, 4, 5, 2, 1, -4, -1, 10, 55};
        int rezerv[] = new int [9];
        int temp = 0;

        for (int i = 0; i < arr.length -1; i++) {        
                
            temp = arr[i];
            rezerv[i] = arr[i];
            rezerv[i] = temp;
            System.out.println(rezerv[i]);
 
           
            
        }
        return 0;
    }   
      
}


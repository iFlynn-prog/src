package Arrays2Task3;



/*3. Создайте массив из элементов `0, 1, 3, 4, 5, 2, 1, -4, -1, 10, 55`. Выполните следующие пункты задания:
- Выведите все элементы массива через 1;*/

    public class App1 {
        public static void main(String[] args) {
        ShowArr();
    }

   
    public static void ShowArr() {
        int arr[] = new int [] {0, 1, 3, 4, 5, 2, 1, -4, -1, 10, 55};
        for (int i = 0; i < arr.length; i = i + 2) {
        System.out.print(arr[i]);
            }
  
    }
}

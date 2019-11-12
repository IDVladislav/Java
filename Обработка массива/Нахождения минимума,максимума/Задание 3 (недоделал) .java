import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         System.out.println("Введите количество ячеек");
         Scanner i1 = new Scanner(System.in);
         int g = i1.nextInt();
         int [] arr;
          arr = new int [g];
         for(int i = 0; i < g ; i ++){
             System.out.println("Введите ячейку номер " + i);
             Scanner a = new Scanner(System. in);
             arr[i] = a.nextInt();
         }
         System.out.println("Итоговый массив :");
         int schet = 0;
        for(int i = 0; i < g ; i ++) {
            System.out.println(i + " = " + arr[i]);
        }
        //Вывели массив,начинаем преобразования ниже
        int  max = arr[0];
        for (int c = 0 ; c < g;c++ ) {
             for (int i = 0; i < 5; i++) {
                if (arr[c] > max) {
                    max = arr[i];

                }
             }
           if (arr[c] ==  max) {
               schet = schet + 1;
           }

        }
        System.out.println(max);
        System.out.println(" Максимальное значение : " + max);
        System.out.println(" Количество максимальных : "+ schet);
    }
}

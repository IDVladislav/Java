import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arr;
        arr = new int[20];


        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (1000 - Math.random() * 2000);
            System.out.println(i + " = " + arr[i]);
        }
        System.out.println("Преобразованно :");
        for (int i = 0; i < 20; i++) {
            if (arr[i] % 10 == 4) {
                arr[i] = arr[i] / 2;
                System.out.println(i + " = " + arr[i]);
            }
        }
        System.out.println("Итоговый массив ЗАДАНИЕ 5 (А)");
        for (int i = 0; i < 20; i++) {
            System.out.println(i + " =" + arr[i]);

        }
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0)
                arr[i] = arr[i] * arr[i];
            else arr[i] = arr[i] * 2;
        }
        System.out.println("После преобразований ЗАДАНИЕ 5 (Б)");
        for (int i = 0; i < 20; i++) {
            System.out.println(i + " =" + arr[i]);
        }
          System.out.println("Введите а , b");
         Scanner a1 = new Scanner(System.in);
        int a = a1.nextInt();
          Scanner b1 = new Scanner(System.in);
          int b = b1.nextInt();
          System.out.println("После преобразований ЗАДАНИЕ 5 (В)");
        for (int i = 0; i < 20; i++) {
          if(arr[i] % 2 == 0)
              arr[i] = arr[i] + a;
           if (i % 2 == 0)
               arr[i] = arr[i] - b;
        }
        for (int i = 0; i < 20; i++)
        System.out.println(i + " = " + arr[i]);

    }
}

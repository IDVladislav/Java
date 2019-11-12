import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int g = 0;
          int[] arr;
          arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = (int) ( Math.random() * 21); // заполню массив от 0 до 20
            System.out.println(i + " = " + arr[i]);
        }
         int  max = arr[0];
        for(int i = 0 ; i < 5; i++) {
              if(arr[i]>max){
                  max = arr[i];
                  g = i ;
              }
          }
          System.out.println("Максимальный элемент : A[" + g + "] = " + max);

        int mini = 0;
        for(int i = 0 ; i < 5; i++) {
            if(arr[i] < max){
                mini = arr[i];
                max = arr[i];
                g = i ;
            }
        }
        System.out.println("Минимальный элемент : A[" + g + "] = " + mini);
    }
}

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
                 int f = 0;
        int max2 = arr[0];
          System.out.println("Максимальный элемент : A[" + g + "] = " + max);
        for(int i = 0 ; i < 5; i++) {
            if((arr[i]>max2 && i != g )){
                max2 = arr[i];
                 f = i ;
            }
        }
        System.out.println("Максимальный элемент 2 : A[" + f + "] = " + max2);



    }
}

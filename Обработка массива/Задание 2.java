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
        for (int i = 0 ; i < 20 ; i++) {
            if((arr[i]>=10 && arr[i]<=99) || (arr[i] > -99 && arr[i] < - 10) )
                System.out.print(arr[i] + " , ");
        }
        for (int i = 0 ; i < 20 ; i++) {
            if ((arr[i] >= 100 && arr[i] <= 999) || (arr[i] > -999 && arr[i] < -100))
                System.out.print(arr[i] + " , ");
        }
        System.out.println("\b" + "\b" + ".");
    }
}

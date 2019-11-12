import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int[] arr;
        arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (1000 - Math.random() * 2000);
            System.out.println(i + " = " + arr[i]);
        }
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0)
                System.out.print(arr[i] + " , ");
        }
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 1)
                System.out.print(arr[i] + " , " );
        }
       System.out.println("\b" + "\b" + ".");
    }
    }

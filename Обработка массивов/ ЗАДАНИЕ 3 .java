import java.util.Random;
public class Main {

    public static void main(String[] args) {
        boolean n = false;
	int[] arr ;
     arr = new int[20];
     for(int i = 0;i < 20;i++) {
         arr[i] = (int) (1000 - Math.random() * 2000);
         System.out.println(i + " = " + arr[i]);
     }
        System.out.print("Номер элемента = ");
        for (int i = 0; i < 20; i++) {
            if (arr[i] % 10 == 0) {
                n = true;
                System.out.print(i + " , ");
            }
        }
        System.out.print("\b"+  "\b" + "."); // Стер 2 элемента и поставил точку
          if( n = false)
              System.out.println("Таких чисел нет");
    }

    }

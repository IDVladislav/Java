import java.util.Scanner;
import java.util.Random;
import java.lang.Math;



public class Main {
	public static void main(String[] args) {
		int [] arr = new int[12];
		 for(int i = 0; i< arr.length;i++){
			 if (i == 11 ) {
				 System.out.println(arr[i]+  ".");
			 }
			  else
			  {
				 System.out.print(arr[i] + ",");
			  }
		 }
                  // Вывели массив с 0
		  System.out.println("Введи диапазон ,где А больше B");
		 Scanner A = new Scanner(System.in);
		 Scanner B = new Scanner(System.in);
		   int min = A.nextInt();
		   int max = B.nextInt();
		   int rasnost = max- min;
		  System.out.println("Диапазон от " + min + " до " + max);
		  System.out.println("Разница между А и B = " + rasnost);

		for(int i = 0; i <= 10 ;i++) {
			arr[i] =  (int) (Math.random() * (max - min)+ min );
              if ( i == 10)
              {
				 System.out.print(arr[i] + ".");
			  }
                 else 
              	{ 
              		System.out.print(arr[i] + ",");
              	}


		}
	} 
	}

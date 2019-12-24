package com.company;

import java.util.Random;
import java.lang.Math;
 class Main {
public static void main(String[] args){
    int [] arr;
     arr = new int[10];

     for (int i =0;i <= 9;i++) {
         arr[i] = ((int )( 10 + (Math.random() * 10)) ) ;
     }
     for (int i = 0 ; i <=9 ; i++){
         System.out.println(arr[i]);
     }
     int three = 0;
     int p = arr.length / 2;
     int min = 0;
      for(int i = 0 ; i<= p;i++){
          min = i;

           for(int j = i+1; j<= p ; j++){
             if(arr[j] < arr[min] )  {
               min = j;
             }
           }
          if( min != i){
              three = arr[min];
              arr[min] = arr[i];
              arr[i] = three;
          }
      }
    System.out.println("........" );
      //Выводим
     for ( int i = 0 ; i <=9 ; i++){
        System.out.print( arr[i] +"  ");
     }
     three = 0;
    int max = 0;
     for(int i = p + 1; i<= arr.length; i++){
         max = i;
          for ( int j = i + 1 ; j <= arr.length - 1; j++){
              if(arr[j] > arr[max]) {
                 max = j;
              }
          }
            if(max != i){
              three = arr[max];
              arr[max] = arr[i];
              arr[i] = three;

            }

     }
     System.out.println("\n");
     for(int i = 0; i <= 9 ; i++){
         System.out.print(  arr[i] + "  ");
     }
}
}

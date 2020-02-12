package com.company;
import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;
public class Main {
    private int sum;

    public static void main(String[] args) throws Exception {
        System.out.println("Сколько чисел записано в файле");
        Scanner a1 = new Scanner(System.in);
        int a = a1.nextInt();
        FileReader ch = new FileReader("c");
         Scanner scan = new Scanner(ch);
         int  arr[] = new int[a];
         int i = 0 ;
          while (scan.hasNextLine()){
              arr[i] = scan.nextInt();
              i++;
          }
          ch.close();
          for(int u = 0 ; u < arr.length ;u ++){
              System.out.println(arr[u]);
          }
          int sum = arr[0];
            for(int u = 1 ; u <arr.length ;u++){
               sum = sum + arr[u];
            }

            System.out.println("Среднее арифметическое :" + sum/a);
            FileWriter result = new FileWriter("Result");
            result.write( sum);
            result.close();
        }

    }

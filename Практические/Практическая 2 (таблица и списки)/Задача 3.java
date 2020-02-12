package com.company;
public class Main{
    public static void main (String[] args){
        String [] mass = new String[9];
        mass[0]= "В поход решено взять :  " ;
        mass[1] = "Палатку ";
        mass[2] = "Котелок";
        mass[3] = "Топор";
        mass[4] = "Хлеб";
        mass[5] = "Тушенку";
        mass[6] = "Гречу";
        mass[7] = "Макароны";
        mass[8] = "Чай";
        System.out.println(mass[0]);
         for(int i = 1 ; i < mass.length;i++) {
            System.out.println(i + ". " + mass[i]);
         }

    }
}

package com.company;
public class Main{
    public static void main (String[] args){
        String [][] mass = new String[4][4];
        mass[0][0] = "Пермь - Москва" ;
        mass[1][0] = "Время полета : ";
        mass[0][2] = "2 ч 15 мин";
        mass[2][0] = "Стоимость : 4100";
        mass[2][1] = "Москва - Ростов-на-Дону";
        mass[0][1] = " Время полета : 1ч 50 мин ";
        mass[3][0] = "Cтоимость : 6500 ";
        mass[1][1] = "Такси - Порт ";
        mass[1][2] = "Время поездки:1 ч 10 мин";
        mass[3][1] = "Стоимость : 100 р";
        mass[0][3] = "Порт - Круглое";
        mass[3][2] = "Время поездки :1 ч 30 мин";
        mass[3][3] = "Cтоимсоть: 500р";
        System.out.println(mass[0][0] + "            . " + mass [2][1] + "   ." + mass[1][1] + "               ." + mass[0][3]);
        System.out.println(mass[1][0] + "" + mass[0][2] + " ." + mass[0][1] +" ." + mass[1][2] + "    ." + mass[3][2]);
        System.out.println(mass[2][0] + "          . " + mass[3][0] + "         ." + mass[3][1] + "           ." + mass [3][3]);

    }
}

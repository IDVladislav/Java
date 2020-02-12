package com.company;
public class Main{
    public static void main (String[] args){
        String [][] mass = new String[4][3];
        mass[0][0] = "Озеро : Б а й к а л " ;
        mass[1][0] = "Длинна озера : 636 , Ширина : 80 км ";
        mass[0][2] = "          Длинна его береговой линии 2100км";
        mass[2][0] = "Площадь : 31722 км^2 , Объем : 23.615.390 km^2";
        mass[2][1] = "В Байкал впадает 336  в их чесле Баргузин,Селенга";
        mass[0][1] = "                             Байкал самое глубокое озеро на Земле";
        mass[3][0] = "Глубина : 1642 м ";
        System.out.println(mass[0][0]);
        System.out.println(mass[1][0] + "    " + mass[0][2]);
        System.out.println(mass[2][0] + "    " + mass[2][1]);
        System.out.println(mass[3][0] + "    " + mass[0][1]);
    }
}

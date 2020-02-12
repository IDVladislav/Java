package com.company;
public class Main{
    public static void main (String[] args){
        String [] mass = new String[4];
        mass[0]= "Биологи выделяют 4 видов енотов" ;
        mass[1] = "Еноты  : ............................ Ракоед,тремарьяскийб барбадосский, полоскун,багаманский,гваделупский";
        mass[2] = "Коати или носатые еноты :............ Белоносый,южноамериканский) ";
        mass[3] = "Горные коати и кольцехвостые еноты :..Какомицли, центральноамериканский комилци";


        System.out.println(mass[0]);
         for(int i = 1 ; i < mass.length;i++) {
            System.out.println(i + ". " + mass[i]);
         }

    }
}

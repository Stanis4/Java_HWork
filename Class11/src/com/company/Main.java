package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.Spliterator;

public class Main {
    public enum Seasons
    {
    WINTER ("Зима"),
    SUMMER ("Лето"),
    SPRING ("Весна"),
    FALL ("Осень");



        private String season;

        Seasons(String season) {
            this.season = season;
        }

        @Override
        public String toString(){
            return "Season " + "is "+ season;
        }

    }


    public static void main(String[] args) {

        Seasons summer = Seasons.valueOf("SUMMER");
        System.out.println(summer);

        /*System.out.println(Arrays.toString(Seasons.values()));
        for (Seasons season: Seasons.values()
             ) {
            System.out.println(season);
        }*/

        Seasons arg = Seasons.FALL;

        switch (arg){
            case WINTER:
                System.out.println("It's winter!");

            case SUMMER:
                System.out.println("It's summer");

            case SPRING:
                System.out.println("It's spring!");
            case FALL:
                System.out.println("It's fall!");
        }


    }
}

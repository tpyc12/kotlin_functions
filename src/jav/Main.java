package jav;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String nameOfMonth = "январь";

        String season;

        switch (nameOfMonth.toLowerCase()) {
            case "Декабрь":
            case "январь":
            case "февраль":
                season = "Зима";
                break;
            case "март":
            case "апрель":
            case "май":
                season = "весна";
                break;
            case "июнь":
            case "июль":
            case "август":
                season = "лето";
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                season = "осень";
                break;
            default:
                season = "null";
        }
        System.out.println(season);
    }

}



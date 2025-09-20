package basics;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class p028_GenerateRandomNumberStrings {
    public static void main(String[] args){
        Random random = new Random();
        int randInt = random.nextInt(1000);
        System.out.println("Random integer 0 - 999: " + randInt);

        double randDouble = random.nextDouble();
        System.out.println("Random Double from 0.00 to 1.00: " + randDouble);

        double randomMathdouble = Math.random();
        System.out.println("Math.random() : " + randomMathdouble    );

        String randomNumeric = RandomStringUtils.randomNumeric(10);
        System.out.println("Random String Numeric by Appache CommonLang librari: " + randomNumeric);

        String randomAlpha = RandomStringUtils.randomAlphabetic(5);
        System.out.println("Random Alphabetic String by Appache CommonLang librari: " + randomAlpha);
    }
}

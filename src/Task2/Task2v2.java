package Task2;

import java.util.Scanner;

public class Task2v2 {
    public static void main(String[] args) {
        System.out.println(massageOut());
    }

    public static Scanner inputStr() {
        return new Scanner(System.in);
    }

    public static boolean equalsString() {
        return inputStr().nextLine().equals(inputStr().nextLine());
    }

    public static String massageOut() {
        if (equalsString()) {
            return "Строки равны";
        } else {
            return "Строки неравны";
        }
    }
}
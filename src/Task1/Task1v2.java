package Task1;

import java.util.Scanner;

public class Task1v2 {

    public static void main(String[] args) {
        System.out.println("Your result: " + operationsWithNum());
        System.out.println(equalsNum());
    }

    public static Integer inputNum() {
        return new Scanner(System.in).nextInt();
    }

    public static void dialogBeforeOperation(String str) {
        System.out.println(str);
    }

    public static int operationsWithNum() {
        dialogBeforeOperation("Input first num: ");
        int a = inputNum();
        dialogBeforeOperation("Input second num: ");
        int b = inputNum();
        dialogBeforeOperation("Input operation(1:'+',2:'-',3:'*',4:'/', 5:'<', 6:'>', 7:'='): ");
        int choice = inputNum();

        switch (choice) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;
            default:
                dialogBeforeOperation("Unknown command!");
        }
        return 0;
    }

    public static boolean equalsNum() {
        dialogBeforeOperation("Input first num: ");
        int a = inputNum();
        dialogBeforeOperation("Input second num: ");
        int b = inputNum();
        dialogBeforeOperation("Input operation(1:'<', 2:'>', 3:'='): ");
        int choice = inputNum();

        switch (choice) {
            case 1:
                return a < b;
            case 2:
                return a > b;
            case 3:
                return a == b;
            default:
                dialogBeforeOperation("Unknown command!");
        }
        return false;
    }
}
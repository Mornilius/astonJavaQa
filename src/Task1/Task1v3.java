package Task1;

import java.util.Scanner;

public class Task1v3 {

    public static void main(String[] args) {
        System.out.println("Your result: " + operationsWithNum());
        System.out.println("Your result: " + equalsNum());
    }

    public static Scanner inputNum() {
        return new Scanner(System.in);
    }

    public static void dialogBeforeOperation(String str){
        System.out.println(str);
    }

    public static String equalsNum() {
        dialogBeforeOperation("Input first num: ");
        int a = inputNum().nextInt();
        dialogBeforeOperation("Input second num: ");
        int b = inputNum().nextInt();

        if(a < b) {
            return  a + "<" + b;
        }else if(a > b) {
            return a + ">" + b;
        }else {
            return a + "=" + b;
        }
    }

    public static int operationsWithNum() {
        dialogBeforeOperation("Input first num: ");
        int a = inputNum().nextInt();
        dialogBeforeOperation("Input second num: ");
        int b = inputNum().nextInt();
        dialogBeforeOperation("Input operation('+','-','*','/'): ");
        char choice = inputNum().next().charAt(0);

        switch (choice){
            case '+':

                return a + b;
            case '-':

                return a - b;
            case '*':

                return a * b;
            case '/':

                return a / b;
            default:
                dialogBeforeOperation("Unknown command!");
        }
        return 0;
    }
}
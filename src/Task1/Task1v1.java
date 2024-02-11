package Task1;

public class Task1v1 {

    public static void main(String[] args) {
        System.out.println("Your result: " + equalsInt(1, 1));
        System.out.println("Your result: " + operationWithNum(20, '/', 20));
    }

    public static String equalsInt (int a, int b) {
        if(a < b) {
            return  a + "<" + b;
        }else if(a > b) {
            return a + ">" + b;
        }else {
            return a + "=" + b;
        }
    }

    public static int operationWithNum(int a, char operation, int b) {
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                System.out.println("Unknown command");
        }
        return 0;
    }
}
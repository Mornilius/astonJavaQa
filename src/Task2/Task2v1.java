package Task2;

public class Task2v1 {
    public static void main(String[] args) {
        equalsString("Петя", "Петя");
    }

    public static void equalsString(String str, String str2){
        if(str.equals(str2)){
            System.out.println("Строки равны");
        }else{
            System.out.println("Строки неравны");
        }
    }
}
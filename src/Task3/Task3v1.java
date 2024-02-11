package Task3;

public class Task3v1 {
    public static void main(String[] args) {
        outputEvenNum(new int[]{1,2,3,4,5,6,7,8,9,10});
    }

    public static void outputEvenNum(int[] array){
        for(int i : array){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

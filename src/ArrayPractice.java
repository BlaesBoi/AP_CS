import java.util.Arrays;
import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {
        int [] numbers = new int [10];
        System.out.println(Arrays.toString(numbers));
        for (int i=0; i<numbers.length; i++){
            numbers[i] = i+1;
        }
        System.out.println(Arrays.toString(numbers));



    }

    public static void randomArray() {
        int length = (int)(Math.random()*10)+1;
        int [] array = new int [length];
        for (int i=0; i<length; i++){
            array [i] = (int) (Math.random()*10)+1;
        }



    }
}

import java.util.*;




public class mostFrequent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your number");
        int n = scan.nextInt();
        int max = -1;
        int[] array = new int[10];

        n = Math.abs(n);
        while (n>0) {
            int temp = n%10;
            n/=10;
            array[temp]++;
        }
        for (int i = 0; i<array.length-1; i++ ) {

            if (array[i]>max){
                max = array[i];
            }

            }
        for(int x=0; x<array.length; x++) {
            if (array[x] == max) {
                System.out.print(x);
            }
            }

    }

}

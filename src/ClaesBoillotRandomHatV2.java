
import java.util.*;


public class ClaesBoillotRandomHatV2 {
    public static void main(String[] args){
            intro();
    }


    public static void intro(){
        Scanner scan = new Scanner(System.in); //asks for number of teams and calls the next two methods
        System.out.println("How many teams?");
        int n = scan.nextInt();
        int[] teams = populateFor(n);
        randomSelect(teams,n);
    }

    public static int[] populateFor(int n){  //populates the array
       int[] bringBack = new int[n+2];
        for (int i = 0; i<n;i++) {
            bringBack[i] = i;
        }
        bringBack[bringBack.length-1] = -1;
        return bringBack;
    }


    public static void randomSelect(int[] teams, int n){
        int rand1 = (int) (Math.random()*(n-1)) ;     //randomly selects two different teams
        teams[rand1]= -1;
        int rand2 = (int) (Math.random()*(n-1)) ;
        while (rand2 == -1){
            rand2 = (int) (Math.random()*(n-1)) ;
        }
        System.out.println("Team 1 is " + rand1);
        System.out.println("Team 2 is " + rand2);
    }
}

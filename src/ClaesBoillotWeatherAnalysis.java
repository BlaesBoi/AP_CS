
    import java.util.Arrays;
import java.util.Scanner;

    public class ClaesBoillotWeatherAnalysis {
        public static void main(String[] args) {
            System.out.println("How many days' temperatures? ");
            Scanner scan = new Scanner(System.in);


            int days = scan.nextInt();
            int[] numbers = new int[days];

            double avg = average(days, scan, numbers);
            above(numbers, avg, days);


        }

        public static double average(int days, Scanner scan, int[] numbers) { //determines the average temp of the days
            double avg = 0;
            for (int i = 0; i < days; i++) {
                System.out.println("Day" + (i + 1) + "'s high temp:");
                int currentTemp = scan.nextInt();
                numbers[i] = currentTemp;
                avg += currentTemp;

            }
            avg /= days;
            return avg;
        }

        public static void above(int[] numbers, double avg, int days) {  //checks for how many days are above average
            int aboveAvg = 0;

            for (int i : numbers) {
                if (i > avg) {
                    aboveAvg++;
                }
            }
            System.out.println("Average temp = " + avg);                    //replies based on what was input
            if (aboveAvg > 1) {System.out.println(aboveAvg + " days were above average.");}
            else if (aboveAvg == 1) System.out.println("1 day was above average.");
            else if (days == 1) {System.out.println("Only one day was input");}
            else { System.out.println("Please input a number above 0");}

        }
    }

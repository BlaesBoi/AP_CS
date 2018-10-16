
    import java.util.Arrays;
import java.util.Scanner;

    public class ClaesBoillotWeatherAnalysis2 {
        public static void main(String[] args) {
            System.out.println("How many days' temperatures? ");
            Scanner scan = new Scanner(System.in);


            int days = scan.nextInt();
            int[] numbers = new int[days];
            int[] temps   = new int[days];

            double avg = average(days, scan, numbers, temps);
            above(numbers, avg, days);
            System.out.print(Arrays.toString(temps));
            HottestDays(temps);
            ColdestDays(temps);


        }

        public static double average(int days, Scanner scan, int[] numbers, int[] temps) { //determines the average temp of the days
            double avg = 0;
            for (int i = 0; i < days; i++) {
                System.out.println("Day" + (i + 1) + "'s high temp:");
                int currentTemp = scan.nextInt();
                temps[i] = currentTemp;
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
            System.out.println("Average temp = " + (double)Math.round(avg * 10d) / 10d);                    //replies based on what was input
            if (aboveAvg > 1) {System.out.println(aboveAvg + " days were above average.");}
            else if (aboveAvg == 1) System.out.println("1 day was above average.");
            else if (days == 1) {System.out.println("Only one day was input");}
            else { System.out.println("Please input a number above 0");}


        }
        public static void HottestDays(int[] temps) {
            //Code for Calculating the hottest day
            int hottest = 0;
            int second=0;
            for (int i = 0; i < temps.length; i++) {
                if (temps[i] > hottest) {
                    second=hottest;
                    hottest=temps[i];
                }


            }
            System.out.println("Two hottest days: "+hottest+", "+second);
        }
        public static void ColdestDays(int[] temps) {
            //Code for Calculating the hottest day
            int hottest = 100000000;
            int second = 1000000000;
            for (int i = 0; i < temps.length; i++) {
                if (temps[i] < hottest) {
                    second = hottest;
                    hottest = temps[i];
                }

            }
            System.out.println("Two coldest days: " + hottest + ", " + second);
        }

    }

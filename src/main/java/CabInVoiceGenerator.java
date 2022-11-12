import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CabInVoiceGenerator {
    public static final int COST_PER_KMS = 10;
    public static final int COST_PER_MIN = 1;
    public static int totalNumberOfRides;
    public static double totalFare;
    public static double AverageFarePerRide;
    public static double totalDistance;
    public static double totalTime;
    public static void getEnhancedInvoice() {
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rides");
        totalNumberOfRides = sc.nextInt();
        while (counter <= totalNumberOfRides) {
            System.out.println("Enter the details of " + counter + " ride");
            System.out.println("Enter the distance for ride: " + counter);
            double distanceCovered = sc.nextDouble();
            totalDistance = totalDistance + distanceCovered;
            System.out.println("Enter the time for ride: " + counter);
            double timeSpent = sc.nextDouble();
            totalTime = totalTime + timeSpent;
            counter++;
        }
        getInvoice(totalDistance, totalTime);
        sc.close();
    }

    public static double getInvoice(double totalKms, double getTime) {
        double totalFare;
        totalFare = (totalKms * COST_PER_KMS) + (getTime * COST_PER_MIN);
        if (totalFare <= 5) {
            totalFare = 5;
            System.out.println("--------------Invoice------------");
            System.out.println("Total payable amount : 5");
            System.out.println("---------------------------------");
            return totalFare;

        } else {
            System.out.println("--------------Invoice------------");
            System.out.println("Total distance travelled : " + totalKms);
            System.out.println("Total Ride Duration : " + getTime);
            System.out.println("Total payable amount for ride is " + totalFare);
            System.out.println("Average Fare Per Ride is " + totalFare / totalNumberOfRides);
            System.out.println("---------------------------------");
            return totalFare;
        }
    }

    public static void main(String[] args) {
           getEnhancedInvoice();
//		generateInvoiceAsPerUserID();
      //  generateInvoiceAsPerUserID();
    }

}


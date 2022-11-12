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
    static List<RideRepository> userList = new ArrayList<>();

    public static void rideInventory() {
    }

    public static void generateInvoiceAsPerUserId() {
        RideRepository user1 = new RideRepository(1, 10.0, 20.01);
        RideRepository user2 = new RideRepository(2, 20.0, 40.0);
        RideRepository user3 = new RideRepository(2, 40.0, 60.0);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        System.out.println("Enter User Id To Get Invoice");
        Scanner sc = new Scanner(System.in);
        int userid = sc.nextInt();
        int id = userid - 1;
        System.out.println(userList.get(userid).getTotalDistance());
    }

    public static void getEnhancedInvoice() {
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No Of Rides");
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
            //System.out.println("Average Fare Per Ride is "+totalFare/totalNumberOfRides);
            System.out.println("---------------------------------");
            return totalFare;
        }
    }

  public static void main(String[] args) {
        getEnhancedInvoice();

  }
  }


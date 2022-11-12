import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CabInVoiceGenerator {
    public static final int COST_PER_KMS=10;
    public static final int COST_PER_MIN=1;

    public static double getInvoice(double totalKms,double getTime) {

        double totalFare;
        totalFare = (totalKms*COST_PER_KMS)+(getTime*COST_PER_MIN);
        if(totalFare<=5) {
            totalFare=5;
            System.out.println("--------------Invoice------------");
            System.out.println("Total payable amount : 5");
            System.out.println("---------------------------------");
            return totalFare;

        }else {
            System.out.println("--------------Invoice------------");
            System.out.println("Total distance travelled : "+totalKms);
            System.out.println("Ride Duration : "+getTime);
            System.out.println("Total payable amount : "+totalFare);
            System.out.println("---------------------------------");
            return totalFare;
        }
    }

    public static double totalPayableAmount(double totalCabCharge[]) {
        double sum = 0;
        for (int i = 0; i<totalCabCharge.length;i++) {
            sum = sum + totalCabCharge[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rides");
        int numberOfRides = sc.nextInt();
        double totalCabCharge [] = new double[numberOfRides];
        while(counter<=numberOfRides){
            System.out.println("Enter the details of "+counter+" ride");
            System.out.println("Enter the distance for ride: "+counter);
            double distanceCovered = sc.nextDouble();
            System.out.println("Enter the time for ride: "+counter);
            double timeSpent = sc.nextDouble();
            totalCabCharge [counter-1] = getInvoice(distanceCovered,timeSpent);
            counter++;
        }
        //double sum =  totalPayableAmount(totalCabCharge);
        System.out.println("Total payable Amount for "+numberOfRides+" ride is "+totalPayableAmount(totalCabCharge));
    }
}


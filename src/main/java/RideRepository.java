public class RideRepository {
    int costPerMin;
    double totalDistance;
    double totalFare;

    public RideRepository(int costPerMin, double totalDistance, double totalFare) {
        this.costPerMin = costPerMin;
        this.totalDistance = totalDistance;
        this.totalFare = totalFare;
    }

    public int getCostPerMin() {
        return costPerMin;
    }

    public void setCostPerMin(int costPerMin) {
        this.costPerMin = costPerMin;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public Object getTotalRideDuration() {
        return getTotalRideDuration();
    }
}

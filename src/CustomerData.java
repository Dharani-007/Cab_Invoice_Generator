public class CustomerData {
    private String name;
    private int distance; // in km
    private int time; // in min
    private double totalFare;
    public static CustomerData instance;

    private CustomerData() {

    }

    public static CustomerData getInstance() {
        if (instance == null) {
            instance = new CustomerData();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

}

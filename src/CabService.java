import java.util.Scanner;

public class CabService {

    public double calculatePerRideFare() {
        CustomerData customer = CustomerData.getInstance();
        bookCab();
        customer.setTotalFare((customer.getDistance() * 10) + customer.getTime());
        if (customer.getTotalFare() < 5) {
            customer.setTotalFare(5);
        }
        System.out.println();
        System.out.println("Customer Name: " + customer.getName() + " \nTotal Fare is: Rs." + customer.getTotalFare());
        return customer.getTotalFare();
    }

    public void bookCab() {
        Scanner sc = new Scanner(System.in);
        CustomerData customer = CustomerData.getInstance();
        System.out.println("Enter Customer Data");
        System.out.print("Name: ");
        String name = sc.next();
        customer.setName(name);
        System.out.print("Distance: ");
        int distance = sc.nextInt();
        customer.setDistance(distance);
        System.out.print("Time: ");
        int time = sc.nextInt();
        customer.setTime(time);
    }

}

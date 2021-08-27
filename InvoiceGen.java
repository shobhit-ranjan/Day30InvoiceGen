import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceGen {
	static int dis;
	static int time;
	static int noOfRides;
	static int totalDistance;
	static int totalTime;
	static ArrayList<Integer> mutipleRideforDis = new ArrayList<>();
	static ArrayList<Integer> mutipleRideforTime = new ArrayList<>();

	static Scanner sc = new Scanner(System.in);
	static Invoice inv;

	static void getridedetails() {
		System.out.println("Hey! how may ride you want today with us");
		noOfRides = sc.nextInt();

		for (int i = 0; i < noOfRides; i++) {
			System.out.println(" Enter the distance for your ride  ");
			dis = sc.nextInt();
			System.out.println(" Enter the Time in min ");
			time = sc.nextInt();
			mutipleRideforDis.add(dis);
			mutipleRideforTime.add((time));
		}
		mutipleRideforDis.forEach(dis -> {

			System.out.println(dis);
			totalDistance = totalDistance + dis;
		});
		mutipleRideforTime.forEach(time -> {

			System.out.println(time);
			totalTime = totalTime + time;
		});
		System.out.println(totalDistance);
		//System.out.println(totalTime);

	}

	static void billGenerater() {
		if ((mutipleRideforDis != null) && (mutipleRideforTime != null)) {

			int totalcost = (totalDistance * 10) + totalTime;

			if (totalcost < 5) {
				System.out.println("for today you have pay 5$ as a base fare");
			} else {
				System.out.println("for today you have pay " + totalcost + " $ as you fare");
			}

			System.out.println("your total no of ride with us was " + noOfRides);
			System.out.println("your total cost with  with us was " + totalcost);
			int avrRide = (totalcost / noOfRides);
			System.out.println("your avg fare per ride was " + avrRide);

		} else {
			System.out.println(" you did't ride with us !!");
		}
	}
}

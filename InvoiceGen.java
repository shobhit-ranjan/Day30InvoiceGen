import java.util.Scanner;

public class InvoiceGen {
	static int dis;
	static int time;

	static void getridedetails() {
		Invoice ride = new Invoice();
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the distance ");
		dis = sc.nextInt();
		//ride.setDistance(sc.next());
		System.out.println(" Enter the Time in min ");
		time = sc.nextInt();
		//ride.setTime(sc.next());
		sc.close();

	}

	static void billGenerater() {
		int totalcost = (dis * 10) + time;
		
		if(totalcost<5)
		{
			System.out.println("for today you have pay 5$ as a base fare");
		}
		else
		{
			System.out.println("for today you have pay " + totalcost + " $ as you fare");
		}
		
		
		
	}
}

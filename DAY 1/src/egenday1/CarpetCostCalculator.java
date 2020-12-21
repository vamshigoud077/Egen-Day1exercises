package egenday1;
import java.util.Scanner;


public class CarpetCostCalculator {
	public static void main(String args[]) {
		
	

	Scanner scan = new Scanner(System.in);
	System.out.print("Enter Length of the carpet :");
	int length = scan.nextInt();
	System.out.println("Enter width of the carpet :");  
	int width = scan.nextInt();
	System.out.println("Enter cost of the carpet per square foot : ");
	int costPerSquareFoot = scan.nextInt();
	scan.close();
	
	RoomDimension roomDimension = new RoomDimension(length, width);
	
	RoomCarpet roomCarpet = new RoomCarpet(roomDimension, costPerSquareFoot);
	
	int totalCostofCarpet = roomCarpet.totalCostOfCarpet();
	System.out.println ("Total carpet cost is :"+totalCostofCarpet);
	
	

}
}
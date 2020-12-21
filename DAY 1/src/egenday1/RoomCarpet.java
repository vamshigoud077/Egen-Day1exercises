package egenday1;

public class RoomCarpet {
	private RoomDimension roomDimension;
	private int costPerSquareFoot;
	public RoomCarpet(RoomDimension roomDimension, int costPerSquareFoot) {
		
		this.roomDimension = roomDimension;
		this.costPerSquareFoot = costPerSquareFoot;
	}
	public int totalCostOfCarpet() {
		return roomDimension.area() * costPerSquareFoot;
	}
	
	
	

}

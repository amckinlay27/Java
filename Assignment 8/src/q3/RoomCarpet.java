package q3;

/**<h1>Assignment 8 - Q3: RoomCarpet</h1>
 * RoomCarpet takes a RoomDimension object in order to determine the cost to carpet a room. 
 * 
 * @author Adam McKinlay c0656685
 * @since 2019-04-03
 *	
 *																				 	      */
public class RoomCarpet {
	private RoomDimension size;
	private double carpetCost;
	
	/**Constructor creates instance of carpet cost for a room.
	 * 
	 * @param size			size of a room.
	 * @param carpetCost	the cost per square foot.
	 */
	public RoomCarpet(RoomDimension size, double carpetCost) {
		this.size = size;
		this.carpetCost = carpetCost;
	}//Constructor
	
	/**getTotalCost returns the cost for carpet for an entire room.
	 * 
	 * @return	the cost of carpet for an entire room.
	 */
	public double getTotalCost() {
		return size.getArea() * carpetCost;
	}//getTotalCost
	
	@Override
	/**toString returns the RoomCarpet Object as string.
	 * 
	 */
	public String toString(){
		return "The cost per square foot is $" + carpetCost + ".";
	}//toString
}//RoomCarpet

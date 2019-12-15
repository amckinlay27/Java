package q3;

/**<h1>Assignment 8 - Q3: RoomDimension</h1>
 * This RoomDimension creates an object with a rooms dimensions and area.
 * 
 * @author Adam McKinlay c0656685
 * @since 2019-04-03
 *	
 *																					     		     */
public class RoomDimension {
	private double length;
	private double width;
	
	/**The Constructor constructs the RoomDimension object.
	 * 
	 * @param length	the length of the room.
	 * @param width		the width of the room.
	 */
	public RoomDimension(double length, double width) {
		this.length = length;
		this.width = width;
	}//Constructor
	
	/**getArea returns the area of a room.
	 * 
	 * @return	the area of a room.
	 */
	public double getArea() {
		return length * width;
	}//getArea
	
	@Override
	/**toString converts an object to string.
	 * 
	 */
	public String toString() {
		return "The length of the room is " + length + "ft and the width of the room is " + width + "ft.";
	}//toString
}//RoomDimension

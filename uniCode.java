/*
 * 
 * 
 */


public class uniCode {

	public static void main(String[] args) {
		
		String horizontalRail;	// ━
		String verticalRail;		// ┃
		String tlCorner;			// ┏
		String trCorner;			// ┓
		String brCorner;			// ┛
		String blCorner;			// ┗
		
		String char1 = "\u03A0";
		
		
		
		horizontalRail = "\u2501";
		verticalRail = "\u2503";
		tlCorner = "\u250F";
		trCorner = "\u2513";
		brCorner = "\u251B";
		blCorner = "\u2517";
		
		
		System.out.println(tlCorner+horizontalRail+horizontalRail+trCorner);
		System.out.println(verticalRail+"  " +verticalRail);
		System.out.println(blCorner+horizontalRail+horizontalRail+brCorner);
		
	}
	
}

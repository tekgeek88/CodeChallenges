
public class InClass {
	
	public static void main(String[] args){
		
		
		int x;
		int z;
		int output1; // output x
		int youtput2;// output z
		
		System.out.print("Enter value for x: ");
		x = TextIO.getInt();
		
		System.out.print("Enter value for z: ");
		z = TextIO.getInt();
		
		
		if (x < 0){
			output1 = 1;	
		}// end if
		else {
			output1 = 2;
		}// end else
		
		
		if (z < 0){
			youtput2 = 1;	
		}// end if
		if (z >= 0) {
			
		youtput2 = 2;
			
		System.out.println("output1 is:" + output1);
		System.out.println("youtput2 is:" + youtput2);
		}
	}
}

public class Abc {
	
	public static void copyArg(String str1 str2) {
		str2 = str1;
		
		System.out.println("String 1 is :" + str1);
		System.out.println("String 2 is :" + str2);
	
		
	}
	public static void main(String[] args){
		
		String str1, str2;
		copyArg(str1);
		str1 = "ABC";
		str2 = "XYZ";
	}
	
}

/* Some awsome comments about
 * what this program does
 * 
 */
public class CodeChallenge05 {

	public static void main(String[] args) {
        
        // the current value of k
        double z;
        // initializing
        z = 0;
        // sum of all k outputs
        double sk;
        //initializing
        sk = 0;
        // value of k^2
        double v;
       
       
       
        System.out.println("The sum and k: ");
        for (double k = 1; k <= 20000; k++){
               
               
                v = Math.pow(k, 2);
                sk = v*10 - 4*k + 2;
               
               
                /*System.out.printf("%2.0f", k);
                System.out.print(", ");
                System.out.printf("%2.2f", sk);
                System.out.print(" ");
                System.out.println(); */
               
                if (sk > 20000){
                        z = k;
                        break;
                }
               
        }
       
        /*
         * Prints out all the final values
         */
       
       
        System.out.println();
        System.out.print("The final value of k = ");
        System.out.println(z);
        System.out.print("The final sum value  = ");
        System.out.println(sk);
       
	}
}
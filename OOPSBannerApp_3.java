/**
 * @author: Om Rajput
 * @version: 1.0
 */
 
public class OOPSBannerApp_3 {
    public static void main(String[] args) {
        // Line 1
        String line1 = String.join(""," **** ", "  **** ", "  ****  ", "  **** ");
        
        // Line 2
        String line2 = String.join("","*    *", " *    *", " *   * ", " *     ");
        
        // Line 3
        String line3 = String.join("","*    *", " *    *", " ****  ", "  ***  ");
        
        // Line 4
        String line4 = String.join("","*    *", " *    *", " *     ", "     * ");
        
        // Line 5
        String line5 = String.join(""," **** ", "  **** ", " *     ", " ****  ");

        // Printing the result
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}
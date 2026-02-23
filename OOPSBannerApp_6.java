/*
*
*@author:Om Rajput
*@version:1.0
*
*/

public class OOPSBannerApp_6 {

    // Method to generate banner for letter O
    public static String[] generateO() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Method to generate banner for letter P
    public static String[] generateP() {
        return new String[] {
            " ***** ",
            "*     *",
            " ***** ",
            "*      ",
            "*      "
        };
    }

    // Method to generate banner for letter S
    public static String[] generateS() {
        return new String[] {
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        // Invoking methods during array declaration
        String[][] banner = {
            generateO(),
            generateO(),
            generateP(),
            generateS()
        };

        // Display banner row by row
        for (int row = 0; row < banner[0].length; row++) {
            for (int col = 0; col < banner.length; col++) {
                System.out.print(banner[col][row] + "  ");
            }
            System.out.println();
        }
    }
}
/*
*
*@author:Om Rajput
*@version:1.0
*
*/

public class OOPSBannerApp_6 {

    public static String[] generateO() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    public static String[] generateP() {
        return new String[] {
            " ***** ",
            "*     *",
            " ***** ",
            "*      ",
            "*      "
        };
    }

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

        String[][] banner = {
            generateO(),
            generateO(),
            generateP(),
            generateS()
        };

        for (int row = 0; row < banner[0].length; row++) {
            for (int col = 0; col < banner.length; col++) {
                System.out.print(banner[col][row] + "  ");
            }
            System.out.println();
        }
    }
}
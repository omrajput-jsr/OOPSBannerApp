import java.util.*;

public class OOPSBannerApp_8 {

    // Function to render banner text
    public static void renderText(String text, Map<Character, String[]> patterns) {
        int height = 7; // height of each character pattern

        for (int i = 0; i < height; i++) {
            for (char ch : text.toCharArray()) {
                if (patterns.containsKey(ch)) {
                    System.out.print(patterns.get(ch)[i] + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = new HashMap<>();

        // Pattern for O
        patterns.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for P
        patterns.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        // Pattern for S
        patterns.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        // Print OOPS banner
        renderText("OOPS", patterns);
    }
}
/*
*@author: Om Rajput
*@version: v1.0
*/
class CharacterPattern {

    private char character;
    private String[] pattern;

    public CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public char getCharacter() {
        return character;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class OOPSBannerApp_7 {

    public static void main(String[] args) {

        CharacterPattern oPattern = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern pPattern = new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        CharacterPattern sPattern = new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        CharacterPattern[] patterns = {oPattern, pPattern, sPattern};

        String word = "OOPS";

        for (int row = 0; row < 5; row++) {

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);

                for (int j = 0; j < patterns.length; j++) {
                    if (patterns[j].getCharacter() == ch) {
                        System.out.print(patterns[j].getPattern()[row] + "  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
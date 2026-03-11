import java.util.HashMap;
import java.util.Map;
public class OOPSBannerUC8 {
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> characterMap = new HashMap<>();

        characterMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        characterMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*       ",
                "*       ",
                "*       "
        });

        characterMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return characterMap;
    }
    public static void renderBanner(String message, Map<Character, String[]> characterMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = characterMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }
            }

            System.out.println(line);
        }
    }
    public static void main(String[] args) {

        String message = "OOPS";

        Map<Character, String[]> characterMap = buildCharacterMap();

        renderBanner(message, characterMap);
    }
}
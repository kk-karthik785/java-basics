public class OOPSBannerUC7 {
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;
        public CharacterPatternMap(char character, String[] pattern) {
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
    public static CharacterPatternMap createOPattern() {
        return new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });
    }
    public static CharacterPatternMap createPPattern() {
        return new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*       ",
                "*       ",
                "*       "
        });
    }
    public static CharacterPatternMap createSPattern() {
        return new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
    }
    public static void main(String[] args) {
        CharacterPatternMap[] patterns = {
                createOPattern(),
                createOPattern(),
                createPPattern(),
                createSPattern()
        };
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : patterns) {
                line.append(cp.getPattern()[row]).append(" ");
            }

            System.out.println(line);
        }
    }
}
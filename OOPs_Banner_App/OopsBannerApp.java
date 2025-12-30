package OOPs_Banner_App;

public class OopsBannerApp {

    public static void main(String[] args) {
        uc1();
        uc2();
        uc3();
    }

    public static void uc1() {
        String str = "OOPS";
        System.out.println(str);
    }

    public static void uc2() {
        String[] O = {
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
        String[] P = {
                "*******  ",
                "*      * ",
                "*      * ",
                "*******  ",
                "*        ",
                "*        ",
                "*        "
        };
        String[] S = {
                " ******* ",
                " *       ",
                " *       ",
                " ******* ",
                "       * ",
                "       * ",
                " ******* "
        };
        String[][] oops = {O, O, P, S};
        for (int row = 0; row < O.length; row++) {
            StringBuilder line = new StringBuilder();
            for (String[] letter : oops) {
                line.append(letter[row]).append(" ");
            }
            System.out.println(line.toString());
        }
    }

    private static void uc3() {
        String[][] patterns = {
                getOPattern(),
                getOPattern(),
                getPPattern(),
                getSPattern()
        };

        printBanner(patterns);
    }

    private static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
    }

    private static String[] getPPattern() {
        return new String[]{
                "*******  ",
                "*      * ",
                "*      * ",
                "*******  ",
                "*        ",
                "*        ",
                "*        "
        };
    }

    private static String[] getSPattern() {
        return new String[]{
                " ******* ",
                " *       ",
                " *       ",
                " ******* ",
                "       * ",
                "       * ",
                " ******* "
        };
    }

    private static void printBanner(String[][] patterns) {
        for (int row = 0; row < 7; row++) {
            String line = "";
            for (String[] letter : patterns) {
                line = line + letter[row] + " ";
            }
            System.out.println(line);
        }
    }
}
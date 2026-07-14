import java.util.Scanner;

public class strat {

    static String[][] letters = new String[26][5];

    static {
        letters[0] = new String[]{
                "  *  ",
                " * * ",
                "*****",
                "*   *",
                "*   *"
        }; // A

        letters[1] = new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*   *",
                "**** "
        }; // B

        letters[2] = new String[]{
                " ****",
                "*    ",
                "*    ",
                "*    ",
                " ****"
        }; // C

        letters[3] = new String[]{
                "**** ",
                "*   *",
                "*   *",
                "*   *",
                "**** "
        }; // D

        letters[4] = new String[]{
                "*****",
                "*    ",
                "*****",
                "*    ",
                "*****"
        }; // E

        letters[5] = new String[]{
                "*****",
                "*    ",
                "*****",
                "*    ",
                "*    "
        }; // F

        letters[6] = new String[]{
                " ****",
                "*    ",
                "*  **",
                "*   *",
                " ****"
        }; // G

        letters[7] = new String[]{
                "*   *",
                "*   *",
                "*****",
                "*   *",
                "*   *"
        }; // H

        letters[8] = new String[]{
                "*****",
                "  *  ",
                "  *  ",
                "  *  ",
                "*****"
        }; // I

        letters[9] = new String[]{
                "*****",
                "  *  ",
                "  *  ",
                "* *  ",
                " **  "
        }; // J

        letters[10] = new String[]{
                "*  * ",
                "* *  ",
                "**   ",
                "* *  ",
                "*  * "
        }; // K

        letters[11] = new String[]{
                "*    ",
                "*    ",
                "*    ",
                "*    ",
                "*****"
        }; // L

        letters[12] = new String[]{
                "*   *",
                "** **",
                "* * *",
                "*   *",
                "*   *"
        }; // M

        letters[13] = new String[]{
                "*   *",
                "**  *",
                "* * *",
                "*  **",
                "*   *"
        }; // N

        letters[14] = new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }; // O

        letters[15] = new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }; // P

        letters[16] = new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*  **",
                " ****"
        }; // Q

        letters[17] = new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*  * ",
                "*   *"
        }; // R

        letters[18] = new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }; // S

        letters[19] = new String[]{
                "*****",
                "  *  ",
                "  *  ",
                "  *  ",
                "  *  "
        }; // T

        letters[20] = new String[]{
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }; // U

        letters[21] = new String[]{
                "*   *",
                "*   *",
                "*   *",
                " * * ",
                "  *  "
        }; // V

        letters[22] = new String[]{
                "*   *",
                "*   *",
                "* * *",
                "** **",
                "*   *"
        }; // W

        letters[23] = new String[]{
                "*   *",
                " * * ",
                "  *  ",
                " * * ",
                "*   *"
        }; // X

        letters[24] = new String[]{
                "*   *",
                " * * ",
                "  *  ",
                "  *  ",
                "  *  "
        }; // Y

        letters[25] = new String[]{
                "*****",
                "   * ",
                "  *  ",
                " *   ",
                "*****"
        }; // Z
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine().toUpperCase();

        int rows = 5;

        for (int i = 0; i < rows; i++) {

            for (char ch : name.toCharArray()) {

                if (ch >= 'A' && ch <= 'Z') {
                    System.out.print(letters[ch - 'A'][i] + "  ");
                } else {
                    System.out.print("     ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
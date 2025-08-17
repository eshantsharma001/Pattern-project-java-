import java.util.Scanner; // Allows reading user input from the console
import java.io.IOException; // Allows handling input/output exceptions

public class pp  {

    // Main menu method to show pattern options and read user choice
    void mainModule() {
        clear(); // Clears the screen before showing menu

        // Display all pattern options to the user
        System.out.println("\t\t\t\t   PATTERNS  \n");
        System.out.println("\t\t1. Rectangle"); // Option 1
        System.out.println("\t\t2. Square"); // Option 2
        System.out.println("\t\t3. Hollow Square"); // Option 3
        System.out.println("\t\t4. Right Half Pyramid"); // Option 4
        System.out.println("\t\t5. Diamond"); // Option 5
        System.out.println("\t\t6. Butterfly"); // Option 6
        System.out.println("\t\t7. Hollow Hourglass"); // Option 7
        System.out.println("\t\t8. Mirror Image Triangle"); // Option 8
        System.out.println("\t\t9. Swastika"); // Option 9
        System.out.println("\t\t10. X Pattern"); // Option 10
        System.out.println("\t\t11. Inverted V Pattern"); // Option 11
        System.out.println("\t\t12. V Shape Pattern"); // Option 12
        System.out.println("\t\t13. Number Triangle Pattern"); // Option 13
        System.out.println("\t\t14. Number Increasing Pyramid"); // Option 14
        System.out.println("\t\t15. Number Changing Pyramid"); // Option 15
        System.out.println("\t\t16. Zero One Triangle"); // Option 16
        System.out.println("\t\t17. Exit"); // Option 17 for exiting
        System.out.print("\n\t\tEnter your Choice -- ");

        Scanner sc = new Scanner(System.in); // Used for reading user input
        String c = sc.nextLine(); // Stores user's choice as a String
        clear(); // Clears the screen after input

        // Chooses which pattern method to call based on user input
        switch (c) {
            case "1": rectangle(); break; // Calls rectangle pattern
            case "2": square(); break; // Calls square pattern
            case "3": hollowSquare(); break; // Calls hollow square pattern
            case "4": rightHalfPyramid(); break; // Calls right half pyramid pattern
            case "5": diamond(); break; // Calls diamond pattern
            case "6": butterfly(); break; // Calls butterfly pattern
            case "7": hollowHourglass(); break; // Calls hollow hourglass pattern
            case "8": mirrorTriangle(); break; // Calls mirror triangle pattern
            case "9": swastika(); break; // Calls swastika pattern
            case "10": xPattern(); break; // Calls X pattern
            case "11": invertedV(); break; // Calls inverted V pattern
            case "12": vShape(); break; // Calls V shape pattern
            case "13": numberTriangle(); break; // Calls number triangle pattern
            case "14": numberIncreasingPyramid(); break; // Calls number increasing pyramid
            case "15": numberChangingPyramid(); break; // Calls number changing pyramid
            case "16": zeroOneTriangle(); break; // Calls zero-one triangle pattern
            case "17": return; // Exits the menu/program
            default:
                System.out.println("\n\n ---  Not a valid optuion--- \n\n\n"); // Shows error if choice is invalid
        }

        Continue(); // Asks user if they want to continue
    }

    // Prints a rectangle of stars (5 rows, 10 columns)
    void rectangle() {
        for (int i = 1; i <= 5; i++) { // Loops over 5 rows
            for (int j = 1; j <= 10; j++) { // Loops over 10 columns in each row
                System.out.print("* "); // Prints star and space
            }
            System.out.println(); // Goes to new line after each row
        }
    }

    // Prints a square of stars (5 rows, 5 columns)
    void square() {
        for (int i = 1; i <= 5; i++) { // Loops over 5 rows
            for (int j = 1; j <= 5; j++) { // Loops over 5 columns in each row
                System.out.print("* "); // Prints star and space
            }
            System.out.println(); // Goes to new line after each row
        }
    }

    // Prints a hollow square (stars on border, spaces inside)
    void hollowSquare() {
        for (int i = 1; i <= 5; i++) { // Loops over rows
            for (int j = 1; j <= 5; j++) { // Loops over columns
                if (i == 1 || i == 5 || j == 1 || j == 5) // Checks if on border
                    System.out.print("* "); // Prints star on border
                else
                    System.out.print("  "); // Prints space inside
            }
            System.out.println(); // New line after each row
        }
    }

    // Prints a right half pyramid of stars
    void rightHalfPyramid() {
        for (int i = 1; i <= 5; i++) { // Loops over rows
            for (int j = 1; j <= i; j++) { // Number of stars increases with each row
                System.out.print("* "); // Prints star and space
            }
            System.out.println(); // Moves to new line
        }
    }

    // Prints a diamond shape of stars
    void diamond() {
        int n = 5; // Number of rows for upper half
        for (int i = 1; i <= n; i++) { // Builds upper part of diamond
            for (int j = i; j < n; j++) System.out.print("  "); // Prints spaces for alignment
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("* "); // Prints stars for diamond
            System.out.println(); // New line after row
        }
        for (int i = n - 1; i >= 1; i--) { // Builds lower part of diamond
            for (int j = n; j > i; j--) System.out.print("  "); // Prints spaces for alignment
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("* "); // Prints stars for diamond
            System.out.println(); // New line after row
        }
    }

    // Prints a butterfly pattern of stars
    void butterfly() {
        int n = 5; // Controls size
        for (int i = 1; i <= n; i++) { // Upper wings
            for (int j = 1; j <= i; j++) System.out.print("* "); // Prints left wing stars
            for (int j = 1; j <= 2 * (n - i); j++) System.out.print("  "); // Prints spaces in middle
            for (int j = 1; j <= i; j++) System.out.print("* "); // Prints right wing stars
            System.out.println(); // New line
        }
        for (int i = n; i >= 1; i--) { // Lower wings
            for (int j = 1; j <= i; j++) System.out.print("* "); // Left wing
            for (int j = 1; j <= 2 * (n - i); j++) System.out.print("  "); // Spaces middle
            for (int j = 1; j <= i; j++) System.out.print("* "); // Right wing
            System.out.println(); // New line
        }
    }

    // Prints a hollow hourglass pattern
    void hollowHourglass() {
        int n = 5; // Controls size
        for (int i = 0; i < n; i++) { // Upper part
            for (int j = 0; j < i; j++) System.out.print("  "); // Indents with spaces
            for (int j = 0; j < 2 * (n - i) - 1; j++) { // Draws stars or spaces
                if (j == 0 || j == 2 * (n - i) - 2 || i == 0)
                    System.out.print("* "); // Stars on border or first row
                else
                    System.out.print("  "); // Spaces inside
            }
            System.out.println(); // Next line
        }
        for (int i = 1; i < n; i++) { // Lower part
            for (int j = i; j < n - 1; j++) System.out.print("  "); // Indent with spaces
            for (int j = 0; j <= 2 * i; j++) { // Draws stars or spaces
                if (j == 0 || j == 2 * i || i == n - 1)
                    System.out.print("* "); // Stars on border or last row
                else
                    System.out.print("  "); // Spaces inside
            }
            System.out.println(); // Next line
        }
    }

    // Prints a mirror image triangle of stars
    void mirrorTriangle() {
        for (int i = 1; i <= 5; i++) { // Loops over rows
            for (int j = 1; j <= 5 - i; j++) System.out.print("  "); // Spaces for right alignment
            for (int j = 1; j <= i; j++) System.out.print("* "); // Prints stars
            System.out.println(); // New line
        }
    }

    // Prints a swastika-like pattern using Xs
    void swastika() {
        int i, j, n = 7; // Size of swastika
        for (i = 1; i <= n + n - 1; i++) { // Rows
            for (j = 1; j <= n + n - 1; j++) { // Columns
                System.out.print((i == n || j == n) ||
                        (i < n && j == 1) ||
                        ((i >= n && i <= n + n - 1) && j == n + n - 1) ||
                        (i == 1 && j > n) ||
                        (n % 2 == 1 && ((i == n / 2 + 1 && j == n / 2 + 1) ||
                                (i == n / 2 + 1 && j == n / 2 + n) ||
                                (i == n / 2 + n && j == n / 2 + 1) ||
                                (i == n / 2 + n && j == n / 2 + n)))
                        ||
                        (n % 2 == 0 && ((i == n / 2 && j == n / 2) ||
                                (i == n / 2 && j == (n + n + n) / 2 - 1) ||
                                (i == (n + n + n) / 2 - 1 && j == n / 2) ||
                                (i == (n + n + n) / 2 - 1 && j == (n + n + n) / 2 - 1)))
                        ||
                        (i == n + n - 1 && j < n) ? "X " : "  "); // Prints "X" or space
            }
            System.out.println(); // New line after each row
        }
    }

    // Prints an X shape pattern of stars
    void xPattern() {
        int n = 7; // Size of pattern
        for (int i = 0; i < n; i++) { // Rows
            for (int j = 0; j < n; j++) { // Columns
                if (j == i || j == n - i - 1) // Checks if position needs star
                    System.out.print("* "); // Prints star
                else
                    System.out.print("  "); // Prints space
            }
            System.out.println(); // New line
        }
    }

    // Prints an inverted V shape pattern using stars
    void invertedV() {
        int n = 5; // Size of pattern
        for (int i = 0; i < n; i++) { // Rows
            for (int j = 0; j <= 2 * n; j++) { // Columns
                if (j == i || j == 2 * n - i) // Checks if position for star
                    System.out.print("*"); // Prints star
                else
                    System.out.print(" "); // Prints space
            }
            System.out.println(); // New line
        }
    }

    // Prints a V shape pattern using stars
    void vShape() {
        int n = 5; // Size of pattern
        for (int i = 0; i < n; i++) { // Rows
            for (int j = 0; j <= 2 * n; j++) { // Columns
                if (j == n - i || j == n + i) // Checks position for star
                    System.out.print("*"); // Prints star
                else
                    System.out.print(" "); // Prints space
            }
            System.out.println(); // New line
        }
    }

    // Prints a triangle pattern of increasing numbers
    void numberTriangle() {
        for (int i = 1; i <= 5; i++) { // Rows
            for (int j = 1; j <= i; j++) { // Numbers increase in each row
                System.out.print(j + " "); // Prints number
            }
            System.out.println(); // New line
        }
    }

    // Prints a pyramid pattern with continuously increasing numbers
    void numberIncreasingPyramid() {
        int num = 1; // Number to print
        for (int i = 1; i <= 5; i++) { // Rows
            for (int j = 1; j <= i; j++) { // Columns
                System.out.print(num++ + " "); // Prints and increases number
            }
            System.out.println(); // New line
        }
    }

    // Prints a pyramid pattern, each row has the same number
    void numberChangingPyramid() {
        for (int i = 1; i <= 5; i++) { // Rows
            for (int j = 1; j <= i; j++) { // Columns
                System.out.print(i + " "); // Prints row number
            }
            System.out.println(); // New line
        }
    }

    // Prints a triangle pattern with alternating 0s and 1s
    void zeroOneTriangle() {
        for (int i = 1; i <= 5; i++) { // Rows
            for (int j = 1; j <= i; j++) { // Columns
                System.out.print(((i + j) % 2 == 0 ? "1 " : "0 ")); // Prints 1 or 0 based on position
            }
            System.out.println(); // New line
        }
    }

    // Asks user if they want to repeat menu or exit
    void Continue() {
        Scanner sc = new Scanner(System.in); // Used for reading user response
        System.out.print("\n\n  Do you want to continue? (y/n): ");
        String c = sc.nextLine(); // Stores response

        if (c.equalsIgnoreCase("y")) { // If user says yes
            mainModule(); // Goes back to main menu
        } else if (c.equalsIgnoreCase("n")) { // If user says no
            System.out.println("\nThanks for using the pattern generator!"); // Prints exit message
        } else { // For any other input
            System.out.println("\nInvalid input. Try again."); // Shows error
            Continue(); // Repeats the prompt
        }
    }

    // Tries to clear the screen (works on most systems)
    void clear() {
        try {
            if (System.getProperty("os.name").contains("Windows")) { // Checks if OS is Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Clears screen
            } else {
                System.out.print("\033[H\033[2J"); // ANSI escape codes for clearing Unix/Linux/Mac
                System.out.flush(); // Ensures output is shown immediately
            }
        } catch (IOException | InterruptedException ex) { // Handles any exceptions in clearing
            System.out.println("Error clearing screen: " + ex); // Shows error message
        }
    }

    // Main method, program starts here
    public static void main(String[] args) {
        pp app = new pp(); // Creates an object of this class
        app.mainModule(); // Starts the menu and program
    }
}

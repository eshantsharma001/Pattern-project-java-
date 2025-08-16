import java.util.Scanner;
import java.io.IOException;
public class pp {
    void mainModule() {
        clear();
        System.out.println("\t\t   ---- PATTERN MENU ---- \n");
        System.out.println("\t\t1. Rectangle");
        System.out.println("\t\t2. Square");
        System.out.println("\t\t3. Hollow Square");
        System.out.println("\t\t4. Right Half Pyramid");
        System.out.println("\t\t5. Diamond");
        System.out.println("\t\t6. Butterfly");
        System.out.println("\t\t7. Hollow Hourglass");
        System.out.println("\t\t8. Mirror Image Triangle");
        System.out.println("\t\t9. Swastika");
        System.out.println("\t\t10. X Pattern");
        System.out.println("\t\t11. Inverted V Pattern");
        System.out.println("\t\t12. V Shape Pattern");
        System.out.println("\t\t13. Number Triangle Pattern");
        System.out.println("\t\t14. Number Increasing Pyramid");
        System.out.println("\t\t15. Number Changing Pyramid");
        System.out.println("\t\t16. Zero One Triangle");
        System.out.println("\t\t17. Exit");
        System.out.print("\n\t\tEnter your Choice -- ");

        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        clear();

        switch (c) {
            case "1": rectangle(); break;
            case "2": square(); break;
            case "3": hollowSquare(); break;
            case "4": rightHalfPyramid(); break;
            case "5": diamond(); break;
            case "6": butterfly(); break;
            case "7": hollowHourglass(); break;
            case "8": mirrorTriangle(); break;
            case "9": swastika(); break;
            case "10": xPattern(); break;
            case "11": invertedV(); break;
            case "12": vShape(); break;
            case "13": numberTriangle(); break;
            case "14": numberIncreasingPyramid(); break;
            case "15": numberChangingPyramid(); break;
            case "16": zeroOneTriangle(); break;
            case "17": return;
            default:
                System.out.println("\n\n ---  Sorry, you entered the wrong choice --- \n\n\n");
        }

        Continue();
    }

    void rectangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void square() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void hollowSquare() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    void rightHalfPyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void diamond() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print("  ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("* ");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) System.out.print("  ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("* ");
            System.out.println();
        }
    }

    void butterfly() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            for (int j = 1; j <= 2 * (n - i); j++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            for (int j = 1; j <= 2 * (n - i); j++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    void hollowHourglass() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) System.out.print("  ");
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                if (j == 0 || j == 2 * (n - i) - 2 || i == 0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n - 1; j++) System.out.print("  ");
            for (int j = 0; j <= 2 * i; j++) {
                if (j == 0 || j == 2 * i || i == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    void mirrorTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    void swastika() {
        int i, j, n = 7;
        for (i = 1; i <= n + n - 1; i++) {
            for (j = 1; j <= n + n - 1; j++) {
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
                        (i == n + n - 1 && j < n) ? "X " : "  ");
            }
            System.out.println();
        }
        
            
    }

    void xPattern() {
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - i - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    void invertedV() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 2 * n; j++) {
                if (j == i || j == 2 * n - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    void vShape() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 2 * n; j++) {
                if (j == n - i || j == n + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    void numberTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void numberIncreasingPyramid() {
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    void numberChangingPyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    void zeroOneTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(((i + j) % 2 == 0 ? "1 " : "0 "));
            }
            System.out.println();
        }
    }

    void Continue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\n  Do you want to continue? (y/n): ");
        String c = sc.nextLine();

        if (c.equalsIgnoreCase("y")) {
            mainModule();
        } else if (c.equalsIgnoreCase("n")) {
            System.out.println("\nThanks for using the pattern generator!");
        } else {
            System.out.println("\nInvalid input. Try again.");
            Continue();
        }
    }

    void clear() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException ex) {
            System.out.println("Error clearing screen: " + ex);
        }
    }

    public static void main(String[] args) {
        pp app = new pp();
        app.mainModule();
    }
}

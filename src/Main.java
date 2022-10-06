import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        {
            for (int x = 0; x <= 30; x++) {
                System.out.print(" " + x);
            }
            System.out.println();
            {

                for (int x = 30; x >= 0; x--) {
                    System.out.print(" " + x);
                }
                System.out.println();
                {

                    for (int x = 0; x <= 18; x += 3) {
                        System.out.print(" " + x);
                    }
                    System.out.println();
                    {

                        for (int x = 10; x >= 0; x -= 2) {
                            System.out.print(" " + x);
                        }
                    }
                    System.out.println();
                    {

                        for (int g = 1; g <= 5; g++) {
                            for (int q = 1; q <= 5; q++) {
                                System.out.print("*");
                            }
                            System.out.println();
                            }
                        System.out.println();
                            for (int t = 1; t <= 5; t++)
                    {
                        for (int p = 1; p <= t; p++)
                        {
                            System.out.print("*");
                        }
                        System.out.println();
                        }
                    }
                    System.out.println();
                    for (int d = 1; d <= 5; d++)
                    {
                        for (int l = 5; l >= d; l--)
                        {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    }
                }
            }
        }
    }
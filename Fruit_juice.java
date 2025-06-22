import java.util.Scanner;

public class Fruit_juice {

    static class Juice {
        String fruit;
        String ice;

        Juice() {
            Scanner value = new Scanner(System.in);
            System.out.print("Enter the fruit name: ");
            fruit = value.nextLine();

            process();

            System.out.print("Do you want ice? Enter y/n: ");
            ice = value.nextLine();

            // Use .equalsIgnoreCase() to compare strings
            if (ice.equalsIgnoreCase("y")) {
                ice();
            } else {
                makeJuice();
            }

            value.close(); // Good practice to close the scanner
        }

        void process() {
            System.out.println("Washing the " + fruit);
            System.out.println("Slicing the " + fruit);
        }

        void ice() {
            System.out.println("Adding ice to the " + fruit + " juice...");
            makeJuice(); // After adding ice, make the juice
        }

        void makeJuice() {
            System.out.println("Blending the " + fruit + "...");
            System.out.println("Your " + fruit + " juice is ready!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Fruit Juice Maker!");
        new Juice(); // This will read input and make juice
    }
}

import java.util.Scanner;

public class Fruit_juice {

    static class Juice {
        String fruit;

        Juice() {
            Scanner value = new Scanner(System.in);
            System.out.print("Enter the fruit name: ");
            fruit = value.nextLine();
            makeJuice();
        }

        void makeJuice() {
            System.out.println("Washing the " + fruit);
            System.out.println("Slicing the " + fruit);
            System.out.println("Blending the " + fruit);
            System.out.println("Your " + fruit + " juice is ready!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Fruit Juice Maker!");
        Juice juice = new Juice(); // This will read input and make juice
    }
}

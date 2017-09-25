package asker;

import java.util.Scanner;

/**
 * @author Igor Hnes on 9/25/17.
 */
public class Asker {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hello what is ur name?");
        final String name = scanner.nextLine();

        System.out.println("Nice to meet u " + name);
        scanner.close();
    }
}

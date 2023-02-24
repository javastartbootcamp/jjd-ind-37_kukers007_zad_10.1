package pl.javastart.task;

import java.util.Scanner;

public class ShoeBuilder {
        Scanner scanner = new Scanner(System.in);

        Shoe createShoe() {
            System.out.println("Enter producer (Nike/Adidas): ");
            String producer = scanner.nextLine();
            System.out.println("Enter size(int): ");
            int size = scanner.nextInt();
            scanner.nextLine();
            return new Shoe(producer, size);

    }
}

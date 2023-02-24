package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        ShoeBuilder builder = new ShoeBuilder();
        Scanner scanner = new Scanner(System.in);
        final int maxSize = 3;
        Shoe[] shoes = new Shoe[maxSize];
        int index = 0;

        while (index < maxSize) {
            Shoe shoe = builder.createShoe();
            if (Arrays.asList(shoes).contains(shoe)) {
                System.out.println("Duplikat");
                continue;
            }
            shoes[index] = shoe;
            index++;
            if (index == maxSize) {
                break;
            }
        }
        System.out.println(Arrays.toString(shoes));
    }
}
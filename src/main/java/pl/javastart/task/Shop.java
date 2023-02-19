package pl.javastart.task;

import java.util.Arrays;

public class Shop {
    public static void main(String[] args) {
        ShoeBuilder builder = new ShoeBuilder();
        Shoe[] shoes = new Shoe[3];
        for (int i = 0; i < shoes.length; i++) {
            shoes[i] = builder.createShoe();
        }
        for (int i = 0; i < shoes.length; i++) {
            for (int j = 1; j < shoes.length; j++) {
                if (shoes[i].equals(shoes[j])) {
                    System.out.println("Duplikat");
                    shoes[j] = builder.createShoe();
                }
            }
        }
        System.out.println(Arrays.toString(shoes));
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
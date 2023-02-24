package pl.javastart.task;

import java.util.Objects;

public class Shoe {
    private String producer;
    private int size;

    public Shoe(String producer, int size) {
        this.producer = producer;
        this.size = size;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shoe shoe = (Shoe) o;
        return size == shoe.size && Objects.equals(producer, shoe.producer);
    }


    @Override
    public int hashCode() {
        return Objects.hash(producer, size);
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "producer='" + producer + '\'' +
                ", size=" + size +
                '}';

    }

}
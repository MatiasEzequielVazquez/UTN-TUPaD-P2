package tp7_04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Michi"));
        animales.add(new Vaca("Lola"));
        animales.add(new Perro("Fido"));

        for (Animal animal : animales) {
            animal.describirAnimal();
        }
    }
}
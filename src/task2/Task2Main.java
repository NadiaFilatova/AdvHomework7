package task2;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

//Необхідно здійснити десеріалізацію з файлу попереднього проекту (Animal) та вивести на екран вміст.
public class Task2Main {
    private static final String FILEPATH = "/home/nadia/IdeaProjects/AdvHomework7/src/task2/cats.xml";

    public static void main(String[] args) throws FileNotFoundException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(FILEPATH));
        XMLDecoder decoder = new XMLDecoder(bufferedInputStream);
        List<Cat> cats = (List<Cat>) decoder.readObject();
        cats.forEach(System.out::println);
    }

    private static void serialize() throws FileNotFoundException {
        Cat cat1 = new Cat("Cat 1", 10, 100);
        Cat cat2 = new Cat("Cat 2", 6, 15);
        Cat cat3 = new Cat("Cat 3", 9, 19);
        Cat cat4 = new Cat("Cat 4", 3, 55);
        Cat cat5 = new Cat("Cat 5", 1, 73);
        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        FileOutputStream fileOutputStream = new FileOutputStream(FILEPATH);
        BufferedOutputStream outputStream = new BufferedOutputStream(fileOutputStream);
        XMLEncoder encoder = new XMLEncoder(outputStream);
        encoder.writeObject(cats);
        encoder.flush();
        encoder.close();
    }
}

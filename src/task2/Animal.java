package task2;

import java.io.Serializable;

////Створіть 2 класи, Animal та Cat. У класі Animal ініціалізуйте 3 поля різних модифікаторів.
//// У класі Cat використовуючи рефлексію, отримайте доступ до полів класу Animal та змініть вміст кожного з полів.
public class Animal implements Serializable {
    public String name;
    private int age;
    protected int lens;

    public Animal(String name, int age, int lens) {
        this.name = name;
        this.age = age;
        this.lens = lens;
    }

    public Animal() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLens(int lens) {
        this.lens = lens;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getLens() {
        return lens;
    }
}

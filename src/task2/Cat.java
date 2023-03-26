package task2;

////Створіть 2 класи, Animal та Cat. У класі Animal ініціалізуйте 3 поля різних модифікаторів.
//// У класі Cat використовуючи рефлексію, отримайте доступ до полів класу Animal та змініть вміст кожного з полів.
public class Cat extends Animal {
    public Cat(String name, int age, int lens) {
        super(name, age, lens);
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + getAge() + ", " +
                "name='" + getName() + '\'' +
                ", lens=" + getLens() +
                '}';
    }
}